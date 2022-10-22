package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.MeasurementViewModel
import typingsJapgolly.arcgisJsApi.esri.MeasurementViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.MeasurementViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsMeasurementMeasurementViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Measurement/MeasurementViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MeasurementViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Measurement/MeasurementViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Measurement](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Measurement-MeasurementViewModel.html)
    */
  open class Class ()
    extends StObject
       with MeasurementViewModel {
    def this(properties: MeasurementViewModelProperties) = this()
  }
  
  type _To = js.Object & MeasurementViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsMeasurementMeasurementViewModelMod.foo` */
  override def _to: js.Object & MeasurementViewModelConstructor = ^
}
