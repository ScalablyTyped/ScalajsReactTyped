package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.DataLayer
import typingsJapgolly.arcgisJsApi.esri.DataLayerConstructor
import typingsJapgolly.arcgisJsApi.esri.DataLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportDataLayerMod extends Shortcut {
  
  @JSImport("esri/rest/support/DataLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DataLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/DataLayer", JSImport.Namespace)
  @js.native
  /**
    * Input for properties of ClosestFacilityParameters, RouteParameters or ServiceAreaParameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DataLayer.html)
    */
  open class Class ()
    extends StObject
       with DataLayer {
    def this(properties: DataLayerProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & DataLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportDataLayerMod.foo` */
  override def _to: js.Object & DataLayerConstructor = ^
}
