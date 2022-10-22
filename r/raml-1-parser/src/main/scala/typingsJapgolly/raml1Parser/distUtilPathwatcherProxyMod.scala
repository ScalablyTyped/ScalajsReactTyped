package typingsJapgolly.raml1Parser

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilPathwatcherProxyMod {
  
  @JSImport("raml-1-parser/dist/util/pathwatcherProxy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/util/pathwatcherProxy", "File")
  @js.native
  open class File protected () extends StObject {
    def this(path: String) = this()
    
    def close(): Unit = js.native
    
    def getPath(): String = js.native
    
    /* private */ var path: Any = js.native
  }
  
  inline def watch(path: String, f: js.Function2[/* event */ Any, /* newFileName */ Any, Unit]): IPathWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(path.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[IPathWatcher]
  
  trait IPathWatcher extends StObject {
    
    def close(): Any
  }
  object IPathWatcher {
    
    inline def apply(close: CallbackTo[Any]): IPathWatcher = {
      val __obj = js.Dynamic.literal(close = close.toJsFn)
      __obj.asInstanceOf[IPathWatcher]
    }
    
    extension [Self <: IPathWatcher](x: Self) {
      
      inline def setClose(value: CallbackTo[Any]): Self = StObject.set(x, "close", value.toJsFn)
    }
  }
}
