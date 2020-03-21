package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of one or more Page instances.
  */
trait PageRange extends js.Object {
  def getPages(): js.Array[Page]
}

object PageRange {
  @scala.inline
  def apply(getPages: CallbackTo[js.Array[Page]]): PageRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPages")(getPages.toJsFn)
    __obj.asInstanceOf[PageRange]
  }
}

