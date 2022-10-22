package typingsJapgolly.arcgisJsApi.global.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.SublayersOwner")
@js.native
open class SublayersOwnerCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.SublayersOwner {
  
  /**
    * Returns a deep clone of a map service's [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SublayersOwner.html#createServiceSublayers)
    */
  /* CompleteClass */
  override def createServiceSublayers(): typingsJapgolly.arcgisJsApi.esri.Collection[typingsJapgolly.arcgisJsApi.esri.Sublayer] = js.native
  
  /**
    * Returns the sublayer with the given layerId.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SublayersOwner.html#findSublayerById)
    */
  /* CompleteClass */
  override def findSublayerById(id: Double): typingsJapgolly.arcgisJsApi.esri.Sublayer = js.native
}
