package typingsJapgolly.antDesignPro.exceptionMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignPro.antDesignProStrings.`403`
import typingsJapgolly.antDesignPro.antDesignProStrings.`404`
import typingsJapgolly.antDesignPro.antDesignProStrings.`500`
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionProps[L] extends js.Object {
  var actions: js.UndefOr[Node] = js.undefined
  var backText: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var desc: js.UndefOr[Node] = js.undefined
  var img: js.UndefOr[String] = js.undefined
  var linkElement: js.UndefOr[String | ComponentType[L]] = js.undefined
  var redirect: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
  var `type`: js.UndefOr[`403` | `404` | `500`] = js.undefined
}

object ExceptionProps {
  @scala.inline
  def apply[L](
    actions: VdomNode = null,
    backText: VdomNode = null,
    className: String = null,
    desc: VdomNode = null,
    img: String = null,
    linkElement: String | ComponentType[L] = null,
    redirect: String = null,
    style: CSSProperties = null,
    title: VdomNode = null,
    `type`: `403` | `404` | `500` = null
  ): ExceptionProps[L] = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.rawNode.asInstanceOf[js.Any])
    if (backText != null) __obj.updateDynamic("backText")(backText.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.rawNode.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (linkElement != null) __obj.updateDynamic("linkElement")(linkElement.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionProps[L]]
  }
}

