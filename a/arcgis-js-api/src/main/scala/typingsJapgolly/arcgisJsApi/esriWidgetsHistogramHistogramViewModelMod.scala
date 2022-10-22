package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.HistogramViewModel
import typingsJapgolly.arcgisJsApi.esri.HistogramViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.HistogramViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsHistogramHistogramViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Histogram/HistogramViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & HistogramViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Histogram/HistogramViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram-HistogramViewModel.html)
    */
  open class Class ()
    extends StObject
       with HistogramViewModel {
    def this(properties: HistogramViewModelProperties) = this()
  }
  
  type _To = js.Object & HistogramViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsHistogramHistogramViewModelMod.foo` */
  override def _to: js.Object & HistogramViewModelConstructor = ^
}
