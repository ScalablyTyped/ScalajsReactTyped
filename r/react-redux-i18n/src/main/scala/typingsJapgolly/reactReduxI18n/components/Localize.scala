package typingsJapgolly.reactReduxI18n.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactReduxI18n.mod.LocalizeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Localize {
  def apply(
    value: String | Double | js.Object,
    className: String = null,
    dangerousHTML: js.UndefOr[Boolean] = js.undefined,
    dateFormat: String = null,
    options: js.Object = null,
    style: CSSProperties = null,
    tag: ReactType[_] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LocalizeProps, typingsJapgolly.reactReduxI18n.mod.Localize, Unit, LocalizeProps] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerousHTML)) __obj.updateDynamic("dangerousHTML")(dangerousHTML.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactReduxI18n.mod.LocalizeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactReduxI18n.mod.Localize](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactReduxI18n.mod.LocalizeProps])(children: _*)
  }
  @JSImport("react-redux-i18n", "Localize")
  @js.native
  object componentImport extends js.Object
  
}

