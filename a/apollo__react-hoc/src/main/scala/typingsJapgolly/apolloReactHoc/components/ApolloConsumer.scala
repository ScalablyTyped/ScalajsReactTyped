package typingsJapgolly.apolloReactHoc.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloClient.mod.default
import typingsJapgolly.apolloReactCommon.apolloConsumerMod.ApolloConsumerProps
import typingsJapgolly.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ApolloConsumer {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: default[js.Object] => CallbackTo[ReactChild | Null]
  ): UnmountedSimple[
    ApolloConsumerProps, 
    MountedWithRawType[ApolloConsumerProps, js.Object, RawMounted[ApolloConsumerProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.apolloClient.mod.default[js.Object]) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.apolloReactCommon.apolloConsumerMod.ApolloConsumerProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.apolloReactCommon.apolloConsumerMod.ApolloConsumerProps])
  }
  @JSImport("@apollo/react-hoc", "ApolloConsumer")
  @js.native
  object componentImport extends js.Object
  
}

