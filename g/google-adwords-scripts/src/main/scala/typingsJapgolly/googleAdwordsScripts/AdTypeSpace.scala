package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdTypeSpace extends js.Object {
  def expandedTextAd(): Boolean
  def gmailImageAd(): Boolean
  def gmailMultiProductAd(): Boolean
  def gmailSinglePromotionAd(): Boolean
  def html5Ad(): Boolean
  def imageAd(): Boolean
  def responsiveDisplayAd(): Boolean
}

object AdTypeSpace {
  @scala.inline
  def apply(
    expandedTextAd: CallbackTo[Boolean],
    gmailImageAd: CallbackTo[Boolean],
    gmailMultiProductAd: CallbackTo[Boolean],
    gmailSinglePromotionAd: CallbackTo[Boolean],
    html5Ad: CallbackTo[Boolean],
    imageAd: CallbackTo[Boolean],
    responsiveDisplayAd: CallbackTo[Boolean]
  ): AdTypeSpace = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expandedTextAd")(expandedTextAd.toJsFn)
    __obj.updateDynamic("gmailImageAd")(gmailImageAd.toJsFn)
    __obj.updateDynamic("gmailMultiProductAd")(gmailMultiProductAd.toJsFn)
    __obj.updateDynamic("gmailSinglePromotionAd")(gmailSinglePromotionAd.toJsFn)
    __obj.updateDynamic("html5Ad")(html5Ad.toJsFn)
    __obj.updateDynamic("imageAd")(imageAd.toJsFn)
    __obj.updateDynamic("responsiveDisplayAd")(responsiveDisplayAd.toJsFn)
    __obj.asInstanceOf[AdTypeSpace]
  }
}

