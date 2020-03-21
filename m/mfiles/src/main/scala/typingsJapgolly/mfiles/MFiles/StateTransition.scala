package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.IAccessControlList
import typingsJapgolly.mfiles.ISearchConditions
import typingsJapgolly.mfiles.ISemanticAliases
import typingsJapgolly.mfiles.ISignatureSettings
import typingsJapgolly.mfiles.IStateTransition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.StateTransition")
@js.native
class StateTransition () extends IStateTransition {
  /* CompleteClass */
  override var AccessControlList: IAccessControlList = js.native
  /* CompleteClass */
  override var Description: String = js.native
  /* CompleteClass */
  override var EvaluationOrderNumber: Double = js.native
  /* CompleteClass */
  override var FromState: Double = js.native
  /* CompleteClass */
  override var ID: Double = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override var SemanticAliases: ISemanticAliases = js.native
  /* CompleteClass */
  override var SignatureSettings: ISignatureSettings = js.native
  /* CompleteClass */
  override var ToState: Double = js.native
  /* CompleteClass */
  override var TriggerAllowedByVBScript: String = js.native
  /* CompleteClass */
  override var TriggerCriteria: ISearchConditions = js.native
  /* CompleteClass */
  override var TriggerInDays: Double = js.native
  /* CompleteClass */
  override var TriggerMode: MFAutoStateTransitionMode = js.native
  /* CompleteClass */
  override def Clone(): IStateTransition = js.native
}

@JSGlobal("MFiles.StateTransition")
@js.native
object StateTransition extends Instantiable0[IStateTransition]

