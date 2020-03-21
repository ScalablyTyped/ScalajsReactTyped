package typingsJapgolly.mockingoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExpectedReturnType = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | js.Symbol | js.Object | scala.Unit | scala.Null
  ]
  type Proxy = typingsJapgolly.mockingoose.mod.Target with org.scalablytyped.runtime.StringDictionary[typingsJapgolly.mockingoose.mod.Mock] with (js.Function1[
    /* model */ java.lang.String | (typingsJapgolly.mongoose.mod.Model_[_, js.Object]), 
    typingsJapgolly.mockingoose.mod.Mock
  ])
  type ReturnFunction = js.Function1[
    /* param */ typingsJapgolly.mongoose.mod.Query[js.Any] | typingsJapgolly.mongoose.mod.Aggregate[js.Any], 
    js.Object
  ]
}
