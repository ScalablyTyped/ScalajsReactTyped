package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SublayersOwner extends StObject {
  
  /**
    * Returns a deep clone of a map service's [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SublayersOwner.html#createServiceSublayers)
    */
  def createServiceSublayers(): Collection[Sublayer]
  
  /**
    * Returns the sublayer with the given layerId.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SublayersOwner.html#findSublayerById)
    */
  def findSublayerById(id: Double): Sublayer
}
object SublayersOwner {
  
  inline def apply(createServiceSublayers: CallbackTo[Collection[Sublayer]], findSublayerById: Double => Sublayer): SublayersOwner = {
    val __obj = js.Dynamic.literal(createServiceSublayers = createServiceSublayers.toJsFn, findSublayerById = js.Any.fromFunction1(findSublayerById))
    __obj.asInstanceOf[SublayersOwner]
  }
  
  extension [Self <: SublayersOwner](x: Self) {
    
    inline def setCreateServiceSublayers(value: CallbackTo[Collection[Sublayer]]): Self = StObject.set(x, "createServiceSublayers", value.toJsFn)
    
    inline def setFindSublayerById(value: Double => Sublayer): Self = StObject.set(x, "findSublayerById", js.Any.fromFunction1(value))
  }
}
