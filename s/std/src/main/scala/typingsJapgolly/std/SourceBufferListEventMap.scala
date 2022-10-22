package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceBufferListEventMap extends StObject {
  
  /* standard dom */
  var addsourcebuffer: org.scalajs.dom.Event
  
  /* standard dom */
  var removesourcebuffer: org.scalajs.dom.Event
}
object SourceBufferListEventMap {
  
  inline def apply(addsourcebuffer: org.scalajs.dom.Event, removesourcebuffer: org.scalajs.dom.Event): SourceBufferListEventMap = {
    val __obj = js.Dynamic.literal(addsourcebuffer = addsourcebuffer.asInstanceOf[js.Any], removesourcebuffer = removesourcebuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBufferListEventMap]
  }
  
  extension [Self <: SourceBufferListEventMap](x: Self) {
    
    inline def setAddsourcebuffer(value: org.scalajs.dom.Event): Self = StObject.set(x, "addsourcebuffer", value.asInstanceOf[js.Any])
    
    inline def setRemovesourcebuffer(value: org.scalajs.dom.Event): Self = StObject.set(x, "removesourcebuffer", value.asInstanceOf[js.Any])
  }
}
