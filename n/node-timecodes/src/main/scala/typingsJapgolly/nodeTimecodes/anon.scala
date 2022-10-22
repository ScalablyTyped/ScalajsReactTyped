package typingsJapgolly.nodeTimecodes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Framerate extends StObject {
    
    var framerate: Double
  }
  object Framerate {
    
    inline def apply(framerate: Double): Framerate = {
      val __obj = js.Dynamic.literal(framerate = framerate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Framerate]
    }
    
    extension [Self <: Framerate](x: Self) {
      
      inline def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
    }
  }
}
