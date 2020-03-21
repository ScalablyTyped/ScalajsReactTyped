package typingsJapgolly.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintHolePunch extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintHolePunch")
@js.native
object PrintHolePunch extends js.Object {
  @js.native
  sealed trait bottomEdge extends PrintHolePunch
  
  @js.native
  sealed trait default extends PrintHolePunch
  
  @js.native
  sealed trait leftEdge extends PrintHolePunch
  
  @js.native
  sealed trait none extends PrintHolePunch
  
  @js.native
  sealed trait notAvailable extends PrintHolePunch
  
  @js.native
  sealed trait printerCustom extends PrintHolePunch
  
  @js.native
  sealed trait rightEdge extends PrintHolePunch
  
  @js.native
  sealed trait topEdge extends PrintHolePunch
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintHolePunch with Double] = js.native
  /* 7 */ @js.native
  object bottomEdge extends TopLevel[bottomEdge with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 4 */ @js.native
  object leftEdge extends TopLevel[leftEdge with Double]
  
  /* 3 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object notAvailable extends TopLevel[notAvailable with Double]
  
  /* 2 */ @js.native
  object printerCustom extends TopLevel[printerCustom with Double]
  
  /* 5 */ @js.native
  object rightEdge extends TopLevel[rightEdge with Double]
  
  /* 6 */ @js.native
  object topEdge extends TopLevel[topEdge with Double]
  
}

