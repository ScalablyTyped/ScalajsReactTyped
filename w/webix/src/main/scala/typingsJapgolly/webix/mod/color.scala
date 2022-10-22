package typingsJapgolly.webix.mod

import typingsJapgolly.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait color extends StObject {
  
  def hexToDec(hex: String): Double = js.native
  
  def hsvToRgb(h: Double, s: Double, v: Double): js.Array[Any] = js.native
  
  def rgbToHsv(r: Double, g: Double, b: Double): js.Array[Any] = js.native
  
  def toHex(number: Double): String = js.native
  def toHex(number: Double, length: Double): String = js.native
  
  def toRgb(rgb: String): js.Array[Any] = js.native
}
object color {
  
  inline def apply: typingsJapgolly.webix.webix.color = ^.asInstanceOf[js.Dynamic].selectDynamic("color").asInstanceOf[typingsJapgolly.webix.webix.color]
}
