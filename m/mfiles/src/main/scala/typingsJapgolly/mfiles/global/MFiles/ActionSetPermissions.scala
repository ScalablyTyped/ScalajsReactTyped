package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAccessControlList
import typingsJapgolly.mfiles.IActionSetPermissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ActionSetPermissions")
@js.native
open class ActionSetPermissions ()
  extends StObject
     with IActionSetPermissions {
  
  /* CompleteClass */
  override def Clone(): IActionSetPermissions = js.native
  
  /* CompleteClass */
  var DiscardsAutomaticPermissions: Boolean = js.native
  
  /* CompleteClass */
  var Permissions: IAccessControlList = js.native
}
