package typingsJapgolly.wouter

import typingsJapgolly.wouter.mod.MatcherFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wouter/matcher", JSImport.Namespace)
@js.native
object matcherMod extends js.Object {
  def default(): MatcherFn = js.native
  def default(
    makeRegexpFn: js.Function2[/* pattern */ String, /* keys */ js.UndefOr[js.Array[AnonName]], js.RegExp]
  ): MatcherFn = js.native
}

