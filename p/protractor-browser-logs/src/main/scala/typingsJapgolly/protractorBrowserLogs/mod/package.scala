package typingsJapgolly.protractorBrowserLogs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type matchPredicate = java.lang.String | js.RegExp | typingsJapgolly.protractorBrowserLogs.mod.matchPredicateFunction
  type matchPredicateFunction = js.Function1[/* entry */ typingsJapgolly.seleniumWebdriver.mod.logging.Entry, scala.Boolean]
}
