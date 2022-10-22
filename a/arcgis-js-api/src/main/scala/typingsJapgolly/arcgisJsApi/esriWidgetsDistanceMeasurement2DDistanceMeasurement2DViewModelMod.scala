package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.DistanceMeasurement2DViewModel
import typingsJapgolly.arcgisJsApi.esri.DistanceMeasurement2DViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.DistanceMeasurement2DViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsDistanceMeasurement2DDistanceMeasurement2DViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/DistanceMeasurement2D/DistanceMeasurement2DViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DistanceMeasurement2DViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/DistanceMeasurement2D/DistanceMeasurement2DViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [DistanceMeasurement2D](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html)
    */
  open class Class ()
    extends StObject
       with DistanceMeasurement2DViewModel {
    def this(properties: DistanceMeasurement2DViewModelProperties) = this()
  }
  
  type _To = js.Object & DistanceMeasurement2DViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsDistanceMeasurement2DDistanceMeasurement2DViewModelMod.foo` */
  override def _to: js.Object & DistanceMeasurement2DViewModelConstructor = ^
}
