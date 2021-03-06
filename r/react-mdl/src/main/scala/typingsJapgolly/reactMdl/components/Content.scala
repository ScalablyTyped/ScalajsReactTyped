package typingsJapgolly.reactMdl.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactMdl.mod.ContentProps
import typingsJapgolly.reactMdl.mod.CustomRenderedComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Content {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    CustomRenderedComponent: CustomRenderedComponent = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ContentProps, typingsJapgolly.reactMdl.mod.Content, Unit, ContentProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (CustomRenderedComponent != null) js.Dynamic.global.Object.assign(__obj, CustomRenderedComponent)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMdl.mod.ContentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMdl.mod.Content](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMdl.mod.ContentProps])(children: _*)
  }
  @JSImport("react-mdl", "Content")
  @js.native
  object componentImport extends js.Object
  
}

