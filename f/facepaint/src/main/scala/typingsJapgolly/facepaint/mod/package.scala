package typingsJapgolly.facepaint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Arg = typingsJapgolly.facepaint.mod.BaseArg | js.Array[typingsJapgolly.facepaint.mod.BaseArg]
  type BaseArg = js.Object | js.Array[js.Object]
  type DynamicStyle = org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]]
  type DynamicStyleFunction = js.Function1[
    /* repeated */ typingsJapgolly.facepaint.mod.Arg, 
    js.Array[typingsJapgolly.facepaint.mod.DynamicStyle]
  ]
  type Selector = java.lang.String
}
