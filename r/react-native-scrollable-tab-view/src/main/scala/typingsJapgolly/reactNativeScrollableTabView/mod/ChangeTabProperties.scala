package typingsJapgolly.reactNativeScrollableTabView.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeTabProperties extends js.Object {
  // previousPage
  var from: Double
  // currentPage
  var i: Double
  // currentPage object
  var ref: Element
}

object ChangeTabProperties {
  @scala.inline
  def apply(from: Double, i: Double, ref: VdomElement): ChangeTabProperties = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTabProperties]
  }
}

