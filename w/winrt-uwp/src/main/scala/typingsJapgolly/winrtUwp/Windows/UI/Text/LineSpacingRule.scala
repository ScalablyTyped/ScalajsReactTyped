package typingsJapgolly.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineSpacingRule extends StObject
/** Specifies options for line-spacing rules. */
@JSGlobal("Windows.UI.Text.LineSpacingRule")
@js.native
object LineSpacingRule extends StObject {
  
  /** The line-spacing value specifies the spacing from one line to the next. However, if the value is less than single spacing, text is single spaced. */
  @js.native
  sealed trait atLeast
    extends StObject
       with LineSpacingRule
  
  /** Double line spacing. The line-spacing value is ignored. */
  @js.native
  sealed trait double
    extends StObject
       with LineSpacingRule
  
  /** The line-spacing value specifies the exact spacing from one line to the next, even if the value is less than single spacing. */
  @js.native
  sealed trait exactly
    extends StObject
       with LineSpacingRule
  
  /** The line-spacing value specifies the line spacing, in lines. */
  @js.native
  sealed trait multiple
    extends StObject
       with LineSpacingRule
  
  /** One-and-a-half line spacing. The line-spacing value is ignored. */
  @js.native
  sealed trait oneAndHalf
    extends StObject
       with LineSpacingRule
  
  /** The line-spacing value specifies the line spacing by percent of line height. */
  @js.native
  sealed trait percent
    extends StObject
       with LineSpacingRule
  
  /** Single space. The line-spacing value is ignored. */
  @js.native
  sealed trait single
    extends StObject
       with LineSpacingRule
  
  /** The line spacing is undefined. */
  @js.native
  sealed trait undefined
    extends StObject
       with LineSpacingRule
}
