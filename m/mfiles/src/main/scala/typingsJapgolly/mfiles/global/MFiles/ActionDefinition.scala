package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IActionCreateAssignment
import typingsJapgolly.mfiles.IActionDefinition
import typingsJapgolly.mfiles.MFiles.MFActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ActionDefinition")
@js.native
open class ActionDefinition ()
  extends StObject
     with IActionDefinition {
  
  /* CompleteClass */
  var ActionCreateSeparateAssignment: IActionCreateAssignment = js.native
  
  /* CompleteClass */
  override val ActionType: MFActionType = js.native
  
  /* CompleteClass */
  override def Clear(): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): IActionDefinition = js.native
}
