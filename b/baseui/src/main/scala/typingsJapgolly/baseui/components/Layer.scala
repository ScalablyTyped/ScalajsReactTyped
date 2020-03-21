package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.baseui.layerMod.LayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Layer {
  def apply(
    host: HTMLElement = null,
    index: Int | Double = null,
    mountNode: HTMLElement = null,
    onMount: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onUnmount: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    LayerProps, 
    MountedWithRawType[LayerProps, js.Object, RawMounted[LayerProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    onMount.foreach(p => __obj.updateDynamic("onMount")(p.toJsFn))
    onUnmount.foreach(p => __obj.updateDynamic("onUnmount")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.layerMod.LayerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.layerMod.LayerProps])(children: _*)
  }
  @JSImport("baseui/layer", "Layer")
  @js.native
  object componentImport extends js.Object
  
}

