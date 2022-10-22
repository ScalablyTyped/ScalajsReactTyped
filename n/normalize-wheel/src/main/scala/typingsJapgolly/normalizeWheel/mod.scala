package typingsJapgolly.normalizeWheel

import typingsJapgolly.normalizeWheel.anon.PixelX
import typingsJapgolly.normalizeWheel.normalizeWheelStrings.DOMMouseScroll
import typingsJapgolly.normalizeWheel.normalizeWheelStrings.mousewheel
import typingsJapgolly.normalizeWheel.normalizeWheelStrings.wheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(event: Any): PixelX = ^.asInstanceOf[js.Dynamic].apply(event.asInstanceOf[js.Any]).asInstanceOf[PixelX]
  
  @JSImport("normalize-wheel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEventType(): wheel | mousewheel | DOMMouseScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventType")().asInstanceOf[wheel | mousewheel | DOMMouseScroll]
}
