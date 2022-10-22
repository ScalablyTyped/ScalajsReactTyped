package typingsJapgolly.qrcodeGenerator

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.qrcodeGenerator.anon.CellSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QRCode extends StObject {
  
  def addData(data: String): Unit = js.native
  def addData(data: String, mode: Mode): Unit = js.native
  
  def createASCII(): String = js.native
  def createASCII(cellSize: Double): String = js.native
  def createASCII(cellSize: Double, margin: Double): String = js.native
  def createASCII(cellSize: Unit, margin: Double): String = js.native
  
  def createDataURL(): String = js.native
  def createDataURL(cellSize: Double): String = js.native
  def createDataURL(cellSize: Double, margin: Double): String = js.native
  def createDataURL(cellSize: Unit, margin: Double): String = js.native
  
  def createImgTag(): String = js.native
  def createImgTag(cellSize: Double): String = js.native
  def createImgTag(cellSize: Double, margin: Double): String = js.native
  def createImgTag(cellSize: Unit, margin: Double): String = js.native
  
  def createSvgTag(): String = js.native
  def createSvgTag(cellSize: Double): String = js.native
  def createSvgTag(cellSize: Double, margin: Double): String = js.native
  def createSvgTag(cellSize: Unit, margin: Double): String = js.native
  def createSvgTag(opts: CellSize): String = js.native
  
  def createTableTag(): String = js.native
  def createTableTag(cellSize: Double): String = js.native
  def createTableTag(cellSize: Double, margin: Double): String = js.native
  def createTableTag(cellSize: Unit, margin: Double): String = js.native
  
  def getModuleCount(): Double = js.native
  
  def isDark(row: Double, col: Double): Boolean = js.native
  
  def make(): Unit = js.native
  
  def renderTo2dContext(context: CanvasRenderingContext2D): Unit = js.native
  def renderTo2dContext(context: CanvasRenderingContext2D, cellSize: Double): Unit = js.native
}
