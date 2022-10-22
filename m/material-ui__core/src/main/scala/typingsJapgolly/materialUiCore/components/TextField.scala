package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUiCore.anon.PartialFilledInputProps
import typingsJapgolly.materialUiCore.anon.PartialInputProps
import typingsJapgolly.materialUiCore.anon.PartialOutlinedInputProps
import typingsJapgolly.materialUiCore.anon.PartialSelectPropsAbout
import typingsJapgolly.materialUiCore.materialUiCoreStrings.medium
import typingsJapgolly.materialUiCore.materialUiCoreStrings.p
import typingsJapgolly.materialUiCore.materialUiCoreStrings.primary
import typingsJapgolly.materialUiCore.materialUiCoreStrings.secondary
import typingsJapgolly.materialUiCore.materialUiCoreStrings.small
import typingsJapgolly.materialUiCore.materialUiCoreStrings.standard
import typingsJapgolly.materialUiCore.mod.PropTypes.Margin
import typingsJapgolly.materialUiCore.textFieldTextFieldMod.TextFieldClassKey
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLInputTypeAttribute
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextField {
  
  object FilledTextFieldProps {
    
    inline def apply(): Builder = {
      val __props = js.Dynamic.literal(variant = "filled")
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.materialUiCore.textFieldTextFieldMod.FilledTextFieldProps]))
    }
    
    @JSImport("@material-ui/core", "TextField")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def FormHelperTextProps(
        value: Partial[
              typingsJapgolly.materialUiCore.formHelperTextFormHelperTextMod.FormHelperTextProps[p, js.Object]
            ]
      ): this.type = set("FormHelperTextProps", value.asInstanceOf[js.Any])
      
      inline def InputLabelProps(value: Partial[typingsJapgolly.materialUiCore.inputLabelInputLabelMod.InputLabelProps]): this.type = set("InputLabelProps", value.asInstanceOf[js.Any])
      
      inline def InputProps(value: PartialFilledInputProps): this.type = set("InputProps", value.asInstanceOf[js.Any])
      
      inline def SelectProps(value: PartialSelectPropsAbout): this.type = set("SelectProps", value.asInstanceOf[js.Any])
      
      inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
      
      inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def classes(value: Partial[ClassNameMap[TextFieldClassKey]]): this.type = set("classes", value.asInstanceOf[js.Any])
      
      inline def color(value: primary | secondary): this.type = set("color", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: Any): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
      
      inline def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
      
      inline def helperText(value: VdomNode): this.type = set("helperText", value.rawNode.asInstanceOf[js.Any])
      
      inline def helperTextNull: this.type = set("helperText", null)
      
      inline def helperTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("helperText", js.Array(value*))
      
      inline def helperTextVdomElement(value: VdomElement): this.type = set("helperText", value.rawElement.asInstanceOf[js.Any])
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def innerRef(value: Ref[Any]): this.type = set("innerRef", value.asInstanceOf[js.Any])
      
      inline def innerRefFunction1(value: Any | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def innerRefNull: this.type = set("innerRef", null)
      
      inline def inputRef(value: Ref[Any]): this.type = set("inputRef", value.asInstanceOf[js.Any])
      
      inline def inputRefFunction1(value: Any | Null => Callback): this.type = set("inputRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def inputRefNull: this.type = set("inputRef", null)
      
      inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
      
      inline def labelNull: this.type = set("label", null)
      
      inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
      
      inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
      
      inline def margin(value: Margin): this.type = set("margin", value.asInstanceOf[js.Any])
      
      inline def maxRows(value: String | Double): this.type = set("maxRows", value.asInstanceOf[js.Any])
      
      inline def minRows(value: String | Double): this.type = set("minRows", value.asInstanceOf[js.Any])
      
      inline def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
      
      inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      inline def onBlur(
        value: ReactFocusEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element] => Callback
      ): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onChange(
        value: ReactEventFrom[(HTMLTextAreaElement | HTMLInputElement) & org.scalajs.dom.Element] => Callback
      ): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLTextAreaElement | HTMLInputElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onFocus(
        value: ReactFocusEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element] => Callback
      ): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      inline def ref(
        value: /* import warning: importer.ImportType#apply Failed type conversion: C extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
      ): this.type = set("ref", value.asInstanceOf[js.Any])
      
      inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
      
      inline def rows(value: String | Double): this.type = set("rows", value.asInstanceOf[js.Any])
      
      inline def rowsMax(value: String | Double): this.type = set("rowsMax", value.asInstanceOf[js.Any])
      
      inline def select(value: Boolean): this.type = set("select", value.asInstanceOf[js.Any])
      
      inline def size(value: small | medium): this.type = set("size", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def `type`(value: HTMLInputTypeAttribute): this.type = set("type", value.asInstanceOf[js.Any])
      
      inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.materialUiCore.textFieldTextFieldMod.FilledTextFieldProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object OutlinedTextFieldProps {
    
    inline def apply(): Builder = {
      val __props = js.Dynamic.literal(variant = "outlined")
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.materialUiCore.textFieldTextFieldMod.OutlinedTextFieldProps]))
    }
    
    @JSImport("@material-ui/core", "TextField")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def FormHelperTextProps(
        value: Partial[
              typingsJapgolly.materialUiCore.formHelperTextFormHelperTextMod.FormHelperTextProps[p, js.Object]
            ]
      ): this.type = set("FormHelperTextProps", value.asInstanceOf[js.Any])
      
      inline def InputLabelProps(value: Partial[typingsJapgolly.materialUiCore.inputLabelInputLabelMod.InputLabelProps]): this.type = set("InputLabelProps", value.asInstanceOf[js.Any])
      
      inline def InputProps(value: PartialOutlinedInputProps): this.type = set("InputProps", value.asInstanceOf[js.Any])
      
      inline def SelectProps(value: PartialSelectPropsAbout): this.type = set("SelectProps", value.asInstanceOf[js.Any])
      
      inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
      
      inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def classes(value: Partial[ClassNameMap[TextFieldClassKey]]): this.type = set("classes", value.asInstanceOf[js.Any])
      
      inline def color(value: primary | secondary): this.type = set("color", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: Any): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
      
      inline def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
      
      inline def helperText(value: VdomNode): this.type = set("helperText", value.rawNode.asInstanceOf[js.Any])
      
      inline def helperTextNull: this.type = set("helperText", null)
      
      inline def helperTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("helperText", js.Array(value*))
      
      inline def helperTextVdomElement(value: VdomElement): this.type = set("helperText", value.rawElement.asInstanceOf[js.Any])
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def innerRef(value: Ref[Any]): this.type = set("innerRef", value.asInstanceOf[js.Any])
      
      inline def innerRefFunction1(value: Any | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def innerRefNull: this.type = set("innerRef", null)
      
      inline def inputRef(value: Ref[Any]): this.type = set("inputRef", value.asInstanceOf[js.Any])
      
      inline def inputRefFunction1(value: Any | Null => Callback): this.type = set("inputRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def inputRefNull: this.type = set("inputRef", null)
      
      inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
      
      inline def labelNull: this.type = set("label", null)
      
      inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
      
      inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
      
      inline def margin(value: Margin): this.type = set("margin", value.asInstanceOf[js.Any])
      
      inline def maxRows(value: String | Double): this.type = set("maxRows", value.asInstanceOf[js.Any])
      
      inline def minRows(value: String | Double): this.type = set("minRows", value.asInstanceOf[js.Any])
      
      inline def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
      
      inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      inline def onBlur(
        value: ReactFocusEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element] => Callback
      ): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onChange(
        value: ReactEventFrom[(HTMLTextAreaElement | HTMLInputElement) & org.scalajs.dom.Element] => Callback
      ): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLTextAreaElement | HTMLInputElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onFocus(
        value: ReactFocusEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element] => Callback
      ): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      inline def ref(
        value: /* import warning: importer.ImportType#apply Failed type conversion: C extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
      ): this.type = set("ref", value.asInstanceOf[js.Any])
      
      inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
      
      inline def rows(value: String | Double): this.type = set("rows", value.asInstanceOf[js.Any])
      
      inline def rowsMax(value: String | Double): this.type = set("rowsMax", value.asInstanceOf[js.Any])
      
      inline def select(value: Boolean): this.type = set("select", value.asInstanceOf[js.Any])
      
      inline def size(value: small | medium): this.type = set("size", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def `type`(value: HTMLInputTypeAttribute): this.type = set("type", value.asInstanceOf[js.Any])
      
      inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.materialUiCore.textFieldTextFieldMod.OutlinedTextFieldProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object StandardTextFieldProps {
    
    @JSImport("@material-ui/core", "TextField")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def FormHelperTextProps(
        value: Partial[
              typingsJapgolly.materialUiCore.formHelperTextFormHelperTextMod.FormHelperTextProps[p, js.Object]
            ]
      ): this.type = set("FormHelperTextProps", value.asInstanceOf[js.Any])
      
      inline def InputLabelProps(value: Partial[typingsJapgolly.materialUiCore.inputLabelInputLabelMod.InputLabelProps]): this.type = set("InputLabelProps", value.asInstanceOf[js.Any])
      
      inline def InputProps(value: PartialInputProps): this.type = set("InputProps", value.asInstanceOf[js.Any])
      
      inline def SelectProps(value: PartialSelectPropsAbout): this.type = set("SelectProps", value.asInstanceOf[js.Any])
      
      inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
      
      inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def classes(value: Partial[ClassNameMap[TextFieldClassKey]]): this.type = set("classes", value.asInstanceOf[js.Any])
      
      inline def color(value: primary | secondary): this.type = set("color", value.asInstanceOf[js.Any])
      
      inline def defaultValue(value: Any): this.type = set("defaultValue", value.asInstanceOf[js.Any])
      
      inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      
      inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
      
      inline def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
      
      inline def helperText(value: VdomNode): this.type = set("helperText", value.rawNode.asInstanceOf[js.Any])
      
      inline def helperTextNull: this.type = set("helperText", null)
      
      inline def helperTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("helperText", js.Array(value*))
      
      inline def helperTextVdomElement(value: VdomElement): this.type = set("helperText", value.rawElement.asInstanceOf[js.Any])
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def innerRef(value: Ref[Any]): this.type = set("innerRef", value.asInstanceOf[js.Any])
      
      inline def innerRefFunction1(value: Any | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def innerRefNull: this.type = set("innerRef", null)
      
      inline def inputRef(value: Ref[Any]): this.type = set("inputRef", value.asInstanceOf[js.Any])
      
      inline def inputRefFunction1(value: Any | Null => Callback): this.type = set("inputRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def inputRefNull: this.type = set("inputRef", null)
      
      inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
      
      inline def labelNull: this.type = set("label", null)
      
      inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
      
      inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
      
      inline def margin(value: Margin): this.type = set("margin", value.asInstanceOf[js.Any])
      
      inline def maxRows(value: String | Double): this.type = set("maxRows", value.asInstanceOf[js.Any])
      
      inline def minRows(value: String | Double): this.type = set("minRows", value.asInstanceOf[js.Any])
      
      inline def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
      
      inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
      
      inline def onBlur(
        value: ReactFocusEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element] => Callback
      ): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onChange(
        value: ReactEventFrom[(HTMLTextAreaElement | HTMLInputElement) & org.scalajs.dom.Element] => Callback
      ): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLTextAreaElement | HTMLInputElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def onFocus(
        value: ReactFocusEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element] => Callback
      ): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
      
      inline def ref(
        value: /* import warning: importer.ImportType#apply Failed type conversion: C extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
      ): this.type = set("ref", value.asInstanceOf[js.Any])
      
      inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
      
      inline def rows(value: String | Double): this.type = set("rows", value.asInstanceOf[js.Any])
      
      inline def rowsMax(value: String | Double): this.type = set("rowsMax", value.asInstanceOf[js.Any])
      
      inline def select(value: Boolean): this.type = set("select", value.asInstanceOf[js.Any])
      
      inline def size(value: small | medium): this.type = set("size", value.asInstanceOf[js.Any])
      
      inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      
      inline def `type`(value: HTMLInputTypeAttribute): this.type = set("type", value.asInstanceOf[js.Any])
      
      inline def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
      
      inline def variant(value: standard): this.type = set("variant", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: StandardTextFieldProps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: typingsJapgolly.materialUiCore.textFieldTextFieldMod.StandardTextFieldProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
