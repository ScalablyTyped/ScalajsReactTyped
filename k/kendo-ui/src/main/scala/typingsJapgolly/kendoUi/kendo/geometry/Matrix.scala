package typingsJapgolly.kendoUi.kendo.geometry

import typingsJapgolly.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matrix
  extends StObject
     with Observable {
  
  var a: Double = js.native
  
  var b: Double = js.native
  
  var c: Double = js.native
  
  var d: Double = js.native
  
  var e: Double = js.native
  
  def equals(other: Matrix): Boolean = js.native
  
  var f: Double = js.native
  
  def multiplyCopy(matrix: Matrix): Matrix = js.native
  
  var options: MatrixOptions = js.native
  
  def round(digits: Double): Matrix = js.native
  
  def toArray(digits: Double): Any = js.native
  
  def toString(digits: Double, separator: String): String = js.native
}
