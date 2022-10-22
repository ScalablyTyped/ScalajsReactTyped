package typingsJapgolly.vlq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vlq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(string: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def encode(value: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
