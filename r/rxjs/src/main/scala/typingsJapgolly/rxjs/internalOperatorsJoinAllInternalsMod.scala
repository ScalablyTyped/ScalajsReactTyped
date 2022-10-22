package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservableInput
import typingsJapgolly.rxjs.distTypesInternalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsJoinAllInternalsMod {
  
  @JSImport("rxjs/internal/operators/joinAllInternals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def joinAllInternals[T, R](joinFn: js.Function1[/* sources */ js.Array[ObservableInput[T]], Observable[T]]): UnaryFunction[Observable[ObservableInput[T]], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("joinAllInternals")(joinFn.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[Observable[ObservableInput[T]], Any]]
  inline def joinAllInternals[T, R](
    joinFn: js.Function1[/* sources */ js.Array[ObservableInput[T]], Observable[T]],
    project: js.Function1[/* repeated */ Any, R]
  ): UnaryFunction[Observable[ObservableInput[T]], Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("joinAllInternals")(joinFn.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[Observable[ObservableInput[T]], Any]]
}
