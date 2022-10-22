package typingsJapgolly.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurState extends StObject {
  
  /** The current connection state. */
  var curState: String
  
  /**  The previous connection state. */
  var prevState: String
}
object CurState {
  
  inline def apply(curState: String, prevState: String): CurState = {
    val __obj = js.Dynamic.literal(curState = curState.asInstanceOf[js.Any], prevState = prevState.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurState]
  }
  
  extension [Self <: CurState](x: Self) {
    
    inline def setCurState(value: String): Self = StObject.set(x, "curState", value.asInstanceOf[js.Any])
    
    inline def setPrevState(value: String): Self = StObject.set(x, "prevState", value.asInstanceOf[js.Any])
  }
}
