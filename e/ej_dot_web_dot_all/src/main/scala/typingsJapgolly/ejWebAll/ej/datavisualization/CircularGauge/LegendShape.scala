package typingsJapgolly.ejWebAll.ej.datavisualization.CircularGauge

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendShape extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.LegendShape")
@js.native
object LegendShape extends js.Object {
  //string
  @js.native
  sealed trait Circle extends LegendShape
  
  //string
  @js.native
  sealed trait Diamond extends LegendShape
  
  //string
  @js.native
  sealed trait Ellipse extends LegendShape
  
  //string
  @js.native
  sealed trait Line extends LegendShape
  
  //string
  @js.native
  sealed trait Pentagon extends LegendShape
  
  //string
  @js.native
  sealed trait Rectangle extends LegendShape
  
  //string
  @js.native
  sealed trait Slider extends LegendShape
  
  //string
  @js.native
  sealed trait Trapezoid extends LegendShape
  
  //string
  @js.native
  sealed trait Triangle extends LegendShape
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LegendShape with Double] = js.native
  /* 1 */ @js.native
  object Circle extends TopLevel[Circle with Double]
  
  /* 4 */ @js.native
  object Diamond extends TopLevel[Diamond with Double]
  
  /* 3 */ @js.native
  object Ellipse extends TopLevel[Ellipse with Double]
  
  /* 8 */ @js.native
  object Line extends TopLevel[Line with Double]
  
  /* 5 */ @js.native
  object Pentagon extends TopLevel[Pentagon with Double]
  
  /* 0 */ @js.native
  object Rectangle extends TopLevel[Rectangle with Double]
  
  /* 6 */ @js.native
  object Slider extends TopLevel[Slider with Double]
  
  /* 7 */ @js.native
  object Trapezoid extends TopLevel[Trapezoid with Double]
  
  /* 2 */ @js.native
  object Triangle extends TopLevel[Triangle with Double]
  
}

