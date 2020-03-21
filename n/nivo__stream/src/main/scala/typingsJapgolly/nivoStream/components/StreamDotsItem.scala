package typingsJapgolly.nivoStream.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nivoStream.mod.StreamDotsItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StreamDotsItem {
  def apply(
    borderColor: String,
    borderWidth: Double,
    color: String,
    size: Double,
    x: Double,
    y: Double,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    StreamDotsItemProps, 
    typingsJapgolly.nivoStream.mod.StreamDotsItem, 
    Unit, 
    StreamDotsItemProps
  ] = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nivoStream.mod.StreamDotsItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nivoStream.mod.StreamDotsItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nivoStream.mod.StreamDotsItemProps])(children: _*)
  }
  @JSImport("@nivo/stream", "StreamDotsItem")
  @js.native
  object componentImport extends js.Object
  
}

