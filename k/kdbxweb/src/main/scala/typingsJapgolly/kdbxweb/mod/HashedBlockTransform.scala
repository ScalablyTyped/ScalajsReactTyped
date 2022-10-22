package typingsJapgolly.kdbxweb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HashedBlockTransform {
  
  @JSImport("kdbxweb", "HashedBlockTransform")
  @js.native
  val ^ : js.Any = js.native
  
  inline def decrypt(data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  inline def encrypt(data: js.typedarray.ArrayBuffer): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
}
