package typingsJapgolly.pathToRegexp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MatchFunction[P /* <: js.Object */] = js.Function2[
    /* path */ java.lang.String, 
    /* options */ js.UndefOr[typingsJapgolly.pathToRegexp.mod.MatchFunctionOptions], 
    typingsJapgolly.pathToRegexp.mod.Match_[P]
  ]
  type Path = java.lang.String | js.RegExp | (js.Array[java.lang.String | js.RegExp])
  type PathFunction[P /* <: js.Object */] = js.Function2[
    /* data */ js.UndefOr[P], 
    /* options */ js.UndefOr[typingsJapgolly.pathToRegexp.mod.PathFunctionOptions], 
    java.lang.String
  ]
  type Token = java.lang.String | typingsJapgolly.pathToRegexp.mod.Key
}
