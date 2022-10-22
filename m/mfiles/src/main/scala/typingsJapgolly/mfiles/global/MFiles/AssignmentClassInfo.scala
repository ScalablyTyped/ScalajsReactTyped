package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IApprovalAssignmentClassInfo
import typingsJapgolly.mfiles.IAssignmentClassInfo
import typingsJapgolly.mfiles.ITaskAssignmentClassInfo
import typingsJapgolly.mfiles.MFiles.MFAssignmentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.AssignmentClassInfo")
@js.native
open class AssignmentClassInfo ()
  extends StObject
     with IAssignmentClassInfo {
  
  /* CompleteClass */
  var ApprovalAssignmentClassInfo: IApprovalAssignmentClassInfo = js.native
  
  /* CompleteClass */
  override val AssignmentType: MFAssignmentType = js.native
  
  /* CompleteClass */
  override def Clone(): IAssignmentClassInfo = js.native
  
  /* CompleteClass */
  var TaskAssignmentClassInfo: ITaskAssignmentClassInfo = js.native
}
