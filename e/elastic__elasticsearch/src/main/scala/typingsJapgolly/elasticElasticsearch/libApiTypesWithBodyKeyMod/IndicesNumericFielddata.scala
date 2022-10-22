package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesNumericFielddata extends StObject {
  
  var format: IndicesNumericFielddataFormat
}
object IndicesNumericFielddata {
  
  inline def apply(format: IndicesNumericFielddataFormat): IndicesNumericFielddata = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesNumericFielddata]
  }
  
  extension [Self <: IndicesNumericFielddata](x: Self) {
    
    inline def setFormat(value: IndicesNumericFielddataFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
