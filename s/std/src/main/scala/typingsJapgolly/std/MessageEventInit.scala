package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEventInit[T]
  extends StObject
     with EventInit {
  
  /* standard dom */
  var data: js.UndefOr[T] = js.undefined
  
  /* standard dom */
  var lastEventId: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var origin: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var ports: js.UndefOr[js.Array[org.scalajs.dom.MessagePort]] = js.undefined
  
  /* standard dom */
  var source: js.UndefOr[MessageEventSource | Null] = js.undefined
}
object MessageEventInit {
  
  inline def apply[T](): MessageEventInit[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageEventInit[T]]
  }
  
  extension [Self <: MessageEventInit[?], T](x: Self & MessageEventInit[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLastEventId(value: java.lang.String): Self = StObject.set(x, "lastEventId", value.asInstanceOf[js.Any])
    
    inline def setLastEventIdUndefined: Self = StObject.set(x, "lastEventId", js.undefined)
    
    inline def setOrigin(value: java.lang.String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPorts(value: js.Array[org.scalajs.dom.MessagePort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: org.scalajs.dom.MessagePort*): Self = StObject.set(x, "ports", js.Array(value*))
    
    inline def setSource(value: MessageEventSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
