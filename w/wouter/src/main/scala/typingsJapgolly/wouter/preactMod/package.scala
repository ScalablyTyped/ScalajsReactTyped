package typingsJapgolly.wouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object preactMod {
  type DefaultParams = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LinkProps = typingsJapgolly.wouter.OmitHTMLAttributesEventTa with typingsJapgolly.wouter.preactMod.NavigationalProps
  type LocationHook = js.Function1[
    /* options */ js.UndefOr[typingsJapgolly.wouter.preactMod.LocationHookOptions], 
    typingsJapgolly.wouter.preactMod.LocationTuple
  ]
  type LocationTuple = js.Tuple2[
    typingsJapgolly.wouter.preactMod.Path, 
    typingsJapgolly.wouter.preactMod.PushCallback
  ]
  type Match[T /* <: typingsJapgolly.wouter.preactMod.DefaultParams */] = typingsJapgolly.wouter.preactMod.MatchWithParams[T] | typingsJapgolly.wouter.preactMod.NoMatch
  type MatchWithParams[T /* <: typingsJapgolly.wouter.preactMod.DefaultParams */] = js.Tuple2[
    typingsJapgolly.wouter.wouterBooleans.`true`, 
    typingsJapgolly.wouter.preactMod.Params[T]
  ]
  type MatcherFn = js.Function2[
    /* pattern */ typingsJapgolly.wouter.preactMod.Path, 
    /* path */ typingsJapgolly.wouter.preactMod.Path, 
    typingsJapgolly.wouter.preactMod.Match[typingsJapgolly.wouter.preactMod.DefaultParams]
  ]
  type NoMatch = js.Tuple2[typingsJapgolly.wouter.wouterBooleans.`false`, scala.Null]
  type Params[T /* <: typingsJapgolly.wouter.preactMod.DefaultParams */] = T
  type Path = java.lang.String
  type PushCallback = js.Function2[
    /* to */ typingsJapgolly.wouter.preactMod.Path, 
    /* replace */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type RedirectProps = typingsJapgolly.wouter.preactMod.NavigationalProps with js.Object
}
