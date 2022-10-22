package typingsJapgolly.reactAriaLive

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactAriaLive.reactAriaLiveStrings.assertive
import typingsJapgolly.reactAriaLive.reactAriaLiveStrings.polite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AnnounceAssertive extends StObject {
    
    def announceAssertive(message: String): Unit = js.native
    def announceAssertive(message: String, id: String): Unit = js.native
    
    def announcePolite(message: String): Unit = js.native
    def announcePolite(message: String, id: String): Unit = js.native
  }
  
  trait Arialive extends StObject {
    
    var `aria-live`: assertive | polite
    
    var clearOnUnmount: js.UndefOr[Boolean] = js.undefined
    
    var message: String
  }
  object Arialive {
    
    inline def apply(`aria-live`: assertive | polite, message: String): Arialive = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arialive]
    }
    
    extension [Self <: Arialive](x: Self) {
      
      inline def `setAria-live`(value: assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def setClearOnUnmount(value: Boolean): Self = StObject.set(x, "clearOnUnmount", value.asInstanceOf[js.Any])
      
      inline def setClearOnUnmountUndefined: Self = StObject.set(x, "clearOnUnmount", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Children extends StObject {
    
    def children(contextProps: AnnounceAssertive): Node
  }
  object Children {
    
    inline def apply(children: AnnounceAssertive => Node): Children = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: AnnounceAssertive => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
}
