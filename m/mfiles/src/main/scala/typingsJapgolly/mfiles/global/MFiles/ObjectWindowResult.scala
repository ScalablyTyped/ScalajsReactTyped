package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAccessControlList
import typingsJapgolly.mfiles.IFileClass
import typingsJapgolly.mfiles.IObjVer
import typingsJapgolly.mfiles.IObjectWindowResult
import typingsJapgolly.mfiles.IPropertyValues
import typingsJapgolly.mfiles.MFiles.MFObjectWindowResultCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjectWindowResult")
@js.native
open class ObjectWindowResult ()
  extends StObject
     with IObjectWindowResult {
  
  /* CompleteClass */
  override val AccessControlList: IAccessControlList = js.native
  
  /* CompleteClass */
  override val ObjVer: IObjVer = js.native
  
  /* CompleteClass */
  override val Properties: IPropertyValues = js.native
  
  /* CompleteClass */
  override val Result: MFObjectWindowResultCode = js.native
  
  /* CompleteClass */
  override val SelectedFileClass: IFileClass = js.native
  
  /* CompleteClass */
  override val UseAsDefaults: Boolean = js.native
  
  /* CompleteClass */
  override val Visible: Boolean = js.native
}
