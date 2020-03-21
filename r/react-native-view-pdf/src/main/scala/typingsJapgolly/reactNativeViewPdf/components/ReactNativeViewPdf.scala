package typingsJapgolly.reactNativeViewPdf.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeViewPdf.mod.PDFViewProps
import typingsJapgolly.reactNativeViewPdf.mod.URLProps
import typingsJapgolly.reactNativeViewPdf.mod.default
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

object ReactNativeViewPdf {
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
    urlProps: URLProps = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PDFViewProps, default, Unit, PDFViewProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeViewPdf.mod.PDFViewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeViewPdf.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeViewPdf.mod.PDFViewProps])(children: _*)
  }
  @JSImport("react-native-view-pdf", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

