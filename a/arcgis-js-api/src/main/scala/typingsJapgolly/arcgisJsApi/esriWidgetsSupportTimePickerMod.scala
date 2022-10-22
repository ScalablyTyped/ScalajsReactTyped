package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.TimePicker
import typingsJapgolly.arcgisJsApi.esri.TimePickerConstructor
import typingsJapgolly.arcgisJsApi.esri.TimePickerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSupportTimePickerMod extends Shortcut {
  
  @JSImport("esri/widgets/support/TimePicker", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TimePickerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/support/TimePicker", JSImport.Namespace)
  @js.native
  /**
    * The `TimePicker` class provides functionality to easily choose an input date.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePicker.html)
    */
  open class Class ()
    extends StObject
       with TimePicker {
    def this(properties: TimePickerProperties) = this()
  }
  
  type _To = js.Object & TimePickerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSupportTimePickerMod.foo` */
  override def _to: js.Object & TimePickerConstructor = ^
}
