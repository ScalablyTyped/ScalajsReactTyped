package typingsJapgolly.vexflow.Vex.Flow

import org.scalajs.dom.SVGElement
import org.scalajs.dom.SVGRect
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGContext
  extends StObject
     with IRenderContext {
  
  var attributes: Any = js.native
  
  def ieMeasureTextFix(bbox: SVGRect, text: String): Y = js.native
  
  def iePolyfill(): Boolean = js.native
  
  var lineWidth: Double = js.native
  
  def rect(x: Double, y: Double, width: Double, height: Double): SVGContext = js.native
  
  def setFont(family: String, size: Double, weight: String): SVGContext = js.native
  
  def setViewBox(xMin: Double, yMin: Double, width: Double, height: Double): Unit = js.native
  
  var state: Any = js.native
  
  var svg: SVGElement = js.native
}
