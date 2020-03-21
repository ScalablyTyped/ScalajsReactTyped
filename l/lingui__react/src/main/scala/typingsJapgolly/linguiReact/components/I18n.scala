package typingsJapgolly.linguiReact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.linguiReact.AnonI18n
import typingsJapgolly.linguiReact.i18nMod.I18nComponentProps
import typingsJapgolly.linguiReact.i18nMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object I18n {
  def apply(
    update: js.UndefOr[Boolean] = js.undefined,
    withHash: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: AnonI18n => CallbackTo[Node]
  ): UnmountedWithRoot[I18nComponentProps, default, Unit, I18nComponentProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.linguiReact.AnonI18n) => children(t0).runNow()))
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (!js.isUndefined(withHash)) __obj.updateDynamic("withHash")(withHash.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.linguiReact.i18nMod.I18nComponentProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.linguiReact.i18nMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.linguiReact.i18nMod.I18nComponentProps])
  }
  @JSImport("@lingui/react/I18n", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

