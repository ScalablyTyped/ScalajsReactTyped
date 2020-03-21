package typingsJapgolly.reactNativeViewPdf.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeViewPdf.reactNativeViewPdfStrings.`utf-16`
import typingsJapgolly.reactNativeViewPdf.reactNativeViewPdfStrings.`utf-8`
import typingsJapgolly.reactNativeViewPdf.reactNativeViewPdfStrings.base64
import typingsJapgolly.reactNativeViewPdf.reactNativeViewPdfStrings.bundle
import typingsJapgolly.reactNativeViewPdf.reactNativeViewPdfStrings.documentsDirectory
import typingsJapgolly.reactNativeViewPdf.reactNativeViewPdfStrings.file
import typingsJapgolly.reactNativeViewPdf.reactNativeViewPdfStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewProps
  extends /* key */ StringDictionary[js.Any] {
  var fadeInDuration: js.UndefOr[Double] = js.undefined
  var fileFrom: js.UndefOr[bundle | documentsDirectory] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPageChanged: js.UndefOr[js.Function2[/* page */ Double, /* pageCount */ Double, Unit]] = js.undefined
  var onScrolled: js.UndefOr[js.Function1[/* offset */ Double, Unit]] = js.undefined
  var resource: String
  var resourceType: js.UndefOr[url | base64 | file] = js.undefined
  var textEncoding: js.UndefOr[`utf-8` | `utf-16`] = js.undefined
  var urlProps: js.UndefOr[URLProps] = js.undefined
}

object PDFViewProps {
  @scala.inline
  def apply(
    resource: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    fadeInDuration: Int | Double = null,
    fileFrom: bundle | documentsDirectory = null,
    onError: /* error */ js.Error => Callback = null,
    onLoad: js.UndefOr[Callback] = js.undefined,
    onPageChanged: (/* page */ Double, /* pageCount */ Double) => Callback = null,
    onScrolled: /* offset */ Double => Callback = null,
    resourceType: url | base64 | file = null,
    textEncoding: `utf-8` | `utf-16` = null,
    urlProps: URLProps = null
  ): PDFViewProps = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (fadeInDuration != null) __obj.updateDynamic("fadeInDuration")(fadeInDuration.asInstanceOf[js.Any])
    if (fileFrom != null) __obj.updateDynamic("fileFrom")(fileFrom.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onError(t0).runNow()))
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    if (onPageChanged != null) __obj.updateDynamic("onPageChanged")(js.Any.fromFunction2((t0: /* page */ scala.Double, t1: /* pageCount */ scala.Double) => onPageChanged(t0, t1).runNow()))
    if (onScrolled != null) __obj.updateDynamic("onScrolled")(js.Any.fromFunction1((t0: /* offset */ scala.Double) => onScrolled(t0).runNow()))
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (textEncoding != null) __obj.updateDynamic("textEncoding")(textEncoding.asInstanceOf[js.Any])
    if (urlProps != null) __obj.updateDynamic("urlProps")(urlProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewProps]
  }
}

