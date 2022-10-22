package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.SizeSlider
import typingsJapgolly.arcgisJsApi.esri.SizeSliderConstructor
import typingsJapgolly.arcgisJsApi.esri.SizeSliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSmartMappingSizeSliderMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/SizeSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SizeSliderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/SizeSlider", JSImport.Namespace)
  @js.native
  /**
    * The SizeSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html)
    */
  open class Class ()
    extends StObject
       with SizeSlider {
    def this(properties: SizeSliderProperties) = this()
  }
  
  type _To = js.Object & SizeSliderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSmartMappingSizeSliderMod.foo` */
  override def _to: js.Object & SizeSliderConstructor = ^
}
