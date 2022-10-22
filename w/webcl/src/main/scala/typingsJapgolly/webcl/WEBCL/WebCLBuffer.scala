package typingsJapgolly.webcl.WEBCL

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.6.1
trait WebCLBuffer
  extends StObject
     with WebCLMemoryObject {
  
  def createSubBuffer(memFlags: MemFlagsBits, origin: Double, sizeInBytes: Double): WebCLBuffer
}
object WebCLBuffer {
  
  inline def apply(
    createSubBuffer: (MemFlagsBits, Double, Double) => WebCLBuffer,
    getInfo: MemInfo => Any,
    release: Callback
  ): WebCLBuffer = {
    val __obj = js.Dynamic.literal(createSubBuffer = js.Any.fromFunction3(createSubBuffer), getInfo = js.Any.fromFunction1(getInfo), release = release.toJsFn)
    __obj.asInstanceOf[WebCLBuffer]
  }
  
  extension [Self <: WebCLBuffer](x: Self) {
    
    inline def setCreateSubBuffer(value: (MemFlagsBits, Double, Double) => WebCLBuffer): Self = StObject.set(x, "createSubBuffer", js.Any.fromFunction3(value))
  }
}
