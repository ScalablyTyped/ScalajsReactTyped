package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentServicesProvider extends DataProvider {
  def createAlert(ownerUri: String, alertInfo: AgentAlertInfo): Thenable[CreateAgentAlertResult]
  def createJob(ownerUri: String, jobInfo: AgentJobInfo): Thenable[CreateAgentJobResult]
  def createJobSchedule(ownerUri: String, scheduleInfo: AgentJobScheduleInfo): Thenable[CreateAgentJobScheduleResult]
  // Job Step management methods
  def createJobStep(ownerUri: String, stepInfo: AgentJobStepInfo): Thenable[CreateAgentJobStepResult]
  def createNotebook(ownerUri: String, notebook: AgentNotebookInfo, templateFilePath: String): Thenable[CreateAgentNotebookResult]
  def createOperator(ownerUri: String, operatorInfo: AgentOperatorInfo): Thenable[CreateAgentOperatorResult]
  def createProxy(ownerUri: String, proxyInfo: AgentProxyInfo): Thenable[CreateAgentOperatorResult]
  def deleteAlert(ownerUri: String, alertInfo: AgentAlertInfo): Thenable[ResultStatus]
  def deleteJob(ownerUri: String, jobInfo: AgentJobInfo): Thenable[ResultStatus]
  def deleteJobSchedule(ownerUri: String, scheduleInfo: AgentJobScheduleInfo): Thenable[ResultStatus]
  def deleteJobStep(ownerUri: String, stepInfo: AgentJobStepInfo): Thenable[ResultStatus]
  def deleteMaterializedNotebook(ownerUri: String, agentNotebookHistory: AgentNotebookHistoryInfo, targetDatabase: String): Thenable[ResultStatus]
  def deleteNotebook(ownerUri: String, notebook: AgentNotebookInfo): Thenable[ResultStatus]
  def deleteOperator(ownerUri: String, operatorInfo: AgentOperatorInfo): Thenable[ResultStatus]
  def deleteProxy(ownerUri: String, proxyInfo: AgentProxyInfo): Thenable[ResultStatus]
  // Alert management methods
  def getAlerts(ownerUri: String): Thenable[AgentAlertsResult]
  // Credential method
  def getCredentials(ownerUri: String): Thenable[GetCredentialsResult]
  def getJobDefaults(ownerUri: String): Thenable[AgentJobDefaultsResult]
  def getJobHistory(ownerUri: String, jobId: String, jobName: String): Thenable[AgentJobHistoryResult]
  // Job Schedule management methods
  def getJobSchedules(ownerUri: String): Thenable[AgentJobSchedulesResult]
  // Job management methods
  def getJobs(ownerUri: String): Thenable[AgentJobsResult]
  def getMaterializedNotebook(ownerUri: String, targetDatabase: String, notebookMaterializedId: Double): Thenable[AgentNotebookMaterializedResult]
  def getNotebookHistory(ownerUri: String, jobId: String, jobName: String, targetDatabase: String): Thenable[AgentNotebookHistoryResult]
  // Notebook management methods
  def getNotebooks(ownerUri: String): Thenable[AgentNotebooksResult]
  // Operator management methods
  def getOperators(ownerUri: String): Thenable[AgentOperatorsResult]
  // Proxy management methods
  def getProxies(ownerUri: String): Thenable[AgentProxiesResult]
  def getTemplateNotebook(ownerUri: String, targetDatabase: String, jobId: String): Thenable[AgentNotebookTemplateResult]
  def jobAction(ownerUri: String, jobName: String, action: String): Thenable[ResultStatus]
  def registerOnUpdated(handler: js.Function0[_]): Unit
  def updateAlert(ownerUri: String, originalAlertName: String, alertInfo: AgentAlertInfo): Thenable[UpdateAgentAlertResult]
  def updateJob(ownerUri: String, originalJobName: String, jobInfo: AgentJobInfo): Thenable[UpdateAgentJobResult]
  def updateJobSchedule(ownerUri: String, originalScheduleName: String, scheduleInfo: AgentJobScheduleInfo): Thenable[UpdateAgentJobScheduleResult]
  def updateJobStep(ownerUri: String, originalJobStepName: String, stepInfo: AgentJobStepInfo): Thenable[UpdateAgentJobStepResult]
  def updateNotebook(
    ownerUri: String,
    originialNotebookName: String,
    notebook: AgentNotebookInfo,
    templateFilePath: String
  ): Thenable[UpdateAgentNotebookResult]
  def updateNotebookMaterializedName(
    ownerUri: String,
    agentNotebookHistory: AgentNotebookHistoryInfo,
    targetDatabase: String,
    name: String
  ): Thenable[ResultStatus]
  def updateNotebookMaterializedPin(
    ownerUri: String,
    agentNotebookHistory: AgentNotebookHistoryInfo,
    targetDatabase: String,
    pin: Boolean
  ): Thenable[ResultStatus]
  def updateOperator(ownerUri: String, originalOperatorName: String, operatorInfo: AgentOperatorInfo): Thenable[UpdateAgentOperatorResult]
  def updateProxy(ownerUri: String, originalProxyName: String, proxyInfo: AgentProxyInfo): Thenable[UpdateAgentOperatorResult]
}

object AgentServicesProvider {
  @scala.inline
  def apply(
    createAlert: (String, AgentAlertInfo) => CallbackTo[Thenable[CreateAgentAlertResult]],
    createJob: (String, AgentJobInfo) => CallbackTo[Thenable[CreateAgentJobResult]],
    createJobSchedule: (String, AgentJobScheduleInfo) => CallbackTo[Thenable[CreateAgentJobScheduleResult]],
    createJobStep: (String, AgentJobStepInfo) => CallbackTo[Thenable[CreateAgentJobStepResult]],
    createNotebook: (String, AgentNotebookInfo, String) => CallbackTo[Thenable[CreateAgentNotebookResult]],
    createOperator: (String, AgentOperatorInfo) => CallbackTo[Thenable[CreateAgentOperatorResult]],
    createProxy: (String, AgentProxyInfo) => CallbackTo[Thenable[CreateAgentOperatorResult]],
    deleteAlert: (String, AgentAlertInfo) => CallbackTo[Thenable[ResultStatus]],
    deleteJob: (String, AgentJobInfo) => CallbackTo[Thenable[ResultStatus]],
    deleteJobSchedule: (String, AgentJobScheduleInfo) => CallbackTo[Thenable[ResultStatus]],
    deleteJobStep: (String, AgentJobStepInfo) => CallbackTo[Thenable[ResultStatus]],
    deleteMaterializedNotebook: (String, AgentNotebookHistoryInfo, String) => CallbackTo[Thenable[ResultStatus]],
    deleteNotebook: (String, AgentNotebookInfo) => CallbackTo[Thenable[ResultStatus]],
    deleteOperator: (String, AgentOperatorInfo) => CallbackTo[Thenable[ResultStatus]],
    deleteProxy: (String, AgentProxyInfo) => CallbackTo[Thenable[ResultStatus]],
    getAlerts: String => CallbackTo[Thenable[AgentAlertsResult]],
    getCredentials: String => CallbackTo[Thenable[GetCredentialsResult]],
    getJobDefaults: String => CallbackTo[Thenable[AgentJobDefaultsResult]],
    getJobHistory: (String, String, String) => CallbackTo[Thenable[AgentJobHistoryResult]],
    getJobSchedules: String => CallbackTo[Thenable[AgentJobSchedulesResult]],
    getJobs: String => CallbackTo[Thenable[AgentJobsResult]],
    getMaterializedNotebook: (String, String, Double) => CallbackTo[Thenable[AgentNotebookMaterializedResult]],
    getNotebookHistory: (String, String, String, String) => CallbackTo[Thenable[AgentNotebookHistoryResult]],
    getNotebooks: String => CallbackTo[Thenable[AgentNotebooksResult]],
    getOperators: String => CallbackTo[Thenable[AgentOperatorsResult]],
    getProxies: String => CallbackTo[Thenable[AgentProxiesResult]],
    getTemplateNotebook: (String, String, String) => CallbackTo[Thenable[AgentNotebookTemplateResult]],
    jobAction: (String, String, String) => CallbackTo[Thenable[ResultStatus]],
    providerId: String,
    registerOnUpdated: js.Function0[js.Any] => Callback,
    updateAlert: (String, String, AgentAlertInfo) => CallbackTo[Thenable[UpdateAgentAlertResult]],
    updateJob: (String, String, AgentJobInfo) => CallbackTo[Thenable[UpdateAgentJobResult]],
    updateJobSchedule: (String, String, AgentJobScheduleInfo) => CallbackTo[Thenable[UpdateAgentJobScheduleResult]],
    updateJobStep: (String, String, AgentJobStepInfo) => CallbackTo[Thenable[UpdateAgentJobStepResult]],
    updateNotebook: (String, String, AgentNotebookInfo, String) => CallbackTo[Thenable[UpdateAgentNotebookResult]],
    updateNotebookMaterializedName: (String, AgentNotebookHistoryInfo, String, String) => CallbackTo[Thenable[ResultStatus]],
    updateNotebookMaterializedPin: (String, AgentNotebookHistoryInfo, String, Boolean) => CallbackTo[Thenable[ResultStatus]],
    updateOperator: (String, String, AgentOperatorInfo) => CallbackTo[Thenable[UpdateAgentOperatorResult]],
    updateProxy: (String, String, AgentProxyInfo) => CallbackTo[Thenable[UpdateAgentOperatorResult]],
    handle: Int | Double = null
  ): AgentServicesProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.updateDynamic("createAlert")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.AgentAlertInfo) => createAlert(t0, t1).runNow()))
    __obj.updateDynamic("createJob")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.AgentJobInfo) => createJob(t0, t1).runNow()))
    __obj.updateDynamic("createJobSchedule")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.AgentJobScheduleInfo) => createJobSchedule(t0, t1).runNow()))
    __obj.updateDynamic("createJobStep")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.AgentJobStepInfo) => createJobStep(t0, t1).runNow()))
    __obj.updateDynamic("createNotebook")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.AgentNotebookInfo, t2: java.lang.String) => createNotebook(t0, t1, t2).runNow()))
    __obj.updateDynamic("createOperator")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.AgentOperatorInfo) => createOperator(t0, t1).runNow()))
    __obj.updateDynamic("createProxy")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.AgentProxyInfo) => createProxy(t0, t1).runNow()))
    __obj.updateDynamic("deleteAlert")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.AgentAlertInfo) => deleteAlert(t0, t1).runNow()))
    __obj.updateDynamic("deleteJob")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.AgentJobInfo) => deleteJob(t0, t1).runNow()))
    __obj.updateDynamic("deleteJobSchedule")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.AgentJobScheduleInfo) => deleteJobSchedule(t0, t1).runNow()))
    __obj.updateDynamic("deleteJobStep")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.AgentJobStepInfo) => deleteJobStep(t0, t1).runNow()))
    __obj.updateDynamic("deleteMaterializedNotebook")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.AgentNotebookHistoryInfo, t2: java.lang.String) => deleteMaterializedNotebook(t0, t1, t2).runNow()))
    __obj.updateDynamic("deleteNotebook")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.AgentNotebookInfo) => deleteNotebook(t0, t1).runNow()))
    __obj.updateDynamic("deleteOperator")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.AgentOperatorInfo) => deleteOperator(t0, t1).runNow()))
    __obj.updateDynamic("deleteProxy")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.AgentProxyInfo) => deleteProxy(t0, t1).runNow()))
    __obj.updateDynamic("getAlerts")(js.Any.fromFunction1((t0: java.lang.String) => getAlerts(t0).runNow()))
    __obj.updateDynamic("getCredentials")(js.Any.fromFunction1((t0: java.lang.String) => getCredentials(t0).runNow()))
    __obj.updateDynamic("getJobDefaults")(js.Any.fromFunction1((t0: java.lang.String) => getJobDefaults(t0).runNow()))
    __obj.updateDynamic("getJobHistory")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => getJobHistory(t0, t1, t2).runNow()))
    __obj.updateDynamic("getJobSchedules")(js.Any.fromFunction1((t0: java.lang.String) => getJobSchedules(t0).runNow()))
    __obj.updateDynamic("getJobs")(js.Any.fromFunction1((t0: java.lang.String) => getJobs(t0).runNow()))
    __obj.updateDynamic("getMaterializedNotebook")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: scala.Double) => getMaterializedNotebook(t0, t1, t2).runNow()))
    __obj.updateDynamic("getNotebookHistory")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String) => getNotebookHistory(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getNotebooks")(js.Any.fromFunction1((t0: java.lang.String) => getNotebooks(t0).runNow()))
    __obj.updateDynamic("getOperators")(js.Any.fromFunction1((t0: java.lang.String) => getOperators(t0).runNow()))
    __obj.updateDynamic("getProxies")(js.Any.fromFunction1((t0: java.lang.String) => getProxies(t0).runNow()))
    __obj.updateDynamic("getTemplateNotebook")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => getTemplateNotebook(t0, t1, t2).runNow()))
    __obj.updateDynamic("jobAction")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => jobAction(t0, t1, t2).runNow()))
    __obj.updateDynamic("registerOnUpdated")(js.Any.fromFunction1((t0: js.Function0[js.Any]) => registerOnUpdated(t0).runNow()))
    __obj.updateDynamic("updateAlert")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.azdata.mod.AgentAlertInfo) => updateAlert(t0, t1, t2).runNow()))
    __obj.updateDynamic("updateJob")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.azdata.mod.AgentJobInfo) => updateJob(t0, t1, t2).runNow()))
    __obj.updateDynamic("updateJobSchedule")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.azdata.mod.AgentJobScheduleInfo) => updateJobSchedule(t0, t1, t2).runNow()))
    __obj.updateDynamic("updateJobStep")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.azdata.mod.AgentJobStepInfo) => updateJobStep(t0, t1, t2).runNow()))
    __obj.updateDynamic("updateNotebook")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.azdata.mod.AgentNotebookInfo, t3: java.lang.String) => updateNotebook(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("updateNotebookMaterializedName")(js.Any.fromFunction4((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.AgentNotebookHistoryInfo, t2: java.lang.String, t3: java.lang.String) => updateNotebookMaterializedName(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("updateNotebookMaterializedPin")(js.Any.fromFunction4((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.AgentNotebookHistoryInfo, t2: java.lang.String, t3: scala.Boolean) => updateNotebookMaterializedPin(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("updateOperator")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.azdata.mod.AgentOperatorInfo) => updateOperator(t0, t1, t2).runNow()))
    __obj.updateDynamic("updateProxy")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.azdata.mod.AgentProxyInfo) => updateProxy(t0, t1, t2).runNow()))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentServicesProvider]
  }
}

