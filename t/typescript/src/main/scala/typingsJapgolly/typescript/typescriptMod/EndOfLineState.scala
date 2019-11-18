package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EndOfLineState extends js.Object

@JSImport("typescript", "EndOfLineState")
@js.native
object EndOfLineState extends js.Object {
  @js.native
  sealed trait InDoubleQuoteStringLiteral extends EndOfLineState
  
  @js.native
  sealed trait InMultiLineCommentTrivia extends EndOfLineState
  
  @js.native
  sealed trait InSingleQuoteStringLiteral extends EndOfLineState
  
  @js.native
  sealed trait InTemplateHeadOrNoSubstitutionTemplate extends EndOfLineState
  
  @js.native
  sealed trait InTemplateMiddleOrTail extends EndOfLineState
  
  @js.native
  sealed trait InTemplateSubstitutionPosition extends EndOfLineState
  
  @js.native
  sealed trait None extends EndOfLineState
  
  /* 3 */ val InDoubleQuoteStringLiteral: typingsJapgolly.typescript.typescriptMod.EndOfLineState.InDoubleQuoteStringLiteral with Double = js.native
  /* 1 */ val InMultiLineCommentTrivia: typingsJapgolly.typescript.typescriptMod.EndOfLineState.InMultiLineCommentTrivia with Double = js.native
  /* 2 */ val InSingleQuoteStringLiteral: typingsJapgolly.typescript.typescriptMod.EndOfLineState.InSingleQuoteStringLiteral with Double = js.native
  /* 4 */ val InTemplateHeadOrNoSubstitutionTemplate: typingsJapgolly.typescript.typescriptMod.EndOfLineState.InTemplateHeadOrNoSubstitutionTemplate with Double = js.native
  /* 5 */ val InTemplateMiddleOrTail: typingsJapgolly.typescript.typescriptMod.EndOfLineState.InTemplateMiddleOrTail with Double = js.native
  /* 6 */ val InTemplateSubstitutionPosition: typingsJapgolly.typescript.typescriptMod.EndOfLineState.InTemplateSubstitutionPosition with Double = js.native
  /* 0 */ val None: typingsJapgolly.typescript.typescriptMod.EndOfLineState.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EndOfLineState with Double] = js.native
}

