package typingsJapgolly.mobx

import typingsJapgolly.mobx.distCoreComputedvalueMod.IComputedValue
import typingsJapgolly.mobx.distCoreObservableMod.IObservable
import typingsJapgolly.mobx.distInternalMod.ObservableMap
import typingsJapgolly.mobx.distInternalMod.ObservableSet
import typingsJapgolly.mobx.distTypesObservablearrayMod.IObservableArray
import typingsJapgolly.mobx.distTypesObservablevalueMod.IObservableValue
import typingsJapgolly.mobx.distUtilsUtilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiBecomeObservedMod {
  
  @JSImport("mobx/dist/api/become-observed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onBecomeObserved(value: IComputedValue[Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved(value: IObservable, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved(value: ObservableMap[Any, Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved(value: ObservableSet[Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved(value: IObservableArray[Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved(value: IObservableValue[Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeObserved[K, V](value: ObservableMap[K, V], property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeObserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  
  inline def onBecomeUnobserved(value: IComputedValue[Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved(value: IObservable, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved(value: ObservableMap[Any, Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved(value: ObservableSet[Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved(value: IObservableArray[Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved(value: IObservableValue[Any], listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def onBecomeUnobserved[K, V](value: ObservableMap[K, V], property: K, listener: Lambda): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("onBecomeUnobserved")(value.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
}
