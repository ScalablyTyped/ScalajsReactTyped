package typingsJapgolly.linguiReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.linguiCore.i18nMod.Catalogs
import typingsJapgolly.linguiCore.mod.I18n_
import typingsJapgolly.linguiReact.i18nProviderMod.I18nProviderProps
import typingsJapgolly.linguiReact.i18nProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object I18nProvider {
  def apply(
    language: String,
    catalogs: Catalogs = null,
    defaultRender: VdomNode = null,
    i18n: I18n_ = null,
    locales: String | js.Array[String] = null,
    missing: String | (js.Function2[/* language */ String, /* id */ String, String]) = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[I18nProviderProps, default, Unit, I18nProviderProps] = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
  
      if (catalogs != null) __obj.updateDynamic("catalogs")(catalogs.asInstanceOf[js.Any])
    if (defaultRender != null) __obj.updateDynamic("defaultRender")(defaultRender.rawNode.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (missing != null) __obj.updateDynamic("missing")(missing.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.linguiReact.i18nProviderMod.I18nProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.linguiReact.i18nProviderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.linguiReact.i18nProviderMod.I18nProviderProps])(children: _*)
  }
  @JSImport("@lingui/react/I18nProvider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

