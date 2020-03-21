package typingsJapgolly.reactDocumentTitle.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDocumentTitle.mod.DocumentTitleProps
import typingsJapgolly.reactDocumentTitle.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDocumentTitle {
  def apply(
    title: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DocumentTitleProps, default, Unit, DocumentTitleProps] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDocumentTitle.mod.DocumentTitleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDocumentTitle.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDocumentTitle.mod.DocumentTitleProps])(children: _*)
  }
  @JSImport("react-document-title", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

