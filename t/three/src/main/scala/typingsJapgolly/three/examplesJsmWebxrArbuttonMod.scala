package typingsJapgolly.three

import org.scalajs.dom.HTMLElement
import typingsJapgolly.three.anon.PartialARButtonSessionIni
import typingsJapgolly.three.anon.Root
import typingsJapgolly.three.srcThreeMod.WebGLRenderer
import typingsJapgolly.webxr.XRSessionInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmWebxrArbuttonMod {
  
  object ARButton {
    
    @JSImport("three/examples/jsm/webxr/ARButton", "ARButton")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createButton(renderer: WebGLRenderer): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createButton")(renderer.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    inline def createButton(renderer: WebGLRenderer, sessionInit: PartialARButtonSessionIni): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createButton")(renderer.asInstanceOf[js.Any], sessionInit.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  }
  
  trait ARButtonSessionInit
    extends StObject
       with XRSessionInit {
    
    @JSName("domOverlay")
    var domOverlay_ARButtonSessionInit: Root
  }
  object ARButtonSessionInit {
    
    inline def apply(domOverlay: Root): ARButtonSessionInit = {
      val __obj = js.Dynamic.literal(domOverlay = domOverlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[ARButtonSessionInit]
    }
    
    extension [Self <: ARButtonSessionInit](x: Self) {
      
      inline def setDomOverlay(value: Root): Self = StObject.set(x, "domOverlay", value.asInstanceOf[js.Any])
    }
  }
}
