package typingsJapgolly.iarnaToml

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringifyMod {
  
  inline def apply(obj: Record[String, Any]): String = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@iarna/toml/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** Serialize a value as TOML would. This is a fragment and not a complete valid TOML document. */
  inline def value(v: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("value")(v.asInstanceOf[js.Any]).asInstanceOf[String]
}
