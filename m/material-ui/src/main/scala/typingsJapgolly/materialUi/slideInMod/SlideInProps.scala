package typingsJapgolly.materialUi.slideInMod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUi.MaterialUI.propTypes.direction
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideInProps extends Props[SlideIn] {
  var childStyle: js.UndefOr[CSSProperties] = js.undefined
  var direction: js.UndefOr[typingsJapgolly.materialUi.MaterialUI.propTypes.direction] = js.undefined
  var enterDelay: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SlideInProps {
  @scala.inline
  def apply(
    childStyle: CSSProperties = null,
    children: VdomNode = null,
    direction: direction = null,
    enterDelay: Int | Double = null,
    key: Key = null,
    ref: LegacyRef[SlideIn] = null,
    style: CSSProperties = null
  ): SlideInProps = {
    val __obj = js.Dynamic.literal()
    if (childStyle != null) __obj.updateDynamic("childStyle")(childStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideInProps]
  }
}

