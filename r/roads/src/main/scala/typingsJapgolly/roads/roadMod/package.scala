package typingsJapgolly.roads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object roadMod {
  type Middleware = js.ThisFunction5[
    /* this */ typingsJapgolly.roads.roadMod.Context, 
    /* method */ java.lang.String, 
    /* path */ java.lang.String, 
    /* body */ java.lang.String, 
    /* headers */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* next */ typingsJapgolly.roads.roadMod.ResponseMiddleware, 
    js.Promise[typingsJapgolly.roads.responseMod.default]
  ]
  type ResponseMiddleware = js.Function0[js.Promise[typingsJapgolly.roads.responseMod.default]]
}
