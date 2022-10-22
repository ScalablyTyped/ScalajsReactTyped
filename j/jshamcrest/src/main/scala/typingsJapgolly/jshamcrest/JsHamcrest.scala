package typingsJapgolly.jshamcrest

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JsHamcrest {
  
  trait BetweenBuilder extends StObject {
    
    def and(end: Any): SimpleMatcher
  }
  object BetweenBuilder {
    
    inline def apply(and: Any => SimpleMatcher): BetweenBuilder = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and))
      __obj.asInstanceOf[BetweenBuilder]
    }
    
    extension [Self <: BetweenBuilder](x: Self) {
      
      inline def setAnd(value: Any => SimpleMatcher): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
    }
  }
  
  trait CombinableMatcher
    extends StObject
       with SimpleMatcher {
    
    /**
      * Wraps this matcher and the given matcher using JsHamcrest.Matchers.allOf().
      *
      * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
      * @return {CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
      */
    def and(matcherOrValue: Any): CombinableMatcher
    
    /**
      * Wraps this matcher and the given matcher using JsHamcrest.Matchers.anyOf().
      *
      * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
      * @return {CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
      */
    def or(matcherOrValue: Any): CombinableMatcher
  }
  object CombinableMatcher {
    
    inline def apply(
      and: Any => CombinableMatcher,
      describeTo: /* description */ Description => Callback,
      describeValueTo: (/* value */ Any, /* description */ Description) => Callback,
      matches: /* value */ Any => Boolean,
      or: Any => CombinableMatcher
    ): CombinableMatcher = {
      val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), describeTo = js.Any.fromFunction1((t0: /* description */ Description) => describeTo(t0).runNow()), describeValueTo = js.Any.fromFunction2((t0: /* value */ Any, t1: /* description */ Description) => (describeValueTo(t0, t1)).runNow()), matches = js.Any.fromFunction1(matches), or = js.Any.fromFunction1(or))
      __obj.asInstanceOf[CombinableMatcher]
    }
    
    extension [Self <: CombinableMatcher](x: Self) {
      
      inline def setAnd(value: Any => CombinableMatcher): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      inline def setOr(value: Any => CombinableMatcher): Self = StObject.set(x, "or", js.Any.fromFunction1(value))
    }
  }
  
  //
  // Description
  //
  /**
    * Defines the method for describing the object to a description.
    */
  type DescribeTo = js.Function1[/* description */ Description, Unit]
  
  /**
    * Defines the method for describing a value to a description.
    */
  type DescribeValueTo = js.Function2[/* value */ Any, /* description */ Description, Unit]
  
  trait Description extends StObject {
    
    /**
      * Appends text to this description.
      *
      * @param text Text to append to this description
      * @return {Description} Itself for method chaining
      */
    def append(text: Any): Description
    
    /**
      * Appends the description of a self describing object to this description.
      *
      * @param selfDescribingObject Any object that has a describeTo() function that accepts a JsHamcrest.Description object as argument
      * @return {Description} Itself for method chaining
      */
    def appendDescriptionOf(selfDescribingObject: SelfDescribing): Description
    
    /**
      * Appends the description of several self describing objects to this description.
      *
      * @param start Start string
      * @param separator Separator string
      * @param end End string
      * @param list Array of self describing objects. These objects must have a describeTo() function that accepts a JsHamcrest.Description object as argument
      * @return {Description} Itself for method chaining
      */
    def appendList(start: String, separator: String, end: String, list: js.Array[Any]): Description
    
    /**
      * Appends a JavaScript language’s literal to this description.
      *
      * @param literal Literal to append to this description
      * @return {Description} Itself for method chaining
      */
    def appendLiteral(literal: Any): Description
    
    /**
      * Appends an array of values to this description.
      *
      * @param start Start string
      * @param separator Separator string
      * @param end End string
      * @param list Array of values to be described to this description
      * @return {Description} Itself for method chaining
      */
    def appendValueList(start: String, separator: String, end: String, list: js.Array[SelfDescribing]): Description
    
    /**
      * Gets the current content of this description.
      *
      * @return {string} Current content of this description
      */
    def get(): String
  }
  object Description {
    
    inline def apply(
      append: Any => Description,
      appendDescriptionOf: SelfDescribing => Description,
      appendList: (String, String, String, js.Array[Any]) => Description,
      appendLiteral: Any => Description,
      appendValueList: (String, String, String, js.Array[SelfDescribing]) => Description,
      get: CallbackTo[String]
    ): Description = {
      val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), appendDescriptionOf = js.Any.fromFunction1(appendDescriptionOf), appendList = js.Any.fromFunction4(appendList), appendLiteral = js.Any.fromFunction1(appendLiteral), appendValueList = js.Any.fromFunction4(appendValueList), get = get.toJsFn)
      __obj.asInstanceOf[Description]
    }
    
    extension [Self <: Description](x: Self) {
      
      inline def setAppend(value: Any => Description): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
      
      inline def setAppendDescriptionOf(value: SelfDescribing => Description): Self = StObject.set(x, "appendDescriptionOf", js.Any.fromFunction1(value))
      
      inline def setAppendList(value: (String, String, String, js.Array[Any]) => Description): Self = StObject.set(x, "appendList", js.Any.fromFunction4(value))
      
      inline def setAppendLiteral(value: Any => Description): Self = StObject.set(x, "appendLiteral", js.Any.fromFunction1(value))
      
      inline def setAppendValueList(value: (String, String, String, js.Array[SelfDescribing]) => Description): Self = StObject.set(x, "appendValueList", js.Any.fromFunction4(value))
      
      inline def setGet(value: CallbackTo[String]): Self = StObject.set(x, "get", value.toJsFn)
    }
  }
  
  trait Matcher
    extends StObject
       with SelfDescribing {
    
    def describeValueTo(value: Any, description: Description): Unit
    @JSName("describeValueTo")
    var describeValueTo_Original: DescribeValueTo
    
    def matches(value: Any): Boolean
    @JSName("matches")
    var matches_Original: Matches
  }
  object Matcher {
    
    inline def apply(
      describeTo: /* description */ Description => Callback,
      describeValueTo: (/* value */ Any, /* description */ Description) => Callback,
      matches: /* value */ Any => Boolean
    ): Matcher = {
      val __obj = js.Dynamic.literal(describeTo = js.Any.fromFunction1((t0: /* description */ Description) => describeTo(t0).runNow()), describeValueTo = js.Any.fromFunction2((t0: /* value */ Any, t1: /* description */ Description) => (describeValueTo(t0, t1)).runNow()), matches = js.Any.fromFunction1(matches))
      __obj.asInstanceOf[Matcher]
    }
    
    extension [Self <: Matcher](x: Self) {
      
      inline def setDescribeValueTo(value: (/* value */ Any, /* description */ Description) => Callback): Self = StObject.set(x, "describeValueTo", js.Any.fromFunction2((t0: /* value */ Any, t1: /* description */ Description) => (value(t0, t1)).runNow()))
      
      inline def setMatches(value: /* value */ Any => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Defines the configurable methods for declaring a new matcher using JsHamcrest.SimpleMatcher.
    */
  trait MatcherConfig extends StObject {
    
    def describeTo(description: Description): Unit
    @JSName("describeTo")
    var describeTo_Original: DescribeTo
    
    var describeValueTo: js.UndefOr[DescribeValueTo] = js.undefined
    
    def matches(value: Any): Boolean
    @JSName("matches")
    var matches_Original: Matches
  }
  object MatcherConfig {
    
    inline def apply(describeTo: /* description */ Description => Callback, matches: /* value */ Any => Boolean): MatcherConfig = {
      val __obj = js.Dynamic.literal(describeTo = js.Any.fromFunction1((t0: /* description */ Description) => describeTo(t0).runNow()), matches = js.Any.fromFunction1(matches))
      __obj.asInstanceOf[MatcherConfig]
    }
    
    extension [Self <: MatcherConfig](x: Self) {
      
      inline def setDescribeTo(value: /* description */ Description => Callback): Self = StObject.set(x, "describeTo", js.Any.fromFunction1((t0: /* description */ Description) => value(t0).runNow()))
      
      inline def setDescribeValueTo(value: (/* value */ Any, /* description */ Description) => Callback): Self = StObject.set(x, "describeValueTo", js.Any.fromFunction2((t0: /* value */ Any, t1: /* description */ Description) => (value(t0, t1)).runNow()))
      
      inline def setDescribeValueToUndefined: Self = StObject.set(x, "describeValueTo", js.undefined)
      
      inline def setMatches(value: /* value */ Any => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
    }
  }
  
  //
  // Matcher
  //
  /**
    * Defines the method for testing the matcher against an actual value.
    */
  type Matches = js.Function1[/* value */ Any, Boolean]
  
  /**
    * Provides the assertion, filtering, and currying methods.
    */
  object Operators {
    
    /**
      * Defines the options accepted by assert().
      */
    trait AssertOptions extends StObject {
      
      var fail: js.UndefOr[js.Function1[/* description */ String, Unit]] = js.undefined
      
      var message: js.UndefOr[Any] = js.undefined
      
      var pass: js.UndefOr[js.Function1[/* description */ String, Unit]] = js.undefined
    }
    object AssertOptions {
      
      inline def apply(): AssertOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AssertOptions]
      }
      
      extension [Self <: AssertOptions](x: Self) {
        
        inline def setFail(value: /* description */ String => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* description */ String) => value(t0).runNow()))
        
        inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
        
        inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        
        inline def setPass(value: /* description */ String => Callback): Self = StObject.set(x, "pass", js.Any.fromFunction1((t0: /* description */ String) => value(t0).runNow()))
        
        inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      }
    }
  }
  
  trait SelfDescribing extends StObject {
    
    def describeTo(description: Description): Unit
    @JSName("describeTo")
    var describeTo_Original: DescribeTo
  }
  object SelfDescribing {
    
    inline def apply(describeTo: /* description */ Description => Callback): SelfDescribing = {
      val __obj = js.Dynamic.literal(describeTo = js.Any.fromFunction1((t0: /* description */ Description) => describeTo(t0).runNow()))
      __obj.asInstanceOf[SelfDescribing]
    }
    
    extension [Self <: SelfDescribing](x: Self) {
      
      inline def setDescribeTo(value: /* description */ Description => Callback): Self = StObject.set(x, "describeTo", js.Any.fromFunction1((t0: /* description */ Description) => value(t0).runNow()))
    }
  }
  
  trait SimpleMatcher
    extends StObject
       with Matcher
  object SimpleMatcher {
    
    inline def apply(
      describeTo: /* description */ Description => Callback,
      describeValueTo: (/* value */ Any, /* description */ Description) => Callback,
      matches: /* value */ Any => Boolean
    ): SimpleMatcher = {
      val __obj = js.Dynamic.literal(describeTo = js.Any.fromFunction1((t0: /* description */ Description) => describeTo(t0).runNow()), describeValueTo = js.Any.fromFunction2((t0: /* value */ Any, t1: /* description */ Description) => (describeValueTo(t0, t1)).runNow()), matches = js.Any.fromFunction1(matches))
      __obj.asInstanceOf[SimpleMatcher]
    }
  }
}
