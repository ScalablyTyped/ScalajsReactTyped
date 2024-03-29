package typingsJapgolly.obeliskJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("obelisk.js", "SideColor")
@js.native
open class SideColor () extends AbstractColor {
  def this(border: Double) = this()
  def this(border: Double, inner: Double) = this()
  def this(border: Unit, inner: Double) = this()
  
  var BRIGHTNESS_GAIN: Double = js.native
  
  def getByInnerColor(inner: Double): SideColor = js.native
}
