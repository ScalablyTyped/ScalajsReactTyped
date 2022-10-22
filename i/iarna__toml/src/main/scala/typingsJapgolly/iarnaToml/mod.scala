package typingsJapgolly.iarnaToml

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@iarna/toml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(str: String): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  
  object stringify {
    
    inline def apply(obj: Record[String, Any]): String = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@iarna/toml", "stringify")
    @js.native
    val ^ : js.Any = js.native
    
    /** Serialize a value as TOML would. This is a fragment and not a complete valid TOML document. */
    inline def value(v: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("value")(v.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
