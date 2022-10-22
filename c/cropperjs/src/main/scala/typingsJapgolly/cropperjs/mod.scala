package typingsJapgolly.cropperjs

import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.cropperjs.Cropper.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cropperjs", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Cropper {
    def this(element: HTMLCanvasElement) = this()
    def this(element: HTMLImageElement) = this()
    def this(element: HTMLCanvasElement, options: Options[HTMLCanvasElement]) = this()
    def this(element: HTMLImageElement, options: Options[HTMLImageElement]) = this()
  }
  object default {
    
    @JSImport("cropperjs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def noConflict(): Cropper = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Cropper]
    
    /* static member */
    inline def setDefaults(options: Options[EventTarget]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaults")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
