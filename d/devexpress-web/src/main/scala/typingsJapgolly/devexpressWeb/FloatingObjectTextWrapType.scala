package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectTextWrapType extends js.Object

/**
  * Lists values specifying how text is wrapped around a floating object.
  */
@JSGlobal("FloatingObjectTextWrapType")
@js.native
object FloatingObjectTextWrapType extends js.Object {
  /**
    * The text does not wrap around the shape.
    */
  @js.native
  sealed trait None extends FloatingObjectTextWrapType
  
  /**
    * The text wraps around the rectangular borders of the shape.
    */
  @js.native
  sealed trait Square extends FloatingObjectTextWrapType
  
  /**
    * The text wraps tightly around the shape and can fill in the transparent background space inside the shape.
    */
  @js.native
  sealed trait Through extends FloatingObjectTextWrapType
  
  /**
    * The text wraps tightly around the shape.
    */
  @js.native
  sealed trait Tight extends FloatingObjectTextWrapType
  
  /**
    * The text is displayed above and below the shape and does not wrap around the sides.
    */
  @js.native
  sealed trait TopAndBottom extends FloatingObjectTextWrapType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectTextWrapType with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 4 */ @js.native
  object Square extends TopLevel[Square with Double]
  
  /* 3 */ @js.native
  object Through extends TopLevel[Through with Double]
  
  /* 2 */ @js.native
  object Tight extends TopLevel[Tight with Double]
  
  /* 1 */ @js.native
  object TopAndBottom extends TopLevel[TopAndBottom with Double]
  
}

