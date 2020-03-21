package typingsJapgolly.reactOverlays.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactOverlays.waitForContainerMod.WaitForContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WaitForContainer {
  def apply(
    container: Node | js.Function = null,
    onContainerResolved: js.Function = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    WaitForContainerProps, 
    typingsJapgolly.reactOverlays.mod.WaitForContainer, 
    Unit, 
    WaitForContainerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (onContainerResolved != null) __obj.updateDynamic("onContainerResolved")(onContainerResolved.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOverlays.waitForContainerMod.WaitForContainerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOverlays.mod.WaitForContainer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOverlays.waitForContainerMod.WaitForContainerProps])(children: _*)
  }
  @JSImport("react-overlays", "WaitForContainer")
  @js.native
  object componentImport extends js.Object
  
}

