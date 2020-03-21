package typingsJapgolly.chaiLike.mod._Global_

import typingsJapgolly.chai.Chai_.LanguageChains
import typingsJapgolly.chai.Chai_.NumericComparison
import typingsJapgolly.chai.Chai_.TypeComparison
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Chai")
@js.native
object Chai extends js.Object {
  @js.native
  trait Assertion
    extends LanguageChains
       with NumericComparison
       with TypeComparison {
    def like(expected: js.Any): Unit = js.native
  }
  
}

