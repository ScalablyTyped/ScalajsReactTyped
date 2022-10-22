package typingsJapgolly.htmlEscaper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-escaper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unescape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
