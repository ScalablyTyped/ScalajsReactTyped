package typingsJapgolly.atlaskitLayer.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atlaskitLayer.mod.BoundariesElementType
import typingsJapgolly.atlaskitLayer.mod.CSSPositionType
import typingsJapgolly.atlaskitLayer.mod.FlipPositionType
import typingsJapgolly.atlaskitLayer.mod.PositionType
import typingsJapgolly.atlaskitLayer.mod.Props
import typingsJapgolly.atlaskitLayer.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Layer {
  def apply(
    autoFlip: Boolean | FlipPositionType | js.Array[FlipPositionType] = null,
    boundariesElement: BoundariesElementType = null,
    content: VdomNode = null,
    lockScroll: js.UndefOr[Boolean] = js.undefined,
    offset: String = null,
    onFlippedChange: (/* flipped */ Boolean, /* actualPosition */ CSSPositionType, /* originalPosition */ CSSPositionType) => Callback = null,
    position: PositionType = null,
    zIndex: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (autoFlip != null) __obj.updateDynamic("autoFlip")(autoFlip.asInstanceOf[js.Any])
    if (boundariesElement != null) __obj.updateDynamic("boundariesElement")(boundariesElement.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScroll)) __obj.updateDynamic("lockScroll")(lockScroll.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onFlippedChange != null) __obj.updateDynamic("onFlippedChange")(js.Any.fromFunction3((t0: /* flipped */ scala.Boolean, t1: /* actualPosition */ typingsJapgolly.atlaskitLayer.mod.CSSPositionType, t2: /* originalPosition */ typingsJapgolly.atlaskitLayer.mod.CSSPositionType) => onFlippedChange(t0, t1, t2).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atlaskitLayer.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atlaskitLayer.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atlaskitLayer.mod.Props])(children: _*)
  }
  @JSImport("@atlaskit/layer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

