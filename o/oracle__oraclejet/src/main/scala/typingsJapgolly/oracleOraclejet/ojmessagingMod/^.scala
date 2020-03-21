package typingsJapgolly.oracleOraclejet.ojmessagingMod

import typingsJapgolly.oracleOraclejet.oracleOraclejetNumbers.`-1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojmessaging", JSImport.Namespace)
@js.native
class ^ protected () extends Message {
  def this(summary: String, detail: String) = this()
  def this(summary: String, detail: String, severity: SEVERITY_LEVEL) = this()
  def this(summary: String, detail: String, severity: SEVERITY_TYPE) = this()
  /* CompleteClass */
  override var detail: String = js.native
  /* CompleteClass */
  override var severity: SEVERITY_TYPE | SEVERITY_LEVEL = js.native
  /* CompleteClass */
  override var summary: String = js.native
}

@JSImport("@oracle/oraclejet/ojmessaging", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getMaxSeverity(): SEVERITY_LEVEL | `-1` = js.native
  def getMaxSeverity(messages: js.Array[Message]): SEVERITY_LEVEL | `-1` = js.native
  def getSeverityLevel(): SEVERITY_LEVEL = js.native
  def getSeverityLevel(severity: SEVERITY_LEVEL): SEVERITY_LEVEL = js.native
  def getSeverityLevel(severity: SEVERITY_TYPE): SEVERITY_LEVEL = js.native
  def getSeverityType(): SEVERITY_TYPE = js.native
  def getSeverityType(level: SEVERITY_LEVEL): SEVERITY_TYPE = js.native
  def getSeverityType(level: SEVERITY_TYPE): SEVERITY_TYPE = js.native
  def isValid(messages: js.Array[Message]): Boolean = js.native
}

