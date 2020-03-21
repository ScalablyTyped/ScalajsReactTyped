package typingsJapgolly.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AlgoliasearchInstance = js.Function3[
    /* applicationId */ java.lang.String, 
    /* apiKey */ java.lang.String, 
    /* options */ js.UndefOr[typingsJapgolly.algoliasearch.mod.ClientOptions], 
    typingsJapgolly.algoliasearch.mod.Client
  ]
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
}
