package typingsJapgolly.reactFlexr.ReactFlexr

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Props
import typingsJapgolly.reactFlexr.reactFlexrStrings.bottom
import typingsJapgolly.reactFlexr.reactFlexrStrings.center
import typingsJapgolly.reactFlexr.reactFlexrStrings.left
import typingsJapgolly.reactFlexr.reactFlexrStrings.right
import typingsJapgolly.reactFlexr.reactFlexrStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps extends Props[Grid] {
  /**
    * Vertical Align Sub Cells: top, center, bottom
    */
  var align: js.UndefOr[top | center | bottom] = js.undefined
  /**
    * All sub cells will be full height.
    */
  var flexCells: js.UndefOr[Boolean] = js.undefined
  /**
    * Override default gutter: '1em', '5%', '10px', etc.
    * Propagates downwards. Cells inside this Grid component
    * will use the same gutter.
    */
  var gutter: js.UndefOr[String] = js.undefined
  /**
    * Horizontal Align Sub Cells: left, center, right
    */
  var hAlign: js.UndefOr[left | center | right] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    align: top | center | bottom = null,
    children: VdomNode = null,
    flexCells: js.UndefOr[Boolean] = js.undefined,
    gutter: String = null,
    hAlign: left | center | right = null,
    key: Key = null,
    ref: LegacyRef[Grid] = null
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(flexCells)) __obj.updateDynamic("flexCells")(flexCells.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (hAlign != null) __obj.updateDynamic("hAlign")(hAlign.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps]
  }
}

