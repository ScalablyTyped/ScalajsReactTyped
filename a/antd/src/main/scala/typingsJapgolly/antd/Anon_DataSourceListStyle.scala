package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataSourceListStyle extends js.Object {
  var dataSource: js.Array[scala.Nothing]
  var showSearch: Boolean
  def listStyle(): Unit
}

object Anon_DataSourceListStyle {
  @scala.inline
  def apply(dataSource: js.Array[scala.Nothing], listStyle: Callback, showSearch: Boolean): Anon_DataSourceListStyle = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], showSearch = showSearch.asInstanceOf[js.Any])
    __obj.updateDynamic("listStyle")(listStyle.toJsFn)
    __obj.asInstanceOf[Anon_DataSourceListStyle]
  }
}

