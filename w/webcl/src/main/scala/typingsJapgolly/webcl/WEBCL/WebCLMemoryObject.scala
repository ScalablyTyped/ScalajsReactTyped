package typingsJapgolly.webcl.WEBCL

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.6
trait WebCLMemoryObject extends StObject {
  
  def getInfo(name: MemInfo): Any
  
  def release(): Unit
}
object WebCLMemoryObject {
  
  inline def apply(getInfo: MemInfo => Any, release: Callback): WebCLMemoryObject = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo), release = release.toJsFn)
    __obj.asInstanceOf[WebCLMemoryObject]
  }
  
  extension [Self <: WebCLMemoryObject](x: Self) {
    
    inline def setGetInfo(value: MemInfo => Any): Self = StObject.set(x, "getInfo", js.Any.fromFunction1(value))
    
    inline def setRelease(value: Callback): Self = StObject.set(x, "release", value.toJsFn)
  }
}
