package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.PointBarrier
import typingsJapgolly.arcgisJsApi.esri.PointBarrierConstructor
import typingsJapgolly.arcgisJsApi.esri.PointBarrierProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportPointBarrierMod extends Shortcut {
  
  @JSImport("esri/rest/support/PointBarrier", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PointBarrierConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/PointBarrier", JSImport.Namespace)
  @js.native
  /**
    * A point barrier to restrict travel along a street network when using a [RouteLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-RouteLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PointBarrier.html)
    */
  open class Class ()
    extends StObject
       with PointBarrier {
    def this(properties: PointBarrierProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & PointBarrierConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportPointBarrierMod.foo` */
  override def _to: js.Object & PointBarrierConstructor = ^
}
