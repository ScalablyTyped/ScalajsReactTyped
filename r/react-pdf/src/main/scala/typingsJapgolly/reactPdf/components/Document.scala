package typingsJapgolly.reactPdf.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.pdfjsDist.mod.PDFDocumentProxy
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactPdf.AnonPageNumber
import typingsJapgolly.reactPdf.documentMod.Props
import typingsJapgolly.reactPdf.documentMod.RenderFunction
import typingsJapgolly.reactPdf.documentMod.default
import typingsJapgolly.reactPdf.reactPdfStrings._blank
import typingsJapgolly.reactPdf.reactPdfStrings._parent
import typingsJapgolly.reactPdf.reactPdfStrings._self
import typingsJapgolly.reactPdf.reactPdfStrings._top
import typingsJapgolly.reactPdf.reactPdfStrings.canvas
import typingsJapgolly.reactPdf.reactPdfStrings.none
import typingsJapgolly.reactPdf.reactPdfStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Document {
  def apply(
    file: js.Any,
    className: String | js.Array[String] = null,
    error: String | Element | RenderFunction = null,
    externalLinkTarget: _self | _blank | _parent | _top = null,
    inputRef: LegacyRef[HTMLDivElement] = null,
    loading: String | Element | RenderFunction = null,
    noData: String | Element | RenderFunction = null,
    onItemClick: /* hasPageNumber */ AnonPageNumber => Callback = null,
    onLoadError: /* error */ js.Error => Callback = null,
    onLoadSuccess: /* pdf */ PDFDocumentProxy => Callback = null,
    onPassword: /* callback */ js.Function1[/* repeated */ js.Any, js.Any] => Callback = null,
    onSourceError: /* error */ js.Error => Callback = null,
    onSourceSuccess: js.UndefOr[Callback] = js.undefined,
    options: js.Any = null,
    renderMode: canvas | svg | none = null,
    rotate: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (externalLinkTarget != null) __obj.updateDynamic("externalLinkTarget")(externalLinkTarget.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (noData != null) __obj.updateDynamic("noData")(noData.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction1((t0: /* hasPageNumber */ typingsJapgolly.reactPdf.AnonPageNumber) => onItemClick(t0).runNow()))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onLoadError(t0).runNow()))
    if (onLoadSuccess != null) __obj.updateDynamic("onLoadSuccess")(js.Any.fromFunction1((t0: /* pdf */ typingsJapgolly.pdfjsDist.mod.PDFDocumentProxy) => onLoadSuccess(t0).runNow()))
    if (onPassword != null) __obj.updateDynamic("onPassword")(js.Any.fromFunction1((t0: /* callback */ js.Function1[/* repeated */ js.Any, js.Any]) => onPassword(t0).runNow()))
    if (onSourceError != null) __obj.updateDynamic("onSourceError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onSourceError(t0).runNow()))
    onSourceSuccess.foreach(p => __obj.updateDynamic("onSourceSuccess")(p.toJsFn))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPdf.documentMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactPdf.documentMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPdf.documentMod.Props])(children: _*)
  }
  @JSImport("react-pdf/dist/Document", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

