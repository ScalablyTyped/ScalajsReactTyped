package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ColorSlider
import typingsJapgolly.arcgisJsApi.esri.ColorSliderConstructor
import typingsJapgolly.arcgisJsApi.esri.ColorSliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSmartMappingColorSliderMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/ColorSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ColorSliderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/ColorSlider", JSImport.Namespace)
  @js.native
  /**
    * The ColorSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider.html)
    */
  open class Class ()
    extends StObject
       with ColorSlider {
    def this(properties: ColorSliderProperties) = this()
  }
  
  type _To = js.Object & ColorSliderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSmartMappingColorSliderMod.foo` */
  override def _to: js.Object & ColorSliderConstructor = ^
}
