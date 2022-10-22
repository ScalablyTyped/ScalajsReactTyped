package typingsJapgolly.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMClippingPath extends StObject {
  
  /**
    * The clipping type.
    */
  var clippingType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ClippingType * / any */ String
  ] = js.undefined
  
  /**
    * The clipping path.
    */
  var path: js.UndefOr[ExternalReferencePolygon] = js.undefined
  
  var `type`: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMClippingPath
}
object CIMClippingPath {
  
  inline def apply(): CIMClippingPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMClippingPath")
    __obj.asInstanceOf[CIMClippingPath]
  }
  
  extension [Self <: CIMClippingPath](x: Self) {
    
    inline def setClippingType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ClippingType * / any */ String
    ): Self = StObject.set(x, "clippingType", value.asInstanceOf[js.Any])
    
    inline def setClippingTypeUndefined: Self = StObject.set(x, "clippingType", js.undefined)
    
    inline def setPath(value: ExternalReferencePolygon): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setType(value: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.CIMClippingPath): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
