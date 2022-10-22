package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ready
import typingsJapgolly.arcgisJsApi.esri.TimePickerViewModel
import typingsJapgolly.arcgisJsApi.esri.TimePickerViewModelConstructor
import typingsJapgolly.arcgisJsApi.esri.TimePickerViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSupportTimePickerViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/support/TimePickerViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TimePickerViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/support/TimePickerViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [TimePicker](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePicker.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-TimePickerViewModel.html)
    */
  open class Class ()
    extends StObject
       with TimePickerViewModel {
    def this(properties: TimePickerViewModelProperties) = this()
    
    /**
      * The current state of the widget.
      *
      * @default ready
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DateTimeElementViewModel.html#state)
      */
    /* CompleteClass */
    var state: ready = js.native
    
    /**
      * The selected date.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-DateTimeElementViewModel.html#value)
      */
    /* CompleteClass */
    var value: js.Date = js.native
  }
  
  type _To = js.Object & TimePickerViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSupportTimePickerViewModelMod.foo` */
  override def _to: js.Object & TimePickerViewModelConstructor = ^
}
