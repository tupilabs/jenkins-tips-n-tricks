if(manager.logContains(".*Connection closed by remote host.*")) {
  manager.addWarningBadge("Bad con, bad!")
  manager.createSummary("warning.gif").appendText("<h1>Network fail detected :-(</h1>", false, false, false, "red")
  manager.buildUnstable()
}