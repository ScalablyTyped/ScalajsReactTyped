package typingsJapgolly.materialToolbar.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialBase.foundationMod.MDCNumbers
import typingsJapgolly.materialToolbar.materialToolbarNumbers.`1.25`
import typingsJapgolly.materialToolbar.materialToolbarNumbers.`2.125`
import typingsJapgolly.materialToolbar.materialToolbarNumbers.`56`
import typingsJapgolly.materialToolbar.materialToolbarNumbers.`600`
import typingsJapgolly.materialToolbar.materialToolbarNumbers.`64`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait numbers extends MDCNumbers {
  var MAX_TITLE_SIZE: `2.125`
  var MIN_TITLE_SIZE: `1.25`
  var TOOLBAR_MOBILE_BREAKPOINT: `600`
  var TOOLBAR_ROW_HEIGHT: `64`
  var TOOLBAR_ROW_MOBILE_HEIGHT: `56`
}

object numbers {
  @scala.inline
  def apply(
    MAX_TITLE_SIZE: `2.125`,
    MIN_TITLE_SIZE: `1.25`,
    TOOLBAR_MOBILE_BREAKPOINT: `600`,
    TOOLBAR_ROW_HEIGHT: `64`,
    TOOLBAR_ROW_MOBILE_HEIGHT: `56`,
    StringDictionary: StringDictionary[Double] = null
  ): numbers = {
    val __obj = js.Dynamic.literal(MAX_TITLE_SIZE = MAX_TITLE_SIZE.asInstanceOf[js.Any], MIN_TITLE_SIZE = MIN_TITLE_SIZE.asInstanceOf[js.Any], TOOLBAR_MOBILE_BREAKPOINT = TOOLBAR_MOBILE_BREAKPOINT.asInstanceOf[js.Any], TOOLBAR_ROW_HEIGHT = TOOLBAR_ROW_HEIGHT.asInstanceOf[js.Any], TOOLBAR_ROW_MOBILE_HEIGHT = TOOLBAR_ROW_MOBILE_HEIGHT.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[numbers]
  }
}

