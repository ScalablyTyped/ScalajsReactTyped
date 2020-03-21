package typingsJapgolly.antDesignPro.resultMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignPro.antDesignProStrings.error
import typingsJapgolly.antDesignPro.antDesignProStrings.success
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultProps extends js.Object {
  var actions: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[Node] = js.undefined
  var extra: js.UndefOr[Node] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
  var `type`: success | error
}

object ResultProps {
  @scala.inline
  def apply(
    `type`: success | error,
    actions: VdomNode = null,
    className: String = null,
    description: VdomNode = null,
    extra: VdomNode = null,
    style: CSSProperties = null,
    title: VdomNode = null
  ): ResultProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.rawNode.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultProps]
  }
}

