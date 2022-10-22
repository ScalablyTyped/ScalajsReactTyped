package typingsJapgolly.leafletFullscreen

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.leaflet.mod.ControlPosition
import typingsJapgolly.leafletFullscreen.leafletFullscreenBooleans.`false`
import typingsJapgolly.leafletFullscreen.leafletMod.Control_.Fullscreen
import typingsJapgolly.leafletFullscreen.leafletMod.Control_.FullscreenOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  object Control_ {
    
    @JSImport("leaflet", "Control.Fullscreen")
    @js.native
    open class Fullscreen ()
      extends typingsJapgolly.leaflet.mod.Control_ {
      def this(options: FullscreenOptions) = this()
      
      @JSName("options")
      var options_Fullscreen: FullscreenOptions = js.native
    }
    
    trait FullscreenOptions extends StObject {
      
      var content: js.UndefOr[String] = js.undefined
      
      var forcePseudoFullscreen: js.UndefOr[Boolean] = js.undefined
      
      var forceSeparateButton: js.UndefOr[Boolean] = js.undefined
      
      var fullscreenElement: js.UndefOr[`false` | HTMLElement] = js.undefined
      
      var position: js.UndefOr[ControlPosition] = js.undefined
      
      var pseudoFullscreen: js.UndefOr[Boolean] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var titleCancel: js.UndefOr[String] = js.undefined
    }
    object FullscreenOptions {
      
      inline def apply(): FullscreenOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FullscreenOptions]
      }
      
      extension [Self <: FullscreenOptions](x: Self) {
        
        inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setForcePseudoFullscreen(value: Boolean): Self = StObject.set(x, "forcePseudoFullscreen", value.asInstanceOf[js.Any])
        
        inline def setForcePseudoFullscreenUndefined: Self = StObject.set(x, "forcePseudoFullscreen", js.undefined)
        
        inline def setForceSeparateButton(value: Boolean): Self = StObject.set(x, "forceSeparateButton", value.asInstanceOf[js.Any])
        
        inline def setForceSeparateButtonUndefined: Self = StObject.set(x, "forceSeparateButton", js.undefined)
        
        inline def setFullscreenElement(value: `false` | HTMLElement): Self = StObject.set(x, "fullscreenElement", value.asInstanceOf[js.Any])
        
        inline def setFullscreenElementUndefined: Self = StObject.set(x, "fullscreenElement", js.undefined)
        
        inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setPseudoFullscreen(value: Boolean): Self = StObject.set(x, "pseudoFullscreen", value.asInstanceOf[js.Any])
        
        inline def setPseudoFullscreenUndefined: Self = StObject.set(x, "pseudoFullscreen", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleCancel(value: String): Self = StObject.set(x, "titleCancel", value.asInstanceOf[js.Any])
        
        inline def setTitleCancelUndefined: Self = StObject.set(x, "titleCancel", js.undefined)
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
  }
  
  object control {
    
    @JSImport("leaflet", "control")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a fullscreen control.
      */
    inline def fullscreen(): Fullscreen = ^.asInstanceOf[js.Dynamic].applyDynamic("fullscreen")().asInstanceOf[Fullscreen]
    inline def fullscreen(options: FullscreenOptions): Fullscreen = ^.asInstanceOf[js.Dynamic].applyDynamic("fullscreen")(options.asInstanceOf[js.Any]).asInstanceOf[Fullscreen]
  }
  
  trait Map extends StObject {
    
    def toggleFullScreen(): Unit
  }
  object Map {
    
    inline def apply(toggleFullScreen: Callback): Map = {
      val __obj = js.Dynamic.literal(toggleFullScreen = toggleFullScreen.toJsFn)
      __obj.asInstanceOf[Map]
    }
    
    extension [Self <: Map](x: Self) {
      
      inline def setToggleFullScreen(value: Callback): Self = StObject.set(x, "toggleFullScreen", value.toJsFn)
    }
  }
  
  trait MapOptions extends StObject {
    
    var fullscreenControl: js.UndefOr[Boolean] = js.undefined
    
    var fullscreenControlOptions: js.UndefOr[FullscreenOptions] = js.undefined
  }
  object MapOptions {
    
    inline def apply(): MapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapOptions]
    }
    
    extension [Self <: MapOptions](x: Self) {
      
      inline def setFullscreenControl(value: Boolean): Self = StObject.set(x, "fullscreenControl", value.asInstanceOf[js.Any])
      
      inline def setFullscreenControlOptions(value: FullscreenOptions): Self = StObject.set(x, "fullscreenControlOptions", value.asInstanceOf[js.Any])
      
      inline def setFullscreenControlOptionsUndefined: Self = StObject.set(x, "fullscreenControlOptions", js.undefined)
      
      inline def setFullscreenControlUndefined: Self = StObject.set(x, "fullscreenControl", js.undefined)
    }
  }
}
