package typingsJapgolly.rxjsCompat

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservableInput
import typingsJapgolly.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsWindowToggleMod {
  
  @JSImport("rxjs-compat/operators/windowToggle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def windowToggle[T, O](
    openings: ObservableInput[O],
    closingSelector: js.Function1[/* openValue */ O, ObservableInput[Any]]
  ): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowToggle")(openings.asInstanceOf[js.Any], closingSelector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
}
