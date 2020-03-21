package typingsJapgolly.winrt.Windows.Globalization.Fonts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageFontGroup extends js.Object {
  var documentAlternate1Font: LanguageFont
  var documentAlternate2Font: LanguageFont
  var documentHeadingFont: LanguageFont
  var fixedWidthTextFont: LanguageFont
  var modernDocumentFont: LanguageFont
  var traditionalDocumentFont: LanguageFont
  var uICaptionFont: LanguageFont
  var uIHeadingFont: LanguageFont
  var uINotificationHeadingFont: LanguageFont
  var uITextFont: LanguageFont
  var uITitleFont: LanguageFont
}

object ILanguageFontGroup {
  @scala.inline
  def apply(
    documentAlternate1Font: LanguageFont,
    documentAlternate2Font: LanguageFont,
    documentHeadingFont: LanguageFont,
    fixedWidthTextFont: LanguageFont,
    modernDocumentFont: LanguageFont,
    traditionalDocumentFont: LanguageFont,
    uICaptionFont: LanguageFont,
    uIHeadingFont: LanguageFont,
    uINotificationHeadingFont: LanguageFont,
    uITextFont: LanguageFont,
    uITitleFont: LanguageFont
  ): ILanguageFontGroup = {
    val __obj = js.Dynamic.literal(documentAlternate1Font = documentAlternate1Font.asInstanceOf[js.Any], documentAlternate2Font = documentAlternate2Font.asInstanceOf[js.Any], documentHeadingFont = documentHeadingFont.asInstanceOf[js.Any], fixedWidthTextFont = fixedWidthTextFont.asInstanceOf[js.Any], modernDocumentFont = modernDocumentFont.asInstanceOf[js.Any], traditionalDocumentFont = traditionalDocumentFont.asInstanceOf[js.Any], uICaptionFont = uICaptionFont.asInstanceOf[js.Any], uIHeadingFont = uIHeadingFont.asInstanceOf[js.Any], uINotificationHeadingFont = uINotificationHeadingFont.asInstanceOf[js.Any], uITextFont = uITextFont.asInstanceOf[js.Any], uITitleFont = uITitleFont.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILanguageFontGroup]
  }
}

