package typingsJapgolly.wouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefaultParams = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LinkProps = typingsJapgolly.wouter.OmitAnchorHTMLAttributesH with typingsJapgolly.wouter.mod.NavigationalProps
  type LocationHook = js.Function1[
    /* options */ js.UndefOr[typingsJapgolly.wouter.mod.LocationHookOptions], 
    typingsJapgolly.wouter.mod.LocationTuple
  ]
  type LocationTuple = js.Tuple2[typingsJapgolly.wouter.mod.Path, typingsJapgolly.wouter.mod.PushCallback]
  type Match[T /* <: typingsJapgolly.wouter.mod.DefaultParams */] = typingsJapgolly.wouter.mod.MatchWithParams[T] | typingsJapgolly.wouter.mod.NoMatch
  type MatchWithParams[T /* <: typingsJapgolly.wouter.mod.DefaultParams */] = js.Tuple2[typingsJapgolly.wouter.wouterBooleans.`true`, typingsJapgolly.wouter.mod.Params[T]]
  type MatcherFn = js.Function2[
    /* pattern */ typingsJapgolly.wouter.mod.Path, 
    /* path */ typingsJapgolly.wouter.mod.Path, 
    typingsJapgolly.wouter.mod.Match[typingsJapgolly.wouter.mod.DefaultParams]
  ]
  type NoMatch = js.Tuple2[typingsJapgolly.wouter.wouterBooleans.`false`, scala.Null]
  type Params[T /* <: typingsJapgolly.wouter.mod.DefaultParams */] = T
  type Path = java.lang.String
  type PushCallback = js.Function2[
    /* to */ typingsJapgolly.wouter.mod.Path, 
    /* replace */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type RedirectProps = typingsJapgolly.wouter.mod.NavigationalProps with js.Object
}
