package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Slider
import typingsJapgolly.arcgisJsApi.esri.SliderConstructor
import typingsJapgolly.arcgisJsApi.esri.SliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSliderMod extends Shortcut {
  
  @JSImport("esri/widgets/Slider", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SliderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Slider", JSImport.Namespace)
  @js.native
  /**
    * A slider widget that can be used for filtering data, or gathering numeric input from a user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html)
    */
  open class Class ()
    extends StObject
       with Slider {
    def this(properties: SliderProperties) = this()
  }
  
  type _To = js.Object & SliderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSliderMod.foo` */
  override def _to: js.Object & SliderConstructor = ^
}
