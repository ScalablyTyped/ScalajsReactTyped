package typingsJapgolly.glReact.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.glReact.mod.NearestCopyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NearestCopy {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Any = null
  ): UnmountedWithRoot[NearestCopyProps, typingsJapgolly.glReact.mod.NearestCopy, Unit, NearestCopyProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.glReact.mod.NearestCopyProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.glReact.mod.NearestCopy](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.glReact.mod.NearestCopyProps])
  }
  @JSImport("gl-react", "NearestCopy")
  @js.native
  object componentImport extends js.Object
  
}

