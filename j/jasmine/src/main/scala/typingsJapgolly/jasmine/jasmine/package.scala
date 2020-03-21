package typingsJapgolly.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmine {
  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, scala.Boolean | scala.Unit]
  type CustomMatcherFactories = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.jasmine.jasmine.CustomMatcherFactory]
  type CustomMatcherFactory = js.Function2[
    /* util */ typingsJapgolly.jasmine.jasmine.MatchersUtil_, 
    /* customEqualityTesters */ js.Array[typingsJapgolly.jasmine.jasmine.CustomEqualityTester], 
    typingsJapgolly.jasmine.jasmine.CustomMatcher
  ]
  /* Rewritten from type alias, can be one of: 
    - T
    - typingsJapgolly.jasmine.jasmine.ObjectContaining_[T]
    - typingsJapgolly.jasmine.jasmine.AsymmetricMatcher[js.Any]
    - typingsJapgolly.jasmine.jasmine.Any_
    - typingsJapgolly.jasmine.jasmine.Spy
    - / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>}
    * / typingsJapgolly.jasmine.jasmineStrings.Expected with T
  */
  type Expected[T] = typingsJapgolly.jasmine.jasmine._Expected[T] | typingsJapgolly.jasmine.jasmine.AsymmetricMatcher[js.Any] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: jasmine.jasmine.ExpectedRecursive<T[K]>}
    */ typingsJapgolly.jasmine.jasmineStrings.Expected with T) | T
  type ExpectedRecursive[T] = T | typingsJapgolly.jasmine.jasmine.ObjectContaining_[T] | typingsJapgolly.jasmine.jasmine.AsymmetricMatcher[js.Any] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jasmine.jasmine.ExpectedRecursive<T[K]> * / object | jasmine.jasmine.Any}
    */ typingsJapgolly.jasmine.jasmineStrings.ExpectedRecursive with js.Any)
  type Func = js.Function1[/* repeated */ js.Any, js.Any]
  type ImplementationCallback = js.Function0[js.Thenable[js.Any]] | (js.Function1[/* done */ typingsJapgolly.jasmine.DoneFn, scala.Unit])
  type PassedExpectation = typingsJapgolly.jasmine.jasmine.CustomReportExpectation
  type SpecFunction = js.Function1[/* spec */ js.UndefOr[typingsJapgolly.jasmine.jasmine.Spec], scala.Unit]
  type SpyObj[T] = T with typingsJapgolly.jasmine.jasmineStrings.SpyObj with js.Any
  type SpyObjMethodNames[T] = js.Array[java.lang.String] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends jasmine.jasmine.Func? std.ReturnType<T[P]> : any}
    */ typingsJapgolly.jasmine.jasmineStrings.SpyObjMethodNames with js.Any) | org.scalablytyped.runtime.StringDictionary[js.Any]
  type SpyObjPropertyNames[T] = js.Array[java.lang.String] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typingsJapgolly.jasmine.jasmineStrings.SpyObjPropertyNames with T) | org.scalablytyped.runtime.StringDictionary[js.Any]
  type StringPrettyPrinter = typingsJapgolly.jasmine.jasmine.PrettyPrinter
}
