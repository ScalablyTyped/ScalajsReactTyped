package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IUserOrUserGroupID
import typingsJapgolly.mfiles.MFiles.MFUserOrUserGroupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.UserOrUserGroupID")
@js.native
open class UserOrUserGroupID ()
  extends StObject
     with IUserOrUserGroupID {
  
  /* CompleteClass */
  override def Clone(): IUserOrUserGroupID = js.native
  
  /* CompleteClass */
  var UserOrGroupID: Double = js.native
  
  /* CompleteClass */
  var UserOrGroupType: MFUserOrUserGroupType = js.native
}
