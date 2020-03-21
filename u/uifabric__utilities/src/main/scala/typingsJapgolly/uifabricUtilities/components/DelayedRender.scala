package typingsJapgolly.uifabricUtilities.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.uifabricUtilities.delayedRenderMod.IDelayedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DelayedRender {
  def apply(
    delay: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDelayedRenderProps, 
    typingsJapgolly.uifabricUtilities.mod.DelayedRender, 
    Unit, 
    IDelayedRenderProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.uifabricUtilities.delayedRenderMod.IDelayedRenderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.uifabricUtilities.mod.DelayedRender](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.uifabricUtilities.delayedRenderMod.IDelayedRenderProps])(children: _*)
  }
  @JSImport("@uifabric/utilities", "DelayedRender")
  @js.native
  object componentImport extends js.Object
  
}

