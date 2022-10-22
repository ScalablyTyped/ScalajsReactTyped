package typingsJapgolly.webcl.WEBCL

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.7
trait WebCLSampler extends StObject {
  
  def getInfo(name: SamplerInfo): Any
  
  def release(): Unit
}
object WebCLSampler {
  
  inline def apply(getInfo: SamplerInfo => Any, release: Callback): WebCLSampler = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo), release = release.toJsFn)
    __obj.asInstanceOf[WebCLSampler]
  }
  
  extension [Self <: WebCLSampler](x: Self) {
    
    inline def setGetInfo(value: SamplerInfo => Any): Self = StObject.set(x, "getInfo", js.Any.fromFunction1(value))
    
    inline def setRelease(value: Callback): Self = StObject.set(x, "release", value.toJsFn)
  }
}
