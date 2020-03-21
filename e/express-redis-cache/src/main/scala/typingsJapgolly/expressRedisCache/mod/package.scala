package typingsJapgolly.expressRedisCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExpirationConfig = org.scalablytyped.runtime.StringDictionary[scala.Double]
  type ExpirationPolicy = js.Function2[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typingsJapgolly.express.mod.Response_, 
    scala.Double
  ]
  type ExpireOption = scala.Double | typingsJapgolly.expressRedisCache.mod.ExpirationConfig
}
