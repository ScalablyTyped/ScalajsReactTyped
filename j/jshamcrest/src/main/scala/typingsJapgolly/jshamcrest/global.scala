package typingsJapgolly.jshamcrest

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.jshamcrest.JsHamcrest.BetweenBuilder
import typingsJapgolly.jshamcrest.JsHamcrest.CombinableMatcher
import typingsJapgolly.jshamcrest.JsHamcrest.DescribeTo
import typingsJapgolly.jshamcrest.JsHamcrest.DescribeValueTo
import typingsJapgolly.jshamcrest.JsHamcrest.Description
import typingsJapgolly.jshamcrest.JsHamcrest.Matcher
import typingsJapgolly.jshamcrest.JsHamcrest.MatcherConfig
import typingsJapgolly.jshamcrest.JsHamcrest.Matches
import typingsJapgolly.jshamcrest.JsHamcrest.Operators.AssertOptions
import typingsJapgolly.jshamcrest.JsHamcrest.SelfDescribing
import typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher
import typingsJapgolly.jshamcrest.anon.AttachAssertions
import typingsJapgolly.jshamcrest.anon.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object JsHamcrest {
    
    @JSGlobal("JsHamcrest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("JsHamcrest.BetweenBuilder")
    @js.native
    open class BetweenBuilder ()
      extends StObject
         with typingsJapgolly.jshamcrest.JsHamcrest.BetweenBuilder {
      
      /* CompleteClass */
      override def and(end: Any): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = js.native
    }
    
    @JSGlobal("JsHamcrest.CombinableMatcher")
    @js.native
    open class CombinableMatcher ()
      extends StObject
         with typingsJapgolly.jshamcrest.JsHamcrest.CombinableMatcher {
      
      /**
        * Wraps this matcher and the given matcher using JsHamcrest.Matchers.allOf().
        *
        * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
        * @return {CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
        */
      /* CompleteClass */
      override def and(matcherOrValue: Any): typingsJapgolly.jshamcrest.JsHamcrest.CombinableMatcher = js.native
      
      /* CompleteClass */
      override def describeTo(description: typingsJapgolly.jshamcrest.JsHamcrest.Description): Unit = js.native
      /* CompleteClass */
      @JSName("describeTo")
      var describeTo_Original: DescribeTo = js.native
      
      /* CompleteClass */
      override def describeValueTo(value: Any, description: typingsJapgolly.jshamcrest.JsHamcrest.Description): Unit = js.native
      /* CompleteClass */
      @JSName("describeValueTo")
      var describeValueTo_Original: DescribeValueTo = js.native
      
      /* CompleteClass */
      override def matches(value: Any): Boolean = js.native
      /* CompleteClass */
      @JSName("matches")
      var matches_Original: Matches = js.native
      
      /**
        * Wraps this matcher and the given matcher using JsHamcrest.Matchers.anyOf().
        *
        * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
        * @return {CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
        */
      /* CompleteClass */
      override def or(matcherOrValue: Any): typingsJapgolly.jshamcrest.JsHamcrest.CombinableMatcher = js.native
    }
    
    @JSGlobal("JsHamcrest.Description")
    @js.native
    open class Description ()
      extends StObject
         with typingsJapgolly.jshamcrest.JsHamcrest.Description {
      
      /**
        * Appends text to this description.
        *
        * @param text Text to append to this description
        * @return {Description} Itself for method chaining
        */
      /* CompleteClass */
      override def append(text: Any): typingsJapgolly.jshamcrest.JsHamcrest.Description = js.native
      
      /**
        * Appends the description of a self describing object to this description.
        *
        * @param selfDescribingObject Any object that has a describeTo() function that accepts a JsHamcrest.Description object as argument
        * @return {Description} Itself for method chaining
        */
      /* CompleteClass */
      override def appendDescriptionOf(selfDescribingObject: SelfDescribing): typingsJapgolly.jshamcrest.JsHamcrest.Description = js.native
      
      /**
        * Appends the description of several self describing objects to this description.
        *
        * @param start Start string
        * @param separator Separator string
        * @param end End string
        * @param list Array of self describing objects. These objects must have a describeTo() function that accepts a JsHamcrest.Description object as argument
        * @return {Description} Itself for method chaining
        */
      /* CompleteClass */
      override def appendList(start: String, separator: String, end: String, list: js.Array[Any]): typingsJapgolly.jshamcrest.JsHamcrest.Description = js.native
      
      /**
        * Appends a JavaScript language’s literal to this description.
        *
        * @param literal Literal to append to this description
        * @return {Description} Itself for method chaining
        */
      /* CompleteClass */
      override def appendLiteral(literal: Any): typingsJapgolly.jshamcrest.JsHamcrest.Description = js.native
      
      /**
        * Appends an array of values to this description.
        *
        * @param start Start string
        * @param separator Separator string
        * @param end End string
        * @param list Array of values to be described to this description
        * @return {Description} Itself for method chaining
        */
      /* CompleteClass */
      override def appendValueList(start: String, separator: String, end: String, list: js.Array[SelfDescribing]): typingsJapgolly.jshamcrest.JsHamcrest.Description = js.native
      
      /**
        * Gets the current content of this description.
        *
        * @return {string} Current content of this description
        */
      /* CompleteClass */
      override def get(): String = js.native
    }
    
    inline def EqualTo(factory: js.Function1[/* matcher */ Matcher, Matcher]): js.Function1[/* matcherOrValue */ Any, Matcher] = ^.asInstanceOf[js.Dynamic].applyDynamic("EqualTo")(factory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* matcherOrValue */ Any, Matcher]]
    
    /**
      * Provides methods for exposing matchers and operators for several testing frameworks.
      */
    object Integration {
      
      @JSGlobal("JsHamcrest.Integration")
      @js.native
      val ^ : js.Any = js.native
      
      inline def JsTestDriver(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("JsTestDriver")().asInstanceOf[Unit]
      inline def JsTestDriver(params: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("JsTestDriver")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def JsUnitTest(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("JsUnitTest")().asInstanceOf[Unit]
      inline def JsUnitTest(params: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("JsUnitTest")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def Nodeunit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Nodeunit")().asInstanceOf[Unit]
      inline def Nodeunit(params: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Nodeunit")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def QUnit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("QUnit")().asInstanceOf[Unit]
      inline def QUnit(params: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("QUnit")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def Rhino(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Rhino")().asInstanceOf[Unit]
      
      inline def WebBrowser(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("WebBrowser")().asInstanceOf[Unit]
      
      inline def YUITest(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("YUITest")().asInstanceOf[Unit]
      inline def YUITest(params: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("YUITest")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def copyMembers(source: js.Object, target: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyMembers")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def copyMembers(target: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("copyMembers")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def installMatchers(source: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installMatchers")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def installOperators(source: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("installOperators")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def jasmine(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jasmine")().asInstanceOf[Unit]
      inline def jasmine(params: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jasmine")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def jsUnity(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jsUnity")().asInstanceOf[Unit]
      inline def jsUnity(params: AttachAssertions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jsUnity")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def screwunit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("screwunit")().asInstanceOf[Unit]
      inline def screwunit(params: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("screwunit")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    /**
      * Defines all of the built-in matchers grouped into five categories.
      */
    object Matchers {
      
      @JSGlobal("JsHamcrest.Matchers")
      @js.native
      val ^ : js.Any = js.native
      
      inline def allOf(matchersOrValues: Any*): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("allOf")(matchersOrValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def anyOf(matchersOrValues: Any*): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("anyOf")(matchersOrValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def anything(): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("anything")().asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def between(start: Any): typingsJapgolly.jshamcrest.JsHamcrest.BetweenBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("between")(start.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.BetweenBuilder]
      
      inline def bool(): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")().asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def both(matcherOrValue: Any): typingsJapgolly.jshamcrest.JsHamcrest.CombinableMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("both")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.CombinableMatcher]
      
      inline def closeTo(expected: Double): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("closeTo")(expected.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      inline def closeTo(expected: Double, delta: Double): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("closeTo")(expected.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def containsString(str: String): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("containsString")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def divisibleBy(divisor: Double): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("divisibleBy")(divisor.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def either(matcherOrValue: Any): typingsJapgolly.jshamcrest.JsHamcrest.CombinableMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("either")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.CombinableMatcher]
      
      inline def emailAddress(): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("emailAddress")().asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def empty(): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def endsWith(str: String): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def equalIgnoringCase(str: String): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("equalIgnoringCase")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def equalTo(expected: Any): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(expected.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def even(): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("even")().asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def everyItem(matcherOrValue: Any): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("everyItem")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def func(): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("func")().asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def greaterThan(expected: Any): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("greaterThan")(expected.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def greaterThanOrEqualTo(expected: Any): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("greaterThanOrEqualTo")(expected.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def hasFunction(functionName: String): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("hasFunction")(functionName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def hasItem(matcherOrValue: Any): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("hasItem")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def hasItems(matchersOrValues: Any*): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("hasItems")(matchersOrValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def hasMember(memberName: String): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMember")(memberName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      inline def hasMember(memberName: String, matcherOrValue: Any): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMember")(memberName.asInstanceOf[js.Any], matcherOrValue.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def hasSize(matcherOrValue: Any): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSize")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def instanceOf(clazz: Instantiable0[Any]): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOf")(clazz.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def is(matcherOrValue: Any): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def isIn(items: Any*): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("isIn")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def lessThan(expected: Any): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("lessThan")(expected.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def lessThanOrEqualTo(expected: Any): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("lessThanOrEqualTo")(expected.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def matches(regex: js.RegExp): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("matches")(regex.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def nil(): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("nil")().asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def not(matcherOrValue: Any): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def notANumber(): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("notANumber")().asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def number(): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def `object`(): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("object")().asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def odd(): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("odd")().asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def oneOf(items: Any*): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def raises(exceptionName: String): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("raises")(exceptionName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def raisesAnything(): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("raisesAnything")().asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def sameAs(expected: Any): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("sameAs")(expected.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def startsWith(str: String): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def string(): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def truth(): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("truth")().asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def typeOf(typeName: String): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(typeName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
      
      inline def zero(): typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher]
    }
    
    /**
      * Provides the assertion, filtering, and currying methods.
      */
    object Operators {
      
      @JSGlobal("JsHamcrest.Operators")
      @js.native
      val ^ : js.Any = js.native
      
      inline def assert(actual: Any): typingsJapgolly.jshamcrest.JsHamcrest.Description = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(actual.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.Description]
      inline def assert(actual: Any, matcherOrValue: Any): typingsJapgolly.jshamcrest.JsHamcrest.Description = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(actual.asInstanceOf[js.Any], matcherOrValue.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.Description]
      inline def assert(actual: Any, matcherOrValue: Any, options: AssertOptions): typingsJapgolly.jshamcrest.JsHamcrest.Description = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(actual.asInstanceOf[js.Any], matcherOrValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.Description]
      inline def assert(actual: Any, matcherOrValue: Unit, options: AssertOptions): typingsJapgolly.jshamcrest.JsHamcrest.Description = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(actual.asInstanceOf[js.Any], matcherOrValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jshamcrest.JsHamcrest.Description]
      
      inline def callTo(func: js.Function1[/* repeated */ Any, Any], args: Any*): js.Function0[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("callTo")(scala.List(func.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function0[Any]]
      
      inline def filter(array: js.Array[Any], matcherOrValue: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(array.asInstanceOf[js.Any], matcherOrValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    }
    
    @JSGlobal("JsHamcrest.SimpleMatcher")
    @js.native
    open class SimpleMatcher protected ()
      extends StObject
         with typingsJapgolly.jshamcrest.JsHamcrest.SimpleMatcher {
      def this(config: MatcherConfig) = this()
      
      /* CompleteClass */
      override def describeTo(description: typingsJapgolly.jshamcrest.JsHamcrest.Description): Unit = js.native
      /* CompleteClass */
      @JSName("describeTo")
      var describeTo_Original: DescribeTo = js.native
      
      /* CompleteClass */
      override def describeValueTo(value: Any, description: typingsJapgolly.jshamcrest.JsHamcrest.Description): Unit = js.native
      /* CompleteClass */
      @JSName("describeValueTo")
      var describeValueTo_Original: DescribeValueTo = js.native
      
      /* CompleteClass */
      override def matches(value: Any): Boolean = js.native
      /* CompleteClass */
      @JSName("matches")
      var matches_Original: Matches = js.native
    }
    
    inline def isMatcher(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMatcher")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSGlobal("JsHamcrest.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  //
  // Core Matchers
  //
  /**
    * All matchesOrValues must match the actual value. This matcher behaves pretty much like the JavaScript && (and) operator.
    *
    * @param matchersOrValues Instances of JsHamcrest.SimpleMatcher and/or values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def allOf(matchersOrValues: Any*): SimpleMatcher = js.Dynamic.global.applyDynamic("allOf")(matchersOrValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SimpleMatcher]
  
  /**
    * At least one of the matchersOrValues should match the actual value. This matcher behaves pretty much like the JavaScript || (or) operator.
    *
    * @param matchersOrValues Instances of JsHamcrest.SimpleMatcher and/or values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def anyOf(matchersOrValues: Any*): SimpleMatcher = js.Dynamic.global.applyDynamic("anyOf")(matchersOrValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SimpleMatcher]
  
  /**
    * Useless always-match matcher.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def anything(): SimpleMatcher = js.Dynamic.global.applyDynamic("anything")().asInstanceOf[SimpleMatcher]
  
  //
  // Functions that are copied by copyMembers() to the global scope are copy-n-pasted here.
  //
  // TODO There must be a better way to do this, and not every testing framework places them in the global scope.
  //
  //
  // Assert
  //
  /**
    * Fails if the actual value does not match the matcher.
    *
    * @param actual Value to test against the matcher
    * @param matcher Applied to the value
    * @param message Prepends the built description
    * @return {JsHamcrest.Description} Contains the message, actual value, matcher, and result
    */
  inline def assertThat(actual: Any): Description = js.Dynamic.global.applyDynamic("assertThat")(actual.asInstanceOf[js.Any]).asInstanceOf[Description]
  inline def assertThat(actual: Any, matcher: Unit, message: Any): Description = (js.Dynamic.global.applyDynamic("assertThat")(actual.asInstanceOf[js.Any], matcher.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Description]
  inline def assertThat(actual: Any, matcher: Matcher): Description = (js.Dynamic.global.applyDynamic("assertThat")(actual.asInstanceOf[js.Any], matcher.asInstanceOf[js.Any])).asInstanceOf[Description]
  inline def assertThat(actual: Any, matcher: Matcher, message: Any): Description = (js.Dynamic.global.applyDynamic("assertThat")(actual.asInstanceOf[js.Any], matcher.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Description]
  
  //
  // Number Matchers
  //
  /**
    * The actual number must be between the given range (inclusive).
    *
    * @param start Range start
    * @return {JsHamcrest.BetweenBuilder} Builder object with an and(end) method, which returns a JsHamcrest.SimpleMatcher instance and thus should be called to finish the matcher creation
    */
  inline def between(start: Any): BetweenBuilder = js.Dynamic.global.applyDynamic("between")(start.asInstanceOf[js.Any]).asInstanceOf[BetweenBuilder]
  
  //
  // Object Matchers
  //
  /**
    * The actual value must be a boolean.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def bool(): SimpleMatcher = js.Dynamic.global.applyDynamic("bool")().asInstanceOf[SimpleMatcher]
  
  /**
    * Combinable matcher where the actual value must match all the given matchers or values.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
    */
  inline def both(matcherOrValue: Any): CombinableMatcher = js.Dynamic.global.applyDynamic("both")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[CombinableMatcher]
  
  /**
    * The actual number must be close enough to expected, that is, the actual number is equal to a value within some range of acceptable error.
    *
    * @param expected Expected number
    * @param [delta=0] Expected difference delta
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def closeTo(expected: Double): SimpleMatcher = js.Dynamic.global.applyDynamic("closeTo")(expected.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  inline def closeTo(expected: Double, delta: Double): SimpleMatcher = (js.Dynamic.global.applyDynamic("closeTo")(expected.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[SimpleMatcher]
  
  //
  // Text Matchers
  //
  /**
    * The actual string must have a substring equals to str.
    *
    * @param str Substring
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def containsString(str: String): SimpleMatcher = js.Dynamic.global.applyDynamic("containsString")(str.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual number must be divisible by divisor.
    *
    * @param divisor Divisor
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def divisibleBy(divisor: Double): SimpleMatcher = js.Dynamic.global.applyDynamic("divisibleBy")(divisor.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * Combinable matcher where the actual value must match at least one of the given matchers or values.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.CombinableMatcher} Instance of JsHamcrest.CombinableMatcher
    */
  inline def either(matcherOrValue: Any): CombinableMatcher = js.Dynamic.global.applyDynamic("either")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[CombinableMatcher]
  
  /**
    * The actual string must look like an e-mail address.
    *
    * Warning: This matcher is not fully compliant with RFC2822 due to its complexity.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def emailAddress(): SimpleMatcher = js.Dynamic.global.applyDynamic("emailAddress")().asInstanceOf[SimpleMatcher]
  
  //
  // Collection Matchers
  //
  /**
    * The length of the actual value must be zero.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def empty(): SimpleMatcher = js.Dynamic.global.applyDynamic("empty")().asInstanceOf[SimpleMatcher]
  
  /**
    * The actual string must end with str.
    *
    * @param str Substring
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def endsWith(str: String): SimpleMatcher = js.Dynamic.global.applyDynamic("endsWith")(str.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual string must be equal to str, ignoring case.
    *
    * @param str String
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def equalIgnoringCase(str: String): SimpleMatcher = js.Dynamic.global.applyDynamic("equalIgnoringCase")(str.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must be equal to expected.
    *
    * @param expected Expected value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def equalTo(expected: Any): SimpleMatcher = js.Dynamic.global.applyDynamic("equalTo")(expected.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual number must be even.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def even(): SimpleMatcher = js.Dynamic.global.applyDynamic("even")().asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value should be an array and matcherOrValue must match all items.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def everyItem(matcherOrValue: Any): SimpleMatcher = js.Dynamic.global.applyDynamic("everyItem")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must be a function.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def func(): SimpleMatcher = js.Dynamic.global.applyDynamic("func")().asInstanceOf[SimpleMatcher]
  
  /**
    * The actual number must be greater than expected.
    *
    * @param expected Expected number
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def greaterThan(expected: Any): SimpleMatcher = js.Dynamic.global.applyDynamic("greaterThan")(expected.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual number must be greater than or equal to expected.
    *
    * @param expected Expected number
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def greaterThanOrEqualTo(expected: Any): SimpleMatcher = js.Dynamic.global.applyDynamic("greaterThanOrEqualTo")(expected.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value has a function with the given name.
    *
    * @param functionName Function name
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def hasFunction(functionName: String): SimpleMatcher = js.Dynamic.global.applyDynamic("hasFunction")(functionName.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value should be an array and it must contain at least one value that matches matcherOrValue.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def hasItem(matcherOrValue: Any): SimpleMatcher = js.Dynamic.global.applyDynamic("hasItem")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value should be an array and matchersOrValues must match at least one item.
    *
    * @param matchersOrValues Instances of JsHamcrest.SimpleMatcher and/or values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def hasItems(matchersOrValues: Any*): SimpleMatcher = js.Dynamic.global.applyDynamic("hasItems")(matchersOrValues.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value has an attribute with the given name.
    *
    * @param memberName Member name
    * @param [matcherOrValue] Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def hasMember(memberName: String): SimpleMatcher = js.Dynamic.global.applyDynamic("hasMember")(memberName.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  inline def hasMember(memberName: String, matcherOrValue: Any): SimpleMatcher = (js.Dynamic.global.applyDynamic("hasMember")(memberName.asInstanceOf[js.Any], matcherOrValue.asInstanceOf[js.Any])).asInstanceOf[SimpleMatcher]
  
  /**
    * The length of the actual value must match matcherOrValue.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def hasSize(matcherOrValue: Any): SimpleMatcher = js.Dynamic.global.applyDynamic("hasSize")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must be an instance of clazz.
    *
    * @param clazz Constructor function
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def instanceOf(clazz: Instantiable0[Any]): SimpleMatcher = js.Dynamic.global.applyDynamic("instanceOf")(clazz.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * Delegate-only matcher frequently used to improve readability.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def is(matcherOrValue: Any): SimpleMatcher = js.Dynamic.global.applyDynamic("is")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The given array or arguments must contain the actual value.
    *
    * @param items Array or list of values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def isIn(items: Any*): SimpleMatcher = js.Dynamic.global.applyDynamic("isIn")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual number must be less than expected.
    *
    * @param expected Expected number
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def lessThan(expected: Any): SimpleMatcher = js.Dynamic.global.applyDynamic("lessThan")(expected.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual number must be less than or equal to expected.
    *
    * @param expected Expected number
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def lessThanOrEqualTo(expected: Any): SimpleMatcher = js.Dynamic.global.applyDynamic("lessThanOrEqualTo")(expected.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual string must match regex.
    *
    * @param regex String
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def matches(regex: js.RegExp): SimpleMatcher = js.Dynamic.global.applyDynamic("matches")(regex.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must be null or undefined.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def nil(): SimpleMatcher = js.Dynamic.global.applyDynamic("nil")().asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must not match matcherOrValue.
    *
    * @param matcherOrValue Instance of JsHamcrest.SimpleMatcher or a value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def not(matcherOrValue: Any): SimpleMatcher = js.Dynamic.global.applyDynamic("not")(matcherOrValue.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must not be a number.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def notANumber(): SimpleMatcher = js.Dynamic.global.applyDynamic("notANumber")().asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must be a number.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def number(): SimpleMatcher = js.Dynamic.global.applyDynamic("number")().asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must be an object.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def `object`(): SimpleMatcher = js.Dynamic.global.applyDynamic("object")().asInstanceOf[SimpleMatcher]
  
  /**
    * The actual number must be odd.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def odd(): SimpleMatcher = js.Dynamic.global.applyDynamic("odd")().asInstanceOf[SimpleMatcher]
  
  /**
    * Alias to isIn() function.
    *
    * @param items Array or list of values
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def oneOf(items: Any*): SimpleMatcher = js.Dynamic.global.applyDynamic("oneOf")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value is a function and, when invoked, it should throw an exception with the given name.
    *
    * @param exceptionName Name of the expected exception
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def raises(exceptionName: String): SimpleMatcher = js.Dynamic.global.applyDynamic("raises")(exceptionName.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value is a function and, when invoked, it should raise any exception.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def raisesAnything(): SimpleMatcher = js.Dynamic.global.applyDynamic("raisesAnything")().asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must be the same as expected.
    *
    * @param expected Expected value
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def sameAs(expected: Any): SimpleMatcher = js.Dynamic.global.applyDynamic("sameAs")(expected.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual string must start with str.
    *
    * @param str Substring
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def startsWith(str: String): SimpleMatcher = js.Dynamic.global.applyDynamic("startsWith")(str.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must be a string.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def string(): SimpleMatcher = js.Dynamic.global.applyDynamic("string")().asInstanceOf[SimpleMatcher]
  
  /**
    * Matches any truthy value (not undefined, null, false, 0, NaN, or "").
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def truth(): SimpleMatcher = js.Dynamic.global.applyDynamic("truth")().asInstanceOf[SimpleMatcher]
  
  /**
    * The actual value must be of the given type.
    *
    * @param typeName Name of the type
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def typeOf(typeName: String): SimpleMatcher = js.Dynamic.global.applyDynamic("typeOf")(typeName.asInstanceOf[js.Any]).asInstanceOf[SimpleMatcher]
  
  /**
    * The actual number must be zero.
    *
    * @return {JsHamcrest.SimpleMatcher} Instance of JsHamcrest.SimpleMatcher
    */
  inline def zero(): SimpleMatcher = js.Dynamic.global.applyDynamic("zero")().asInstanceOf[SimpleMatcher]
}
