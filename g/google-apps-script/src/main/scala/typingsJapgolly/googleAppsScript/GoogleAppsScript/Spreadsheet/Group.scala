package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and modify spreadsheet groups. Groups are an association between an interval of contiguous
  * rows or columns that can be expanded or collapsed as a unit to hide/show the rows or columns.
  * Each group has a control toggle on the row or column directly before or after the group
  * (depending on settings) that can expand or collapse the group as a whole.
  *
  * The depth of a group refers to the nested position of the group and how many larger
  * groups contain the group. The collapsed state of a group refers to whether the group
  * should remain collapsed or expanded after a parent group has been expanded. Additionally, at the
  * time that a group is collapsed or expanded, the rows or columns within the group are hidden or
  * set visible, though individual rows or columns can be hidden or set visible irrespective of the
  * collapsed state.
  */
trait Group extends js.Object {
  def collapse(): Group
  def expand(): Group
  def getControlIndex(): Integer
  def getDepth(): Integer
  def getRange(): Range
  def isCollapsed(): Boolean
  def remove(): Unit
}

object Group {
  @scala.inline
  def apply(
    collapse: CallbackTo[Group],
    expand: CallbackTo[Group],
    getControlIndex: CallbackTo[Integer],
    getDepth: CallbackTo[Integer],
    getRange: CallbackTo[Range],
    isCollapsed: CallbackTo[Boolean],
    remove: Callback
  ): Group = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collapse")(collapse.toJsFn)
    __obj.updateDynamic("expand")(expand.toJsFn)
    __obj.updateDynamic("getControlIndex")(getControlIndex.toJsFn)
    __obj.updateDynamic("getDepth")(getDepth.toJsFn)
    __obj.updateDynamic("getRange")(getRange.toJsFn)
    __obj.updateDynamic("isCollapsed")(isCollapsed.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[Group]
  }
}

