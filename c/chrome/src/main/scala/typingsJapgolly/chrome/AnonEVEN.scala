package typingsJapgolly.chrome

import typingsJapgolly.chrome.chromeStrings.even
import typingsJapgolly.chrome.chromeStrings.no
import typingsJapgolly.chrome.chromeStrings.odd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEVEN extends js.Object {
  var EVEN: even
  var NO: no
  var ODD: odd
}

object AnonEVEN {
  @scala.inline
  def apply(EVEN: even, NO: no, ODD: odd): AnonEVEN = {
    val __obj = js.Dynamic.literal(EVEN = EVEN.asInstanceOf[js.Any], NO = NO.asInstanceOf[js.Any], ODD = ODD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEVEN]
  }
}

