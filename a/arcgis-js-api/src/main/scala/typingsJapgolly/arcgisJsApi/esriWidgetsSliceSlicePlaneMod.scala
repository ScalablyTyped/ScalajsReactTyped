package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.SliceSlicePlane
import typingsJapgolly.arcgisJsApi.esri.SliceSlicePlaneConstructor
import typingsJapgolly.arcgisJsApi.esri.SliceSlicePlaneProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSliceSlicePlaneMod extends Shortcut {
  
  @JSImport("esri/widgets/Slice/SlicePlane", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SliceSlicePlaneConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Slice/SlicePlane", JSImport.Namespace)
  @js.native
  /**
    * Provides the shape definition of a slice plane for the [Slice](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SlicePlane.html)
    */
  open class Class ()
    extends StObject
       with SliceSlicePlane {
    def this(properties: SliceSlicePlaneProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & SliceSlicePlaneConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSliceSlicePlaneMod.foo` */
  override def _to: js.Object & SliceSlicePlaneConstructor = ^
}
