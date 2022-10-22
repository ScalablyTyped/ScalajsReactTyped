package typingsJapgolly.multiformatsMultiaddr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object convertMod {
  
  @JSImport("@multiformats/multiaddr/convert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(proto: String, a: String): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(proto.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
  inline def convert(proto: String, a: js.typedarray.Uint8Array): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(proto.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
  
  inline def convertToBytes(proto: String, str: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToBytes")(proto.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def convertToBytes(proto: Double, str: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToBytes")(proto.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def convertToString(proto: String, buf: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToString")(proto.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def convertToString(proto: Double, buf: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToString")(proto.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String]
}
