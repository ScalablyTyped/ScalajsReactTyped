package typingsJapgolly.vexflow.Vex.Flow

import typingsJapgolly.vexflow.Vex.Flow.Modifier.Position
import typingsJapgolly.vexflow.anon.Fret
import typingsJapgolly.vexflow.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabNote
  extends StObject
     with StemmableNote {
  
  def addDot(): TabNote = js.native
  
  def draw(): Unit = js.native
  
  def drawFlag(): Unit = js.native
  
  def drawModifiers(): Unit = js.native
  
  def drawStemThrough(): Unit = js.native
  
  def getModifierStartXY(position: Position, index: Double): X = js.native
  
  def getPositions(): js.Array[Fret] = js.native
  
  def getStemY(): Double = js.native
  
  def getTieLeftX(): Double = js.native
  
  def getTieRightX(): Double = js.native
  
  def setGhost(ghost: Boolean): TabNote = js.native
  
  @JSName("setStave")
  def setStave_TabNote(stave: Stave): TabNote = js.native
  
  def updateWidth(): Unit = js.native
}
