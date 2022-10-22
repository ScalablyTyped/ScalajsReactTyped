package typingsJapgolly.pause

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(stream: Stream): Handle = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[Handle]
  
  @JSImport("pause", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Handle extends StObject {
    
    def end(): Unit
    
    def resume(): Unit
  }
  object Handle {
    
    inline def apply(end: Callback, resume: Callback): Handle = {
      val __obj = js.Dynamic.literal(end = end.toJsFn, resume = resume.toJsFn)
      __obj.asInstanceOf[Handle]
    }
    
    extension [Self <: Handle](x: Self) {
      
      inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
      
      inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
    }
  }
}
