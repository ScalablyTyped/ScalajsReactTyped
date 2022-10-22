package typingsJapgolly.reactInstantsearchDom.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLFormElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactInstantsearchDom.mod.SearchBoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchBox {
  
  @JSImport("react-instantsearch-dom", "SearchBox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactInstantsearchDom.mod.SearchBox] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultRefinement(value: String): this.type = set("defaultRefinement", value.asInstanceOf[js.Any])
    
    inline def focusShortcuts(value: js.Array[String]): this.type = set("focusShortcuts", value.asInstanceOf[js.Any])
    
    inline def focusShortcutsVarargs(value: String*): this.type = set("focusShortcuts", js.Array(value*))
    
    inline def inputId(value: String): this.type = set("inputId", value.asInstanceOf[js.Any])
    
    inline def inputRef(value: Ref[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    inline def inputRefFunction1(value: HTMLInputElement | Null => Callback): this.type = set("inputRef", js.Any.fromFunction1((t0: HTMLInputElement | Null) => value(t0).runNow()))
    
    inline def inputRefNull: this.type = set("inputRef", null)
    
    inline def loadingIndicator(value: VdomElement): this.type = set("loadingIndicator", value.rawElement.asInstanceOf[js.Any])
    
    inline def onChange(value: /* event */ ReactEventFrom[HTMLInputElement] => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def onKeyDown(value: /* event */ ReactKeyboardEventFrom[HTMLInputElement] => Any): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    inline def onReset(value: /* event */ ReactEventFrom[HTMLFormElement] => Any): this.type = set("onReset", js.Any.fromFunction1(value))
    
    inline def onSubmit(value: /* event */ ReactEventFrom[HTMLFormElement] => Any): this.type = set("onSubmit", js.Any.fromFunction1(value))
    
    inline def reset(value: VdomElement): this.type = set("reset", value.rawElement.asInstanceOf[js.Any])
    
    inline def searchAsYouType(value: Boolean): this.type = set("searchAsYouType", value.asInstanceOf[js.Any])
    
    inline def showLoadingIndicator(value: Boolean): this.type = set("showLoadingIndicator", value.asInstanceOf[js.Any])
    
    inline def submit(value: VdomElement): this.type = set("submit", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SearchBox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SearchBoxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
