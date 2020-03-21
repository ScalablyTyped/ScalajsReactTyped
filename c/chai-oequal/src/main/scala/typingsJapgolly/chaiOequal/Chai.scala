package typingsJapgolly.chaiOequal

import typingsJapgolly.chai.Chai_.Equal
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
    def oeq(act: js.Any, exp: js.Any): Equal = js.native
    def oeq(act: js.Any, exp: js.Any, method: String): Equal = js.native
    def oeql(act: js.Any, exp: js.Any): Equal = js.native
    def oeql(act: js.Any, exp: js.Any, method: String): Equal = js.native
    def oequal(act: js.Any, exp: js.Any): Equal = js.native
    def oequal(act: js.Any, exp: js.Any, method: String): Equal = js.native
  }
  
  // For BDD APIs
  @js.native
  trait Assertion
    extends LanguageChains
       with NumericComparison
       with TypeComparison {
    def oeq(result: js.Any): Equal = js.native
    def oeq(result: js.Any, method: String): Equal = js.native
    def oeql(result: js.Any): Equal = js.native
    def oeql(result: js.Any, method: String): Equal = js.native
    def oequal(result: js.Any): Equal = js.native
    def oequal(result: js.Any, method: String): Equal = js.native
  }
  
}

