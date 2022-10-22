package typingsJapgolly.devtoolsProtocol.mod.Protocol.Profiler

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.CallFrame
import typingsJapgolly.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileNode extends StObject {
  
  /**
    * Function location.
    */
  var callFrame: CallFrame
  
  /**
    * Child node ids.
    */
  var children: js.UndefOr[js.Array[integer]] = js.undefined
  
  /**
    * The reason of being not optimized. The function may be deoptimized or marked as don't
    * optimize.
    */
  var deoptReason: js.UndefOr[String] = js.undefined
  
  /**
    * Number of samples where this node was on top of the call stack.
    */
  var hitCount: js.UndefOr[integer] = js.undefined
  
  /**
    * Unique id of the node.
    */
  var id: integer
  
  /**
    * An array of source position ticks.
    */
  var positionTicks: js.UndefOr[js.Array[PositionTickInfo]] = js.undefined
}
object ProfileNode {
  
  inline def apply(callFrame: CallFrame, id: integer): ProfileNode = {
    val __obj = js.Dynamic.literal(callFrame = callFrame.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileNode]
  }
  
  extension [Self <: ProfileNode](x: Self) {
    
    inline def setCallFrame(value: CallFrame): Self = StObject.set(x, "callFrame", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[integer]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: integer*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setDeoptReason(value: String): Self = StObject.set(x, "deoptReason", value.asInstanceOf[js.Any])
    
    inline def setDeoptReasonUndefined: Self = StObject.set(x, "deoptReason", js.undefined)
    
    inline def setHitCount(value: integer): Self = StObject.set(x, "hitCount", value.asInstanceOf[js.Any])
    
    inline def setHitCountUndefined: Self = StObject.set(x, "hitCount", js.undefined)
    
    inline def setId(value: integer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPositionTicks(value: js.Array[PositionTickInfo]): Self = StObject.set(x, "positionTicks", value.asInstanceOf[js.Any])
    
    inline def setPositionTicksUndefined: Self = StObject.set(x, "positionTicks", js.undefined)
    
    inline def setPositionTicksVarargs(value: PositionTickInfo*): Self = StObject.set(x, "positionTicks", js.Array(value*))
  }
}
