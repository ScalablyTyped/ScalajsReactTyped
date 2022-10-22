package typingsJapgolly.jestWhen

import typingsJapgolly.jestWhen.jestWhenBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-when", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resetAllWhenMocks(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetAllWhenMocks")().asInstanceOf[Unit]
  
  inline def verifyAllWhenMocksCalled(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyAllWhenMocksCalled")().asInstanceOf[Unit]
  
  @JSImport("jest-when", "when")
  @js.native
  val when: When_ = js.native
  
  @js.native
  trait AllArgsMatcher[Y] extends StObject {
    
    def apply(
      args: Y,
      equals: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.MatcherUtils * / any['equals'] */ js.Any
    ): Boolean = js.native
    
    // Internal, but needed to distinguish from normal callables
    var _isAllArgsFunctionMatcher: `true` = js.native
    
    var _isFunctionMatcher: `true` = js.native
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Index in keyof ArgTypes ]: ArgTypes[Index] | jest-when.jest-when.WhenMock<boolean, [ArgTypes[Index]]>}
    }}}
    */
  @js.native
  trait ArgumentOrMatcher[ArgTypes /* <: js.Array[Any] */] extends StObject
  
  @js.native
  trait WhenMock[T, Y /* <: js.Array[Any] */] extends StObject {
    
    def calledWith(allArgsMatcher: AllArgsMatcher[Y]): WhenMockWithMatchers[T, Y] = js.native
    def calledWith(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param matchers because its type ArgumentOrMatcher<Y> is not an array type */ matchers: ArgumentOrMatcher[Y]
    ): WhenMockWithMatchers[T, Y] = js.native
    
    def defaultImplementation(fn: js.Function1[/* args */ Y, T]): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def defaultRejectedValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.RejectedValue<T> */ Any
    ): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def defaultResolvedValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.ResolvedValue<T> */ Any
    ): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def defaultReturnValue(value: T): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def expectCalledWith(allArgsMatcher: AllArgsMatcher[Y]): WhenMockWithMatchers[T, Y] = js.native
    def expectCalledWith(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param matchers because its type ArgumentOrMatcher<Y> is not an array type */ matchers: ArgumentOrMatcher[Y]
    ): WhenMockWithMatchers[T, Y] = js.native
    
    def mockImplementation(fn: js.Function1[/* args */ Y, T]): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def mockRejectedValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.RejectedValue<T> */ Any
    ): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def mockResolvedValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.ResolvedValue<T> */ Any
    ): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def mockReturnValue(value: T): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def resetWhenMocks(): Unit = js.native
  }
  
  @js.native
  trait WhenMockWithMatchers[T, Y /* <: js.Array[Any] */] extends StObject {
    
    def defaultImplementation(fn: js.Function1[/* args */ Y, T]): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def defaultRejectedValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.RejectedValue<T> */ Any
    ): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def defaultResolvedValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.ResolvedValue<T> */ Any
    ): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def defaultReturnValue(value: T): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def mockImplementation(fn: js.Function1[/* args */ Y, T]): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def mockImplementationOnce(): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    def mockImplementationOnce(fn: js.Function1[/* args */ Y, T]): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def mockRejectedValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.RejectedValue<T> */ Any
    ): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def mockRejectedValueOnce(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.RejectedValue<T> */ Any
    ): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def mockResolvedValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.ResolvedValue<T> */ Any
    ): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def mockResolvedValueOnce(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.ResolvedValue<T> */ Any
    ): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def mockReturnValue(value: T): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
    
    def mockReturnValueOnce(value: T): (WhenMockWithMatchers[T, Y]) & (WhenMock[T, Y]) = js.native
  }
  
  @js.native
  trait When_ extends StObject {
    
    def apply[T, Y /* <: js.Array[Any] */](fn: js.Function1[/* args */ Y, T]): WhenMock[T, Y] = js.native
    def apply[T, Y /* <: js.Array[Any] */](
      fn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.MockInstance<T, Y> */ Any
    ): WhenMock[T, Y] = js.native
    
    @JSName("allArgs")
    def allArgs_equals[Y /* <: js.Array[Any] */](
      matcher: js.Function2[
          /* args */ Y, 
          /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.MatcherUtils * / any['equals'] */ /* equals */ js.Any, 
          Boolean
        ]
    ): AllArgsMatcher[Y] = js.native
  }
}
