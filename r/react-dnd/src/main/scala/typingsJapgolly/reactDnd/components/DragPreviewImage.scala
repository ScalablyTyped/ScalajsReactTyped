package typingsJapgolly.reactDnd.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDnd.connectorsMod.ConnectableElement
import typingsJapgolly.reactDnd.dragPreviewImageMod.DragPreviewImageProps
import typingsJapgolly.reactDnd.optionsMod.DragPreviewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DragPreviewImage {
  def apply(
    src: String,
    connect: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => CallbackTo[Element | Null],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    DragPreviewImageProps, 
    MountedWithRawType[DragPreviewImageProps, js.Object, RawMounted[DragPreviewImageProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
  
      __obj.updateDynamic("connect")(js.Any.fromFunction2((t0: /* elementOrNode */ typingsJapgolly.reactDnd.connectorsMod.ConnectableElement, t1: /* options */ js.UndefOr[typingsJapgolly.reactDnd.optionsMod.DragPreviewOptions]) => connect(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactDnd.dragPreviewImageMod.DragPreviewImageProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDnd.dragPreviewImageMod.DragPreviewImageProps])(children: _*)
  }
  @JSImport("react-dnd", "DragPreviewImage")
  @js.native
  object componentImport extends js.Object
  
}

