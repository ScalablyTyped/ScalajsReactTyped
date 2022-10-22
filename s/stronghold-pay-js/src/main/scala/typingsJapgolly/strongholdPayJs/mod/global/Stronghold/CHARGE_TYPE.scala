package typingsJapgolly.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CHARGE_TYPE extends StObject
@JSGlobal("Stronghold.CHARGE_TYPE")
@js.native
object CHARGE_TYPE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CHARGE_TYPE & String] = js.native
  
  @js.native
  sealed trait BANK_DEBIT
    extends StObject
       with CHARGE_TYPE
  /* "bank_debit" */ val BANK_DEBIT: typingsJapgolly.strongholdPayJs.mod.global.Stronghold.CHARGE_TYPE.BANK_DEBIT & String = js.native
  
  @js.native
  sealed trait BANK_DEBIT_CUSTOMER_NOT_PRESENT
    extends StObject
       with CHARGE_TYPE
  /* "bank_debit_cnp" */ val BANK_DEBIT_CUSTOMER_NOT_PRESENT: typingsJapgolly.strongholdPayJs.mod.global.Stronghold.CHARGE_TYPE.BANK_DEBIT_CUSTOMER_NOT_PRESENT & String = js.native
}
