package typingsJapgolly.mobx

import typingsJapgolly.mobx.distCoreComputedvalueMod.IComputedValue
import typingsJapgolly.mobx.distInternalMod.ObservableMap
import typingsJapgolly.mobx.distInternalMod.ObservableSet
import typingsJapgolly.mobx.distTypesObservablearrayMod.IArrayDidChange
import typingsJapgolly.mobx.distTypesObservablearrayMod.IObservableArray
import typingsJapgolly.mobx.distTypesObservablemapMod.IMapDidChange
import typingsJapgolly.mobx.distTypesObservableobjectMod.IObjectDidChange
import typingsJapgolly.mobx.distTypesObservablesetMod.ISetDidChange
import typingsJapgolly.mobx.distTypesObservablevalueMod.IObservableValue
import typingsJapgolly.mobx.distTypesObservablevalueMod.IValueDidChange
import typingsJapgolly.mobx.distUtilsUtilsMod.Lambda
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiObserveMod {
  
  @JSImport("mobx/dist/api/observe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def observe(`object`: js.Object, listener: js.Function1[/* change */ IObjectDidChange[Any], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`object`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe(
    `object`: js.Object,
    listener: js.Function1[/* change */ IObjectDidChange[Any], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`object`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](observableArray: js.Array[T], listener: js.Function1[/* change */ IArrayDidChange[T], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableArray.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](
    observableArray: js.Array[T],
    listener: js.Function1[/* change */ IArrayDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableArray.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayDidChange[T], Unit]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableArray.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableArray.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[V](observableSet: ObservableSet[V], listener: js.Function1[/* change */ ISetDidChange[V], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableSet.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[V](
    observableSet: ObservableSet[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableSet.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[V](observableSet: Set[V], listener: js.Function1[/* change */ ISetDidChange[V], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableSet.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[V](
    observableSet: Set[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableSet.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](value: IComputedValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](
    value: IComputedValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](value: IObservableValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T](
    value: IObservableValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(value.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T, K /* <: /* keyof T */ String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ IValueDidChange[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      Unit
    ]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[T, K /* <: /* keyof T */ String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ IValueDidChange[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      Unit
    ],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[K, V](observableMap: ObservableMap[K, V], listener: js.Function1[/* change */ IMapDidChange[K, V], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[K, V](
    observableMap: ObservableMap[K, V],
    listener: js.Function1[/* change */ IMapDidChange[K, V], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[K, V](
    observableMap: ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[K, V](
    observableMap: ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[K, V](observableMap: Map[K, V], listener: js.Function1[/* change */ IMapDidChange[K, V], Unit]): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[K, V](
    observableMap: Map[K, V],
    listener: js.Function1[/* change */ IMapDidChange[K, V], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[K, V](
    observableMap: Map[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit]
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Lambda]
  inline def observe[K, V](
    observableMap: Map[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(observableMap.asInstanceOf[js.Any], property.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], fireImmediately.asInstanceOf[js.Any])).asInstanceOf[Lambda]
}
