package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.SpatialReference
import typingsJapgolly.arcgisJsApi.esri.SpatialReferenceConstructor
import typingsJapgolly.arcgisJsApi.esri.SpatialReferenceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriGeometrySpatialReferenceMod extends Shortcut {
  
  @JSImport("esri/geometry/SpatialReference", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SpatialReferenceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/SpatialReference", JSImport.Namespace)
  @js.native
  /**
    * Defines the spatial reference of a view, layer, or method parameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html)
    */
  open class Class ()
    extends StObject
       with SpatialReference {
    def this(properties: SpatialReferenceProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & SpatialReferenceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriGeometrySpatialReferenceMod.foo` */
  override def _to: js.Object & SpatialReferenceConstructor = ^
}
