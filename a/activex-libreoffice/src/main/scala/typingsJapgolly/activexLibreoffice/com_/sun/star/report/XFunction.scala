package typingsJapgolly.activexLibreoffice.com_.sun.star.report

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.Optional
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XChild
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a format condition for a control. */
trait XFunction
  extends StObject
     with XPropertySet
     with XComponent
     with XChild {
  
  /** specifies if sub reports should be traversed as well. */
  var DeepTraversing: Boolean
  
  /** defines the formula of this function */
  var Formula: String
  
  /** defines the formula for the initial value */
  var InitialFormula: Optional[String]
  
  /** defines the name of the function */
  var Name: String
  
  /** specifies if the function should be evaluated before the report element will be executed. */
  var PreEvaluated: Boolean
}
object XFunction {
  
  inline def apply(
    DeepTraversing: Boolean,
    Formula: String,
    InitialFormula: Optional[String],
    Name: String,
    Parent: XInterface,
    PreEvaluated: Boolean,
    PropertySetInfo: XPropertySetInfo,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    dispose: Callback,
    getParent: CallbackTo[XInterface],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setParent: XInterface => Callback,
    setPropertyValue: (String, Any) => Callback
  ): XFunction = {
    val __obj = js.Dynamic.literal(DeepTraversing = DeepTraversing.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], InitialFormula = InitialFormula.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PreEvaluated = PreEvaluated.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), dispose = dispose.toJsFn, getParent = getParent.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[XFunction]
  }
  
  extension [Self <: XFunction](x: Self) {
    
    inline def setDeepTraversing(value: Boolean): Self = StObject.set(x, "DeepTraversing", value.asInstanceOf[js.Any])
    
    inline def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    inline def setInitialFormula(value: Optional[String]): Self = StObject.set(x, "InitialFormula", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPreEvaluated(value: Boolean): Self = StObject.set(x, "PreEvaluated", value.asInstanceOf[js.Any])
  }
}
