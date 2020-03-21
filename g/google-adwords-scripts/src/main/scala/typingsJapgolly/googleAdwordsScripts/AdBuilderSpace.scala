package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdBuilderSpace extends js.Object {
  def expandedTextAdBuilder(): ExpandedTextAdBuilder[ExpandedTextAd]
  def gmailImageAdBuilder(): GmailImageAdBuilder[GmailImageAd]
  def gmailMultiProductAdBuilder(): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def gmailSinglePromotionAdBuilder(): GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]
  def html5AdBuilder(): Html5AdBuilder[Html5Ad]
  def imageAdBuilder(): ImageAdBuilder[ImageAd]
  def responsiveDisplayAdBuilder(): ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]
}

object AdBuilderSpace {
  @scala.inline
  def apply(
    expandedTextAdBuilder: CallbackTo[ExpandedTextAdBuilder[ExpandedTextAd]],
    gmailImageAdBuilder: CallbackTo[GmailImageAdBuilder[GmailImageAd]],
    gmailMultiProductAdBuilder: CallbackTo[GmailMultiProductAdBuilder[GmailMultiProductAd]],
    gmailSinglePromotionAdBuilder: CallbackTo[GmailSinglePromotionAdBuilder[GmailSinglePromotionAd]],
    html5AdBuilder: CallbackTo[Html5AdBuilder[Html5Ad]],
    imageAdBuilder: CallbackTo[ImageAdBuilder[ImageAd]],
    responsiveDisplayAdBuilder: CallbackTo[ResponsiveDisplayAdBuilder[ResponsiveDisplayAd]]
  ): AdBuilderSpace = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expandedTextAdBuilder")(expandedTextAdBuilder.toJsFn)
    __obj.updateDynamic("gmailImageAdBuilder")(gmailImageAdBuilder.toJsFn)
    __obj.updateDynamic("gmailMultiProductAdBuilder")(gmailMultiProductAdBuilder.toJsFn)
    __obj.updateDynamic("gmailSinglePromotionAdBuilder")(gmailSinglePromotionAdBuilder.toJsFn)
    __obj.updateDynamic("html5AdBuilder")(html5AdBuilder.toJsFn)
    __obj.updateDynamic("imageAdBuilder")(imageAdBuilder.toJsFn)
    __obj.updateDynamic("responsiveDisplayAdBuilder")(responsiveDisplayAdBuilder.toJsFn)
    __obj.asInstanceOf[AdBuilderSpace]
  }
}

