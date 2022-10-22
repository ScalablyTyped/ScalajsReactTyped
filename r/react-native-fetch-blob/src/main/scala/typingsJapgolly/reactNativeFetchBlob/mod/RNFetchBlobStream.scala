package typingsJapgolly.reactNativeFetchBlob.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RNFetchBlobStream extends StObject {
  
  def onData(): Unit
  
  def onEnd(): Unit
  
  def onError(): Unit
}
object RNFetchBlobStream {
  
  inline def apply(onData: Callback, onEnd: Callback, onError: Callback): RNFetchBlobStream = {
    val __obj = js.Dynamic.literal(onData = onData.toJsFn, onEnd = onEnd.toJsFn, onError = onError.toJsFn)
    __obj.asInstanceOf[RNFetchBlobStream]
  }
  
  extension [Self <: RNFetchBlobStream](x: Self) {
    
    inline def setOnData(value: Callback): Self = StObject.set(x, "onData", value.toJsFn)
    
    inline def setOnEnd(value: Callback): Self = StObject.set(x, "onEnd", value.toJsFn)
    
    inline def setOnError(value: Callback): Self = StObject.set(x, "onError", value.toJsFn)
  }
}
