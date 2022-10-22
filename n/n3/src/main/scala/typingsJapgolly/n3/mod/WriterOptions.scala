package typingsJapgolly.n3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriterOptions extends StObject {
  
  var end: js.UndefOr[Boolean] = js.undefined
  
  // string type is here to maintain backwards compatibility - consider removing when
  // updating major version
  var format: js.UndefOr[String | MimeFormat] = js.undefined
  
  var prefixes: js.UndefOr[Prefixes[typingsJapgolly.rdfjsTypes.dataModelMod.NamedNode[String] | String]] = js.undefined
}
object WriterOptions {
  
  inline def apply(): WriterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriterOptions]
  }
  
  extension [Self <: WriterOptions](x: Self) {
    
    inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setFormat(value: String | MimeFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setPrefixes(value: Prefixes[typingsJapgolly.rdfjsTypes.dataModelMod.NamedNode[String] | String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    inline def setPrefixesUndefined: Self = StObject.set(x, "prefixes", js.undefined)
  }
}
