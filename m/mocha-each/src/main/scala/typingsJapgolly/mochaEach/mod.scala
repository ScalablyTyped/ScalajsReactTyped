package typingsJapgolly.mochaEach

import typingsJapgolly.mocha.Mocha.SuiteFunction
import typingsJapgolly.mocha.Mocha.TestFunction
import typingsJapgolly.mocha.mod.Context
import typingsJapgolly.mocha.mod.Suite_
import typingsJapgolly.mocha.mod.Test_
import typingsJapgolly.mochaEach.anon.Describe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This function takes an array collections of parameters to be used in
    * a series of mocha tests, defined using the `it` or `describe` notation common to
    * Mocha.
    */
  inline def apply(parameters: js.Array[Any]): Describe = ^.asInstanceOf[js.Dynamic].apply(parameters.asInstanceOf[js.Any]).asInstanceOf[Describe]
  inline def apply(parameters: js.Array[Any], dIt: Unit, dDescribe: SuiteFunction): Describe = (^.asInstanceOf[js.Dynamic].apply(parameters.asInstanceOf[js.Any], dIt.asInstanceOf[js.Any], dDescribe.asInstanceOf[js.Any])).asInstanceOf[Describe]
  inline def apply(parameters: js.Array[Any], dIt: TestFunction): Describe = (^.asInstanceOf[js.Dynamic].apply(parameters.asInstanceOf[js.Any], dIt.asInstanceOf[js.Any])).asInstanceOf[Describe]
  inline def apply(parameters: js.Array[Any], dIt: TestFunction, dDescribe: SuiteFunction): Describe = (^.asInstanceOf[js.Dynamic].apply(parameters.asInstanceOf[js.Any], dIt.asInstanceOf[js.Any], dDescribe.asInstanceOf[js.Any])).asInstanceOf[Describe]
  
  @JSImport("mocha-each", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This interface describes the kind of `describe` available from a `forEach` call.
    * The result is almost identical to Mocha's `SuiteFunction` interface.
    */
  @js.native
  trait ForEachDescribeDefinition extends StObject {
    
    def apply(expectation: String): Suite_ = js.native
    def apply(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ Any, Any]): Suite_ = js.native
    
    def only(expectation: String): Suite_ = js.native
    def only(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ Any, Any]): Suite_ = js.native
    
    def skip(expectation: String): Suite_ = js.native
    def skip(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ Any, Any]): Suite_ = js.native
  }
  
  /**
    * This interface describes the kind of `it` available from a `forEach` call.
    * The result is very similar to Mocha's `TestFunction` interface.
    */
  @js.native
  trait ForEachTestFunction extends StObject {
    
    def apply(expectation: String): Test_ = js.native
    def apply(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ Any, Any]): Test_ = js.native
    
    def only(expectation: String): Test_ = js.native
    def only(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ Any, Any]): Test_ = js.native
    
    def skip(expectation: String): Test_ = js.native
    def skip(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ Any, Any]): Test_ = js.native
  }
}
