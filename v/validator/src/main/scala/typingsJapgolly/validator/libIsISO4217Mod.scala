package typingsJapgolly.validator

import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsISO4217Mod {
  
  @JSImport("validator/lib/isISO4217", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("validator/lib/isISO4217", "CurrencyCodes")
  @js.native
  val CurrencyCodes: Set[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 179, starting with typingsJapgolly.validator.validatorStrings.AED, typingsJapgolly.validator.validatorStrings.AFN, typingsJapgolly.validator.validatorStrings.ALL */ Any
  ] = js.native
}
