package typingsJapgolly.jestGlobals

import typingsJapgolly.jestExpect.mod.JestExpect_
import typingsJapgolly.jestGlobals.anon.FnCall
import typingsJapgolly.jestGlobals.anon.FnCallTestNameFnTimeout
import typingsJapgolly.jestMock.mod.ClassLike
import typingsJapgolly.jestMock.mod.FunctionLike
import typingsJapgolly.jestMock.mod.Mocked_
import typingsJapgolly.jestTypes.anon.ItBaseconcurrentItConcurr
import typingsJapgolly.jestTypes.mod.BlockFn
import typingsJapgolly.jestTypes.mod.BlockNameLike
import typingsJapgolly.jestTypes.mod.Describe
import typingsJapgolly.jestTypes.mod.DescribeBase
import typingsJapgolly.jestTypes.mod.HookBase
import typingsJapgolly.jestTypes.mod.ItBase
import typingsJapgolly.jestTypes.mod.ItConcurrent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/globals", "afterAll")
  @js.native
  val afterAll: HookBase & FnCall = js.native
  
  @JSImport("@jest/globals", "afterEach")
  @js.native
  val afterEach: HookBase & FnCall = js.native
  
  @JSImport("@jest/globals", "beforeAll")
  @js.native
  val beforeAll: HookBase & FnCall = js.native
  
  @JSImport("@jest/globals", "beforeEach")
  @js.native
  val beforeEach: HookBase & FnCall = js.native
  
  @JSImport("@jest/globals", "describe")
  @js.native
  val describe: Describe & (js.Function2[/* blockName */ BlockNameLike, /* blockFn */ BlockFn, Unit]) = js.native
  
  @JSImport("@jest/globals", "expect")
  @js.native
  val expect: JestExpect_ = js.native
  
  @JSImport("@jest/globals", "fdescribe")
  @js.native
  val fdescribe: DescribeBase & (js.Function2[/* blockName */ BlockNameLike, /* blockFn */ BlockFn, Unit]) = js.native
  
  @JSImport("@jest/globals", "fit")
  @js.native
  val fit: ItBaseconcurrentItConcurr & FnCallTestNameFnTimeout = js.native
  
  @JSImport("@jest/globals", "it")
  @js.native
  val it: ItConcurrent & FnCallTestNameFnTimeout = js.native
  
  @JSImport("@jest/globals", "test")
  @js.native
  val test: ItConcurrent & FnCallTestNameFnTimeout = js.native
  
  @JSImport("@jest/globals", "xdescribe")
  @js.native
  val xdescribe: DescribeBase & (js.Function2[/* blockName */ BlockNameLike, /* blockFn */ BlockFn, Unit]) = js.native
  
  @JSImport("@jest/globals", "xit")
  @js.native
  val xit: ItBase & FnCallTestNameFnTimeout = js.native
  
  @JSImport("@jest/globals", "xtest")
  @js.native
  val xtest: ItBase & FnCallTestNameFnTimeout = js.native
  
  object jest {
    
    /**
      * Constructs the type of a mock function, e.g. the return type of `jest.fn()`.
      */
    type Mock[T /* <: FunctionLike */] = typingsJapgolly.jestMock.mod.Mock[T]
    
    /**
      * Wraps a class, function or object type with Jest mock type definitions.
      */
    type Mocked[T /* <: js.Object */] = Mocked_[T]
    
    /**
      * Wraps a class type with Jest mock type definitions.
      */
    type MockedClass[T /* <: ClassLike */] = typingsJapgolly.jestMock.mod.MockedClass[T]
    
    /**
      * Wraps a function type with Jest mock type definitions.
      */
    type MockedFunction[T /* <: FunctionLike */] = typingsJapgolly.jestMock.mod.MockedFunction[T]
    
    /**
      * Wraps an object type with Jest mock type definitions.
      */
    type MockedObject[T /* <: js.Object */] = typingsJapgolly.jestMock.mod.MockedObject[T]
  }
}
