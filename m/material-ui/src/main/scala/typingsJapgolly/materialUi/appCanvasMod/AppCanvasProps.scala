package typingsJapgolly.materialUi.appCanvasMod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppCanvasProps extends Props[AppCanvas]

object AppCanvasProps {
  @scala.inline
  def apply(children: VdomNode = null, key: Key = null, ref: LegacyRef[AppCanvas] = null): AppCanvasProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCanvasProps]
  }
}

