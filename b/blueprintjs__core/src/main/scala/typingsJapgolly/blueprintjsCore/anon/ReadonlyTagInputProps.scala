package typingsJapgolly.blueprintjsCore.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.blueprintjsCore.blueprintjsCoreBooleans.`false`
import typingsJapgolly.blueprintjsCore.libEsmCommonIntentMod.Intent
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.HTMLInputProps
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typingsJapgolly.blueprintjsCore.libEsmComponentsTagInputTagInputMod.TagInputAddMethod
import typingsJapgolly.blueprintjsCore.libEsmComponentsTagTagMod.TagProps
import typingsJapgolly.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tag-input/tagInput.TagInputProps> */
trait ReadonlyTagInputProps extends StObject {
  
  val addOnBlur: js.UndefOr[Boolean] = js.undefined
  
  val addOnPaste: js.UndefOr[Boolean] = js.undefined
  
  val children: js.UndefOr[Node] = js.undefined
  
  val className: js.UndefOr[String] = js.undefined
  
  val disabled: js.UndefOr[Boolean] = js.undefined
  
  val fill: js.UndefOr[Boolean] = js.undefined
  
  val inputProps: js.UndefOr[HTMLInputProps] = js.undefined
  
  val inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
  
  val inputValue: js.UndefOr[String] = js.undefined
  
  val intent: js.UndefOr[Intent] = js.undefined
  
  val large: js.UndefOr[Boolean] = js.undefined
  
  val leftIcon: js.UndefOr[BlueprintIcons16Id | MaybeElement] = js.undefined
  
  val onAdd: js.UndefOr[
    js.Function2[/* values */ js.Array[String], /* method */ TagInputAddMethod, Boolean | Unit]
  ] = js.undefined
  
  val onChange: js.UndefOr[js.Function1[/* values */ js.Array[Node], Boolean | Unit]] = js.undefined
  
  val onInputChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
  
  val onKeyDown: js.UndefOr[
    js.Function2[
      /* event */ ReactKeyboardEventFrom[HTMLElement], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  
  val onKeyUp: js.UndefOr[
    js.Function2[
      /* event */ ReactKeyboardEventFrom[HTMLElement], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  
  val onRemove: js.UndefOr[js.Function2[/* value */ Node, /* index */ Double, Unit]] = js.undefined
  
  val placeholder: js.UndefOr[String] = js.undefined
  
  val rightElement: js.UndefOr[Element] = js.undefined
  
  val separator: js.UndefOr[String | js.RegExp | `false`] = js.undefined
  
  val tagProps: js.UndefOr[TagProps | (js.Function2[/* value */ Node, /* index */ Double, TagProps])] = js.undefined
  
  val values: js.Array[Node]
}
object ReadonlyTagInputProps {
  
  inline def apply(values: js.Array[Node]): ReadonlyTagInputProps = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyTagInputProps]
  }
  
  extension [Self <: ReadonlyTagInputProps](x: Self) {
    
    inline def setAddOnBlur(value: Boolean): Self = StObject.set(x, "addOnBlur", value.asInstanceOf[js.Any])
    
    inline def setAddOnBlurUndefined: Self = StObject.set(x, "addOnBlur", js.undefined)
    
    inline def setAddOnPaste(value: Boolean): Self = StObject.set(x, "addOnPaste", value.asInstanceOf[js.Any])
    
    inline def setAddOnPasteUndefined: Self = StObject.set(x, "addOnPaste", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setInputProps(value: HTMLInputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
    
    inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
    
    inline def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
    
    inline def setInputRefFunction1(value: HTMLInputElement | Null => Callback): Self = StObject.set(x, "inputRef", js.Any.fromFunction1((t0: HTMLInputElement | Null) => value(t0).runNow()))
    
    inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
    
    inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    inline def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    inline def setLeftIcon(value: BlueprintIcons16Id | MaybeElement): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
    
    inline def setLeftIconNull: Self = StObject.set(x, "leftIcon", null)
    
    inline def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
    
    inline def setLeftIconVdomElement(value: VdomElement): Self = StObject.set(x, "leftIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOnAdd(value: (/* values */ js.Array[String], /* method */ TagInputAddMethod) => Boolean | Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction2(value))
    
    inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    inline def setOnChange(value: /* values */ js.Array[Node] => Boolean | Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnInputChange(value: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInputChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
    
    inline def setOnKeyDown(
      value: (/* event */ ReactKeyboardEventFrom[HTMLElement], /* index */ js.UndefOr[Double]) => Callback
    ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2((t0: /* event */ ReactKeyboardEventFrom[HTMLElement], t1: /* index */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyUp(
      value: (/* event */ ReactKeyboardEventFrom[HTMLElement], /* index */ js.UndefOr[Double]) => Callback
    ): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction2((t0: /* event */ ReactKeyboardEventFrom[HTMLElement], t1: /* index */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnRemove(value: (/* value */ Node, /* index */ Double) => Callback): Self = StObject.set(x, "onRemove", js.Any.fromFunction2((t0: /* value */ Node, t1: /* index */ Double) => (value(t0, t1)).runNow()))
    
    inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setRightElement(value: VdomElement): Self = StObject.set(x, "rightElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
    
    inline def setSeparator(value: String | js.RegExp | `false`): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setTagProps(value: TagProps | (js.Function2[/* value */ Node, /* index */ Double, TagProps])): Self = StObject.set(x, "tagProps", value.asInstanceOf[js.Any])
    
    inline def setTagPropsFunction2(value: (/* value */ Node, /* index */ Double) => TagProps): Self = StObject.set(x, "tagProps", js.Any.fromFunction2(value))
    
    inline def setTagPropsUndefined: Self = StObject.set(x, "tagProps", js.undefined)
    
    inline def setValues(value: js.Array[Node]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Node*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
