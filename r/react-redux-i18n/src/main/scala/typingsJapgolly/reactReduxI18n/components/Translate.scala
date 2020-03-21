package typingsJapgolly.reactReduxI18n.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactReduxI18n.mod.TranslateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Translate {
  def apply(
    value: String,
    StringDictionary: /* prop */ StringDictionary[js.Any] = null,
    className: String = null,
    dangerousHTML: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tag: ReactType[_] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TranslateProps, typingsJapgolly.reactReduxI18n.mod.Translate, Unit, TranslateProps] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerousHTML)) __obj.updateDynamic("dangerousHTML")(dangerousHTML.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactReduxI18n.mod.TranslateProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactReduxI18n.mod.Translate](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactReduxI18n.mod.TranslateProps])(children: _*)
  }
  @JSImport("react-redux-i18n", "Translate")
  @js.native
  object componentImport extends js.Object
  
}

