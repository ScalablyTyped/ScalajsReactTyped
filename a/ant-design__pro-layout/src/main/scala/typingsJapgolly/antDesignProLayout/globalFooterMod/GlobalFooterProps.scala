package typingsJapgolly.antDesignProLayout.globalFooterMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignProLayout.AnonBlankTarget
import typingsJapgolly.antDesignProLayout.typingsMod.WithFalse
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalFooterProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var copyright: js.UndefOr[Node] = js.undefined
  var links: js.UndefOr[WithFalse[js.Array[AnonBlankTarget]]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object GlobalFooterProps {
  @scala.inline
  def apply(
    className: String = null,
    copyright: VdomNode = null,
    links: WithFalse[js.Array[AnonBlankTarget]] = null,
    style: CSSProperties = null
  ): GlobalFooterProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.rawNode.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalFooterProps]
  }
}

