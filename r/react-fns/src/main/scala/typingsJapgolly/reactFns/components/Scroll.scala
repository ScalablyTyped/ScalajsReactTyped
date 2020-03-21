package typingsJapgolly.reactFns.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactFns.scrollScrollMod.ScrollConfig
import typingsJapgolly.reactFns.scrollScrollMod.ScrollProps
import typingsJapgolly.reactFns.typesMod.SharedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Scroll {
  def apply(
    component: ComponentType[ScrollProps | Unit] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    render: ScrollProps => CallbackTo[Node] = null,
    throttle: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (js.Function1[ScrollProps, Node]) | Node = null
  ): UnmountedWithRoot[
    ScrollConfig with SharedRenderProps[ScrollProps], 
    typingsJapgolly.reactFns.mod.Scroll, 
    Unit, 
    ScrollConfig with SharedRenderProps[ScrollProps]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.reactFns.scrollScrollMod.ScrollProps) => render(t0).runNow()))
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFns.scrollScrollMod.ScrollConfig with typingsJapgolly.reactFns.typesMod.SharedRenderProps[typingsJapgolly.reactFns.scrollScrollMod.ScrollProps], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactFns.mod.Scroll](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFns.scrollScrollMod.ScrollConfig with typingsJapgolly.reactFns.typesMod.SharedRenderProps[typingsJapgolly.reactFns.scrollScrollMod.ScrollProps]])
  }
  @JSImport("react-fns", "Scroll")
  @js.native
  object componentImport extends js.Object
  
}

