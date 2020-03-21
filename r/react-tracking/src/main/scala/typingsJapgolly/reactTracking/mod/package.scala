package typingsJapgolly.reactTracking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // Duplicated from ES6 lib to remove the `void` typing, otherwise `track` can’t be used as a HOC function that passes
  // through a JSX component that be used without casting.
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function]
  type Decorator = typingsJapgolly.reactTracking.mod.ClassDecorator with typingsJapgolly.reactTracking.mod.MethodDecorator
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactTracking.reactTrackingBooleans.`false`
    - scala.Null
    - `js.undefined`
    - typingsJapgolly.reactTracking.reactTrackingStrings._empty
  */
  type Falsy = js.UndefOr[typingsJapgolly.reactTracking.mod._Falsy | scala.Null]
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ typingsJapgolly.std.TypedPropertyDescriptor[js.Any], 
    typingsJapgolly.std.TypedPropertyDescriptor[js.Any]
  ]
  type Track_[T, P, S] = js.Function2[
    /* trackingInfo */ js.UndefOr[
      typingsJapgolly.reactTracking.mod.TrackingInfo[typingsJapgolly.std.Pick[T, java.lang.String], P, S]
    ], 
    /* options */ js.UndefOr[typingsJapgolly.reactTracking.mod.Options[typingsJapgolly.std.Partial[T]]], 
    typingsJapgolly.reactTracking.mod.Decorator
  ]
  type TrackingContext[T] = typingsJapgolly.react.mod.Context[typingsJapgolly.reactTracking.AnonTracking[T]]
  type TrackingInfo[T, P, S] = T | (js.Function3[
    /* props */ P, 
    /* state */ S, 
    /* import warning: importer.ImportType#apply Failed type conversion: any[any] */ /* args */ js.Any, 
    T | typingsJapgolly.reactTracking.mod.Falsy
  ])
}
