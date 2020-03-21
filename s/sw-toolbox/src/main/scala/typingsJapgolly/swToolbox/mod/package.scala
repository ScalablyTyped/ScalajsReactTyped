package typingsJapgolly.swToolbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Handler = js.Function1[
    /* request */ typingsJapgolly.swToolbox.mod.Request, 
    js.Promise[typingsJapgolly.swToolbox.mod.Response]
  ]
  type PrecacheURL = typingsJapgolly.swToolbox.mod.Request | java.lang.String
  type PrecacheURLs = js.Promise[js.Array[typingsJapgolly.swToolbox.mod.PrecacheURL]] | js.Array[typingsJapgolly.swToolbox.mod.PrecacheURL]
  type URLPattern = java.lang.String | js.RegExp
}
