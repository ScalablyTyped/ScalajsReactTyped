package typingsJapgolly.relayRuntime.relayStoreTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentSpecResolver extends js.Object {
  /**
    * Stop watching for changes to the results of the fragments.
    */
  def dispose(): Unit
  /**
    * Get the current results.
    */
  def resolve(): FragmentSpecResults
  /**
    * Subscribe to resolver updates.
    * Overrides existing callback (if one has been specified).
    */
  def setCallback(callback: js.Function0[Unit]): Unit
  /**
    * Update the resolver with new inputs. Call `resolve()` to get the updated
    * results.
    */
  def setProps(props: Props): Unit
  /**
    * Override the variables used to read the results of the fragments. Call
    * `resolve()` to get the updated results.
    */
  def setVariables(variables: Variables, node: ConcreteRequest): Unit
}

object FragmentSpecResolver {
  @scala.inline
  def apply(
    dispose: Callback,
    resolve: CallbackTo[FragmentSpecResults],
    setCallback: js.Function0[Unit] => Callback,
    setProps: Props => Callback,
    setVariables: (Variables, ConcreteRequest) => Callback
  ): FragmentSpecResolver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("resolve")(resolve.toJsFn)
    __obj.updateDynamic("setCallback")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => setCallback(t0).runNow()))
    __obj.updateDynamic("setProps")(js.Any.fromFunction1((t0: typingsJapgolly.relayRuntime.relayStoreTypesMod.Props) => setProps(t0).runNow()))
    __obj.updateDynamic("setVariables")(js.Any.fromFunction2((t0: typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables, t1: typingsJapgolly.relayRuntime.relayConcreteNodeMod.ConcreteRequest) => setVariables(t0, t1).runNow()))
    __obj.asInstanceOf[FragmentSpecResolver]
  }
}

