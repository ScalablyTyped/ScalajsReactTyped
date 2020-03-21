package typingsJapgolly.chaiStyle.mod._Global_

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
    def style(styleName: String): Assertion = js.native
    def style(styleName: String, styleValue: String): Assertion = js.native
  }
  
}

