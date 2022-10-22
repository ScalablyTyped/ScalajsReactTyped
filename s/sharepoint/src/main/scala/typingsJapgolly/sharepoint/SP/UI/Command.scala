package typingsJapgolly.sharepoint.SP.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.sharepoint.SP.HtmlBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Command extends StObject {
  
  def attachEvents(): Unit
  
  def get_displayName(): String
  
  def get_elementIDPrefix(): String
  
  def get_href(): String
  
  def get_isDropDownCommand(): Boolean
  
  def get_isEnabled(): Boolean
  
  def get_linkElement(): HTMLAnchorElement
  
  def get_name(): String
  
  def get_tooltip(): String
  
  /**Should override*/
  def onClick(): Unit
  
  def render(builder: HtmlBuilder): Unit
  
  def set_displayName(value: String): String
  
  def set_elementIDPrefix(value: String): String
  
  def set_isDropDownCommand(value: Boolean): Boolean
  
  def set_isEnabled(value: Boolean): Boolean
  
  def set_tooltip(value: String): String
}
object Command {
  
  inline def apply(
    attachEvents: Callback,
    get_displayName: CallbackTo[String],
    get_elementIDPrefix: CallbackTo[String],
    get_href: CallbackTo[String],
    get_isDropDownCommand: CallbackTo[Boolean],
    get_isEnabled: CallbackTo[Boolean],
    get_linkElement: CallbackTo[HTMLAnchorElement],
    get_name: CallbackTo[String],
    get_tooltip: CallbackTo[String],
    onClick: Callback,
    render: HtmlBuilder => Callback,
    set_displayName: String => String,
    set_elementIDPrefix: String => String,
    set_isDropDownCommand: Boolean => Boolean,
    set_isEnabled: Boolean => Boolean,
    set_tooltip: String => String
  ): Command = {
    val __obj = js.Dynamic.literal(attachEvents = attachEvents.toJsFn, get_displayName = get_displayName.toJsFn, get_elementIDPrefix = get_elementIDPrefix.toJsFn, get_href = get_href.toJsFn, get_isDropDownCommand = get_isDropDownCommand.toJsFn, get_isEnabled = get_isEnabled.toJsFn, get_linkElement = get_linkElement.toJsFn, get_name = get_name.toJsFn, get_tooltip = get_tooltip.toJsFn, onClick = onClick.toJsFn, render = js.Any.fromFunction1((t0: HtmlBuilder) => render(t0).runNow()), set_displayName = js.Any.fromFunction1(set_displayName), set_elementIDPrefix = js.Any.fromFunction1(set_elementIDPrefix), set_isDropDownCommand = js.Any.fromFunction1(set_isDropDownCommand), set_isEnabled = js.Any.fromFunction1(set_isEnabled), set_tooltip = js.Any.fromFunction1(set_tooltip))
    __obj.asInstanceOf[Command]
  }
  
  extension [Self <: Command](x: Self) {
    
    inline def setAttachEvents(value: Callback): Self = StObject.set(x, "attachEvents", value.toJsFn)
    
    inline def setGet_displayName(value: CallbackTo[String]): Self = StObject.set(x, "get_displayName", value.toJsFn)
    
    inline def setGet_elementIDPrefix(value: CallbackTo[String]): Self = StObject.set(x, "get_elementIDPrefix", value.toJsFn)
    
    inline def setGet_href(value: CallbackTo[String]): Self = StObject.set(x, "get_href", value.toJsFn)
    
    inline def setGet_isDropDownCommand(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_isDropDownCommand", value.toJsFn)
    
    inline def setGet_isEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_isEnabled", value.toJsFn)
    
    inline def setGet_linkElement(value: CallbackTo[HTMLAnchorElement]): Self = StObject.set(x, "get_linkElement", value.toJsFn)
    
    inline def setGet_name(value: CallbackTo[String]): Self = StObject.set(x, "get_name", value.toJsFn)
    
    inline def setGet_tooltip(value: CallbackTo[String]): Self = StObject.set(x, "get_tooltip", value.toJsFn)
    
    inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
    
    inline def setRender(value: HtmlBuilder => Callback): Self = StObject.set(x, "render", js.Any.fromFunction1((t0: HtmlBuilder) => value(t0).runNow()))
    
    inline def setSet_displayName(value: String => String): Self = StObject.set(x, "set_displayName", js.Any.fromFunction1(value))
    
    inline def setSet_elementIDPrefix(value: String => String): Self = StObject.set(x, "set_elementIDPrefix", js.Any.fromFunction1(value))
    
    inline def setSet_isDropDownCommand(value: Boolean => Boolean): Self = StObject.set(x, "set_isDropDownCommand", js.Any.fromFunction1(value))
    
    inline def setSet_isEnabled(value: Boolean => Boolean): Self = StObject.set(x, "set_isEnabled", js.Any.fromFunction1(value))
    
    inline def setSet_tooltip(value: String => String): Self = StObject.set(x, "set_tooltip", js.Any.fromFunction1(value))
  }
}
