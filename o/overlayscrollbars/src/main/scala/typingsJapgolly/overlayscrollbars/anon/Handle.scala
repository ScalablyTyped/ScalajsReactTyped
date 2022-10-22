package typingsJapgolly.overlayscrollbars.anon

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handle extends StObject {
  
  var handle: HTMLElement
  
  var scrollbar: HTMLElement
  
  var track: HTMLElement
}
object Handle {
  
  inline def apply(handle: HTMLElement, scrollbar: HTMLElement, track: HTMLElement): Handle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handle]
  }
  
  extension [Self <: Handle](x: Self) {
    
    inline def setHandle(value: HTMLElement): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setScrollbar(value: HTMLElement): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    inline def setTrack(value: HTMLElement): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
