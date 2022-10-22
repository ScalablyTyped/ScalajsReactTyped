package typingsJapgolly.rxjs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservableInput
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typingsJapgolly.rxjs.distTypesInternalTypesMod.OperatorFunction
import typingsJapgolly.rxjs.distTypesInternalTypesMod.SubjectLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsConnectMod {
  
  @JSImport("rxjs/dist/types/internal/operators/connect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect[T, O /* <: ObservableInput[Any] */](selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(selector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def connect[T, O /* <: ObservableInput[Any] */](selector: js.Function1[/* shared */ Observable[T], O], config: ConnectConfig[T]): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(selector.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  
  trait ConnectConfig[T] extends StObject {
    
    /**
      * A factory function used to create the Subject through which the source
      * is multicast. By default, this creates a {@link Subject}.
      */
    def connector(): SubjectLike[T]
  }
  object ConnectConfig {
    
    inline def apply[T](connector: CallbackTo[SubjectLike[T]]): ConnectConfig[T] = {
      val __obj = js.Dynamic.literal(connector = connector.toJsFn)
      __obj.asInstanceOf[ConnectConfig[T]]
    }
    
    extension [Self <: ConnectConfig[?], T](x: Self & ConnectConfig[T]) {
      
      inline def setConnector(value: CallbackTo[SubjectLike[T]]): Self = StObject.set(x, "connector", value.toJsFn)
    }
  }
}
