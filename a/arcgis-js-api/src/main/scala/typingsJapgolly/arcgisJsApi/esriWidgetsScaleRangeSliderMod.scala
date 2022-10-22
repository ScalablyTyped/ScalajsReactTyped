package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.ScaleRangeSlider
import typingsJapgolly.arcgisJsApi.esri.ScaleRangeSliderConstructor
import typingsJapgolly.arcgisJsApi.esri.ScaleRangeSliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsScaleRangeSliderMod extends Shortcut {
  
  @JSImport("esri/widgets/ScaleRangeSlider", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ScaleRangeSliderConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/ScaleRangeSlider", JSImport.Namespace)
  @js.native
  /**
    * The ScaleRangeSlider widget allows the user to set a minimum and maximum scale based on named scale ranges.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html)
    */
  open class Class ()
    extends StObject
       with ScaleRangeSlider {
    def this(properties: ScaleRangeSliderProperties) = this()
  }
  
  type _To = js.Object & ScaleRangeSliderConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsScaleRangeSliderMod.foo` */
  override def _to: js.Object & ScaleRangeSliderConstructor = ^
}
