package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fundamentalReact.anon.Text
import typingsJapgolly.fundamentalReact.libSearchInputSearchInputMod.SearchInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchInput {
  
  @JSImport("fundamental-react", "SearchInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.fundamentalReact.mod.SearchInput] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    inline def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    inline def inShellbar(value: Boolean): this.type = set("inShellbar", value.asInstanceOf[js.Any])
    
    inline def inputGroupAddonProps(value: Any): this.type = set("inputGroupAddonProps", value.asInstanceOf[js.Any])
    
    inline def inputGroupProps(value: Any): this.type = set("inputGroupProps", value.asInstanceOf[js.Any])
    
    inline def inputProps(value: Any): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    inline def listProps(value: Any): this.type = set("listProps", value.asInstanceOf[js.Any])
    
    inline def noSearchBtn(value: Boolean): this.type = set("noSearchBtn", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* event */ ReactEventFrom[HTMLInputElement] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLInputElement]) => value(t0).runNow()))
    
    inline def onEnter(value: /* value */ js.UndefOr[String | Double | js.Array[String]] => Callback): this.type = set("onEnter", js.Any.fromFunction1((t0: /* value */ js.UndefOr[String | Double | js.Array[String]]) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def popoverProps(value: Any): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    
    inline def searchBtnProps(value: Any): this.type = set("searchBtnProps", value.asInstanceOf[js.Any])
    
    inline def searchList(value: js.Array[typingsJapgolly.fundamentalReact.anon.Callback]): this.type = set("searchList", value.asInstanceOf[js.Any])
    
    inline def searchListVarargs(value: typingsJapgolly.fundamentalReact.anon.Callback*): this.type = set("searchList", js.Array(value*))
    
    inline def validationState(value: Text): this.type = set("validationState", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SearchInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SearchInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
