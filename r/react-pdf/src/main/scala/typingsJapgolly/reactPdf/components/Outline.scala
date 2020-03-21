package typingsJapgolly.reactPdf.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pdfjsDist.mod.PDFTreeNode
import typingsJapgolly.reactPdf.AnonPageNumber
import typingsJapgolly.reactPdf.outlineMod.Props
import typingsJapgolly.reactPdf.outlineMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Outline {
  def apply(
    className: String | js.Array[String] = null,
    onItemClick: /* hasPageNumber */ AnonPageNumber => Callback = null,
    onLoadError: /* error */ js.Error => Callback = null,
    onLoadSuccess: /* outline */ js.Array[PDFTreeNode] => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction1((t0: /* hasPageNumber */ typingsJapgolly.reactPdf.AnonPageNumber) => onItemClick(t0).runNow()))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onLoadError(t0).runNow()))
    if (onLoadSuccess != null) __obj.updateDynamic("onLoadSuccess")(js.Any.fromFunction1((t0: /* outline */ js.Array[typingsJapgolly.pdfjsDist.mod.PDFTreeNode]) => onLoadSuccess(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPdf.outlineMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactPdf.outlineMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPdf.outlineMod.Props])(children: _*)
  }
  @JSImport("react-pdf/dist/Outline", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

