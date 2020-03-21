package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The connection site on a PageElement that can connect to a connector.
  */
trait ConnectionSite extends js.Object {
  def getIndex(): Integer
  def getPageElement(): PageElement
}

object ConnectionSite {
  @scala.inline
  def apply(getIndex: CallbackTo[Integer], getPageElement: CallbackTo[PageElement]): ConnectionSite = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getIndex")(getIndex.toJsFn)
    __obj.updateDynamic("getPageElement")(getPageElement.toJsFn)
    __obj.asInstanceOf[ConnectionSite]
  }
}

