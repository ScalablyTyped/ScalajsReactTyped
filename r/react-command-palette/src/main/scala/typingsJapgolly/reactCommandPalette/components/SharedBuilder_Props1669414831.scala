package typingsJapgolly.reactCommandPalette.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCommandPalette.anon.MaxDisplayed
import typingsJapgolly.reactCommandPalette.commandPaletteMod.Command
import typingsJapgolly.reactCommandPalette.reactCommandPaletteStrings.`inline`
import typingsJapgolly.reactCommandPalette.reactCommandPaletteStrings.modal
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_Props1669414831[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def alwaysRenderCommands(value: Boolean): this.type = set("alwaysRenderCommands", value.asInstanceOf[js.Any])
  
  inline def closeOnSelect(value: Boolean): this.type = set("closeOnSelect", value.asInstanceOf[js.Any])
  
  inline def defaultInputValue(value: String): this.type = set("defaultInputValue", value.asInstanceOf[js.Any])
  
  inline def display(value: modal | `inline`): this.type = set("display", value.asInstanceOf[js.Any])
  
  inline def filterSearchQuery(value: /* inputValue */ String => String): this.type = set("filterSearchQuery", js.Any.fromFunction1(value))
  
  inline def getSuggestionValue(value: /* suggestion */ Command => String): this.type = set("getSuggestionValue", js.Any.fromFunction1(value))
  
  inline def header(value: VdomNode): this.type = set("header", value.rawNode.asInstanceOf[js.Any])
  
  inline def headerNull: this.type = set("header", null)
  
  inline def headerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("header", js.Array(value*))
  
  inline def headerVdomElement(value: VdomElement): this.type = set("header", value.rawElement.asInstanceOf[js.Any])
  
  inline def highlightFirstSuggestion(value: Boolean): this.type = set("highlightFirstSuggestion", value.asInstanceOf[js.Any])
  
  inline def hotKeys(value: js.Array[String] | String): this.type = set("hotKeys", value.asInstanceOf[js.Any])
  
  inline def hotKeysVarargs(value: String*): this.type = set("hotKeys", js.Array(value*))
  
  inline def maxDisplayed(
    value: (/* props */ MaxDisplayed, /* propName */ String, /* componentName */ String) => js.Error | Null
  ): this.type = set("maxDisplayed", js.Any.fromFunction3(value))
  
  inline def onAfterOpen(value: Callback): this.type = set("onAfterOpen", value.toJsFn)
  
  inline def onChange(value: (/* inputValue */ String, /* userQuery */ String) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* inputValue */ String, t1: /* userQuery */ String) => (value(t0, t1)).runNow()))
  
  inline def onHighlight(value: /* suggestion */ Record[String, Any] => Callback): this.type = set("onHighlight", js.Any.fromFunction1((t0: /* suggestion */ Record[String, Any]) => value(t0).runNow()))
  
  inline def onRequestClose(value: Callback): this.type = set("onRequestClose", value.toJsFn)
  
  inline def onSelect(value: /* command */ Record[String, Any] => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* command */ Record[String, Any]) => value(t0).runNow()))
  
  inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
  
  inline def options(value: Record[String, Any]): this.type = set("options", value.asInstanceOf[js.Any])
  
  inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  
  inline def reactModalParentSelector(value: String): this.type = set("reactModalParentSelector", value.asInstanceOf[js.Any])
  
  inline def renderCommand(value: /* command */ Command => Node): this.type = set("renderCommand", js.Any.fromFunction1(value))
  
  inline def renderCommandNull: this.type = set("renderCommand", null)
  
  inline def resetInputOnOpen(value: Boolean): this.type = set("resetInputOnOpen", value.asInstanceOf[js.Any])
  
  inline def shouldReturnFocusAfterClose(value: Boolean): this.type = set("shouldReturnFocusAfterClose", value.asInstanceOf[js.Any])
  
  inline def showSpinnerOnSelect(value: Boolean): this.type = set("showSpinnerOnSelect", value.asInstanceOf[js.Any])
  
  inline def spinner(value: VdomNode): this.type = set("spinner", value.rawNode.asInstanceOf[js.Any])
  
  inline def spinnerNull: this.type = set("spinner", null)
  
  inline def spinnerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("spinner", js.Array(value*))
  
  inline def spinnerVdomElement(value: VdomElement): this.type = set("spinner", value.rawElement.asInstanceOf[js.Any])
  
  inline def theme(value: Record[String, String]): this.type = set("theme", value.asInstanceOf[js.Any])
  
  inline def trigger(value: VdomNode): this.type = set("trigger", value.rawNode.asInstanceOf[js.Any])
  
  inline def triggerNull: this.type = set("trigger", null)
  
  inline def triggerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("trigger", js.Array(value*))
  
  inline def triggerVdomElement(value: VdomElement): this.type = set("trigger", value.rawElement.asInstanceOf[js.Any])
}
