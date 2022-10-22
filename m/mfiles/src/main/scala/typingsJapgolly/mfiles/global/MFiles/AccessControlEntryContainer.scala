package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAccessControlEntryContainer
import typingsJapgolly.mfiles.IAccessControlEntryData
import typingsJapgolly.mfiles.IAccessControlEntryKey
import typingsJapgolly.mfiles.IAccessControlEntryKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.AccessControlEntryContainer")
@js.native
open class AccessControlEntryContainer ()
  extends StObject
     with IAccessControlEntryContainer {
  
  /* CompleteClass */
  override def Add(AccessControlEntryKey: IAccessControlEntryKey, AccessControlEntryData: IAccessControlEntryData): Unit = js.native
  
  /* CompleteClass */
  override def At(AccessControlEntryKey: IAccessControlEntryKey): IAccessControlEntryData = js.native
  
  /* CompleteClass */
  override def Clear(): Unit = js.native
  
  /* CompleteClass */
  override def Clone(): IAccessControlEntryContainer = js.native
  
  /* CompleteClass */
  override def GetKeys(): IAccessControlEntryKeys = js.native
  
  /* CompleteClass */
  override def GetKeysWithPseudoUserDefinitions(): IAccessControlEntryKeys = js.native
  
  /* CompleteClass */
  override def HasKey(AccessControlEntryKey: IAccessControlEntryKey): Boolean = js.native
  
  /* CompleteClass */
  override val IsEmpty: Boolean = js.native
  
  /* CompleteClass */
  override def Remove(AccessControlEntryKey: IAccessControlEntryKey): Unit = js.native
}
