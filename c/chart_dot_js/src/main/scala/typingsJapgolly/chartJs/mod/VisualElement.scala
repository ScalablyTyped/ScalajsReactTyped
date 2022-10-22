package typingsJapgolly.chartJs.mod

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.chartJs.anon.X
import typingsJapgolly.chartJs.chartJsStrings.x
import typingsJapgolly.chartJs.chartJsStrings.y
import typingsJapgolly.chartJs.typesGeometricMod.ChartArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisualElement extends StObject {
  
  def draw(ctx: CanvasRenderingContext2D): Unit = js.native
  def draw(ctx: CanvasRenderingContext2D, area: ChartArea): Unit = js.native
  
  def getCenterPoint(): X = js.native
  def getCenterPoint(useFinalPosition: Boolean): X = js.native
  
  var getRange: js.UndefOr[js.Function1[/* axis */ x | y, Double]] = js.native
  
  def inRange(mouseX: Double, mouseY: Double): Boolean = js.native
  def inRange(mouseX: Double, mouseY: Double, useFinalPosition: Boolean): Boolean = js.native
  
  def inXRange(mouseX: Double): Boolean = js.native
  def inXRange(mouseX: Double, useFinalPosition: Boolean): Boolean = js.native
  
  def inYRange(mouseY: Double): Boolean = js.native
  def inYRange(mouseY: Double, useFinalPosition: Boolean): Boolean = js.native
}
