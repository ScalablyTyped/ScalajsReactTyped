package typingsJapgolly.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var browser: Typeofbrowser
}

object Window {
  @scala.inline
  def apply(browser: Typeofbrowser): Window = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

