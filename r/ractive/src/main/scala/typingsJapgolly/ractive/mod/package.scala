package typingsJapgolly.ractive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AdaptorPrefixer = js.Function1[
    /* map */ typingsJapgolly.ractive.mod.ValueMap, 
    typingsJapgolly.ractive.mod.ValueMap
  ]
  type Component = typingsJapgolly.ractive.mod.Static[typingsJapgolly.ractive.mod.Ractive[typingsJapgolly.ractive.mod.Ractive[js.Any]]] | (js.Promise[
    typingsJapgolly.ractive.mod.Static[typingsJapgolly.ractive.mod.Ractive[typingsJapgolly.ractive.mod.Ractive[js.Any]]]
  ])
  type Computation[T /* <: typingsJapgolly.ractive.mod.Ractive[T] */] = java.lang.String | typingsJapgolly.ractive.mod.ComputationFn[T] | typingsJapgolly.ractive.mod.ComputationDescriptor[T]
  type ComputationFn[T /* <: typingsJapgolly.ractive.mod.Ractive[T] */] = js.ThisFunction0[/* this */ T, js.Any]
  type CssFn = js.Function1[/* data */ typingsJapgolly.ractive.mod.DataGetFn, java.lang.String]
  type Data = typingsJapgolly.ractive.mod.ValueMap
  type DataFn[T /* <: typingsJapgolly.ractive.mod.Ractive[T] */] = js.ThisFunction0[/* this */ T, typingsJapgolly.ractive.mod.ValueMap]
  type DataGetFn = js.Function1[/* keypath */ java.lang.String, js.Any]
  type Decorator[T /* <: typingsJapgolly.ractive.mod.Ractive[T] */] = js.ThisFunction2[
    /* this */ T, 
    /* node */ org.scalajs.dom.raw.HTMLElement, 
    /* repeated */ js.Any, 
    typingsJapgolly.ractive.mod.DecoratorHandle
  ]
  type Easing = js.Function1[/* time */ scala.Double, scala.Double]
  type EventPlugin[T /* <: typingsJapgolly.ractive.mod.Ractive[T] */] = js.ThisFunction2[
    /* this */ T, 
    /* node */ org.scalajs.dom.raw.HTMLElement, 
    /* fire */ js.Function1[/* event */ typingsJapgolly.std.Event_, scala.Unit], 
    typingsJapgolly.ractive.AnonTeardown
  ]
  type Helper = js.ThisFunction1[
    /* this */ typingsJapgolly.ractive.mod.Ractive[typingsJapgolly.ractive.mod.Ractive[js.Any]], 
    /* repeated */ js.Any, 
    js.Any
  ]
  type Interpolator = js.Function2[/* from */ js.Any, /* to */ js.Any, js.Function1[/* t */ scala.Double, js.Any]]
  type ListenerCallback[T /* <: typingsJapgolly.ractive.mod.Ractive[T] */] = js.ThisFunction2[
    /* this */ T, 
    /* ctx */ typingsJapgolly.ractive.mod.ContextHelper, 
    /* repeated */ js.Any, 
    scala.Boolean | scala.Unit | js.Promise[js.Any]
  ]
  type MacroFn = js.Function1[/* MacroHelper */ js.Any, typingsJapgolly.ractive.mod.MacroHandle]
  type ObserverArrayCallback[T /* <: typingsJapgolly.ractive.mod.Ractive[T] */] = js.ThisFunction1[
    /* this */ T, 
    /* changes */ typingsJapgolly.ractive.mod.ArrayChanges, 
    scala.Unit | js.Promise[js.Any]
  ]
  type ObserverCallback[T /* <: typingsJapgolly.ractive.mod.Ractive[T] */] = js.ThisFunction4[
    /* this */ T, 
    /* value */ js.Any, 
    /* old */ js.Any, 
    /* keypath */ java.lang.String, 
    /* repeated */ java.lang.String, 
    scala.Unit | js.Promise[js.Any]
  ]
  type ParseDelimiters = js.Tuple2[java.lang.String, java.lang.String]
  type ParseFn = js.Function1[
    /* helper */ typingsJapgolly.ractive.mod.ParseHelper, 
    java.lang.String | (js.Array[js.Object | java.lang.String]) | typingsJapgolly.ractive.mod.ParsedTemplate
  ]
  type Partial = java.lang.String | js.Array[js.Any] | typingsJapgolly.ractive.mod.ParseFn | typingsJapgolly.ractive.mod.Macro
  type PartialMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.ractive.mod.Partial]
  type Plugin = js.Function1[/* PluginArgsBase */ js.Any, scala.Unit]
  type PluginExtend = js.Function1[/* PluginArgsExtend */ js.Any, scala.Unit]
  type PluginInstance = js.Function1[/* PluginArgsInstance */ js.Any, scala.Unit]
  type Registry[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ShuffleFn = js.Function2[
    /* left */ js.Any, 
    /* right */ js.Any, 
    typingsJapgolly.ractive.ractiveNumbers.`1` | typingsJapgolly.ractive.ractiveNumbers.`0` | typingsJapgolly.ractive.ractiveNumbers.`-1`
  ]
  type Shuffler = scala.Boolean | java.lang.String | typingsJapgolly.ractive.mod.ShuffleFn
  type Target = java.lang.String | org.scalajs.dom.raw.HTMLElement | typingsJapgolly.std.ArrayLike[js.Any]
  type Template = typingsJapgolly.ractive.mod.ParsedTemplate | java.lang.String | js.Array[js.Any] | typingsJapgolly.ractive.mod.ParseFn
  type Transition = js.Function2[
    /* helper */ typingsJapgolly.ractive.mod.TransitionHelper, 
    /* repeated */ js.Any, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  type ValueMap = org.scalablytyped.runtime.StringDictionary[js.Any]
}
