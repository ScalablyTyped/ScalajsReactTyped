package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAccessControlEntryContainer
import typingsJapgolly.mfiles.IAccessControlEntryData
import typingsJapgolly.mfiles.IAccessControlEntryKey
import typingsJapgolly.mfiles.IAccessControlListComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.AccessControlListComponent")
@js.native
open class AccessControlListComponent ()
  extends StObject
     with IAccessControlListComponent {
  
  /* CompleteClass */
  var AccessControlEntries: IAccessControlEntryContainer = js.native
  
  /* CompleteClass */
  var CanDeactivate: Boolean = js.native
  
  /* CompleteClass */
  override def Clone(): IAccessControlListComponent = js.native
  
  /* CompleteClass */
  override val CurrentUserBinding: Double = js.native
  
  /* CompleteClass */
  override def GetACEByUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): IAccessControlEntryData = js.native
  
  /* CompleteClass */
  override def GetACEKeyByUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): IAccessControlEntryKey = js.native
  
  /* CompleteClass */
  override val HasCurrentUser: Boolean = js.native
  
  /* CompleteClass */
  override val HasCurrentUserBinding: Boolean = js.native
  
  /* CompleteClass */
  override val HasNamedACLLink: Boolean = js.native
  
  /* CompleteClass */
  override val HasPseudoUsers: Boolean = js.native
  
  /* CompleteClass */
  var IsActive: Boolean = js.native
  
  /* CompleteClass */
  override val NamedACLLink: Double = js.native
  
  /* CompleteClass */
  override def ResetCurrentUserBinding(): Unit = js.native
  
  /* CompleteClass */
  override def ResetNamedACLLink(): Unit = js.native
}
