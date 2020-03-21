package typingsJapgolly.reactLeaflet.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ConsumerProps
import typingsJapgolly.reactLeaflet.mod.LeafletContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LeafletConsumer {
  def apply(
    unstable_observedBits: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: LeafletContext => CallbackTo[Node]
  ): UnmountedSimple[
    ConsumerProps[LeafletContext], 
    MountedWithRawType[
      ConsumerProps[LeafletContext], 
      js.Object, 
      RawMounted[ConsumerProps[LeafletContext], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactLeaflet.mod.LeafletContext) => children(t0).runNow()))
    if (unstable_observedBits != null) __obj.updateDynamic("unstable_observedBits")(unstable_observedBits.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.mod.ConsumerProps[typingsJapgolly.reactLeaflet.mod.LeafletContext], 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.ConsumerProps[typingsJapgolly.reactLeaflet.mod.LeafletContext]])
  }
  @JSImport("react-leaflet", "LeafletConsumer")
  @js.native
  object componentImport extends js.Object
  
}

