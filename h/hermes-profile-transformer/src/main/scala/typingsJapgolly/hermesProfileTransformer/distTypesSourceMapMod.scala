package typingsJapgolly.hermesProfileTransformer

import typingsJapgolly.hermesProfileTransformer.anon.Mappings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSourceMapMod {
  
  trait SourceMap extends StObject {
    
    var mappings: String
    
    var names: js.Array[String]
    
    var sourceContent: js.Array[String]
    
    var sources: js.Array[String]
    
    var version: String
    
    var x_facebook_sources: js.Array[Mappings] | Null
  }
  object SourceMap {
    
    inline def apply(
      mappings: String,
      names: js.Array[String],
      sourceContent: js.Array[String],
      sources: js.Array[String],
      version: String
    ): SourceMap = {
      val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sourceContent = sourceContent.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], x_facebook_sources = null)
      __obj.asInstanceOf[SourceMap]
    }
    
    extension [Self <: SourceMap](x: Self) {
      
      inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setSourceContent(value: js.Array[String]): Self = StObject.set(x, "sourceContent", value.asInstanceOf[js.Any])
      
      inline def setSourceContentVarargs(value: String*): Self = StObject.set(x, "sourceContent", js.Array(value*))
      
      inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setX_facebook_sources(value: js.Array[Mappings]): Self = StObject.set(x, "x_facebook_sources", value.asInstanceOf[js.Any])
      
      inline def setX_facebook_sourcesNull: Self = StObject.set(x, "x_facebook_sources", null)
      
      inline def setX_facebook_sourcesVarargs(value: Mappings*): Self = StObject.set(x, "x_facebook_sources", js.Array(value*))
    }
  }
}
