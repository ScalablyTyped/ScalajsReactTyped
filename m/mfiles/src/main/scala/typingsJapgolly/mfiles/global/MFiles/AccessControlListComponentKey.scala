package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAccessControlListComponentKey
import typingsJapgolly.mfiles.MFiles.MFBuiltInPropertyDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.AccessControlListComponentKey")
@js.native
open class AccessControlListComponentKey ()
  extends StObject
     with IAccessControlListComponentKey {
  
  /* CompleteClass */
  override def Clone(): IAccessControlListComponentKey = js.native
  
  /* CompleteClass */
  var ItemID: Double = js.native
  
  /* CompleteClass */
  var PropertyDefID: MFBuiltInPropertyDef | Double = js.native
}
