package typingsJapgolly.sizeof

import typingsJapgolly.sizeof.sizeofBooleans.`false`
import typingsJapgolly.sizeof.sizeofBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sizeof", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(bytes: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sizeof(`object`: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeof")(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sizeof_false(`object`: Any, pretty: `false`): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sizeof")(`object`.asInstanceOf[js.Any], pretty.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sizeof_true(`object`: Any, pretty: `true`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sizeof")(`object`.asInstanceOf[js.Any], pretty.asInstanceOf[js.Any])).asInstanceOf[String]
}
