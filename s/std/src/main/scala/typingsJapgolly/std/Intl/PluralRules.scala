package typingsJapgolly.std.Intl

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluralRules extends StObject {
  
  /* standard es2018.intl */
  def resolvedOptions(): ResolvedPluralRulesOptions
  
  /* standard es2018.intl */
  def select(n: Double): LDMLPluralRule
}
object PluralRules {
  
  inline def apply(resolvedOptions: CallbackTo[ResolvedPluralRulesOptions], select: Double => LDMLPluralRule): PluralRules = {
    val __obj = js.Dynamic.literal(resolvedOptions = resolvedOptions.toJsFn, select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[PluralRules]
  }
  
  extension [Self <: PluralRules](x: Self) {
    
    inline def setResolvedOptions(value: CallbackTo[ResolvedPluralRulesOptions]): Self = StObject.set(x, "resolvedOptions", value.toJsFn)
    
    inline def setSelect(value: Double => LDMLPluralRule): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
  }
}
