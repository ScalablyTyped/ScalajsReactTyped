package typingsJapgolly.multiformats

import typingsJapgolly.multiformats.distTypesSrcBlockInterfaceMod.ByteView
import typingsJapgolly.multiformats.multiformatsInts.`512`
import typingsJapgolly.multiformats.multiformatsStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object codecsJsonMod {
  
  @JSImport("multiformats/codecs/json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multiformats/codecs/json", "code")
  @js.native
  val code: `512` = js.native
  
  inline def decode[T](data: ByteView[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def encode[T](node: T): ByteView[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(node.asInstanceOf[js.Any]).asInstanceOf[ByteView[T]]
  
  @JSImport("multiformats/codecs/json", "name")
  @js.native
  val name: json = js.native
}
