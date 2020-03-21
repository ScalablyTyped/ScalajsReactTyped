package typingsJapgolly.antd.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.ConsumerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ConfigConsumer {
  def apply(
    unstable_observedBits: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ConfigConsumerProps => CallbackTo[Node]
  ): UnmountedSimple[
    ConsumerProps[ConfigConsumerProps], 
    MountedWithRawType[
      ConsumerProps[ConfigConsumerProps], 
      js.Object, 
      RawMounted[ConsumerProps[ConfigConsumerProps], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.antd.contextMod.ConfigConsumerProps) => children(t0).runNow()))
    if (unstable_observedBits != null) __obj.updateDynamic("unstable_observedBits")(unstable_observedBits.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.mod.ConsumerProps[typingsJapgolly.antd.contextMod.ConfigConsumerProps], 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.ConsumerProps[typingsJapgolly.antd.contextMod.ConfigConsumerProps]])
  }
  @JSImport("antd/lib/config-provider", "ConfigConsumer")
  @js.native
  object componentImport extends js.Object
  
}

