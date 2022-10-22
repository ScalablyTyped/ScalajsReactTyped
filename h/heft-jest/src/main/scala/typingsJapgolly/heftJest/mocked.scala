package typingsJapgolly.heftJest

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mocked {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends (args : infer A): any ? A : never
    }}}
    */
  @js.native
  trait ArgumentsOf[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends new (args : infer A): any ? A : never
    }}}
    */
  @js.native
  trait ConstructorArgumentsOf[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends heft-jest.mocked.MockableFunction ? heft-jest.mocked.MockedFunction<T> : T extends object ? heft-jest.mocked.MockedObject<T> : T
    }}}
    */
  @js.native
  trait MaybeMocked[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends new (args : ...any): infer R ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.MockInstance<R, ConstructorArgumentsOf<T>> * / any : {}
    }}}
    */
  @js.native
  trait MaybeMockedConstructor[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends heft-jest.mocked.MockableFunction ? heft-jest.mocked.MockedFunctionDeep<T> : T extends object ? heft-jest.mocked.MockedObjectDeep<T> : T
    }}}
    */
  @js.native
  trait MaybeMockedDeep[T] extends StObject
  
  type MethodKeysOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends heft-jest.mocked.MockableFunction? K : never}[keyof T] */ js.Any
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.MockInstance<ReturnType<T>, ArgumentsOf<T>> * / any */ @js.native
  trait MockWithArgs[T /* <: MockableFunction */]
    extends StObject
       with Instantiable1[/* args */ ConstructorArgumentsOf[T], T] {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgumentsOf<T> is not an array type */ args: ArgumentsOf[T]
    ): ReturnType[T] = js.native
  }
  
  @js.native
  trait MockableFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  type MockedFunction[T /* <: MockableFunction */] = MockWithArgs[T] & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K]} */ js.Any)
  
  type MockedFunctionDeep[T /* <: MockableFunction */] = MockWithArgs[T] & MockedObjectDeep[T]
  
  type MockedObject[T] = MaybeMockedConstructor[T] & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in heft-jest.mocked.MethodKeysOf<T> ]: T[K] extends heft-jest.mocked.MockableFunction? heft-jest.mocked.MockedFunction<T[K]> : T[K]} */ js.Any)
  
  type MockedObjectDeep[T] = MaybeMockedConstructor[T] & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in heft-jest.mocked.MethodKeysOf<T> ]: T[K] extends heft-jest.mocked.MockableFunction? heft-jest.mocked.MockedFunctionDeep<T[K]> : T[K]} */ js.Any)
  
  type PropertyKeysOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends heft-jest.mocked.MockableFunction? never : K}[keyof T] */ js.Any
}
