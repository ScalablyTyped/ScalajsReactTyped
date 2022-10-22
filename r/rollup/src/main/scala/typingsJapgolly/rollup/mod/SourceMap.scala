package typingsJapgolly.rollup.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceMap extends StObject {
  
  var file: String
  
  var mappings: String
  
  var names: js.Array[String]
  
  var sources: js.Array[String]
  
  var sourcesContent: js.Array[String]
  
  def toUrl(): String
  
  var version: Double
}
object SourceMap {
  
  inline def apply(
    file: String,
    mappings: String,
    names: js.Array[String],
    sources: js.Array[String],
    sourcesContent: js.Array[String],
    toUrl: CallbackTo[String],
    version: Double
  ): SourceMap = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any], toUrl = toUrl.toJsFn, version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMap]
  }
  
  extension [Self <: SourceMap](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setMappings(value: String): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesContent(value: js.Array[String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
    
    inline def setSourcesContentVarargs(value: String*): Self = StObject.set(x, "sourcesContent", js.Array(value*))
    
    inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setToUrl(value: CallbackTo[String]): Self = StObject.set(x, "toUrl", value.toJsFn)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
