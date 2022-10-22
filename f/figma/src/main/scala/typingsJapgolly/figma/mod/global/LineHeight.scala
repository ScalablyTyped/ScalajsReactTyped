package typingsJapgolly.figma.mod.global

import typingsJapgolly.figma.figmaStrings.PERCENT
import typingsJapgolly.figma.figmaStrings.PIXELS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.figma.anon.Unit
  - typingsJapgolly.figma.anon.`0`
*/
trait LineHeight extends StObject
object LineHeight {
  
  inline def `0`(): typingsJapgolly.figma.anon.`0` = {
    val __obj = js.Dynamic.literal(unit = "AUTO")
    __obj.asInstanceOf[typingsJapgolly.figma.anon.`0`]
  }
  
  inline def Unit(unit: PIXELS | PERCENT, value: Double): typingsJapgolly.figma.anon.Unit = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.figma.anon.Unit]
  }
}
