package typingsJapgolly.chaiRoughly.mod._Global_

import typingsJapgolly.chai.Chai_.LanguageChains
import typingsJapgolly.chai.Chai_.NumericComparison
import typingsJapgolly.chai.Chai_.TypeComparison
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Chai")
@js.native
object Chai extends js.Object {
  // For Assert APIs
  @js.native
  trait Assert extends js.Object {
    @JSName("roughly")
    var roughly_Original: Roughly = js.native
    def roughly(): Assertion = js.native
    def roughly(tolerance: Double): Assertion = js.native
    def roughly(`type`: String): typingsJapgolly.chai.Chai_.Assertion = js.native
    def roughly(`type`: String, message: String): typingsJapgolly.chai.Chai_.Assertion = js.native
  }
  
  @js.native
  trait Assertion
    extends LanguageChains
       with NumericComparison
       with TypeComparison {
    @JSName("roughly")
    var roughly_Original: Roughly = js.native
    def roughly(): Assertion = js.native
    def roughly(tolerance: Double): Assertion = js.native
    def roughly(`type`: String): typingsJapgolly.chai.Chai_.Assertion = js.native
    def roughly(`type`: String, message: String): typingsJapgolly.chai.Chai_.Assertion = js.native
  }
  
  // For BDD APIs
  @js.native
  trait Roughly extends Assertion {
    def apply(): Assertion = js.native
    def apply(tolerance: Double): Assertion = js.native
  }
  
}

