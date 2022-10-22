package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outFunctionCurryMod.Curry
import typingsJapgolly.tsToolbelt.outFunctionFunctionMod.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outFunctionComposeMultiSyncMod {
  
  @js.native
  trait ComposeMultiSync extends StObject {
    
    def apply[R0, P /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<P, R0> | Curry<Function<P, R0>>] is not an array type */ fns: js.Array[(Function[P, R0]) | (Curry[Function[P, R0]])]
    ): Function[P, R0] = js.native
    def apply[R0, R1, P /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<[R0], R1> | Curry<Function<[R0], R1>>, Function<P, R0> | Curry<Function<P, R0>>] is not an array type */ fns: js.Tuple2[
          (Function[js.Array[R0], R1]) | (Curry[Function[js.Array[R0], R1]]), 
          (Function[P, R0]) | (Curry[Function[P, R0]])
        ]
    ): Function[P, R1] = js.native
    def apply[R0, R1, R2, P /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<[R1], R2> | Curry<Function<[R1], R2>>, Function<[R0], R1> | Curry<Function<[R0], R1>>, Function<P, R0> | Curry<Function<P, R0>>] is not an array type */ fns: js.Tuple3[
          (Function[js.Array[R1], R2]) | (Curry[Function[js.Array[R1], R2]]), 
          (Function[js.Array[R0], R1]) | (Curry[Function[js.Array[R0], R1]]), 
          (Function[P, R0]) | (Curry[Function[P, R0]])
        ]
    ): Function[P, R2] = js.native
    def apply[R0, R1, R2, R3, P /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<[R2], R3> | Curry<Function<[R2], R3>>, Function<[R1], R2> | Curry<Function<[R1], R2>>, Function<[R0], R1> | Curry<Function<[R0], R1>>, Function<P, R0> | Curry<Function<P, R0>>] is not an array type */ fns: js.Tuple4[
          (Function[js.Array[R2], R3]) | (Curry[Function[js.Array[R2], R3]]), 
          (Function[js.Array[R1], R2]) | (Curry[Function[js.Array[R1], R2]]), 
          (Function[js.Array[R0], R1]) | (Curry[Function[js.Array[R0], R1]]), 
          (Function[P, R0]) | (Curry[Function[P, R0]])
        ]
    ): Function[P, R3] = js.native
    def apply[R0, R1, R2, R3, R4, P /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<[R3], R4> | Curry<Function<[R3], R4>>, Function<[R2], R3> | Curry<Function<[R2], R3>>, Function<[R1], R2> | Curry<Function<[R1], R2>>, Function<[R0], R1> | Curry<Function<[R0], R1>>, Function<P, R0> | Curry<Function<P, R0>>] is not an array type */ fns: js.Tuple5[
          (Function[js.Array[R3], R4]) | (Curry[Function[js.Array[R3], R4]]), 
          (Function[js.Array[R2], R3]) | (Curry[Function[js.Array[R2], R3]]), 
          (Function[js.Array[R1], R2]) | (Curry[Function[js.Array[R1], R2]]), 
          (Function[js.Array[R0], R1]) | (Curry[Function[js.Array[R0], R1]]), 
          (Function[P, R0]) | (Curry[Function[P, R0]])
        ]
    ): Function[P, R4] = js.native
    def apply[R0, R1, R2, R3, R4, R5, P /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<[R4], R5> | Curry<Function<[R4], R5>>, Function<[R3], R4> | Curry<Function<[R3], R4>>, Function<[R2], R3> | Curry<Function<[R2], R3>>, Function<[R1], R2> | Curry<Function<[R1], R2>>, Function<[R0], R1> | Curry<Function<[R0], R1>>, Function<P, R0> | Curry<Function<P, R0>>] is not an array type */ fns: js.Tuple6[
          (Function[js.Array[R4], R5]) | (Curry[Function[js.Array[R4], R5]]), 
          (Function[js.Array[R3], R4]) | (Curry[Function[js.Array[R3], R4]]), 
          (Function[js.Array[R2], R3]) | (Curry[Function[js.Array[R2], R3]]), 
          (Function[js.Array[R1], R2]) | (Curry[Function[js.Array[R1], R2]]), 
          (Function[js.Array[R0], R1]) | (Curry[Function[js.Array[R0], R1]]), 
          (Function[P, R0]) | (Curry[Function[P, R0]])
        ]
    ): Function[P, R5] = js.native
    def apply[R0, R1, R2, R3, R4, R5, R6, P /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<[R5], R6> | Curry<Function<[R5], R6>>, Function<[R4], R5> | Curry<Function<[R4], R5>>, Function<[R3], R4> | Curry<Function<[R3], R4>>, Function<[R2], R3> | Curry<Function<[R2], R3>>, Function<[R1], R2> | Curry<Function<[R1], R2>>, Function<[R0], R1> | Curry<Function<[R0], R1>>, Function<P, R0> | Curry<Function<P, R0>>] is not an array type */ fns: js.Tuple7[
          (Function[js.Array[R5], R6]) | (Curry[Function[js.Array[R5], R6]]), 
          (Function[js.Array[R4], R5]) | (Curry[Function[js.Array[R4], R5]]), 
          (Function[js.Array[R3], R4]) | (Curry[Function[js.Array[R3], R4]]), 
          (Function[js.Array[R2], R3]) | (Curry[Function[js.Array[R2], R3]]), 
          (Function[js.Array[R1], R2]) | (Curry[Function[js.Array[R1], R2]]), 
          (Function[js.Array[R0], R1]) | (Curry[Function[js.Array[R0], R1]]), 
          (Function[P, R0]) | (Curry[Function[P, R0]])
        ]
    ): Function[P, R6] = js.native
    def apply[R0, R1, R2, R3, R4, R5, R6, R7, P /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<[R6], R7> | Curry<Function<[R6], R7>>, Function<[R5], R6> | Curry<Function<[R5], R6>>, Function<[R4], R5> | Curry<Function<[R4], R5>>, Function<[R3], R4> | Curry<Function<[R3], R4>>, Function<[R2], R3> | Curry<Function<[R2], R3>>, Function<[R1], R2> | Curry<Function<[R1], R2>>, Function<[R0], R1> | Curry<Function<[R0], R1>>, Function<P, R0> | Curry<Function<P, R0>>] is not an array type */ fns: js.Tuple8[
          (Function[js.Array[R6], R7]) | (Curry[Function[js.Array[R6], R7]]), 
          (Function[js.Array[R5], R6]) | (Curry[Function[js.Array[R5], R6]]), 
          (Function[js.Array[R4], R5]) | (Curry[Function[js.Array[R4], R5]]), 
          (Function[js.Array[R3], R4]) | (Curry[Function[js.Array[R3], R4]]), 
          (Function[js.Array[R2], R3]) | (Curry[Function[js.Array[R2], R3]]), 
          (Function[js.Array[R1], R2]) | (Curry[Function[js.Array[R1], R2]]), 
          (Function[js.Array[R0], R1]) | (Curry[Function[js.Array[R0], R1]]), 
          (Function[P, R0]) | (Curry[Function[P, R0]])
        ]
    ): Function[P, R7] = js.native
    def apply[R0, R1, R2, R3, R4, R5, R6, R7, R8, P /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<[R7], R8> | Curry<Function<[R7], R8>>, Function<[R6], R7> | Curry<Function<[R6], R7>>, Function<[R5], R6> | Curry<Function<[R5], R6>>, Function<[R4], R5> | Curry<Function<[R4], R5>>, Function<[R3], R4> | Curry<Function<[R3], R4>>, Function<[R2], R3> | Curry<Function<[R2], R3>>, Function<[R1], R2> | Curry<Function<[R1], R2>>, Function<[R0], R1> | Curry<Function<[R0], R1>>, Function<P, R0> | Curry<Function<P, R0>>] is not an array type */ fns: js.Tuple9[
          (Function[js.Array[R7], R8]) | (Curry[Function[js.Array[R7], R8]]), 
          (Function[js.Array[R6], R7]) | (Curry[Function[js.Array[R6], R7]]), 
          (Function[js.Array[R5], R6]) | (Curry[Function[js.Array[R5], R6]]), 
          (Function[js.Array[R4], R5]) | (Curry[Function[js.Array[R4], R5]]), 
          (Function[js.Array[R3], R4]) | (Curry[Function[js.Array[R3], R4]]), 
          (Function[js.Array[R2], R3]) | (Curry[Function[js.Array[R2], R3]]), 
          (Function[js.Array[R1], R2]) | (Curry[Function[js.Array[R1], R2]]), 
          (Function[js.Array[R0], R1]) | (Curry[Function[js.Array[R0], R1]]), 
          (Function[P, R0]) | (Curry[Function[P, R0]])
        ]
    ): Function[P, R8] = js.native
    def apply[R0, R1, R2, R3, R4, R5, R6, R7, R8, R9, P /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fns because its type [Function<[R8], R9> | Curry<Function<[R8], R9>>, Function<[R7], R8> | Curry<Function<[R7], R8>>, Function<[R6], R7> | Curry<Function<[R6], R7>>, Function<[R5], R6> | Curry<Function<[R5], R6>>, Function<[R4], R5> | Curry<Function<[R4], R5>>, Function<[R3], R4> | Curry<Function<[R3], R4>>, Function<[R2], R3> | Curry<Function<[R2], R3>>, Function<[R1], R2> | Curry<Function<[R1], R2>>, Function<[R0], R1> | Curry<Function<[R0], R1>>, Function<P, R0> | Curry<Function<P, R0>>] is not an array type */ fns: js.Tuple10[
          (Function[js.Array[R8], R9]) | (Curry[Function[js.Array[R8], R9]]), 
          (Function[js.Array[R7], R8]) | (Curry[Function[js.Array[R7], R8]]), 
          (Function[js.Array[R6], R7]) | (Curry[Function[js.Array[R6], R7]]), 
          (Function[js.Array[R5], R6]) | (Curry[Function[js.Array[R5], R6]]), 
          (Function[js.Array[R4], R5]) | (Curry[Function[js.Array[R4], R5]]), 
          (Function[js.Array[R3], R4]) | (Curry[Function[js.Array[R3], R4]]), 
          (Function[js.Array[R2], R3]) | (Curry[Function[js.Array[R2], R3]]), 
          (Function[js.Array[R1], R2]) | (Curry[Function[js.Array[R1], R2]]), 
          (Function[js.Array[R0], R1]) | (Curry[Function[js.Array[R0], R1]]), 
          (Function[P, R0]) | (Curry[Function[P, R0]])
        ]
    ): Function[P, R9] = js.native
  }
}
