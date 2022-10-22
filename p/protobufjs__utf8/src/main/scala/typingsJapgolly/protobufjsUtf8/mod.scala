package typingsJapgolly.protobufjsUtf8

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@protobufjs/utf8", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def length(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def read(buffer: js.typedarray.Uint8Array, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def write(string: String, buffer: js.typedarray.Uint8Array, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(string.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
}
