package typingsJapgolly.chaiAlmost.mod._Global_

import typingsJapgolly.chai.Chai_.Equal
import typingsJapgolly.chaiAlmost.mod._Global_.Chai.ChaiAlmost.Almost
import typingsJapgolly.chaiAlmost.mod._Global_.Chai.ChaiAlmost.DeepAlmost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Chai")
@js.native
object Chai extends js.Object {
  @js.native
  trait Assertion extends js.Object {
    @JSName("almost")
    var almost_Original: Almost = js.native
    def almost(value: js.Any): Assertion = js.native
    def almost(value: js.Any, toleranceOverride: Double): Assertion = js.native
  }
  
  @js.native
  trait Deep extends js.Object {
    @JSName("almost")
    var almost_Original: DeepAlmost = js.native
    def almost(value: js.Any): Assertion = js.native
    def almost(value: js.Any, toleranceOverride: Double): Assertion = js.native
  }
  
  @js.native
  object ChaiAlmost extends js.Object {
    @js.native
    trait Almost extends DeepAlmost {
      @JSName("eql")
      var eql_Original: Equal = js.native
      @JSName("eqls")
      var eqls_Original: Equal = js.native
      def eql(value: js.Any): typingsJapgolly.chai.Chai_.Assertion = js.native
      def eql(value: js.Any, message: String): typingsJapgolly.chai.Chai_.Assertion = js.native
      def eqls(value: js.Any): typingsJapgolly.chai.Chai_.Assertion = js.native
      def eqls(value: js.Any, message: String): typingsJapgolly.chai.Chai_.Assertion = js.native
    }
    
    @js.native
    trait DeepAlmost extends js.Object {
      @JSName("eq")
      var eq_Original: Equal = js.native
      @JSName("equal")
      var equal_Original: Equal = js.native
      @JSName("equals")
      var equals_Original: Equal = js.native
      def apply(value: js.Any): Assertion = js.native
      def apply(value: js.Any, toleranceOverride: Double): Assertion = js.native
      def eq(value: js.Any): typingsJapgolly.chai.Chai_.Assertion = js.native
      def eq(value: js.Any, message: String): typingsJapgolly.chai.Chai_.Assertion = js.native
      def equal(value: js.Any): typingsJapgolly.chai.Chai_.Assertion = js.native
      def equal(value: js.Any, message: String): typingsJapgolly.chai.Chai_.Assertion = js.native
      def equals(value: js.Any): typingsJapgolly.chai.Chai_.Assertion = js.native
      def equals(value: js.Any, message: String): typingsJapgolly.chai.Chai_.Assertion = js.native
    }
    
  }
  
}

