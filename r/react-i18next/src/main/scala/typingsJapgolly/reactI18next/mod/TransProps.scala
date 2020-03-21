package typingsJapgolly.reactI18next.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.i18next.mod.TFunction
import typingsJapgolly.i18next.mod.i18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<i18next.i18next.WithT> */
trait TransProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var components: js.UndefOr[js.Array[Node]] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var defaults: js.UndefOr[String] = js.undefined
  var i18n: js.UndefOr[typingsJapgolly.i18next.mod.i18n] = js.undefined
  var i18nKey: js.UndefOr[String] = js.undefined
  var ns: js.UndefOr[Namespace] = js.undefined
  var parent: js.UndefOr[Node] = js.undefined
  var t: js.UndefOr[TFunction] = js.undefined
  var tOptions: js.UndefOr[js.Object] = js.undefined
  var values: js.UndefOr[js.Object] = js.undefined
}

object TransProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    components: js.Array[Node] = null,
    count: Int | Double = null,
    defaults: String = null,
    i18n: i18n = null,
    i18nKey: String = null,
    ns: Namespace = null,
    parent: VdomNode = null,
    t: TFunction = null,
    tOptions: js.Object = null,
    values: js.Object = null
  ): TransProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (i18nKey != null) __obj.updateDynamic("i18nKey")(i18nKey.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.rawNode.asInstanceOf[js.Any])
    if (t != null) __obj.updateDynamic("t")(t.asInstanceOf[js.Any])
    if (tOptions != null) __obj.updateDynamic("tOptions")(tOptions.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransProps]
  }
}

