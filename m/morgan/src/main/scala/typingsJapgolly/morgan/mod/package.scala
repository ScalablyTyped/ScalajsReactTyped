package typingsJapgolly.morgan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormatFn = js.Function3[
    /* tokens */ typingsJapgolly.morgan.mod.TokenIndexer, 
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typingsJapgolly.express.mod.Response_, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type TokenCallbackFn = js.Function3[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typingsJapgolly.express.mod.Response_, 
    /* arg */ js.UndefOr[java.lang.String | scala.Double | scala.Boolean], 
    js.UndefOr[java.lang.String]
  ]
  type TokenIndexer = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.morgan.mod.TokenCallbackFn]
}
