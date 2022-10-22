package typingsJapgolly.pollyjsAdapter

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Request
import typingsJapgolly.pollyjsAdapter.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pollyjs/adapter", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Adapter {
    
    /* CompleteClass */
    override def connect(): Unit = js.native
    
    /* CompleteClass */
    override def disconnect(): Unit = js.native
    
    /* CompleteClass */
    override val options: StringDictionary[Any] = js.native
    
    /* CompleteClass */
    override def passthroughRequest(pollyRequest: Request): js.Promise[Body] = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@pollyjs/adapter", "default.id")
    @js.native
    val id: String = js.native
    
    @JSImport("@pollyjs/adapter", "default.type")
    @js.native
    val `type`: String = js.native
  }
  
  trait Adapter extends StObject {
    
    def connect(): Unit
    
    def disconnect(): Unit
    
    val options: StringDictionary[Any]
    
    def passthroughRequest(pollyRequest: Request): js.Promise[Body]
  }
  object Adapter {
    
    inline def apply(
      connect: Callback,
      disconnect: Callback,
      options: StringDictionary[Any],
      passthroughRequest: Request => js.Promise[Body]
    ): Adapter = {
      val __obj = js.Dynamic.literal(connect = connect.toJsFn, disconnect = disconnect.toJsFn, options = options.asInstanceOf[js.Any], passthroughRequest = js.Any.fromFunction1(passthroughRequest))
      __obj.asInstanceOf[Adapter]
    }
    
    extension [Self <: Adapter](x: Self) {
      
      inline def setConnect(value: Callback): Self = StObject.set(x, "connect", value.toJsFn)
      
      inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
      
      inline def setOptions(value: StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPassthroughRequest(value: Request => js.Promise[Body]): Self = StObject.set(x, "passthroughRequest", js.Any.fromFunction1(value))
    }
  }
}
