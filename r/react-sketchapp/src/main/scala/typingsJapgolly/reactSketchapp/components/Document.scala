package typingsJapgolly.reactSketchapp.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSketchapp.mod.DocumentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Document {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Element] | Element = null
  ): UnmountedWithRoot[DocumentProps, typingsJapgolly.reactSketchapp.mod.Document, Unit, DocumentProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSketchapp.mod.DocumentProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactSketchapp.mod.Document](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSketchapp.mod.DocumentProps])
  }
  @JSImport("react-sketchapp", "Document")
  @js.native
  object componentImport extends js.Object
  
}

