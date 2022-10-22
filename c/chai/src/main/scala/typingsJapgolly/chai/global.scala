package typingsJapgolly.chai

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.chai.Chai.ChaiStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Chai_ {
    
    @JSGlobal("Chai.AssertionError")
    @js.native
    open class AssertionError protected ()
      extends StObject
         with typingsJapgolly.chai.Chai.AssertionError {
      def this(message: String) = this()
      def this(message: String, _props: Any) = this()
      def this(message: String, _props: Any, ssf: js.Function) = this()
      def this(message: String, _props: Unit, ssf: js.Function) = this()
      
      /* CompleteClass */
      var message: String = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      var showDiff: Boolean = js.native
      
      /* CompleteClass */
      var stack: String = js.native
    }
  }
  
  object chai extends Shortcut {
    
    @JSGlobal("chai")
    @js.native
    val ^ : ChaiStatic = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("chai.Assertion")
    @js.native
    open class Assertion protected ()
      extends StObject
         with typingsJapgolly.chai.Chai.Assertion {
      def this(target: Any) = this()
      def this(target: Any, message: String) = this()
      def this(target: Any, message: String, ssfi: js.Function) = this()
      def this(target: Any, message: Unit, ssfi: js.Function) = this()
      def this(target: Any, message: String, ssfi: js.Function, lockSsfi: Boolean) = this()
      def this(target: Any, message: String, ssfi: Unit, lockSsfi: Boolean) = this()
      def this(target: Any, message: Unit, ssfi: js.Function, lockSsfi: Boolean) = this()
      def this(target: Any, message: Unit, ssfi: Unit, lockSsfi: Boolean) = this()
      
      /* CompleteClass */
      override def and(`type`: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      override def and(`type`: String, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      @JSName("and")
      var and_Original: typingsJapgolly.chai.Chai.Assertion = js.native
      
      /* CompleteClass */
      override def at(`type`: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      override def at(`type`: String, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      @JSName("at")
      var at_Original: typingsJapgolly.chai.Chai.Assertion = js.native
      
      /* CompleteClass */
      override def be(`type`: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      override def be(`type`: String, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      @JSName("be")
      var be_Original: typingsJapgolly.chai.Chai.Assertion = js.native
      
      /* CompleteClass */
      override def been(`type`: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      override def been(`type`: String, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      @JSName("been")
      var been_Original: typingsJapgolly.chai.Chai.Assertion = js.native
      
      /* CompleteClass */
      override def but(`type`: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      override def but(`type`: String, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      @JSName("but")
      var but_Original: typingsJapgolly.chai.Chai.Assertion = js.native
      
      /* CompleteClass */
      override def does(`type`: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      override def does(`type`: String, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      @JSName("does")
      var does_Original: typingsJapgolly.chai.Chai.Assertion = js.native
      
      /* CompleteClass */
      override def has(`type`: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      override def has(`type`: String, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      @JSName("has")
      var has_Original: typingsJapgolly.chai.Chai.Assertion = js.native
      
      /* CompleteClass */
      override def have(`type`: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      override def have(`type`: String, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      @JSName("have")
      var have_Original: typingsJapgolly.chai.Chai.Assertion = js.native
      
      /* CompleteClass */
      override def is(`type`: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      override def is(`type`: String, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      @JSName("is")
      var is_Original: typingsJapgolly.chai.Chai.Assertion = js.native
      
      /* CompleteClass */
      override def of(`type`: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      override def of(`type`: String, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      @JSName("of")
      var of_Original: typingsJapgolly.chai.Chai.Assertion = js.native
      
      /* CompleteClass */
      override def same(`type`: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      override def same(`type`: String, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      @JSName("same")
      var same_Original: typingsJapgolly.chai.Chai.Assertion = js.native
      
      /* CompleteClass */
      override def that(`type`: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      override def that(`type`: String, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      @JSName("that")
      var that_Original: typingsJapgolly.chai.Chai.Assertion = js.native
      
      /* CompleteClass */
      override def to(`type`: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      override def to(`type`: String, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      @JSName("to")
      var to_Original: typingsJapgolly.chai.Chai.Assertion = js.native
      
      /* CompleteClass */
      override def which(`type`: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      override def which(`type`: String, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      @JSName("which")
      var which_Original: typingsJapgolly.chai.Chai.Assertion = js.native
      
      /* CompleteClass */
      override def `with`(`type`: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      override def `with`(`type`: String, message: String): typingsJapgolly.chai.Chai.Assertion = js.native
      /* CompleteClass */
      @JSName("with")
      var with_Original: typingsJapgolly.chai.Chai.Assertion = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("chai.AssertionError")
    @js.native
    open class AssertionError protected ()
      extends StObject
         with typingsJapgolly.chai.Chai.AssertionError {
      def this(message: String) = this()
      def this(message: String, _props: Any) = this()
      def this(message: String, _props: Any, ssf: js.Function) = this()
      def this(message: String, _props: Unit, ssf: js.Function) = this()
      
      /* CompleteClass */
      var message: String = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      var showDiff: Boolean = js.native
      
      /* CompleteClass */
      var stack: String = js.native
    }
    
    type _To = ChaiStatic
    
    /* This means you don't have to write `^`, but can instead just say `chai.foo` */
    override def _to: ChaiStatic = ^
  }
}
