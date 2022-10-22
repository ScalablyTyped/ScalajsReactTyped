package typingsJapgolly.pageFlip

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.pageFlip.distPageFlipMod.PageFlip
import typingsJapgolly.pageFlip.distSettingsMod.FlipSetting
import typingsJapgolly.pageFlip.distUIUIMod.UI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUICanvasUIMod {
  
  @JSImport("page-flip/dist/UI/CanvasUI", "CanvasUI")
  @js.native
  open class CanvasUI protected () extends UI {
    def this(inBlock: HTMLElement, app: PageFlip, setting: FlipSetting) = this()
    
    /* private */ val canvas: Any = js.native
    
    /**
      * Get canvas element
      */
    def getCanvas(): HTMLCanvasElement = js.native
    
    /* private */ var resizeCanvas: Any = js.native
  }
}
