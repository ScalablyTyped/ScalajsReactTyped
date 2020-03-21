package typingsJapgolly.reactDocumentMeta.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDocumentMeta.mod.DocumentMetaProps
import typingsJapgolly.reactDocumentMeta.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDocumentMeta {
  def apply(
    canonical: String = null,
    description: String = null,
    title: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DocumentMetaProps, default, Unit, DocumentMetaProps] = {
    val __obj = js.Dynamic.literal()
  
      if (canonical != null) __obj.updateDynamic("canonical")(canonical.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDocumentMeta.mod.DocumentMetaProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDocumentMeta.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDocumentMeta.mod.DocumentMetaProps])(children: _*)
  }
  @JSImport("react-document-meta", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

