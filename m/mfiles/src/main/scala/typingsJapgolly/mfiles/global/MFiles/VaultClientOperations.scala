package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IVaultClientOperations
import typingsJapgolly.mfiles.MFiles.MFOfflineTransitionResultFlags
import typingsJapgolly.mfiles.MFiles.MFOnlineTransitionResultFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultClientOperations")
@js.native
open class VaultClientOperations ()
  extends StObject
     with IVaultClientOperations {
  
  /* CompleteClass */
  override def DisableCheckInReminderForCallingProcess(): Unit = js.native
  
  /* CompleteClass */
  override def EnableCheckInReminderForCallingProcess(): Unit = js.native
  
  /* CompleteClass */
  override def IsOffline(): Boolean = js.native
  
  /* CompleteClass */
  override def IsOnline(): Boolean = js.native
  
  /* CompleteClass */
  override def SetVaultToOffline(ParentWindow: Double): MFOfflineTransitionResultFlags = js.native
  
  /* CompleteClass */
  override def SetVaultToOnline(ParentWindow: Double): MFOnlineTransitionResultFlags = js.native
}
