package typingsJapgolly.reactAvatarEditor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.File
import typingsJapgolly.reactAvatarEditor.mod.AvatarEditorProps
import typingsJapgolly.reactAvatarEditor.mod.ImageState
import typingsJapgolly.reactAvatarEditor.mod.Position
import typingsJapgolly.reactAvatarEditor.mod.default
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactAvatarEditor {
  def apply(
    image: String | File,
    border: Double | js.Array[Double] = null,
    borderRadius: Int | Double = null,
    className: String = null,
    color: js.Array[Double] = null,
    crossOrigin: String = null,
    disableBoundaryChecks: js.UndefOr[Boolean] = js.undefined,
    disableDrop: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    onDropFile: /* event */ DragEvent => Callback = null,
    onImageChange: js.UndefOr[Callback] = js.undefined,
    onImageReady: /* event */ Event_ => Callback = null,
    onLoadFailure: /* event */ Event_ => Callback = null,
    onLoadSuccess: /* imgInfo */ ImageState => Callback = null,
    onMouseMove: /* event */ Event_ => Callback = null,
    onMouseUp: js.UndefOr[Callback] = js.undefined,
    onPositionChange: /* position */ Position => Callback = null,
    position: Position = null,
    rotate: Int | Double = null,
    scale: Int | Double = null,
    style: js.Object = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AvatarEditorProps, default, Unit, AvatarEditorProps] = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
  
      if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(disableBoundaryChecks)) __obj.updateDynamic("disableBoundaryChecks")(disableBoundaryChecks.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDrop)) __obj.updateDynamic("disableDrop")(disableDrop.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onDropFile != null) __obj.updateDynamic("onDropFile")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.DragEvent) => onDropFile(t0).runNow()))
    onImageChange.foreach(p => __obj.updateDynamic("onImageChange")(p.toJsFn))
    if (onImageReady != null) __obj.updateDynamic("onImageReady")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onImageReady(t0).runNow()))
    if (onLoadFailure != null) __obj.updateDynamic("onLoadFailure")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onLoadFailure(t0).runNow()))
    if (onLoadSuccess != null) __obj.updateDynamic("onLoadSuccess")(js.Any.fromFunction1((t0: /* imgInfo */ typingsJapgolly.reactAvatarEditor.mod.ImageState) => onLoadSuccess(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onMouseMove(t0).runNow()))
    onMouseUp.foreach(p => __obj.updateDynamic("onMouseUp")(p.toJsFn))
    if (onPositionChange != null) __obj.updateDynamic("onPositionChange")(js.Any.fromFunction1((t0: /* position */ typingsJapgolly.reactAvatarEditor.mod.Position) => onPositionChange(t0).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactAvatarEditor.mod.AvatarEditorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactAvatarEditor.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAvatarEditor.mod.AvatarEditorProps])(children: _*)
  }
  @JSImport("react-avatar-editor", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

