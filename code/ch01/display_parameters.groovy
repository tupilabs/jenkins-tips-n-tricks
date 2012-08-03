def parametersActions = manager.build.getActions(hudson.model.ParametersAction.class)
for(parameterAction in parametersActions) {
  def parameters  = parameterAction.parameters
  for(parameter in parameters) {
      def name = parameter.name
      def value = parameter.createVariableResolver(manager.build).resolve(parameter.name)
      manager.listener.logger.append("Parameter "+name+" = "+value+"\n");
  }
}