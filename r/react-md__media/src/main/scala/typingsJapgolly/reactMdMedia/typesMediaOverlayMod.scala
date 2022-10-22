package typingsJapgolly.reactMdMedia

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMediaOverlayMod {
  
  @JSImport("@react-md/media/types/MediaOverlay", "MediaOverlay")
  @js.native
  val MediaOverlay: ForwardRefExoticComponent[MediaOverlayProps & RefAttributes[HTMLDivElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdMedia.reactMdMediaStrings.top
    - typingsJapgolly.reactMdMedia.reactMdMediaStrings.right
    - typingsJapgolly.reactMdMedia.reactMdMediaStrings.bottom
    - typingsJapgolly.reactMdMedia.reactMdMediaStrings.left
    - typingsJapgolly.reactMdMedia.reactMdMediaStrings.middle
    - typingsJapgolly.reactMdMedia.reactMdMediaStrings.center
    - typingsJapgolly.reactMdMedia.reactMdMediaStrings.`absolute-center`
  */
  trait MediaOverlayPosition extends StObject
  object MediaOverlayPosition {
    
    inline def `absolute-center`: typingsJapgolly.reactMdMedia.reactMdMediaStrings.`absolute-center` = "absolute-center".asInstanceOf[typingsJapgolly.reactMdMedia.reactMdMediaStrings.`absolute-center`]
    
    inline def bottom: typingsJapgolly.reactMdMedia.reactMdMediaStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.reactMdMedia.reactMdMediaStrings.bottom]
    
    inline def center: typingsJapgolly.reactMdMedia.reactMdMediaStrings.center = "center".asInstanceOf[typingsJapgolly.reactMdMedia.reactMdMediaStrings.center]
    
    inline def left: typingsJapgolly.reactMdMedia.reactMdMediaStrings.left = "left".asInstanceOf[typingsJapgolly.reactMdMedia.reactMdMediaStrings.left]
    
    inline def middle: typingsJapgolly.reactMdMedia.reactMdMediaStrings.middle = "middle".asInstanceOf[typingsJapgolly.reactMdMedia.reactMdMediaStrings.middle]
    
    inline def right: typingsJapgolly.reactMdMedia.reactMdMediaStrings.right = "right".asInstanceOf[typingsJapgolly.reactMdMedia.reactMdMediaStrings.right]
    
    inline def top: typingsJapgolly.reactMdMedia.reactMdMediaStrings.top = "top".asInstanceOf[typingsJapgolly.reactMdMedia.reactMdMediaStrings.top]
  }
  
  trait MediaOverlayProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * The position of the overlay within the `MediaContainer`.
      */
    var position: js.UndefOr[MediaOverlayPosition] = js.undefined
  }
  object MediaOverlayProps {
    
    inline def apply(): MediaOverlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaOverlayProps]
    }
    
    extension [Self <: MediaOverlayProps](x: Self) {
      
      inline def setPosition(value: MediaOverlayPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
}
