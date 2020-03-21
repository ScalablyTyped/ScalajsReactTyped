package typingsJapgolly.reduxPersist.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reduxPersist.integrationReactMod.PersistGateProps
import typingsJapgolly.reduxPersist.typesMod.Persistor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PersistGate {
  def apply(
    persistor: Persistor,
    loading: VdomNode = null,
    onBeforeLift: js.UndefOr[CallbackTo[Unit | js.Promise[Unit]]] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Node | (js.Function1[/* bootstrapped */ Boolean, Node]) = null
  ): UnmountedWithRoot[
    PersistGateProps, 
    typingsJapgolly.reduxPersist.integrationReactMod.PersistGate, 
    Unit, 
    PersistGateProps
  ] = {
    val __obj = js.Dynamic.literal(persistor = persistor.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.rawNode.asInstanceOf[js.Any])
    onBeforeLift.foreach(p => __obj.updateDynamic("onBeforeLift")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reduxPersist.integrationReactMod.PersistGateProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reduxPersist.integrationReactMod.PersistGate](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reduxPersist.integrationReactMod.PersistGateProps])
  }
  @JSImport("redux-persist/integration/react", "PersistGate")
  @js.native
  object componentImport extends js.Object
  
}

