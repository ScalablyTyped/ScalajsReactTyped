package typingsJapgolly.glReact.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.glReact.mod.LinearCopyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LinearCopy {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Any = null
  ): UnmountedWithRoot[LinearCopyProps, typingsJapgolly.glReact.mod.LinearCopy, Unit, LinearCopyProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.glReact.mod.LinearCopyProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.glReact.mod.LinearCopy](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.glReact.mod.LinearCopyProps])
  }
  @JSImport("gl-react", "LinearCopy")
  @js.native
  object componentImport extends js.Object
  
}

