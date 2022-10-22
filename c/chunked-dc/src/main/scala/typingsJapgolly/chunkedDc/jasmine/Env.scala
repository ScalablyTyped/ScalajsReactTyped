package typingsJapgolly.chunkedDc.jasmine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Env extends StObject {
  
  def addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit
  
  def addMatchers(matchers: CustomMatcherFactories): Unit
  
  def addReporter(reporter: Reporter): Unit
  
  def afterAll(afterAllFunction: js.Function0[Unit]): Unit
  
  def afterEach(afterEachFunction: js.Function0[Unit]): Unit
  
  def beforeAll(beforeAllFunction: js.Function0[Unit]): Unit
  
  // ddescribe(description: string, specDefinitions: () => void): Suite; Not a part of jasmine. Angular team adds these
  def beforeEach(beforeEachFunction: js.Function0[Unit]): Unit
  
  var clearInterval: Unit
  
  var clearTimeout: Unit
  
  def compareObjects_(a: scala.Any, b: scala.Any, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean
  
  def compareRegExps_(a: js.RegExp, b: js.RegExp, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean
  
  def contains_(haystack: scala.Any, needle: scala.Any): Boolean
  
  def currentRunner(): Runner
  
  var currentSpec: Spec
  
  def describe(description: String, specDefinitions: js.Function0[Unit]): Suite
  
  def equals_(a: scala.Any, b: scala.Any, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean
  
  def execute(): Unit
  
  def it(description: String, func: js.Function0[Unit]): Spec
  
  var matchersClass: Matchers
  
  def nextSpecId(): Double
  
  var setInterval: scala.Any
  
  var setTimeout: scala.Any
  
  def specFilter(spec: Spec): Boolean
  
  var updateInterval: Double
  
  def version(): scala.Any
  
  def versionString(): String
  
  def xdescribe(desc: String, specDefinitions: js.Function0[Unit]): XSuite
  
  // iit(description: string, func: () => void): Spec; Not a part of jasmine. Angular team adds these
  def xit(desc: String, func: js.Function0[Unit]): XSpec
}
object Env {
  
  inline def apply(
    addCustomEqualityTester: CustomEqualityTester => Callback,
    addMatchers: CustomMatcherFactories => Callback,
    addReporter: Reporter => Callback,
    afterAll: js.Function0[Unit] => Callback,
    afterEach: js.Function0[Unit] => Callback,
    beforeAll: js.Function0[Unit] => Callback,
    beforeEach: js.Function0[Unit] => Callback,
    clearInterval: Unit,
    clearTimeout: Unit,
    compareObjects_ : (scala.Any, scala.Any, js.Array[String], js.Array[String]) => Boolean,
    compareRegExps_ : (js.RegExp, js.RegExp, js.Array[String], js.Array[String]) => Boolean,
    contains_ : (scala.Any, scala.Any) => Boolean,
    currentRunner: CallbackTo[Runner],
    currentSpec: Spec,
    describe: (String, js.Function0[Unit]) => Suite,
    equals_ : (scala.Any, scala.Any, js.Array[String], js.Array[String]) => Boolean,
    execute: Callback,
    it: (String, js.Function0[Unit]) => Spec,
    matchersClass: Matchers,
    nextSpecId: CallbackTo[Double],
    setInterval: scala.Any,
    setTimeout: scala.Any,
    specFilter: Spec => Boolean,
    updateInterval: Double,
    version: CallbackTo[scala.Any],
    versionString: CallbackTo[String],
    xdescribe: (String, js.Function0[Unit]) => XSuite,
    xit: (String, js.Function0[Unit]) => XSpec
  ): Env = {
    val __obj = js.Dynamic.literal(addCustomEqualityTester = js.Any.fromFunction1((t0: CustomEqualityTester) => addCustomEqualityTester(t0).runNow()), addMatchers = js.Any.fromFunction1((t0: CustomMatcherFactories) => addMatchers(t0).runNow()), addReporter = js.Any.fromFunction1((t0: Reporter) => addReporter(t0).runNow()), afterAll = js.Any.fromFunction1((t0: js.Function0[Unit]) => afterAll(t0).runNow()), afterEach = js.Any.fromFunction1((t0: js.Function0[Unit]) => afterEach(t0).runNow()), beforeAll = js.Any.fromFunction1((t0: js.Function0[Unit]) => beforeAll(t0).runNow()), beforeEach = js.Any.fromFunction1((t0: js.Function0[Unit]) => beforeEach(t0).runNow()), clearInterval = clearInterval.asInstanceOf[js.Any], clearTimeout = clearTimeout.asInstanceOf[js.Any], compareObjects_ = js.Any.fromFunction4(compareObjects_), compareRegExps_ = js.Any.fromFunction4(compareRegExps_), contains_ = js.Any.fromFunction2(contains_), currentRunner = currentRunner.toJsFn, currentSpec = currentSpec.asInstanceOf[js.Any], describe = js.Any.fromFunction2(describe), equals_ = js.Any.fromFunction4(equals_), execute = execute.toJsFn, it = js.Any.fromFunction2(it), matchersClass = matchersClass.asInstanceOf[js.Any], nextSpecId = nextSpecId.toJsFn, setInterval = setInterval.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any], specFilter = js.Any.fromFunction1(specFilter), updateInterval = updateInterval.asInstanceOf[js.Any], version = version.toJsFn, versionString = versionString.toJsFn, xdescribe = js.Any.fromFunction2(xdescribe), xit = js.Any.fromFunction2(xit))
    __obj.asInstanceOf[Env]
  }
  
  extension [Self <: Env](x: Self) {
    
    inline def setAddCustomEqualityTester(value: CustomEqualityTester => Callback): Self = StObject.set(x, "addCustomEqualityTester", js.Any.fromFunction1((t0: CustomEqualityTester) => value(t0).runNow()))
    
    inline def setAddMatchers(value: CustomMatcherFactories => Callback): Self = StObject.set(x, "addMatchers", js.Any.fromFunction1((t0: CustomMatcherFactories) => value(t0).runNow()))
    
    inline def setAddReporter(value: Reporter => Callback): Self = StObject.set(x, "addReporter", js.Any.fromFunction1((t0: Reporter) => value(t0).runNow()))
    
    inline def setAfterAll(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "afterAll", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setAfterEach(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "afterEach", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setBeforeAll(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "beforeAll", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setBeforeEach(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "beforeEach", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setClearInterval(value: Unit): Self = StObject.set(x, "clearInterval", value.asInstanceOf[js.Any])
    
    inline def setClearTimeout(value: Unit): Self = StObject.set(x, "clearTimeout", value.asInstanceOf[js.Any])
    
    inline def setCompareObjects_(value: (scala.Any, scala.Any, js.Array[String], js.Array[String]) => Boolean): Self = StObject.set(x, "compareObjects_", js.Any.fromFunction4(value))
    
    inline def setCompareRegExps_(value: (js.RegExp, js.RegExp, js.Array[String], js.Array[String]) => Boolean): Self = StObject.set(x, "compareRegExps_", js.Any.fromFunction4(value))
    
    inline def setContains_(value: (scala.Any, scala.Any) => Boolean): Self = StObject.set(x, "contains_", js.Any.fromFunction2(value))
    
    inline def setCurrentRunner(value: CallbackTo[Runner]): Self = StObject.set(x, "currentRunner", value.toJsFn)
    
    inline def setCurrentSpec(value: Spec): Self = StObject.set(x, "currentSpec", value.asInstanceOf[js.Any])
    
    inline def setDescribe(value: (String, js.Function0[Unit]) => Suite): Self = StObject.set(x, "describe", js.Any.fromFunction2(value))
    
    inline def setEquals_(value: (scala.Any, scala.Any, js.Array[String], js.Array[String]) => Boolean): Self = StObject.set(x, "equals_", js.Any.fromFunction4(value))
    
    inline def setExecute(value: Callback): Self = StObject.set(x, "execute", value.toJsFn)
    
    inline def setIt(value: (String, js.Function0[Unit]) => Spec): Self = StObject.set(x, "it", js.Any.fromFunction2(value))
    
    inline def setMatchersClass(value: Matchers): Self = StObject.set(x, "matchersClass", value.asInstanceOf[js.Any])
    
    inline def setNextSpecId(value: CallbackTo[Double]): Self = StObject.set(x, "nextSpecId", value.toJsFn)
    
    inline def setSetInterval(value: scala.Any): Self = StObject.set(x, "setInterval", value.asInstanceOf[js.Any])
    
    inline def setSetTimeout(value: scala.Any): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
    
    inline def setSpecFilter(value: Spec => Boolean): Self = StObject.set(x, "specFilter", js.Any.fromFunction1(value))
    
    inline def setUpdateInterval(value: Double): Self = StObject.set(x, "updateInterval", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: CallbackTo[scala.Any]): Self = StObject.set(x, "version", value.toJsFn)
    
    inline def setVersionString(value: CallbackTo[String]): Self = StObject.set(x, "versionString", value.toJsFn)
    
    inline def setXdescribe(value: (String, js.Function0[Unit]) => XSuite): Self = StObject.set(x, "xdescribe", js.Any.fromFunction2(value))
    
    inline def setXit(value: (String, js.Function0[Unit]) => XSpec): Self = StObject.set(x, "xit", js.Any.fromFunction2(value))
  }
}
