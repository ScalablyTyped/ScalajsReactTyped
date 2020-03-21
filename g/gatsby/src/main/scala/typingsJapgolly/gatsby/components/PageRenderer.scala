package typingsJapgolly.gatsby.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gatsby.mod.PageRendererProps
import typingsJapgolly.reachRouter.mod.WindowLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PageRenderer {
  def apply(
    location: WindowLocation,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PageRendererProps, typingsJapgolly.gatsby.mod.PageRenderer, Unit, PageRendererProps] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gatsby.mod.PageRendererProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gatsby.mod.PageRenderer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gatsby.mod.PageRendererProps])(children: _*)
  }
  @JSImport("gatsby", "PageRenderer")
  @js.native
  object componentImport extends js.Object
  
}

