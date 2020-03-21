package typingsJapgolly.jest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jest {
  type AndNot[T] = T with typingsJapgolly.jest.AnonNot[T]
  type ArgsType[T] = js.Any
  type ConstructorArgsType[T] = js.Any
  type ConstructorPropertyNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends new (args : ...any): any? K : never}[keyof T] */ js.Any) with java.lang.String
  type CustomAsymmetricMatcher[TMatcher /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Function1[
    /* args */ typingsJapgolly.jest.mod.jest.RemoveFirstFromTuple[typingsJapgolly.jest.mod.jest.Parameters[TMatcher]], 
    typingsJapgolly.jest.mod.jest.AsymmetricMatcher
  ]
  type CustomAsyncMatchers[TMatchers /* <: typingsJapgolly.jest.mod.jest.ExpectExtendMap */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in jest.jest.jest.NonAsyncMatchers<TMatchers> ]: jest.jest.jest.CustomAsymmetricMatcher<TMatchers[K]>}
    */ typingsJapgolly.jest.jestStrings.CustomAsyncMatchers with TMatchers
  // should be TMatcherReturn extends void|Promise<void> but getting dtslint error
  type CustomJestMatcher[TMatcher /* <: js.Function1[/* repeated */ js.Any, _] */, TMatcherReturn] = js.Function1[
    /* args */ typingsJapgolly.jest.mod.jest.RemoveFirstFromTuple[typingsJapgolly.jest.mod.jest.Parameters[TMatcher]], 
    TMatcherReturn
  ]
  type CustomMatcher = js.ThisFunction2[
    /* this */ typingsJapgolly.jest.mod.jest.MatcherContext, 
    /* received */ js.Any, 
    /* repeated */ js.Any, 
    typingsJapgolly.jest.mod.jest.CustomMatcherResult | js.Promise[typingsJapgolly.jest.mod.jest.CustomMatcherResult]
  ]
  type EmptyFunction = js.Function0[scala.Unit]
  type EqualityTester = js.Function2[/* a */ js.Any, /* b */ js.Any, js.UndefOr[scala.Boolean]]
  type ExpectExtendMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.jest.mod.jest.CustomMatcher]
  type ExtendedExpect[TMatchers /* <: typingsJapgolly.jest.mod.jest.ExpectExtendMap */] = typingsJapgolly.jest.mod.jest.ExpectProperties with typingsJapgolly.jest.mod.jest.AndNot[typingsJapgolly.jest.mod.jest.CustomAsyncMatchers[TMatchers]] with typingsJapgolly.jest.mod.jest.ExtendedExpectFunction[TMatchers]
  // when have called expect.extend
  type ExtendedExpectFunction[TMatchers /* <: typingsJapgolly.jest.mod.jest.ExpectExtendMap */] = js.Function1[
    /* actual */ js.Any, 
    typingsJapgolly.jest.mod.jest.JestExtendedMatchers[TMatchers, js.Any]
  ]
  // should be TMatcherReturn extends void|Promise<void> but getting dtslint error
  // Use the `void` type for return types only. Otherwise, use `undefined`. See: https://github.com/Microsoft/dtslint/blob/master/docs/void-return.md
  // have added issue https://github.com/microsoft/dtslint/issues/256 - Cannot have type union containing void ( to be used as return type only
  type ExtendedMatchers[TMatchers /* <: typingsJapgolly.jest.mod.jest.ExpectExtendMap */, TMatcherReturn, TActual] = (typingsJapgolly.jest.mod.jest.Matchers[TMatcherReturn, TActual]) with typingsJapgolly.jest.jestStrings.ExtendedMatchers with TMatchers
  type FunctionPropertyNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}[keyof T] */ js.Any) with java.lang.String
  type JestExtendedMatchers[TMatchers /* <: typingsJapgolly.jest.mod.jest.ExpectExtendMap */, TActual] = typingsJapgolly.jest.mod.jest.JestMatchersShape[
    typingsJapgolly.jest.mod.jest.ExtendedMatchers[TMatchers, scala.Unit, TActual], 
    typingsJapgolly.jest.mod.jest.ExtendedMatchers[TMatchers, js.Promise[scala.Unit], TActual]
  ]
  type JestMatchersShape[TNonPromise /* <: js.Object */, TPromise /* <: js.Object */] = typingsJapgolly.jest.AnonRejects[TPromise] with typingsJapgolly.jest.mod.jest.AndNot[TNonPromise]
  type Lifecycle = js.Function2[
    /* fn */ typingsJapgolly.jest.mod.jest.ProvidesCallback, 
    /* timeout */ js.UndefOr[scala.Double], 
    js.Any
  ]
  type MatcherHintColor = js.Function1[/* arg */ java.lang.String, java.lang.String]
  /**
    * Wrap an object or a module with mock definitions
    *
    * @example
    *
    *  jest.mock("../api");
    *  import * as api from "../api";
    *
    *  const mockApi = api as jest.Mocked<typeof api>;
    *  api.MyApi.prototype.myApiMethod.mockImplementation(() => "test");
    */
  type Mocked[T] = typingsJapgolly.jest.jestStrings.Mocked with js.Any with T
  /**
    * Wrap a class with mock definitions
    *
    * @example
    *
    *  import { MyClass } from "./libary";
    *  jest.mock("./library");
    *
    *  const mockedMyClass = MyClass as jest.MockedClass<MyClass>;
    *
    *  expect(mockedMyClass.mock.calls[0][0]).toBe(42); // Constructor calls
    *  expect(mockedMyClass.prototype.myMethod.mock.calls[0][0]).toBe(42); // Method calls
    */
  type MockedClass[T /* <: typingsJapgolly.jest.mod.jest.Constructable */] = (typingsJapgolly.jest.mod.jest.MockInstance[typingsJapgolly.std.InstanceType[T], _]) with js.Object with T
  /**
    * Wrap a function with mock definitions
    *
    * @example
    *
    *  import { myFunction } from "./library";
    *  jest.mock("./library");
    *
    *  const mockMyFunction = myFunction as jest.MockedFunction<typeof myFunction>;
    *  expect(mockMyFunction.mock.calls[0][0]).toBe(42);
    */
  type MockedFunction[T /* <: js.Function1[/* repeated */ js.Any, _] */] = (typingsJapgolly.jest.mod.jest.MockInstance[typingsJapgolly.std.ReturnType[T], typingsJapgolly.jest.mod.jest.ArgsType[T]]) with T
  type NonAsyncMatchers[TMatchers /* <: typingsJapgolly.jest.mod.jest.ExpectExtendMap */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof TMatchers ]: std.ReturnType<TMatchers[K]> extends std.Promise<jest.jest.jest.CustomMatcherResult>? never : K}[keyof TMatchers] */ js.Any
  // see https://github.com/Microsoft/TypeScript/issues/25215
  type NonFunctionPropertyNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? never : K}[keyof T] */ js.Any) with java.lang.String
  type NonPromiseMatchers[T /* <: typingsJapgolly.jest.JestMatchersShape */] = typingsJapgolly.jest.mod.jest.Omit[
    T, 
    typingsJapgolly.jest.jestStrings.resolves | typingsJapgolly.jest.jestStrings.rejects | typingsJapgolly.jest.jestStrings.not
  ]
  /**
    * Construct a type with the properties of T except for those in type K.
    */
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type Parameters[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type PrintLabel = js.Function1[/* string */ java.lang.String, java.lang.String]
  type PromiseMatchers[T /* <: typingsJapgolly.jest.JestMatchersShape */] = typingsJapgolly.jest.mod.jest.Omit[
    /* import warning: importer.ImportType#apply Failed type conversion: T['resolves'] */ js.Any, 
    typingsJapgolly.jest.jestStrings.not
  ]
  type ProvidesCallback = js.Function1[/* cb */ typingsJapgolly.jest.mod.jest.DoneCallback, js.Any]
  type RejectedValue[T] = js.Any
  type RemoveFirstFromTuple[T /* <: js.Array[_] */] = js.Array[js.Any]
  type ResolvedValue[T] = js.Any | T
  type SnapshotSerializerPlugin = typingsJapgolly.prettyFormat.mod.Plugin
  /**
    * Represents a function that has been spied on.
    */
  type SpiedFunction[T /* <: js.Function1[/* repeated */ js.Any, _] */] = typingsJapgolly.jest.mod.jest.SpyInstance[typingsJapgolly.std.ReturnType[T], typingsJapgolly.jest.mod.jest.ArgsType[T]]
  type SpyInstance[T, Y /* <: js.Array[_] */] = typingsJapgolly.jest.mod.jest.MockInstance[T, Y]
}
