package typingsJapgolly.snabbdom

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snabbdom.buildVnodeMod.VNodeData
import typingsJapgolly.snabbdom.buildVnodeMod.VNode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildThunkMod {
  
  @JSImport("snabbdom/build/thunk", "thunk")
  @js.native
  val thunk: ThunkFn = js.native
  
  trait ThunkData
    extends StObject
       with VNodeData {
    
    @JSName("args")
    var args_ThunkData: js.Array[Any]
    
    @JSName("fn")
    def fn_MThunkData(): VNode_
  }
  object ThunkData {
    
    inline def apply(args: js.Array[Any], fn: CallbackTo[VNode_]): ThunkData = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], fn = fn.toJsFn)
      __obj.asInstanceOf[ThunkData]
    }
    
    extension [Self <: ThunkData](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setFn(value: CallbackTo[VNode_]): Self = StObject.set(x, "fn", value.toJsFn)
    }
  }
  
  @js.native
  trait ThunkFn extends StObject {
    
    def apply(sel: String, fn: js.Function1[/* repeated */ Any, Any], args: js.Array[Any]): Thunk_ = js.native
    def apply(sel: String, key: Any, fn: js.Function1[/* repeated */ Any, Any], args: js.Array[Any]): Thunk_ = js.native
  }
  
  trait Thunk_
    extends StObject
       with VNode_ {
    
    @JSName("data")
    var data_Thunk_ : ThunkData
  }
  object Thunk_ {
    
    inline def apply(data: ThunkData): Thunk_ = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Thunk_]
    }
    
    extension [Self <: Thunk_](x: Self) {
      
      inline def setData(value: ThunkData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}
