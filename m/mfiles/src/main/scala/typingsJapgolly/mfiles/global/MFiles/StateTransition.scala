package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAccessControlList
import typingsJapgolly.mfiles.ISearchConditions
import typingsJapgolly.mfiles.ISemanticAliases
import typingsJapgolly.mfiles.ISignatureSettings
import typingsJapgolly.mfiles.IStateTransition
import typingsJapgolly.mfiles.MFiles.MFAutoStateTransitionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.StateTransition")
@js.native
open class StateTransition ()
  extends StObject
     with IStateTransition {
  
  /* CompleteClass */
  var AccessControlList: IAccessControlList = js.native
  
  /* CompleteClass */
  override def Clone(): IStateTransition = js.native
  
  /* CompleteClass */
  var Description: String = js.native
  
  /* CompleteClass */
  var EvaluationOrderNumber: Double = js.native
  
  /* CompleteClass */
  var FromState: Double = js.native
  
  /* CompleteClass */
  var ID: Double = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  var SemanticAliases: ISemanticAliases = js.native
  
  /* CompleteClass */
  var SignatureSettings: ISignatureSettings = js.native
  
  /* CompleteClass */
  var ToState: Double = js.native
  
  /* CompleteClass */
  var TriggerAllowedByVBScript: String = js.native
  
  /* CompleteClass */
  var TriggerCriteria: ISearchConditions = js.native
  
  /* CompleteClass */
  var TriggerInDays: Double = js.native
  
  /* CompleteClass */
  var TriggerMode: MFAutoStateTransitionMode = js.native
}
