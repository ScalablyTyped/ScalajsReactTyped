package typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentSpecResolver extends StObject {
  
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
  
  inline def apply(
    dispose: Callback,
    resolve: CallbackTo[FragmentSpecResults],
    setCallback: js.Function0[Unit] => Callback,
    setProps: Props => Callback,
    setVariables: (Variables, ConcreteRequest) => Callback
  ): FragmentSpecResolver = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, resolve = resolve.toJsFn, setCallback = js.Any.fromFunction1((t0: js.Function0[Unit]) => setCallback(t0).runNow()), setProps = js.Any.fromFunction1((t0: Props) => setProps(t0).runNow()), setVariables = js.Any.fromFunction2((t0: Variables, t1: ConcreteRequest) => (setVariables(t0, t1)).runNow()))
    __obj.asInstanceOf[FragmentSpecResolver]
  }
  
  extension [Self <: FragmentSpecResolver](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setResolve(value: CallbackTo[FragmentSpecResults]): Self = StObject.set(x, "resolve", value.toJsFn)
    
    inline def setSetCallback(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "setCallback", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setSetProps(value: Props => Callback): Self = StObject.set(x, "setProps", js.Any.fromFunction1((t0: Props) => value(t0).runNow()))
    
    inline def setSetVariables(value: (Variables, ConcreteRequest) => Callback): Self = StObject.set(x, "setVariables", js.Any.fromFunction2((t0: Variables, t1: ConcreteRequest) => (value(t0, t1)).runNow()))
  }
}
