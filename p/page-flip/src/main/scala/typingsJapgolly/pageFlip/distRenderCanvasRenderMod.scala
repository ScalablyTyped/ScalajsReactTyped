package typingsJapgolly.pageFlip

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.pageFlip.distPageFlipMod.PageFlip
import typingsJapgolly.pageFlip.distRenderRenderMod.Render
import typingsJapgolly.pageFlip.distSettingsMod.FlipSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRenderCanvasRenderMod {
  
  @JSImport("page-flip/dist/Render/CanvasRender", "CanvasRender")
  @js.native
  open class CanvasRender protected () extends Render {
    def this(app: PageFlip, setting: FlipSetting, inCanvas: HTMLCanvasElement) = this()
    
    /* private */ val canvas: Any = js.native
    
    /* private */ var clear: Any = js.native
    
    /* private */ val ctx: Any = js.native
    
    /* private */ var drawBookShadow: Any = js.native
    
    /* private */ var drawInnerShadow: Any = js.native
    
    /* private */ var drawOuterShadow: Any = js.native
    
    def getContext(): CanvasRenderingContext2D = js.native
  }
}
