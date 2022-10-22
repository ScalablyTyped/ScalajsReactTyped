package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.blueprintjsCoreBooleans.`false`
import typingsJapgolly.blueprintjsCore.libEsmCommonIntentMod.Intent
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.HTMLInputProps
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typingsJapgolly.blueprintjsCore.libEsmComponentsTagInputTagInputMod.ITagInputProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsTagInputTagInputMod.TagInputAddMethod
import typingsJapgolly.blueprintjsCore.libEsmComponentsTagTagMod.TagProps
import typingsJapgolly.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TagInput {
  
  inline def apply(values: js.Array[Node]): Builder = {
    val __props = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITagInputProps]))
  }
  
  @JSImport("@blueprintjs/core", "TagInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.TagInput] {
    
    inline def addOnBlur(value: Boolean): this.type = set("addOnBlur", value.asInstanceOf[js.Any])
    
    inline def addOnPaste(value: Boolean): this.type = set("addOnPaste", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def fill(value: Boolean): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def inputProps(value: HTMLInputProps): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    inline def inputRef(value: Ref[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    inline def inputRefFunction1(value: HTMLInputElement | Null => Callback): this.type = set("inputRef", js.Any.fromFunction1((t0: HTMLInputElement | Null) => value(t0).runNow()))
    
    inline def inputRefNull: this.type = set("inputRef", null)
    
    inline def inputValue(value: String): this.type = set("inputValue", value.asInstanceOf[js.Any])
    
    inline def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    
    inline def large(value: Boolean): this.type = set("large", value.asInstanceOf[js.Any])
    
    inline def leftIcon(value: BlueprintIcons16Id | MaybeElement): this.type = set("leftIcon", value.asInstanceOf[js.Any])
    
    inline def leftIconNull: this.type = set("leftIcon", null)
    
    inline def leftIconVdomElement(value: VdomElement): this.type = set("leftIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def onAdd(value: (/* values */ js.Array[String], /* method */ TagInputAddMethod) => Boolean | Unit): this.type = set("onAdd", js.Any.fromFunction2(value))
    
    inline def onChange(value: /* values */ js.Array[Node] => Boolean | Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def onInputChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onInputChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def onKeyDown(
      value: (/* event */ ReactKeyboardEventFrom[HTMLElement], /* index */ js.UndefOr[Double]) => Callback
    ): this.type = set("onKeyDown", js.Any.fromFunction2((t0: /* event */ ReactKeyboardEventFrom[HTMLElement], t1: /* index */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def onKeyUp(
      value: (/* event */ ReactKeyboardEventFrom[HTMLElement], /* index */ js.UndefOr[Double]) => Callback
    ): this.type = set("onKeyUp", js.Any.fromFunction2((t0: /* event */ ReactKeyboardEventFrom[HTMLElement], t1: /* index */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def onRemove(value: (/* value */ Node, /* index */ Double) => Callback): this.type = set("onRemove", js.Any.fromFunction2((t0: /* value */ Node, t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def rightElement(value: VdomElement): this.type = set("rightElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def separator(value: String | js.RegExp | `false`): this.type = set("separator", value.asInstanceOf[js.Any])
    
    inline def tagProps(value: TagProps | (js.Function2[/* value */ Node, /* index */ Double, TagProps])): this.type = set("tagProps", value.asInstanceOf[js.Any])
    
    inline def tagPropsFunction2(value: (/* value */ Node, /* index */ Double) => TagProps): this.type = set("tagProps", js.Any.fromFunction2(value))
  }
  
  def withProps(p: ITagInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
