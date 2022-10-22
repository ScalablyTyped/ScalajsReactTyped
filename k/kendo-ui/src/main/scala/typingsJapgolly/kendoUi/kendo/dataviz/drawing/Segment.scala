package typingsJapgolly.kendoUi.kendo.dataviz.drawing

import typingsJapgolly.kendoUi.kendo.Class
import typingsJapgolly.kendoUi.kendo.geometry.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Segment
  extends StObject
     with Class {
  
  def anchor(): Point = js.native
  def anchor(value: Point): Unit = js.native
  
  def controlIn(): Point = js.native
  def controlIn(value: Point): Unit = js.native
  
  def controlOut(): Point = js.native
  def controlOut(value: Point): Unit = js.native
  
  var options: SegmentOptions = js.native
}
