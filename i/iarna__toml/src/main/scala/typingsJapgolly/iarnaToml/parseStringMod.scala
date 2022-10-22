package typingsJapgolly.iarnaToml

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseStringMod {
  
  inline def apply(str: String): Record[String, Any] = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  
  @JSImport("@iarna/toml/parse-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
