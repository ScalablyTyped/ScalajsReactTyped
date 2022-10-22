package typingsJapgolly.hexo.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hexo.mod.Router.Data
import typingsJapgolly.hexo.mod.Router.RouteStream
import typingsJapgolly.hexoUtil.mod.Pattern
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Router extends StObject {
  
  /**
    * The `format` method transforms a string to a valid path.
    */
  def format(path: String): String = js.native
  
  /**
    * The `get` method returns a `Stream`.
    */
  def get(path: String): js.UndefOr[RouteStream] = js.native
  
  /**
    * Get the List of Routes
    */
  def list(): js.Array[String] = js.native
  
  /**
    * Remove a Path
    */
  def remove(path: String): this.type = js.native
  
  /**
    * The `set` method takes a string, a `Buffer` or a function.
    */
  def set(path: String, data: String): this.type = js.native
  def set(path: String, data: Data): this.type = js.native
  def set(path: String, data: Pattern[Boolean]): this.type = js.native
  def set(path: String, data: Buffer): this.type = js.native
}
object Router {
  
  type Callback = (js.Function2[/* err */ Any, /* result */ String, Unit]) | js.Function0[js.Promise[String]]
  
  trait Data extends StObject {
    
    var data: String | Buffer | Callback
    
    var modified: Boolean
  }
  object Data {
    
    inline def apply(data: String | Buffer | Callback, modified: Boolean): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: String | Buffer | Callback): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataCallbackTo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "data", value.toJsFn)
      
      inline def setDataFunction2(value: (/* err */ Any, /* result */ String) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "data", js.Any.fromFunction2((t0: /* err */ Any, t1: /* result */ String) => (value(t0, t1)).runNow()))
      
      inline def setModified(value: Boolean): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RouteStream extends Readable {
    
    val modified: Boolean = js.native
  }
}
