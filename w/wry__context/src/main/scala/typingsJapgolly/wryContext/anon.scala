package typingsJapgolly.wryContext

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait GetValue[TValue] extends StObject {
    
    def getValue(): js.UndefOr[TValue] = js.native
    
    def hasValue(): Boolean = js.native
    
    val id: String = js.native
    
    def withValue[TResult, TArgs /* <: js.Array[Any] */, TThis](value: TValue, callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult]): TResult = js.native
    def withValue[TResult, TArgs /* <: js.Array[Any] */, TThis](
      value: TValue,
      callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult],
      args: TArgs
    ): TResult = js.native
    def withValue[TResult, TArgs /* <: js.Array[Any] */, TThis](
      value: TValue,
      callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult],
      args: TArgs,
      thisArg: TThis
    ): TResult = js.native
    def withValue[TResult, TArgs /* <: js.Array[Any] */, TThis](
      value: TValue,
      callback: js.ThisFunction1[/* this */ TThis, /* args */ TArgs, TResult],
      args: Unit,
      thisArg: TThis
    ): TResult = js.native
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable0[GetValue[js.Object]] {
    
    def bind[TArgs_1 /* <: js.Array[Any] */, TResult_1, TThis_1](callback: js.ThisFunction1[/* this */ TThis_1, /* args */ TArgs_1, TResult_1]): js.ThisFunction1[/* this */ TThis_1, /* args */ TArgs_1, TResult_1] = js.native
    
    def noContext[TResult_2, TArgs_2 /* <: js.Array[Any] */, TThis_2](callback: js.ThisFunction1[/* this */ TThis_2, /* args */ TArgs_2, TResult_2]): TResult_2 = js.native
    def noContext[TResult_2, TArgs_2 /* <: js.Array[Any] */, TThis_2](callback: js.ThisFunction1[/* this */ TThis_2, /* args */ TArgs_2, TResult_2], args: TArgs_2): TResult_2 = js.native
    def noContext[TResult_2, TArgs_2 /* <: js.Array[Any] */, TThis_2](
      callback: js.ThisFunction1[/* this */ TThis_2, /* args */ TArgs_2, TResult_2],
      args: TArgs_2,
      thisArg: TThis_2
    ): TResult_2 = js.native
    def noContext[TResult_2, TArgs_2 /* <: js.Array[Any] */, TThis_2](
      callback: js.ThisFunction1[/* this */ TThis_2, /* args */ TArgs_2, TResult_2],
      args: Unit,
      thisArg: TThis_2
    ): TResult_2 = js.native
  }
}
