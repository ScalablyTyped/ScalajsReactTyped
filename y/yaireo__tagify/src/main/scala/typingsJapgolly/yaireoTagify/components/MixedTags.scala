package typingsJapgolly.yaireoTagify.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CustomEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.yaireoTagify.distReactDottagifyMod.TagifyBaseReactProps
import typingsJapgolly.yaireoTagify.mod.BaseTagData
import typingsJapgolly.yaireoTagify.mod.TagifySettings
import typingsJapgolly.yaireoTagify.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MixedTags {
  
  inline def apply[T /* <: BaseTagData */](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[TagifyBaseReactProps[T]]))
  }
  
  @JSImport("@yaireo/tagify/dist/react.tagify", "MixedTags")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: BaseTagData */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def children(value: String | js.Array[String]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVarargs(value: String*): this.type = set("children", js.Array(value*))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String | (js.Array[String | T])): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: (String | T)*): this.type = set("defaultValue", js.Array(value*))
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onAdd(value: /* event */ CustomEvent => Callback): this.type = set("onAdd", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onBlur(value: /* event */ CustomEvent => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onChange(value: /* event */ CustomEvent => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onClick(value: /* event */ CustomEvent => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onDropdownHide(value: /* event */ CustomEvent => Callback): this.type = set("onDropdownHide", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onDropdownNoMatch(value: /* event */ CustomEvent => Callback): this.type = set("onDropdownNoMatch", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onDropdownScroll(value: /* event */ CustomEvent => Callback): this.type = set("onDropdownScroll", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onDropdownSelect(value: /* event */ CustomEvent => Callback): this.type = set("onDropdownSelect", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onDropdownShow(value: /* event */ CustomEvent => Callback): this.type = set("onDropdownShow", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onDropdownUpdated(value: /* event */ CustomEvent => Callback): this.type = set("onDropdownUpdated", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onEditBeforeUpdate(value: /* event */ CustomEvent => Callback): this.type = set("onEditBeforeUpdate", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onEditInput(value: /* event */ CustomEvent => Callback): this.type = set("onEditInput", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onEditKeydown(value: /* event */ CustomEvent => Callback): this.type = set("onEditKeydown", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onEditStart(value: /* event */ CustomEvent => Callback): this.type = set("onEditStart", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onEditUpdated(value: /* event */ CustomEvent => Callback): this.type = set("onEditUpdated", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onFocus(value: /* event */ CustomEvent => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onInput(value: /* event */ CustomEvent => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onInvalid(value: /* event */ CustomEvent => Callback): this.type = set("onInvalid", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onKeydown(value: /* event */ CustomEvent => Callback): this.type = set("onKeydown", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def onRemove(value: /* event */ CustomEvent => Callback): this.type = set("onRemove", js.Any.fromFunction1((t0: /* event */ CustomEvent) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def settings(value: TagifySettings[T]): this.type = set("settings", value.asInstanceOf[js.Any])
    
    inline def showDropdown(value: String | Boolean): this.type = set("showDropdown", value.asInstanceOf[js.Any])
    
    inline def tagifyRef(value: MutableRefObject[js.UndefOr[^[T]]]): this.type = set("tagifyRef", value.asInstanceOf[js.Any])
    
    inline def value(value: String | (js.Array[String | T])): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: (String | T)*): this.type = set("value", js.Array(value*))
    
    inline def whitelist(value: js.Array[String | T]): this.type = set("whitelist", value.asInstanceOf[js.Any])
    
    inline def whitelistVarargs(value: (String | T)*): this.type = set("whitelist", js.Array(value*))
  }
  
  implicit def make[T /* <: BaseTagData */](companion: MixedTags.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T /* <: BaseTagData */](p: TagifyBaseReactProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
