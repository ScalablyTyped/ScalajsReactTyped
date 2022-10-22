package typingsJapgolly.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERROR_MESSAGE extends StObject
@JSGlobal("Stronghold.ERROR_MESSAGE")
@js.native
object ERROR_MESSAGE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ERROR_MESSAGE & String] = js.native
  
  @js.native
  sealed trait AMOUNT_BAD_FORMAT
    extends StObject
       with ERROR_MESSAGE
  /* "The 'amount' option was unable to be parsed as number." */ val AMOUNT_BAD_FORMAT: typingsJapgolly.strongholdPayJs.mod.global.Stronghold.ERROR_MESSAGE.AMOUNT_BAD_FORMAT & String = js.native
  
  @js.native
  sealed trait ATTRIBUTE_REQUIRED
    extends StObject
       with ERROR_MESSAGE
  /* "Attribute is required." */ val ATTRIBUTE_REQUIRED: typingsJapgolly.strongholdPayJs.mod.global.Stronghold.ERROR_MESSAGE.ATTRIBUTE_REQUIRED & String = js.native
  
  @js.native
  sealed trait BAD_ENVIRONMENT
    extends StObject
       with ERROR_MESSAGE
  /* "Invalid environment provided. Expect \"live\" or \"sandbox\"." */ val BAD_ENVIRONMENT: typingsJapgolly.strongholdPayJs.mod.global.Stronghold.ERROR_MESSAGE.BAD_ENVIRONMENT & String = js.native
}
