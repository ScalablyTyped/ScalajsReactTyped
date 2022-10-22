package typingsJapgolly.vegaSchemaUrlParser

import typingsJapgolly.vegaSchemaUrlParser.vegaSchemaUrlParserStrings.`vega-lite`
import typingsJapgolly.vegaSchemaUrlParser.vegaSchemaUrlParserStrings.vega
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Library extends StObject {
    
    var library: vega | `vega-lite`
    
    var version: String
  }
  object Library {
    
    inline def apply(library: vega | `vega-lite`, version: String): Library = {
      val __obj = js.Dynamic.literal(library = library.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Library]
    }
    
    extension [Self <: Library](x: Self) {
      
      inline def setLibrary(value: vega | `vega-lite`): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
