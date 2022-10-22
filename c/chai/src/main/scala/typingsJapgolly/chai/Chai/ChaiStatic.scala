package typingsJapgolly.chai.Chai

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChaiStatic extends StObject {
  
  var Assertion: AssertionStatic
  
  var AssertionError: Instantiable3[
    /* message */ String, 
    /* _props */ js.UndefOr[Any], 
    /* ssf */ js.UndefOr[js.Function], 
    typingsJapgolly.chai.Chai.AssertionError
  ]
  
  /**
    * @param expression    Expression to test for truthiness.
    * @param message    Message to display on error.
    */
  def assert(expression: Any): /* asserts expression */ Boolean
  def assert(expression: Any, message: String): /* asserts expression */ Boolean
  @JSName("assert")
  var assert_Original: AssertStatic
  
  var config: Config
  
  def expect(`val`: Any): Assertion
  def expect(`val`: Any, message: String): Assertion
  @JSName("expect")
  var expect_Original: ExpectStatic
  
  def should(): Should
  
  /**
    * Provides a way to extend the internals of Chai
    */
  def use(fn: ChaiPlugin): ChaiStatic
  
  var util: ChaiUtils
  
  var version: String
}
object ChaiStatic {
  
  inline def apply(
    Assertion: AssertionStatic,
    AssertionError: Instantiable3[
      /* message */ String, 
      /* _props */ js.UndefOr[Any], 
      /* ssf */ js.UndefOr[js.Function], 
      AssertionError
    ],
    assert: AssertStatic,
    config: Config,
    expect: ExpectStatic,
    should: CallbackTo[Should],
    use: ChaiPlugin => ChaiStatic,
    util: ChaiUtils,
    version: String
  ): ChaiStatic = {
    val __obj = js.Dynamic.literal(Assertion = Assertion.asInstanceOf[js.Any], AssertionError = AssertionError.asInstanceOf[js.Any], assert = assert.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], expect = expect.asInstanceOf[js.Any], should = should.toJsFn, use = js.Any.fromFunction1(use), util = util.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChaiStatic]
  }
  
  extension [Self <: ChaiStatic](x: Self) {
    
    inline def setAssert(value: AssertStatic): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    inline def setAssertion(value: AssertionStatic): Self = StObject.set(x, "Assertion", value.asInstanceOf[js.Any])
    
    inline def setAssertionError(
      value: Instantiable3[
          /* message */ String, 
          /* _props */ js.UndefOr[Any], 
          /* ssf */ js.UndefOr[js.Function], 
          AssertionError
        ]
    ): Self = StObject.set(x, "AssertionError", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setExpect(value: ExpectStatic): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
    
    inline def setShould(value: CallbackTo[Should]): Self = StObject.set(x, "should", value.toJsFn)
    
    inline def setUse(value: ChaiPlugin => ChaiStatic): Self = StObject.set(x, "use", js.Any.fromFunction1(value))
    
    inline def setUtil(value: ChaiUtils): Self = StObject.set(x, "util", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
