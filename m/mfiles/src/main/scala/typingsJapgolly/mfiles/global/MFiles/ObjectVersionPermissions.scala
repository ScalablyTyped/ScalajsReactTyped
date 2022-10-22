package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAccessControlList
import typingsJapgolly.mfiles.INamedACL
import typingsJapgolly.mfiles.IObjVer
import typingsJapgolly.mfiles.IObjectVersionPermissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ObjectVersionPermissions")
@js.native
open class ObjectVersionPermissions ()
  extends StObject
     with IObjectVersionPermissions {
  
  /* CompleteClass */
  override val AccessControlList: IAccessControlList = js.native
  
  /* CompleteClass */
  override val CustomACL: Boolean = js.native
  
  /* CompleteClass */
  override val NamedACL: INamedACL = js.native
  
  /* CompleteClass */
  override val ObjVer: IObjVer = js.native
}
