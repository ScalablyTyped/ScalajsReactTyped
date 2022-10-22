package typingsJapgolly.hyperformula.typingsParserAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParsingErrorType extends StObject
@JSImport("hyperformula/typings/parser/Ast", "ParsingErrorType")
@js.native
object ParsingErrorType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ParsingErrorType & String] = js.native
  
  @js.native
  sealed trait LexingError
    extends StObject
       with ParsingErrorType
  /* "LexingError" */ val LexingError: typingsJapgolly.hyperformula.typingsParserAstMod.ParsingErrorType.LexingError & String = js.native
  
  @js.native
  sealed trait ParserError
    extends StObject
       with ParsingErrorType
  /* "ParsingError" */ val ParserError: typingsJapgolly.hyperformula.typingsParserAstMod.ParsingErrorType.ParserError & String = js.native
  
  @js.native
  sealed trait RangeOffsetNotAllowed
    extends StObject
       with ParsingErrorType
  /* "RangeOffsetNotAllowed" */ val RangeOffsetNotAllowed: typingsJapgolly.hyperformula.typingsParserAstMod.ParsingErrorType.RangeOffsetNotAllowed & String = js.native
  
  @js.native
  sealed trait StaticOffsetError
    extends StObject
       with ParsingErrorType
  /* "StaticOffsetError" */ val StaticOffsetError: typingsJapgolly.hyperformula.typingsParserAstMod.ParsingErrorType.StaticOffsetError & String = js.native
  
  @js.native
  sealed trait StaticOffsetOutOfRangeError
    extends StObject
       with ParsingErrorType
  /* "StaticOffsetOutOfRangeError" */ val StaticOffsetOutOfRangeError: typingsJapgolly.hyperformula.typingsParserAstMod.ParsingErrorType.StaticOffsetOutOfRangeError & String = js.native
}
