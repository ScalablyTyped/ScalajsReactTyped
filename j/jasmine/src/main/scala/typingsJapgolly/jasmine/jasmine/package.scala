package typingsJapgolly.jasmine.jasmine

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jasmine.DoneFn
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// Use trick with prototype to allow abstract classes.
// More info: https://stackoverflow.com/a/38642922/2009373
type Constructor = js.Function

type CustomAsyncMatcherFactories = StringDictionary[CustomAsyncMatcherFactory]

type CustomAsyncMatcherFactory = js.Function1[/* util */ MatchersUtil, CustomAsyncMatcher]

type CustomEqualityTester = js.Function2[/* first */ scala.Any, /* second */ scala.Any, Boolean | Unit]

type CustomMatcherFactories = StringDictionary[CustomMatcherFactory]

type CustomMatcherFactory = js.Function1[/* util */ MatchersUtil, CustomMatcher]

type CustomObjectFormatter = js.Function1[/* value */ scala.Any, js.UndefOr[String]]

/** @deprecated Please use `Configuration` instead of `EnvConfiguration`. */
type EnvConfiguration = Configuration

/* Rewritten from type alias, can be one of: 
  - T
  - typingsJapgolly.jasmine.jasmine.ObjectContaining[T]
  - typingsJapgolly.jasmine.jasmine.AsymmetricMatcher[scala.Any]
  - typingsJapgolly.jasmine.jasmine.Any
  - typingsJapgolly.jasmine.jasmine.Spy[typingsJapgolly.jasmine.jasmine.Func]
  - / * import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>} * / js.Any
*/
type Expected[T] = _Expected[T] | AsymmetricMatcher[scala.Any] | Spy[Func] | T | (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>} */ js.Any)

type ExpectedRecursive[T] = T | ObjectContaining[T] | AsymmetricMatcher[scala.Any] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]> | jasmine.jasmine.Any} */ js.Any)

type ImplementationCallback = (js.Function0[PromiseLike[scala.Any] | Unit]) | (js.Function1[/* done */ DoneFn, Unit])

/**
  * It's like SpyObj, but doesn't verify argument/return types for functions.
  * Useful if TS cannot correctly infer type for complex objects.
  */
type NonTypedSpyObj[T] = SpyObj[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends jasmine.jasmine.Func? jasmine.jasmine.Func : T[K]} */ js.Any]

type PassedExpectation = CustomReportExpectation

/** @deprecated use JasmineDoneInfo instead */
type RunDetails = JasmineDoneInfo

type SpecFilter = js.Function1[/* spec */ Spec, Boolean]

/** @deprecated Please use `SpecFilter` instead of `SpecFunction`. */
type SpecFunction = js.Function1[/* spec */ js.UndefOr[Spec], Unit]

type SpyObj[T] = T & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends jasmine.jasmine.Func? T[K] & jasmine.jasmine.Spy<T[K]> : T[K]} */ js.Any)

/** @deprecated use JasmineStartedInfo instead */
type SuiteInfo = JasmineStartedInfo
