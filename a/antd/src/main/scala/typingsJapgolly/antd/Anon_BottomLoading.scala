package typingsJapgolly.antd

import typingsJapgolly.antd.antdStrings.bottom
import typingsJapgolly.antd.antdStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomLoading extends js.Object {
  var loading: Boolean
  var multiLines: Boolean
  var notFoundContent: String
  var placement: bottom | top
}

object Anon_BottomLoading {
  @scala.inline
  def apply(loading: Boolean, multiLines: Boolean, notFoundContent: String, placement: bottom | top): Anon_BottomLoading = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], multiLines = multiLines.asInstanceOf[js.Any], notFoundContent = notFoundContent.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BottomLoading]
  }
}

