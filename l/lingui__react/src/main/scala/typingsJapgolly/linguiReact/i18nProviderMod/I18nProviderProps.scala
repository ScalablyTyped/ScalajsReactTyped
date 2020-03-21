package typingsJapgolly.linguiReact.i18nProviderMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.linguiCore.i18nMod.Catalogs
import typingsJapgolly.linguiCore.mod.I18n_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nProviderProps extends js.Object {
  var catalogs: js.UndefOr[Catalogs] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var defaultRender: js.UndefOr[Node] = js.undefined
  var i18n: js.UndefOr[I18n_] = js.undefined
  var language: String
  var locales: js.UndefOr[String | js.Array[String]] = js.undefined
  var missing: js.UndefOr[String | (js.Function2[/* language */ String, /* id */ String, String])] = js.undefined
}

object I18nProviderProps {
  @scala.inline
  def apply(
    language: String,
    catalogs: Catalogs = null,
    children: VdomNode = null,
    defaultRender: VdomNode = null,
    i18n: I18n_ = null,
    locales: String | js.Array[String] = null,
    missing: String | (js.Function2[/* language */ String, /* id */ String, String]) = null
  ): I18nProviderProps = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    if (catalogs != null) __obj.updateDynamic("catalogs")(catalogs.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (defaultRender != null) __obj.updateDynamic("defaultRender")(defaultRender.rawNode.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (missing != null) __obj.updateDynamic("missing")(missing.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nProviderProps]
  }
}

