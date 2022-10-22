package typingsJapgolly.thrift.mod

import typingsJapgolly.thrift.mod.Thrift.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TMessage extends StObject {
  
  var fname: String
  
  var mtype: MessageType
  
  var rseqid: Double
}
object TMessage {
  
  inline def apply(fname: String, mtype: MessageType, rseqid: Double): TMessage = {
    val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any], mtype = mtype.asInstanceOf[js.Any], rseqid = rseqid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TMessage]
  }
  
  extension [Self <: TMessage](x: Self) {
    
    inline def setFname(value: String): Self = StObject.set(x, "fname", value.asInstanceOf[js.Any])
    
    inline def setMtype(value: MessageType): Self = StObject.set(x, "mtype", value.asInstanceOf[js.Any])
    
    inline def setRseqid(value: Double): Self = StObject.set(x, "rseqid", value.asInstanceOf[js.Any])
  }
}
