package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.beakTypesMod.IBeak
import typingsJapgolly.officeUiFabricReact.beakTypesMod.IBeakProps
import typingsJapgolly.officeUiFabricReact.positioningTypesMod.RectangleEdge
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Beak {
  def apply(
    bottom: String = null,
    color: String = null,
    componentRef: IRefObject[IBeak] = null,
    direction: RectangleEdge = null,
    height: Int | Double = null,
    left: String = null,
    right: String = null,
    top: String = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IBeakProps, typingsJapgolly.officeUiFabricReact.beakMod.Beak, Unit, IBeakProps] = {
    val __obj = js.Dynamic.literal()
  
      if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.beakTypesMod.IBeakProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.beakMod.Beak](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.beakTypesMod.IBeakProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/Beak/Beak", "Beak")
  @js.native
  object componentImport extends js.Object
  
}

