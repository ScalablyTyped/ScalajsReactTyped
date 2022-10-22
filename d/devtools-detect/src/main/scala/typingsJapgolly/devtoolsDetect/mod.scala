package typingsJapgolly.devtoolsDetect

import typingsJapgolly.devtoolsDetect.anon.IsOpen
import typingsJapgolly.devtoolsDetect.devtoolsDetectStrings.devtoolschange
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
    	Whether DevTools is open.
    	*/
    @JSImport("devtools-detect", "default.isOpen")
    @js.native
    val isOpen: Boolean = js.native
    
    /**
    	Orientation of the DevTools if it's open.
    	*/
    @JSImport("devtools-detect", "default.orientation")
    @js.native
    val orientation: js.UndefOr[Orientation] = js.native
  }
  
  @js.native
  trait DevToolsEvent
    extends StObject
       with Event {
    
    var detail: IsOpen = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devtoolsDetect.devtoolsDetectStrings.vertical
    - typingsJapgolly.devtoolsDetect.devtoolsDetectStrings.horizontal
  */
  trait Orientation extends StObject
  object Orientation {
    
    inline def horizontal: typingsJapgolly.devtoolsDetect.devtoolsDetectStrings.horizontal = "horizontal".asInstanceOf[typingsJapgolly.devtoolsDetect.devtoolsDetectStrings.horizontal]
    
    inline def vertical: typingsJapgolly.devtoolsDetect.devtoolsDetectStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.devtoolsDetect.devtoolsDetectStrings.vertical]
  }
  
  object global {
    
    @js.native
    trait Window extends StObject {
      
      @JSName("addEventListener")
      def addEventListener_devtoolschange(`type`: devtoolschange, listener: js.Function1[/* event */ DevToolsEvent, Any]): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_devtoolschange(`type`: devtoolschange, listener: js.Function1[/* event */ DevToolsEvent, Any], options: Boolean): Unit = js.native
      @JSName("addEventListener")
      def addEventListener_devtoolschange(
        `type`: devtoolschange,
        listener: js.Function1[/* event */ DevToolsEvent, Any],
        options: AddEventListenerOptions
      ): Unit = js.native
    }
  }
}
