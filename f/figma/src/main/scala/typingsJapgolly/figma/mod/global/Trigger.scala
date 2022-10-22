package typingsJapgolly.figma.mod.global

import typingsJapgolly.figma.figmaStrings.MOUSE_DOWN
import typingsJapgolly.figma.figmaStrings.MOUSE_ENTER
import typingsJapgolly.figma.figmaStrings.MOUSE_LEAVE
import typingsJapgolly.figma.figmaStrings.MOUSE_UP
import typingsJapgolly.figma.figmaStrings.ON_CLICK
import typingsJapgolly.figma.figmaStrings.ON_DRAG
import typingsJapgolly.figma.figmaStrings.ON_HOVER
import typingsJapgolly.figma.figmaStrings.ON_PRESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.figma.anon.`1`
  - typingsJapgolly.figma.anon.Timeout
  - typingsJapgolly.figma.anon.Delay
*/
trait Trigger extends StObject
object Trigger {
  
  inline def `1`(`type`: ON_CLICK | ON_HOVER | ON_PRESS | ON_DRAG): typingsJapgolly.figma.anon.`1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.figma.anon.`1`]
  }
  
  inline def Delay(delay: Double, `type`: MOUSE_ENTER | MOUSE_LEAVE | MOUSE_UP | MOUSE_DOWN): typingsJapgolly.figma.anon.Delay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.figma.anon.Delay]
  }
  
  inline def Timeout(timeout: Double): typingsJapgolly.figma.anon.Timeout = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AFTER_TIMEOUT")
    __obj.asInstanceOf[typingsJapgolly.figma.anon.Timeout]
  }
}
