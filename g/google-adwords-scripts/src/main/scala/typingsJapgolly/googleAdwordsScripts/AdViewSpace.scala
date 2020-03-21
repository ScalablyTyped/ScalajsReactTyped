package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdViewSpace extends js.Object {
  def expandedTextAd(): ExpandedTextAd
  def gmailImageAd(): GmailImageAd
  def gmailMultiProductAd(): GmailMultiProductAd
  def gmailSinglePromotionAd(): GmailSinglePromotionAd
  def html5Ad(): Html5Ad
  def imageAd(): ImageAd
  def responsiveDisplayAd(): ResponsiveDisplayAd
}

object AdViewSpace {
  @scala.inline
  def apply(
    expandedTextAd: CallbackTo[ExpandedTextAd],
    gmailImageAd: CallbackTo[GmailImageAd],
    gmailMultiProductAd: CallbackTo[GmailMultiProductAd],
    gmailSinglePromotionAd: CallbackTo[GmailSinglePromotionAd],
    html5Ad: CallbackTo[Html5Ad],
    imageAd: CallbackTo[ImageAd],
    responsiveDisplayAd: CallbackTo[ResponsiveDisplayAd]
  ): AdViewSpace = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expandedTextAd")(expandedTextAd.toJsFn)
    __obj.updateDynamic("gmailImageAd")(gmailImageAd.toJsFn)
    __obj.updateDynamic("gmailMultiProductAd")(gmailMultiProductAd.toJsFn)
    __obj.updateDynamic("gmailSinglePromotionAd")(gmailSinglePromotionAd.toJsFn)
    __obj.updateDynamic("html5Ad")(html5Ad.toJsFn)
    __obj.updateDynamic("imageAd")(imageAd.toJsFn)
    __obj.updateDynamic("responsiveDisplayAd")(responsiveDisplayAd.toJsFn)
    __obj.asInstanceOf[AdViewSpace]
  }
}

