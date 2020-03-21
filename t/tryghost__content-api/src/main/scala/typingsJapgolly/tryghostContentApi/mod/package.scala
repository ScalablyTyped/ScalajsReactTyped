package typingsJapgolly.tryghostContentApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArrayOrValue[T] = T | js.Array[T]
  type BrowseFunction[T] = js.Function2[
    /* options */ js.UndefOr[typingsJapgolly.tryghostContentApi.mod.Params], 
    /* memberToken */ js.UndefOr[typingsJapgolly.tryghostContentApi.mod.Nullable[java.lang.String]], 
    js.Promise[T]
  ]
  type FieldParam = java.lang.String
  type FilterParam = java.lang.String
  type LimitParam = scala.Double | java.lang.String
  type Nullable[T] = T | scala.Null
  type OrderParam = java.lang.String
  type PageParam = scala.Double
  type ReadFunction[T] = js.Function3[
    /* data */ typingsJapgolly.tryghostContentApi.mod.GhostData, 
    /* options */ js.UndefOr[typingsJapgolly.tryghostContentApi.mod.Params], 
    /* memberToken */ js.UndefOr[typingsJapgolly.tryghostContentApi.mod.Nullable[java.lang.String]], 
    js.Promise[T]
  ]
}
