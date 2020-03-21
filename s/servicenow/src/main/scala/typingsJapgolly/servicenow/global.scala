package typingsJapgolly.servicenow

import typingsJapgolly.servicenow.servicenow.GlideRecordOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("global")
@js.native
object global extends js.Object {
  @js.native
  class Workflow () extends js.Object {
    def broadcastEvent(contextId: String, eventName: String): Unit = js.native
    def cancel(record: typingsJapgolly.servicenow.servicenow.GlideRecord): Unit = js.native
    def cancelContext(context: typingsJapgolly.servicenow.servicenow.GlideRecord): Unit = js.native
    def deleteWorkflow(current: typingsJapgolly.servicenow.servicenow.GlideRecord): Unit = js.native
    def fireEvent(eventRecord: typingsJapgolly.servicenow.servicenow.GlideRecord, eventName: String): Unit = js.native
    def fireEventById(eventRecordId: String, eventName: String): Unit = js.native
    def getContexts(record: typingsJapgolly.servicenow.servicenow.GlideRecord): typingsJapgolly.servicenow.servicenow.GlideRecord = js.native
    def getEstimatedDeliveryTime(workflowId: String): String = js.native
    def getEstimatedDeliveryTimeFromWFVersion(wfVersion: typingsJapgolly.servicenow.servicenow.GlideRecord): String = js.native
    def getReturnValue(workflowID: String, amount: Double, result: Boolean): js.Object = js.native
    def getRunningFlows(record: typingsJapgolly.servicenow.servicenow.GlideRecord): typingsJapgolly.servicenow.servicenow.GlideRecord = js.native
    def getVersion(workflowId: String): Unit = js.native
    def getVersionFromName(workflowName: String): Unit = js.native
    def getWorkflowFromName(workflowName: String): Unit = js.native
    def hasWorkflow(record: typingsJapgolly.servicenow.servicenow.GlideRecord): Boolean = js.native
    def restartWorkflow(record: typingsJapgolly.servicenow.servicenow.GlideRecord, maintainStateFlag: Boolean): Unit = js.native
    def runFlows(record: typingsJapgolly.servicenow.servicenow.GlideRecord, operation: GlideRecordOperation): Unit = js.native
    def startFlow(workflowId: String, current: Null, operation: GlideRecordOperation): String = js.native
    def startFlow(workflowId: String, current: Null, operation: GlideRecordOperation, vars: js.Object): String = js.native
    def startFlow(
      workflowId: String,
      current: typingsJapgolly.servicenow.servicenow.GlideRecord,
      operation: GlideRecordOperation
    ): String = js.native
    def startFlow(
      workflowId: String,
      current: typingsJapgolly.servicenow.servicenow.GlideRecord,
      operation: GlideRecordOperation,
      vars: js.Object
    ): String = js.native
    def startFlowFromContextInsert(context: typingsJapgolly.servicenow.servicenow.GlideRecord, operation: GlideRecordOperation): Unit = js.native
    def startFlowRetroactive(
      workflowID: String,
      retroactiveMSecs: Double,
      current: typingsJapgolly.servicenow.servicenow.GlideRecord,
      operation: GlideRecordOperation
    ): typingsJapgolly.servicenow.servicenow.GlideRecord = js.native
    def startFlowRetroactive(
      workflowID: String,
      retroactiveMSecs: Double,
      current: typingsJapgolly.servicenow.servicenow.GlideRecord,
      operation: GlideRecordOperation,
      vars: js.Object
    ): typingsJapgolly.servicenow.servicenow.GlideRecord = js.native
    def startFlowRetroactive(
      workflowID: String,
      retroactiveMSecs: Double,
      current: typingsJapgolly.servicenow.servicenow.GlideRecord,
      operation: GlideRecordOperation,
      vars: js.Object,
      withSchedule: js.Any
    ): typingsJapgolly.servicenow.servicenow.GlideRecord = js.native
  }
  
  @js.native
  object Class extends js.Object {
    def create(): js.Any = js.native
  }
  
  @js.native
  object GlideStringUtil extends js.Object {
    def base64Decode(value: String): String = js.native
    def base64DecodeAsBytes(value: String): js.Any = js.native
    def escapeHTML(value: String): String = js.native
    def getStringFromStream(stream: js.Object): String = js.native
  }
  
}

