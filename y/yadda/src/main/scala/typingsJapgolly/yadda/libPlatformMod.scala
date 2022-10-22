package typingsJapgolly.yadda

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformMod {
  
  @JSImport("yadda/lib/Platform", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Platform {
    
    /* CompleteClass */
    override def get_container(): Any = js.native
    
    /* CompleteClass */
    override def is_browser(): Boolean = js.native
    
    /* CompleteClass */
    override def is_karma(): Boolean = js.native
    
    // Window | NodeJS.Global | Phantom
    /* CompleteClass */
    override def is_node(): Boolean = js.native
    
    /* CompleteClass */
    override def is_phantom(): Boolean = js.native
  }
  
  trait Platform extends StObject {
    
    def get_container(): Any
    
    def is_browser(): Boolean
    
    def is_karma(): Boolean
    
    // Window | NodeJS.Global | Phantom
    def is_node(): Boolean
    
    def is_phantom(): Boolean
  }
  object Platform {
    
    inline def apply(
      get_container: CallbackTo[Any],
      is_browser: CallbackTo[Boolean],
      is_karma: CallbackTo[Boolean],
      is_node: CallbackTo[Boolean],
      is_phantom: CallbackTo[Boolean]
    ): Platform = {
      val __obj = js.Dynamic.literal(get_container = get_container.toJsFn, is_browser = is_browser.toJsFn, is_karma = is_karma.toJsFn, is_node = is_node.toJsFn, is_phantom = is_phantom.toJsFn)
      __obj.asInstanceOf[Platform]
    }
    
    extension [Self <: Platform](x: Self) {
      
      inline def setGet_container(value: CallbackTo[Any]): Self = StObject.set(x, "get_container", value.toJsFn)
      
      inline def setIs_browser(value: CallbackTo[Boolean]): Self = StObject.set(x, "is_browser", value.toJsFn)
      
      inline def setIs_karma(value: CallbackTo[Boolean]): Self = StObject.set(x, "is_karma", value.toJsFn)
      
      inline def setIs_node(value: CallbackTo[Boolean]): Self = StObject.set(x, "is_node", value.toJsFn)
      
      inline def setIs_phantom(value: CallbackTo[Boolean]): Self = StObject.set(x, "is_phantom", value.toJsFn)
    }
  }
}
