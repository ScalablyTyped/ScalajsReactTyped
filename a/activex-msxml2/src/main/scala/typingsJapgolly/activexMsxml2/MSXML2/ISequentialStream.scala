package typingsJapgolly.activexMsxml2.MSXML2

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISequentialStream extends StObject {
  
  /* private */ @JSName("MSXML2.ISequentialStream_typekey")
  var MSXML2DotISequentialStream_typekey: ISequentialStream
  
  def RemoteRead(pv: Double, cb: Double, pcbRead: Double): Unit
  
  def RemoteWrite(pv: Double, cb: Double, pcbWritten: Double): Unit
}
object ISequentialStream {
  
  inline def apply(
    MSXML2DotISequentialStream_typekey: ISequentialStream,
    RemoteRead: (Double, Double, Double) => Callback,
    RemoteWrite: (Double, Double, Double) => Callback
  ): ISequentialStream = {
    val __obj = js.Dynamic.literal(RemoteRead = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (RemoteRead(t0, t1, t2)).runNow()), RemoteWrite = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (RemoteWrite(t0, t1, t2)).runNow()))
    __obj.updateDynamic("MSXML2.ISequentialStream_typekey")(MSXML2DotISequentialStream_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISequentialStream]
  }
  
  extension [Self <: ISequentialStream](x: Self) {
    
    inline def setMSXML2DotISequentialStream_typekey(value: ISequentialStream): Self = StObject.set(x, "MSXML2.ISequentialStream_typekey", value.asInstanceOf[js.Any])
    
    inline def setRemoteRead(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "RemoteRead", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setRemoteWrite(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "RemoteWrite", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
