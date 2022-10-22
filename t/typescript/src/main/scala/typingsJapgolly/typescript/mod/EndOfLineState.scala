package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EndOfLineState extends StObject
@JSImport("typescript", "EndOfLineState")
@js.native
object EndOfLineState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EndOfLineState & Double] = js.native
  
  @js.native
  sealed trait InDoubleQuoteStringLiteral
    extends StObject
       with EndOfLineState
  /* 3 */ val InDoubleQuoteStringLiteral: typingsJapgolly.typescript.mod.EndOfLineState.InDoubleQuoteStringLiteral & Double = js.native
  
  @js.native
  sealed trait InMultiLineCommentTrivia
    extends StObject
       with EndOfLineState
  /* 1 */ val InMultiLineCommentTrivia: typingsJapgolly.typescript.mod.EndOfLineState.InMultiLineCommentTrivia & Double = js.native
  
  @js.native
  sealed trait InSingleQuoteStringLiteral
    extends StObject
       with EndOfLineState
  /* 2 */ val InSingleQuoteStringLiteral: typingsJapgolly.typescript.mod.EndOfLineState.InSingleQuoteStringLiteral & Double = js.native
  
  @js.native
  sealed trait InTemplateHeadOrNoSubstitutionTemplate
    extends StObject
       with EndOfLineState
  /* 4 */ val InTemplateHeadOrNoSubstitutionTemplate: typingsJapgolly.typescript.mod.EndOfLineState.InTemplateHeadOrNoSubstitutionTemplate & Double = js.native
  
  @js.native
  sealed trait InTemplateMiddleOrTail
    extends StObject
       with EndOfLineState
  /* 5 */ val InTemplateMiddleOrTail: typingsJapgolly.typescript.mod.EndOfLineState.InTemplateMiddleOrTail & Double = js.native
  
  @js.native
  sealed trait InTemplateSubstitutionPosition
    extends StObject
       with EndOfLineState
  /* 6 */ val InTemplateSubstitutionPosition: typingsJapgolly.typescript.mod.EndOfLineState.InTemplateSubstitutionPosition & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EndOfLineState
  /* 0 */ val None: typingsJapgolly.typescript.mod.EndOfLineState.None & Double = js.native
}
