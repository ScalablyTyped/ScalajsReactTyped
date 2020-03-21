package typingsJapgolly.dirtyChai.mod._Global_

import typingsJapgolly.chaiAsPromised.Chai.Eventually
import typingsJapgolly.std.PromiseLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Chai")
@js.native
object Chai extends js.Object {
  @js.native
  trait Assertion extends js.Object {
    @JSName("ensure")
    var ensure_Original: Assertion = js.native
    def apply(): Assertion = js.native
    def apply(message: String): Assertion = js.native
    def ensure(): Assertion = js.native
    def ensure(message: String): Assertion = js.native
  }
  
  @js.native
  trait LanguageChains extends js.Object {
    @JSName("always")
    var always_Original: Assertion = js.native
    def always(): Assertion = js.native
    def always(message: String): Assertion = js.native
  }
  
  @js.native
  trait PromisedAssertion
    extends Eventually
       with PromiseLike[js.Any] {
    @JSName("ensure")
    var ensure_Original: PromisedAssertion = js.native
    def apply(): PromisedAssertion = js.native
    def ensure(): PromisedAssertion = js.native
    def ensure(message: String): PromisedAssertion = js.native
    def ensure(`type`: String, message: String): typingsJapgolly.chaiAsPromised.Chai.PromisedAssertion = js.native
    @JSName("ensure")
    def ensure_PromisedAssertion(`type`: String): typingsJapgolly.chaiAsPromised.Chai.PromisedAssertion = js.native
  }
  
}

