package typingsJapgolly.tsMockito

import typingsJapgolly.tsMockito.matcherMod.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/matcher/type/BetweenMatcher", JSImport.Namespace)
@js.native
object betweenMatcherMod extends js.Object {
  @js.native
  class BetweenMatcher protected () extends Matcher {
    def this(min: Double, max: Double) = this()
    var max: js.Any = js.native
    var min: js.Any = js.native
  }
  
}

