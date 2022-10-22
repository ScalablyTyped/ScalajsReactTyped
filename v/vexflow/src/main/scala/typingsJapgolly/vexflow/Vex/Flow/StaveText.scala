package typingsJapgolly.vexflow.Vex.Flow

import typingsJapgolly.vexflow.anon.Weight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaveText
  extends StObject
     with Modifier {
  
  def draw(stave: Stave): StaveText = js.native
  
  def setFont(font: Weight): Unit = js.native
  
  def setShiftX(x: Double): StaveText = js.native
  
  def setShiftY(y: Double): StaveText = js.native
  
  def setStaveText(text: String): StaveText = js.native
  
  def setText(text: String): Unit = js.native
}
