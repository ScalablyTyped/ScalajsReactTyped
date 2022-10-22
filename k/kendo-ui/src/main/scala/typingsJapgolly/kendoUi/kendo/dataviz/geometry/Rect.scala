package typingsJapgolly.kendoUi.kendo.dataviz.geometry

import typingsJapgolly.kendoUi.kendo.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rect
  extends StObject
     with Observable {
  
  def bbox(matrix: typingsJapgolly.kendoUi.kendo.geometry.Matrix): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  
  def bottomLeft(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def bottomRight(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def center(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def equals(other: typingsJapgolly.kendoUi.kendo.geometry.Rect): Boolean = js.native
  
  def getOrigin(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def getSize(): typingsJapgolly.kendoUi.kendo.geometry.Size = js.native
  
  def height(): Double = js.native
  
  var options: RectOptions = js.native
  
  var origin: typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def setOrigin(value: Any): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  def setOrigin(value: typingsJapgolly.kendoUi.kendo.geometry.Point): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  
  def setSize(value: Any): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  def setSize(value: typingsJapgolly.kendoUi.kendo.geometry.Size): typingsJapgolly.kendoUi.kendo.geometry.Rect = js.native
  
  var size: typingsJapgolly.kendoUi.kendo.geometry.Size = js.native
  
  def topLeft(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def topRight(): typingsJapgolly.kendoUi.kendo.geometry.Point = js.native
  
  def width(): Double = js.native
}
