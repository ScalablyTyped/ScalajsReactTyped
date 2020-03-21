package typingsJapgolly.chunkedDc.jasmine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Env extends js.Object {
  var clearInterval: Unit
  var clearTimeout: Unit
  var currentSpec: Spec
  var matchersClass: Matchers
  var setInterval: js.Any
  var setTimeout: js.Any
  var updateInterval: Double
  def addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit
  def addMatchers(matchers: CustomMatcherFactories): Unit
  def addReporter(reporter: Reporter): Unit
  def afterAll(afterAllFunction: js.Function0[Unit]): Unit
  def afterEach(afterEachFunction: js.Function0[Unit]): Unit
  def beforeAll(beforeAllFunction: js.Function0[Unit]): Unit
  // ddescribe(description: string, specDefinitions: () => void): Suite; Not a part of jasmine. Angular team adds these
  def beforeEach(beforeEachFunction: js.Function0[Unit]): Unit
  def compareObjects_(a: js.Any, b: js.Any, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean
  def compareRegExps_(a: js.RegExp, b: js.RegExp, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean
  def contains_(haystack: js.Any, needle: js.Any): Boolean
  def currentRunner(): Runner
  def describe(description: String, specDefinitions: js.Function0[Unit]): Suite
  def equals_(a: js.Any, b: js.Any, mismatchKeys: js.Array[String], mismatchValues: js.Array[String]): Boolean
  def execute(): Unit
  def it(description: String, func: js.Function0[Unit]): Spec
  def nextSpecId(): Double
  def specFilter(spec: Spec): Boolean
  def version(): js.Any
  def versionString(): String
  def xdescribe(desc: String, specDefinitions: js.Function0[Unit]): XSuite
  // iit(description: string, func: () => void): Spec; Not a part of jasmine. Angular team adds these
  def xit(desc: String, func: js.Function0[Unit]): XSpec
}

object Env {
  @scala.inline
  def apply(
    addCustomEqualityTester: CustomEqualityTester => Callback,
    addMatchers: CustomMatcherFactories => Callback,
    addReporter: Reporter => Callback,
    afterAll: js.Function0[Unit] => Callback,
    afterEach: js.Function0[Unit] => Callback,
    beforeAll: js.Function0[Unit] => Callback,
    beforeEach: js.Function0[Unit] => Callback,
    clearInterval: Unit,
    clearTimeout: Unit,
    compareObjects_ : (js.Any, js.Any, js.Array[String], js.Array[String]) => CallbackTo[Boolean],
    compareRegExps_ : (js.RegExp, js.RegExp, js.Array[String], js.Array[String]) => CallbackTo[Boolean],
    contains_ : (js.Any, js.Any) => CallbackTo[Boolean],
    currentRunner: CallbackTo[Runner],
    currentSpec: Spec,
    describe: (String, js.Function0[Unit]) => CallbackTo[Suite],
    equals_ : (js.Any, js.Any, js.Array[String], js.Array[String]) => CallbackTo[Boolean],
    execute: Callback,
    it: (String, js.Function0[Unit]) => CallbackTo[Spec],
    matchersClass: Matchers,
    nextSpecId: CallbackTo[Double],
    setInterval: js.Any,
    setTimeout: js.Any,
    specFilter: Spec => CallbackTo[Boolean],
    updateInterval: Double,
    version: CallbackTo[js.Any],
    versionString: CallbackTo[String],
    xdescribe: (String, js.Function0[Unit]) => CallbackTo[XSuite],
    xit: (String, js.Function0[Unit]) => CallbackTo[XSpec]
  ): Env = {
    val __obj = js.Dynamic.literal(clearInterval = clearInterval.asInstanceOf[js.Any], clearTimeout = clearTimeout.asInstanceOf[js.Any], currentSpec = currentSpec.asInstanceOf[js.Any], matchersClass = matchersClass.asInstanceOf[js.Any], setInterval = setInterval.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any], updateInterval = updateInterval.asInstanceOf[js.Any])
    __obj.updateDynamic("addCustomEqualityTester")(js.Any.fromFunction1((t0: typingsJapgolly.chunkedDc.jasmine.CustomEqualityTester) => addCustomEqualityTester(t0).runNow()))
    __obj.updateDynamic("addMatchers")(js.Any.fromFunction1((t0: typingsJapgolly.chunkedDc.jasmine.CustomMatcherFactories) => addMatchers(t0).runNow()))
    __obj.updateDynamic("addReporter")(js.Any.fromFunction1((t0: typingsJapgolly.chunkedDc.jasmine.Reporter) => addReporter(t0).runNow()))
    __obj.updateDynamic("afterAll")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => afterAll(t0).runNow()))
    __obj.updateDynamic("afterEach")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => afterEach(t0).runNow()))
    __obj.updateDynamic("beforeAll")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => beforeAll(t0).runNow()))
    __obj.updateDynamic("beforeEach")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => beforeEach(t0).runNow()))
    __obj.updateDynamic("compareObjects_")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Array[java.lang.String], t3: js.Array[java.lang.String]) => compareObjects_(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("compareRegExps_")(js.Any.fromFunction4((t0: js.RegExp, t1: js.RegExp, t2: js.Array[java.lang.String], t3: js.Array[java.lang.String]) => compareRegExps_(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("contains_")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => contains_(t0, t1).runNow()))
    __obj.updateDynamic("currentRunner")(currentRunner.toJsFn)
    __obj.updateDynamic("describe")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => describe(t0, t1).runNow()))
    __obj.updateDynamic("equals_")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Array[java.lang.String], t3: js.Array[java.lang.String]) => equals_(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("execute")(execute.toJsFn)
    __obj.updateDynamic("it")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => it(t0, t1).runNow()))
    __obj.updateDynamic("nextSpecId")(nextSpecId.toJsFn)
    __obj.updateDynamic("specFilter")(js.Any.fromFunction1((t0: typingsJapgolly.chunkedDc.jasmine.Spec) => specFilter(t0).runNow()))
    __obj.updateDynamic("version")(version.toJsFn)
    __obj.updateDynamic("versionString")(versionString.toJsFn)
    __obj.updateDynamic("xdescribe")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => xdescribe(t0, t1).runNow()))
    __obj.updateDynamic("xit")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function0[scala.Unit]) => xit(t0, t1).runNow()))
    __obj.asInstanceOf[Env]
  }
}

