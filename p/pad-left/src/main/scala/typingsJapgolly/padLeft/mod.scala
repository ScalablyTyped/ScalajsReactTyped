package typingsJapgolly.padLeft

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(str: String): String = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(str: String, num: Double): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(str: String, num: Double, ch: String): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], num.asInstanceOf[js.Any], ch.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(str: String, num: Unit, ch: String): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], num.asInstanceOf[js.Any], ch.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("pad-left", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
