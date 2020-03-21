package typingsJapgolly.reactFns.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactFns.mediaMediaMod.MediaProps
import typingsJapgolly.reactFns.typesMod.SharedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Media {
  def apply(
    component: ComponentType[MediaProps | Unit] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    render: MediaProps => CallbackTo[Node] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (js.Function1[MediaProps, Node]) | Node = null
  ): UnmountedSimple[
    SharedRenderProps[MediaProps], 
    MountedWithRawType[
      SharedRenderProps[MediaProps], 
      js.Object, 
      RawMounted[SharedRenderProps[MediaProps], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.reactFns.mediaMediaMod.MediaProps) => render(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactFns.typesMod.SharedRenderProps[typingsJapgolly.reactFns.mediaMediaMod.MediaProps], 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFns.typesMod.SharedRenderProps[typingsJapgolly.reactFns.mediaMediaMod.MediaProps]])
  }
  @JSImport("react-fns", "Media")
  @js.native
  object componentImport extends js.Object
  
}

