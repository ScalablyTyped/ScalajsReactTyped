package typingsJapgolly.linguiReact.transMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.linguiReact.renderMod.RenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransPropsWithoutI18n extends RenderProps {
  var children: js.UndefOr[Node] = js.undefined
  var components: js.UndefOr[js.Array[Element]] = js.undefined
  var defaults: js.UndefOr[String] = js.undefined
  var formats: js.UndefOr[js.Object] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var values: js.UndefOr[js.Object] = js.undefined
}

object TransPropsWithoutI18n {
  @scala.inline
  def apply(
    children: VdomNode = null,
    className: String = null,
    components: js.Array[Element] = null,
    defaults: String = null,
    formats: js.Object = null,
    id: String = null,
    render: VdomNode = null,
    values: js.Object = null
  ): TransPropsWithoutI18n = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.rawNode.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransPropsWithoutI18n]
  }
}

