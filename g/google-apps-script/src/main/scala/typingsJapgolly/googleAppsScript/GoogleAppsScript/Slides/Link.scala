package typingsJapgolly.googleAppsScript.GoogleAppsScript.Slides

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A hypertext link.
  */
trait Link extends js.Object {
  def getLinkType(): LinkType
  def getLinkedSlide(): Slide
  def getSlideId(): String
  def getSlideIndex(): Integer
  def getSlidePosition(): SlidePosition
  def getUrl(): String
}

object Link {
  @scala.inline
  def apply(
    getLinkType: CallbackTo[LinkType],
    getLinkedSlide: CallbackTo[Slide],
    getSlideId: CallbackTo[String],
    getSlideIndex: CallbackTo[Integer],
    getSlidePosition: CallbackTo[SlidePosition],
    getUrl: CallbackTo[String]
  ): Link = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLinkType")(getLinkType.toJsFn)
    __obj.updateDynamic("getLinkedSlide")(getLinkedSlide.toJsFn)
    __obj.updateDynamic("getSlideId")(getSlideId.toJsFn)
    __obj.updateDynamic("getSlideIndex")(getSlideIndex.toJsFn)
    __obj.updateDynamic("getSlidePosition")(getSlidePosition.toJsFn)
    __obj.updateDynamic("getUrl")(getUrl.toJsFn)
    __obj.asInstanceOf[Link]
  }
}

