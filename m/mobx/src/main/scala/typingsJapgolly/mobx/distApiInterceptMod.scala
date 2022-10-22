package typingsJapgolly.mobx

import typingsJapgolly.mobx.distInternalMod.ObservableMap
import typingsJapgolly.mobx.distInternalMod.ObservableSet
import typingsJapgolly.mobx.distTypesInterceptUtilsMod.IInterceptor
import typingsJapgolly.mobx.distTypesObservablearrayMod.IArrayWillChange
import typingsJapgolly.mobx.distTypesObservablearrayMod.IArrayWillSplice
import typingsJapgolly.mobx.distTypesObservablearrayMod.IObservableArray
import typingsJapgolly.mobx.distTypesObservablemapMod.IMapWillChange
import typingsJapgolly.mobx.distTypesObservableobjectMod.IObjectWillChange
import typingsJapgolly.mobx.distTypesObservablesetMod.ISetWillChange
import typingsJapgolly.mobx.distTypesObservablevalueMod.IObservableValue
import typingsJapgolly.mobx.distTypesObservablevalueMod.IValueWillChange
import typingsJapgolly.mobx.distUtilsUtilsMod.Lambda
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiInterceptMod {
  
  @JSImport("mobx/dist/api/intercept", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def intercept(`object`: js.Object, handler: IInterceptor[IObjectWillChange[Any]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(`object`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[T](observableArray: js.Array[T], handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableArray.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[T](
    observableArray: IObservableArray[T],
    handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableArray.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[V](observableSet: ObservableSet[V], handler: IInterceptor[ISetWillChange[V]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableSet.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[V](observableSet: Set[V], handler: IInterceptor[ISetWillChange[V]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableSet.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[T](value: IObservableValue[T], handler: IInterceptor[IValueWillChange[T]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(value.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[T /* <: js.Object */, K /* <: /* keyof T */ String */](
    `object`: T,
    property: K,
    handler: IInterceptor[
      IValueWillChange[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ]
    ]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[K, V](observableMap: ObservableMap[K, V], handler: IInterceptor[IMapWillChange[K, V]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableMap.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[K, V](observableMap: ObservableMap[K, V], property: K, handler: IInterceptor[IValueWillChange[V]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableMap.asInstanceOf[js.Any], property.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[K, V](observableMap: Map[K, V], handler: IInterceptor[IMapWillChange[K, V]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableMap.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def intercept[K, V](observableMap: Map[K, V], property: K, handler: IInterceptor[IValueWillChange[V]]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("intercept")(observableMap.asInstanceOf[js.Any], property.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Lambda]
}
