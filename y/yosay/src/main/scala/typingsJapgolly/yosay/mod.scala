package typingsJapgolly.yosay

import typingsJapgolly.yosay.anon.MaxLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(message: String): String = ^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(message: String, options: MaxLength): String = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(message: Unit, options: MaxLength): String = (^.asInstanceOf[js.Dynamic].apply(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("yosay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
