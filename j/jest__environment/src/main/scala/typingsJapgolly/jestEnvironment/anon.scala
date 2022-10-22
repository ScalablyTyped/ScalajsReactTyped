package typingsJapgolly.jestEnvironment

import typingsJapgolly.jestEnvironment.jestEnvironmentStrings.get
import typingsJapgolly.jestEnvironment.jestEnvironmentStrings.set
import typingsJapgolly.jestMock.anon.Shallow
import typingsJapgolly.jestMock.anon.`0`
import typingsJapgolly.jestMock.mod.ConstructorLikeKeys
import typingsJapgolly.jestMock.mod.FunctionLike
import typingsJapgolly.jestMock.mod.Mock
import typingsJapgolly.jestMock.mod.MockedShallow
import typingsJapgolly.jestMock.mod.Mocked_
import typingsJapgolly.jestMock.mod.PropertyLikeKeys
import typingsJapgolly.jestMock.mod.SpyInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T /* <: FunctionLike */](): Mock[T] = js.native
    def apply[T /* <: FunctionLike */](implementation: T): Mock[T] = js.native
  }
  
  @js.native
  trait FnCallFn extends StObject {
    
    def apply(fn: Any): /* is jest-mock.jest-mock.Mock<jest-mock.jest-mock.UnknownFunction> */ Boolean = js.native
    def apply[T /* <: FunctionLike */](fn: SpyInstance[T]): /* is jest-mock.jest-mock.SpyInstance<T> */ Boolean = js.native
    def apply[P /* <: js.Array[Any] */, R /* <: Any */](fn: js.Function1[/* args */ P, R]): /* is jest-mock.jest-mock.Mock<(args : P): R> */ Boolean = js.native
  }
  
  @js.native
  trait FnCallObjectMethodKeyAccessType extends StObject {
    
    def apply[T /* <: js.Object */, K /* <: ConstructorLikeKeys[T] */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[K] */ js.Any */](`object`: T, methodKey: K): /* import warning: importer.ImportType#apply Failed type conversion: V extends jest-mock.jest-mock.ClassLike ? jest-mock.jest-mock.SpyInstance<(args : std.ConstructorParameters<V>): std.InstanceType<V>> : never */ js.Any = js.native
    def apply[T /* <: js.Object */, K /* <: PropertyLikeKeys[T] */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[K] */ js.Any */](`object`: T, methodKey: K, accessType: get): SpyInstance[js.Function0[V]] = js.native
    def apply[T /* <: js.Object */, K /* <: PropertyLikeKeys[T] */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[K] */ js.Any */](`object`: T, methodKey: K, accessType: set): SpyInstance[js.Function1[/* arg */ V, Unit]] = js.native
  }
  
  @js.native
  trait FnCallSourceOptions extends StObject {
    
    def apply[T /* <: js.Object */](source: T): Mocked_[T] = js.native
    def apply[T /* <: js.Object */](source: T, options: Shallow): Mocked_[T] = js.native
    def apply[T /* <: js.Object */](source: T, options: `0`): MockedShallow[T] = js.native
  }
  
  trait LogErrorsBeforeRetry extends StObject {
    
    var logErrorsBeforeRetry: js.UndefOr[Boolean] = js.undefined
  }
  object LogErrorsBeforeRetry {
    
    inline def apply(): LogErrorsBeforeRetry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogErrorsBeforeRetry]
    }
    
    extension [Self <: LogErrorsBeforeRetry](x: Self) {
      
      inline def setLogErrorsBeforeRetry(value: Boolean): Self = StObject.set(x, "logErrorsBeforeRetry", value.asInstanceOf[js.Any])
      
      inline def setLogErrorsBeforeRetryUndefined: Self = StObject.set(x, "logErrorsBeforeRetry", js.undefined)
    }
  }
  
  trait Virtual extends StObject {
    
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object Virtual {
    
    inline def apply(): Virtual = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Virtual]
    }
    
    extension [Self <: Virtual](x: Self) {
      
      inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
}
