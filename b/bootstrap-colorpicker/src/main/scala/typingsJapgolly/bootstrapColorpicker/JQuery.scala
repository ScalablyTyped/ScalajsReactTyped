package typingsJapgolly.bootstrapColorpicker

import typingsJapgolly.bootstrapColorpicker.bootstrapColorpickerStrings.colorpicker
import typingsJapgolly.bootstrapColorpicker.bootstrapColorpickerStrings.destroy
import typingsJapgolly.bootstrapColorpicker.bootstrapColorpickerStrings.disable
import typingsJapgolly.bootstrapColorpicker.bootstrapColorpickerStrings.enable
import typingsJapgolly.bootstrapColorpicker.bootstrapColorpickerStrings.getValue
import typingsJapgolly.bootstrapColorpicker.bootstrapColorpickerStrings.hide
import typingsJapgolly.bootstrapColorpicker.bootstrapColorpickerStrings.reposition
import typingsJapgolly.bootstrapColorpicker.bootstrapColorpickerStrings.setValue
import typingsJapgolly.bootstrapColorpicker.bootstrapColorpickerStrings.show
import typingsJapgolly.bootstrapColorpicker.bootstrapColorpickerStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  /**
    * Initializes an colorpicker.
    */
  def colorpicker(): JQuery = js.native
  def colorpicker(options: ColorPickerOptions): JQuery = js.native
  /**
    * Destroys the colorpicker widget and unbind all .colorpicker events from the element and component
    */
  @JSName("colorpicker")
  def colorpicker_destroy(methodName: destroy): Unit = js.native
  /**
    * Disable the color picker.
    */
  @JSName("colorpicker")
  def colorpicker_disable(methodName: disable): Unit = js.native
  /**
    * Enable the color picker.
    */
  @JSName("colorpicker")
  def colorpicker_enable(methodName: enable): Unit = js.native
  /**
    * Gets the value from the input or the data attribute (if has no input), otherwise returns the default value, which defaults to #000000 if not specified.
    */
  @JSName("colorpicker")
  def colorpicker_getValue(methodName: getValue, defaultValue: String): String = js.native
  /**
    * Hide the color picker
    */
  @JSName("colorpicker")
  def colorpicker_hide(methodName: hide): Unit = js.native
  /**
    * Updates the color picker's position relative to the element
    */
  @JSName("colorpicker")
  def colorpicker_reposition(methodName: reposition): Unit = js.native
  /**
    * Set a new value for the color picker (also updates everything). Triggers 'changeColor' event.
    */
  @JSName("colorpicker")
  def colorpicker_setValue(methodName: setValue, value: Any): Any = js.native
  /**
    * Show the color picker
    */
  @JSName("colorpicker")
  def colorpicker_show(methodName: show): Unit = js.native
  /**
    * Refreshes the widget colors (this is done automatically)
    */
  @JSName("colorpicker")
  def colorpicker_update(methodName: update): Unit = js.native
  
  /**
    * Access to the colorpicker API directly
    */
  @JSName("data")
  def data_colorpicker(methodName: colorpicker): ColorPicker = js.native
  
  def off(events: ColorPickerEvents): JQuery = js.native
  def off(events: ColorPickerEvents, handler: js.Function1[/* event */ ColorPickerEventObject, Any]): JQuery = js.native
  def off(events: ColorPickerEvents, selector: String): JQuery = js.native
  def off(
    events: ColorPickerEvents,
    selector: String,
    handler: js.Function1[/* event */ ColorPickerEventObject, Any]
  ): JQuery = js.native
  def off(
    events: ColorPickerEvents,
    selector: Unit,
    handler: js.Function1[/* event */ ColorPickerEventObject, Any]
  ): JQuery = js.native
  
  def on(events: ColorPickerEvents, handler: js.Function1[/* event */ ColorPickerEventObject, Any]): JQuery = js.native
  def on(events: ColorPickerEvents, selector: String, data: Any): JQuery = js.native
  def on(
    events: ColorPickerEvents,
    selector: String,
    data: Any,
    handler: js.Function1[/* event */ ColorPickerEventObject, Any]
  ): JQuery = js.native
  def on(
    events: ColorPickerEvents,
    selector: String,
    handler: js.Function1[/* event */ ColorPickerEventObject, Any]
  ): JQuery = js.native
}
