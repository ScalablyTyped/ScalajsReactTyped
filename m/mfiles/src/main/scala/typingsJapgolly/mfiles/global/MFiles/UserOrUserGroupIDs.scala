package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IUserOrUserGroupID
import typingsJapgolly.mfiles.IUserOrUserGroupIDs
import typingsJapgolly.mfiles.MFiles.MFUserOrUserGroupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.UserOrUserGroupIDs")
@js.native
open class UserOrUserGroupIDs ()
  extends StObject
     with IUserOrUserGroupIDs {
  
  /* CompleteClass */
  override def Add(Index: Double, UserOrUserGroupID: IUserOrUserGroupID): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): IUserOrUserGroupIDs = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def GetUserOrUserGroupID(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupID = js.native
  
  /* CompleteClass */
  override def GetUserOrUserGroupIDIndex(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): IUserOrUserGroupID = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}
