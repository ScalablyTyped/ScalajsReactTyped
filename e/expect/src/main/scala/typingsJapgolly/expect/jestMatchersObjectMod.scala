package typingsJapgolly.expect

import typingsJapgolly.expect.typesMod.Expect
import typingsJapgolly.expect.typesMod.MatchersObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expect/build/jestMatchersObject", JSImport.Namespace)
@js.native
object jestMatchersObjectMod extends js.Object {
  val INTERNAL_MATCHER_FLAG: js.Symbol = js.native
  def getMatchers(): js.Any = js.native
  def getState(): js.Any = js.native
  def setMatchers(matchers: MatchersObject, isInternal: Boolean, expect: Expect): Unit = js.native
  def setState(state: js.Object): Unit = js.native
}

