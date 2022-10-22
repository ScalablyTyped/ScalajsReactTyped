package typingsJapgolly.hyperformula.typingsCellMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorType extends StObject
@JSImport("hyperformula/typings/Cell", "ErrorType")
@js.native
object ErrorType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorType & String] = js.native
  
  /** Cyclic dependency. */
  @js.native
  sealed trait CYCLE
    extends StObject
       with ErrorType
  /* "CYCLE" */ val CYCLE: typingsJapgolly.hyperformula.typingsCellMod.ErrorType.CYCLE & String = js.native
  
  /** Division by zero. */
  @js.native
  sealed trait DIV_BY_ZERO
    extends StObject
       with ErrorType
  /* "DIV_BY_ZERO" */ val DIV_BY_ZERO: typingsJapgolly.hyperformula.typingsCellMod.ErrorType.DIV_BY_ZERO & String = js.native
  
  /** Generic error */
  @js.native
  sealed trait ERROR
    extends StObject
       with ErrorType
  /* "ERROR" */ val ERROR: typingsJapgolly.hyperformula.typingsCellMod.ErrorType.ERROR & String = js.native
  
  /** Invalid/missing licence error. */
  @js.native
  sealed trait LIC
    extends StObject
       with ErrorType
  /* "LIC" */ val LIC: typingsJapgolly.hyperformula.typingsCellMod.ErrorType.LIC & String = js.native
  
  @js.native
  sealed trait NA
    extends StObject
       with ErrorType
  /* "NA" */ val NA: typingsJapgolly.hyperformula.typingsCellMod.ErrorType.NA & String = js.native
  
  /** Unknown function name. */
  @js.native
  sealed trait NAME
    extends StObject
       with ErrorType
  /* "NAME" */ val NAME: typingsJapgolly.hyperformula.typingsCellMod.ErrorType.NAME & String = js.native
  
  @js.native
  sealed trait NUM
    extends StObject
       with ErrorType
  /* "NUM" */ val NUM: typingsJapgolly.hyperformula.typingsCellMod.ErrorType.NUM & String = js.native
  
  /** Wrong address reference. */
  @js.native
  sealed trait REF
    extends StObject
       with ErrorType
  /* "REF" */ val REF: typingsJapgolly.hyperformula.typingsCellMod.ErrorType.REF & String = js.native
  
  /** Array spill error. */
  @js.native
  sealed trait SPILL
    extends StObject
       with ErrorType
  /* "SPILL" */ val SPILL: typingsJapgolly.hyperformula.typingsCellMod.ErrorType.SPILL & String = js.native
  
  @js.native
  sealed trait VALUE
    extends StObject
       with ErrorType
  /* "VALUE" */ val VALUE: typingsJapgolly.hyperformula.typingsCellMod.ErrorType.VALUE & String = js.native
}
