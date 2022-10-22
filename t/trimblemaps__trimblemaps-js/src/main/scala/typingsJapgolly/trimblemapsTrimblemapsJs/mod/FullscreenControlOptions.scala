package typingsJapgolly.trimblemapsTrimblemapsJs.mod

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullscreenControlOptions extends StObject {
  
  /**
    * A compatible DOM element which should be made full screen.
    * By default, the map container element will be made full screen.
    */
  var container: js.UndefOr[HTMLElement | Null] = js.undefined
}
object FullscreenControlOptions {
  
  inline def apply(): FullscreenControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullscreenControlOptions]
  }
  
  extension [Self <: FullscreenControlOptions](x: Self) {
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
  }
}
