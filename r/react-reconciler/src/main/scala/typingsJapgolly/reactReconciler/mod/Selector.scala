package typingsJapgolly.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactReconciler.mod.ComponentSelector
  - typingsJapgolly.reactReconciler.mod.HasPseudoClassSelector
  - typingsJapgolly.reactReconciler.mod.RoleSelector
  - typingsJapgolly.reactReconciler.mod.TextSelector
  - typingsJapgolly.reactReconciler.mod.TestNameSelector
*/
trait Selector extends StObject
object Selector {
  
  inline def ComponentSelector(DollarDollartypeof: js.Symbol | Double, value: ReactAbstractComponent[scala.Nothing, Any]): typingsJapgolly.reactReconciler.mod.ComponentSelector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactReconciler.mod.ComponentSelector]
  }
  
  inline def HasPseudoClassSelector(DollarDollartypeof: js.Symbol | Double, value: js.Array[Selector]): typingsJapgolly.reactReconciler.mod.HasPseudoClassSelector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactReconciler.mod.HasPseudoClassSelector]
  }
  
  inline def RoleSelector(DollarDollartypeof: js.Symbol | Double, value: String): typingsJapgolly.reactReconciler.mod.RoleSelector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactReconciler.mod.RoleSelector]
  }
  
  inline def TestNameSelector(DollarDollartypeof: js.Symbol | Double, value: String): typingsJapgolly.reactReconciler.mod.TestNameSelector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactReconciler.mod.TestNameSelector]
  }
  
  inline def TextSelector(DollarDollartypeof: js.Symbol | Double, value: String): typingsJapgolly.reactReconciler.mod.TextSelector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactReconciler.mod.TextSelector]
  }
}
