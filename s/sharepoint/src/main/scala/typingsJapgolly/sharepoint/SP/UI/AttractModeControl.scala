package typingsJapgolly.sharepoint.SP.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.microsoftAjax.Sys.UI.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttractModeControl
  extends StObject
     with Control {
  
  var cssAttractMode: String
  
  var cssAttractModeBackground: String
  
  var cssAttractModeCell: String
  
  var cssAttractModeIcon: String
  
  var cssAttractModeText: String
  
  var cssAttractModeWrapper: String
  
  var defaultAttractModeIcon: String
  
  def get_imageElement(): Any
  
  def get_textElement(): HTMLElement
}
object AttractModeControl {
  
  inline def apply(
    addCssClass: String => Callback,
    add_disposing: js.Function => Callback,
    add_propertyChanged: js.Function => Callback,
    beginUpdate: Callback,
    cssAttractMode: String,
    cssAttractModeBackground: String,
    cssAttractModeCell: String,
    cssAttractModeIcon: String,
    cssAttractModeText: String,
    cssAttractModeWrapper: String,
    defaultAttractModeIcon: String,
    dispose: Callback,
    endUpdate: Callback,
    get_element: CallbackTo[HTMLElement],
    get_events: CallbackTo[Any],
    get_id: CallbackTo[String],
    get_imageElement: CallbackTo[Any],
    get_isInitialized: CallbackTo[Boolean],
    get_isUpdating: CallbackTo[Boolean],
    get_textElement: CallbackTo[HTMLElement],
    initialize: Callback,
    onBubbleEvent: (Any, Any) => Boolean,
    raiseBubbleEvent: (Any, Any) => Callback,
    raisePropertyChanged: String => Callback,
    removeCssClass: String => Callback,
    remove_disposing: js.Function => Callback,
    remove_propertyChanged: js.Function => Callback,
    set_id: String => Callback,
    toggleCssClass: String => Callback,
    updated: Callback
  ): AttractModeControl = {
    val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1((t0: String) => addCssClass(t0).runNow()), add_disposing = js.Any.fromFunction1((t0: js.Function) => add_disposing(t0).runNow()), add_propertyChanged = js.Any.fromFunction1((t0: js.Function) => add_propertyChanged(t0).runNow()), beginUpdate = beginUpdate.toJsFn, cssAttractMode = cssAttractMode.asInstanceOf[js.Any], cssAttractModeBackground = cssAttractModeBackground.asInstanceOf[js.Any], cssAttractModeCell = cssAttractModeCell.asInstanceOf[js.Any], cssAttractModeIcon = cssAttractModeIcon.asInstanceOf[js.Any], cssAttractModeText = cssAttractModeText.asInstanceOf[js.Any], cssAttractModeWrapper = cssAttractModeWrapper.asInstanceOf[js.Any], defaultAttractModeIcon = defaultAttractModeIcon.asInstanceOf[js.Any], dispose = dispose.toJsFn, endUpdate = endUpdate.toJsFn, get_element = get_element.toJsFn, get_events = get_events.toJsFn, get_id = get_id.toJsFn, get_imageElement = get_imageElement.toJsFn, get_isInitialized = get_isInitialized.toJsFn, get_isUpdating = get_isUpdating.toJsFn, get_textElement = get_textElement.toJsFn, initialize = initialize.toJsFn, onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), raiseBubbleEvent = js.Any.fromFunction2((t0: Any, t1: Any) => (raiseBubbleEvent(t0, t1)).runNow()), raisePropertyChanged = js.Any.fromFunction1((t0: String) => raisePropertyChanged(t0).runNow()), removeCssClass = js.Any.fromFunction1((t0: String) => removeCssClass(t0).runNow()), remove_disposing = js.Any.fromFunction1((t0: js.Function) => remove_disposing(t0).runNow()), remove_propertyChanged = js.Any.fromFunction1((t0: js.Function) => remove_propertyChanged(t0).runNow()), set_id = js.Any.fromFunction1((t0: String) => set_id(t0).runNow()), toggleCssClass = js.Any.fromFunction1((t0: String) => toggleCssClass(t0).runNow()), updated = updated.toJsFn)
    __obj.asInstanceOf[AttractModeControl]
  }
  
  extension [Self <: AttractModeControl](x: Self) {
    
    inline def setCssAttractMode(value: String): Self = StObject.set(x, "cssAttractMode", value.asInstanceOf[js.Any])
    
    inline def setCssAttractModeBackground(value: String): Self = StObject.set(x, "cssAttractModeBackground", value.asInstanceOf[js.Any])
    
    inline def setCssAttractModeCell(value: String): Self = StObject.set(x, "cssAttractModeCell", value.asInstanceOf[js.Any])
    
    inline def setCssAttractModeIcon(value: String): Self = StObject.set(x, "cssAttractModeIcon", value.asInstanceOf[js.Any])
    
    inline def setCssAttractModeText(value: String): Self = StObject.set(x, "cssAttractModeText", value.asInstanceOf[js.Any])
    
    inline def setCssAttractModeWrapper(value: String): Self = StObject.set(x, "cssAttractModeWrapper", value.asInstanceOf[js.Any])
    
    inline def setDefaultAttractModeIcon(value: String): Self = StObject.set(x, "defaultAttractModeIcon", value.asInstanceOf[js.Any])
    
    inline def setGet_imageElement(value: CallbackTo[Any]): Self = StObject.set(x, "get_imageElement", value.toJsFn)
    
    inline def setGet_textElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "get_textElement", value.toJsFn)
  }
}
