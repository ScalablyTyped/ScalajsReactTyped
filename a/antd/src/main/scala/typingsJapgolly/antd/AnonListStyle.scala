package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonListStyle extends js.Object {
  var dataSource: js.Array[scala.Nothing]
  var showSearch: Boolean
  def listStyle(): Unit
}

object AnonListStyle {
  @scala.inline
  def apply(dataSource: js.Array[scala.Nothing], listStyle: Callback, showSearch: Boolean): AnonListStyle = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], showSearch = showSearch.asInstanceOf[js.Any])
    __obj.updateDynamic("listStyle")(listStyle.toJsFn)
    __obj.asInstanceOf[AnonListStyle]
  }
}

