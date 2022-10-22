package typingsJapgolly.jestSinon

import typingsJapgolly.sinon.mod.SinonMatch
import typingsJapgolly.sinon.mod.SinonSpy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jest {
  
  @js.native
  trait Matchers[R, T] extends StObject {
    
    def toAlwaysReturnWith(obj: Any): R = js.native
    
    def toAlwaysThrow(): R = js.native
    def toAlwaysThrow(error: Any): R = js.native
    
    def toAlwaysThrowError(): R = js.native
    def toAlwaysThrowError(error: Any): R = js.native
    
    def toBeAlwaysCalledOn(`object`: js.Object): R = js.native
    
    def toBeAlwaysCalledWith(args: Any*): R = js.native
    
    def toBeAlwaysCalledWithExactly(args: Any*): R = js.native
    
    def toBeAlwaysCalledWithMatch(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Array<sinon.SinonMatch> | Array<any> is not an array type */ args: js.Array[Any | SinonMatch]
    ): R = js.native
    
    def toBeAlwaysCalledWithNew(): R = js.native
    
    def toBeCalled(): R = js.native
    
    def toBeCalledAfter(spy: SinonSpy[js.Array[Any], Any]): R = js.native
    
    def toBeCalledBefore(spy: SinonSpy[js.Array[Any], Any]): R = js.native
    
    def toBeCalledImmediatelyAfter(spy: SinonSpy[js.Array[Any], Any]): R = js.native
    
    def toBeCalledImmediatelyBefore(spy: SinonSpy[js.Array[Any], Any]): R = js.native
    
    def toBeCalledOn(`object`: js.Object): R = js.native
    
    def toBeCalledOnce(): R = js.native
    
    def toBeCalledOnceWith(args: Any*): R = js.native
    
    def toBeCalledOnceWithExactly(args: Any*): R = js.native
    
    def toBeCalledThrice(): R = js.native
    
    def toBeCalledTimes(callCount: Double): R = js.native
    
    def toBeCalledTwice(): R = js.native
    
    def toBeCalledWith(args: Any*): R = js.native
    
    def toBeCalledWithExactly(args: Any*): R = js.native
    
    def toBeCalledWithMatch(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Array<sinon.SinonMatch> | Array<any> is not an array type */ args: js.Array[Any | SinonMatch]
    ): R = js.native
    
    def toBeCalledWithNew(): R = js.native
    
    def toHaveAlwaysReturnedWith(obj: Any): R = js.native
    
    def toHaveAlwaysThrown(): R = js.native
    def toHaveAlwaysThrown(error: Any): R = js.native
    
    def toHaveAlwaysThrownError(): R = js.native
    def toHaveAlwaysThrownError(error: Any): R = js.native
    
    def toHaveBeenAlwaysCalledOn(`object`: js.Object): R = js.native
    
    def toHaveBeenAlwaysCalledWith(args: Any*): R = js.native
    
    def toHaveBeenAlwaysCalledWithExactly(args: Any*): R = js.native
    
    def toHaveBeenAlwaysCalledWithMatch(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Array<sinon.SinonMatch> | Array<any> is not an array type */ args: js.Array[Any | SinonMatch]
    ): R = js.native
    
    def toHaveBeenAlwaysCalledWithNew(): R = js.native
    
    def toHaveBeenCalled(): R = js.native
    
    def toHaveBeenCalledAfter(spy: SinonSpy[js.Array[Any], Any]): R = js.native
    
    def toHaveBeenCalledBefore(spy: SinonSpy[js.Array[Any], Any]): R = js.native
    
    def toHaveBeenCalledImmediatelyAfter(spy: SinonSpy[js.Array[Any], Any]): R = js.native
    
    def toHaveBeenCalledImmediatelyBefore(spy: SinonSpy[js.Array[Any], Any]): R = js.native
    
    def toHaveBeenCalledOn(`object`: js.Object): R = js.native
    
    def toHaveBeenCalledOnce(): R = js.native
    
    def toHaveBeenCalledOnceWith(args: Any*): R = js.native
    
    def toHaveBeenCalledOnceWithExactly(args: Any*): R = js.native
    
    def toHaveBeenCalledThrice(): R = js.native
    
    def toHaveBeenCalledTimes(callCount: Double): R = js.native
    
    def toHaveBeenCalledTwice(): R = js.native
    
    def toHaveBeenCalledWith(args: Any*): R = js.native
    
    def toHaveBeenCalledWithExactly(args: Any*): R = js.native
    
    def toHaveBeenCalledWithMatch(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Array<sinon.SinonMatch> | Array<any> is not an array type */ args: js.Array[Any | SinonMatch]
    ): R = js.native
    
    def toHaveBeenCalledWithNew(): R = js.native
    
    def toHaveCallCount(callCount: Double): R = js.native
    
    def toHaveReturned(obj: Any): R = js.native
    
    def toHaveReturnedWith(obj: Any): R = js.native
    
    def toHaveThrown(): R = js.native
    def toHaveThrown(error: Any): R = js.native
    
    def toReturn(obj: Any): R = js.native
    
    def toReturnWith(obj: Any): R = js.native
    
    def toThrow(): R = js.native
    def toThrow(error: Any): R = js.native
    
    def toThrowError(): R = js.native
    def toThrowError(error: Any): R = js.native
  }
}
