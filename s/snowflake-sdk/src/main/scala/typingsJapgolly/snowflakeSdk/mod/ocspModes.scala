package typingsJapgolly.snowflakeSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ocspModes extends StObject
@JSImport("snowflake-sdk", "ocspModes")
@js.native
object ocspModes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ocspModes & String] = js.native
  
  @js.native
  sealed trait FAIL_CLOSED
    extends StObject
       with ocspModes
  /* "FAIL_CLOSED" */ val FAIL_CLOSED: typingsJapgolly.snowflakeSdk.mod.ocspModes.FAIL_CLOSED & String = js.native
  
  @js.native
  sealed trait FAIL_OPEN
    extends StObject
       with ocspModes
  /* "FAIL_OPEN" */ val FAIL_OPEN: typingsJapgolly.snowflakeSdk.mod.ocspModes.FAIL_OPEN & String = js.native
  
  @js.native
  sealed trait INSECURE
    extends StObject
       with ocspModes
  /* "INSECURE" */ val INSECURE: typingsJapgolly.snowflakeSdk.mod.ocspModes.INSECURE & String = js.native
}
