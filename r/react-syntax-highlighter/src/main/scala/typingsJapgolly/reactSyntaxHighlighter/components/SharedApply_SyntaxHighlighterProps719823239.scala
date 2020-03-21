package typingsJapgolly.reactSyntaxHighlighter.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactSyntaxHighlighter.lineTagPropsFunction
import typingsJapgolly.reactSyntaxHighlighter.mod.SyntaxHighlighterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_SyntaxHighlighterProps719823239[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    StringDictionary: /* spread */ StringDictionary[js.Any] = null,
    codeTagProps: HTMLProps[HTMLElement] = null,
    customStyle: js.Any = null,
    language: String = null,
    lineNumberStyle: js.Any = null,
    lineProps: lineTagPropsFunction | HTMLProps[HTMLElement] = null,
    showLineNumbers: js.UndefOr[Boolean] = js.undefined,
    startingLineNumber: Int | Double = null,
    style: js.Any = null,
    useInlineStyles: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SyntaxHighlighterProps, ComponentRef, Unit, SyntaxHighlighterProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (codeTagProps != null) __obj.updateDynamic("codeTagProps")(codeTagProps.asInstanceOf[js.Any])
    if (customStyle != null) __obj.updateDynamic("customStyle")(customStyle.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lineNumberStyle != null) __obj.updateDynamic("lineNumberStyle")(lineNumberStyle.asInstanceOf[js.Any])
    if (lineProps != null) __obj.updateDynamic("lineProps")(lineProps.asInstanceOf[js.Any])
    if (!js.isUndefined(showLineNumbers)) __obj.updateDynamic("showLineNumbers")(showLineNumbers.asInstanceOf[js.Any])
    if (startingLineNumber != null) __obj.updateDynamic("startingLineNumber")(startingLineNumber.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useInlineStyles)) __obj.updateDynamic("useInlineStyles")(useInlineStyles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSyntaxHighlighter.mod.SyntaxHighlighterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSyntaxHighlighter.mod.SyntaxHighlighterProps])(children: _*)
  }
}

