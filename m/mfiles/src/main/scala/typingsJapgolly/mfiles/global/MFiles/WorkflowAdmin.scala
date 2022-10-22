package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAccessControlList
import typingsJapgolly.mfiles.ISemanticAliases
import typingsJapgolly.mfiles.IStateTransitions
import typingsJapgolly.mfiles.IStatesAdmin
import typingsJapgolly.mfiles.IWorkflow
import typingsJapgolly.mfiles.IWorkflowAdmin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.WorkflowAdmin")
@js.native
open class WorkflowAdmin ()
  extends StObject
     with IWorkflowAdmin {
  
  /* CompleteClass */
  override def Clone(): IWorkflowAdmin = js.native
  
  /* CompleteClass */
  var Description: String = js.native
  
  /* CompleteClass */
  var Permissions: IAccessControlList = js.native
  
  /* CompleteClass */
  var SemanticAliases: ISemanticAliases = js.native
  
  /* CompleteClass */
  var StateTransitions: IStateTransitions = js.native
  
  /* CompleteClass */
  var States: IStatesAdmin = js.native
  
  /* CompleteClass */
  var Workflow: IWorkflow = js.native
}
