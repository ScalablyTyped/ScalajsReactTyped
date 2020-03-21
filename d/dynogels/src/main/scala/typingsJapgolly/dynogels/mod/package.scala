package typingsJapgolly.dynogels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Document = org.scalablytyped.runtime.StringDictionary[js.Any]
  type DynogelsItemCallback = js.Function2[/* err */ js.Error, /* data */ typingsJapgolly.dynogels.mod.Item, scala.Unit]
  type QueryFilterChain = typingsJapgolly.dynogels.mod.ExtendedChain[typingsJapgolly.dynogels.mod.Query]
  type QueryWhereChain = typingsJapgolly.dynogels.mod.BaseChain[typingsJapgolly.dynogels.mod.Query]
  type tableResolve = js.Function0[java.lang.String]
}
