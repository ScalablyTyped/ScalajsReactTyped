package typingsJapgolly.nodegit

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodegit.oidMod.Oid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexEntryMod {
  
  @JSImport("nodegit/index-entry", "IndexEntry")
  @js.native
  open class IndexEntry () extends StObject {
    
    var ctime: IndexTime = js.native
    
    var dev: Double = js.native
    
    var fileSize: Double = js.native
    
    var flags: Double = js.native
    
    var flagsExtended: Double = js.native
    
    var gid: Double = js.native
    
    var id: Oid = js.native
    
    var ino: Double = js.native
    
    var mode: Double = js.native
    
    var mtime: IndexTime = js.native
    
    var path: String = js.native
    
    var uid: Double = js.native
  }
  
  trait IndexTime extends StObject {
    
    def nanoseconds(): Double
    
    def seconds(): Double
  }
  object IndexTime {
    
    inline def apply(nanoseconds: CallbackTo[Double], seconds: CallbackTo[Double]): IndexTime = {
      val __obj = js.Dynamic.literal(nanoseconds = nanoseconds.toJsFn, seconds = seconds.toJsFn)
      __obj.asInstanceOf[IndexTime]
    }
    
    extension [Self <: IndexTime](x: Self) {
      
      inline def setNanoseconds(value: CallbackTo[Double]): Self = StObject.set(x, "nanoseconds", value.toJsFn)
      
      inline def setSeconds(value: CallbackTo[Double]): Self = StObject.set(x, "seconds", value.toJsFn)
    }
  }
}
