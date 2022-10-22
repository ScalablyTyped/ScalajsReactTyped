package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a scenario in a spreadsheet document. */
trait Scenario
  extends StObject
     with XScenario
     with XScenarioEnhanced
     with XPropertySet
     with XNamed {
  
  /** specifies the color of the border of the scenario. */
  var BorderColor: Double
  
  /** specifies if the data should be copied back into the scenario. */
  var CopyBack: Boolean
  
  /** specifies if the formulas are copied or only the results. */
  var CopyFormulas: Boolean
  
  /** specifies if the styles are copied. */
  var CopyStyles: Boolean
  
  /** specifies if the scenario is active. */
  var IsActive: Boolean
  
  /** specifies if the scenario prints a border. */
  var PrintBorder: Boolean
  
  /** specifies if the scenario is protected. */
  var Protected: Boolean
  
  /** specifies if the scenario shows a border. */
  var ShowBorder: Boolean
}
object Scenario {
  
  inline def apply(
    BorderColor: Double,
    CopyBack: Boolean,
    CopyFormulas: Boolean,
    CopyStyles: Boolean,
    IsActive: Boolean,
    IsScenario: Boolean,
    Name: String,
    PrintBorder: Boolean,
    PropertySetInfo: XPropertySetInfo,
    Protected: Boolean,
    Ranges: SafeArray[CellRangeAddress],
    ScenarioComment: String,
    ShowBorder: Boolean,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addRanges: SeqEquiv[CellRangeAddress] => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    apply: Callback,
    getIsScenario: CallbackTo[Boolean],
    getName: CallbackTo[String],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getRanges: CallbackTo[SafeArray[CellRangeAddress]],
    getScenarioComment: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setName: String => Callback,
    setPropertyValue: (String, Any) => Callback,
    setScenarioComment: String => Callback
  ): Scenario = {
    val __obj = js.Dynamic.literal(BorderColor = BorderColor.asInstanceOf[js.Any], CopyBack = CopyBack.asInstanceOf[js.Any], CopyFormulas = CopyFormulas.asInstanceOf[js.Any], CopyStyles = CopyStyles.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], IsScenario = IsScenario.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PrintBorder = PrintBorder.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Protected = Protected.asInstanceOf[js.Any], Ranges = Ranges.asInstanceOf[js.Any], ScenarioComment = ScenarioComment.asInstanceOf[js.Any], ShowBorder = ShowBorder.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addRanges = js.Any.fromFunction1((t0: SeqEquiv[CellRangeAddress]) => addRanges(t0).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), apply = apply.toJsFn, getIsScenario = getIsScenario.toJsFn, getName = getName.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRanges = getRanges.toJsFn, getScenarioComment = getScenarioComment.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setScenarioComment = js.Any.fromFunction1((t0: String) => setScenarioComment(t0).runNow()))
    __obj.asInstanceOf[Scenario]
  }
  
  extension [Self <: Scenario](x: Self) {
    
    inline def setBorderColor(value: Double): Self = StObject.set(x, "BorderColor", value.asInstanceOf[js.Any])
    
    inline def setCopyBack(value: Boolean): Self = StObject.set(x, "CopyBack", value.asInstanceOf[js.Any])
    
    inline def setCopyFormulas(value: Boolean): Self = StObject.set(x, "CopyFormulas", value.asInstanceOf[js.Any])
    
    inline def setCopyStyles(value: Boolean): Self = StObject.set(x, "CopyStyles", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "IsActive", value.asInstanceOf[js.Any])
    
    inline def setPrintBorder(value: Boolean): Self = StObject.set(x, "PrintBorder", value.asInstanceOf[js.Any])
    
    inline def setProtected(value: Boolean): Self = StObject.set(x, "Protected", value.asInstanceOf[js.Any])
    
    inline def setShowBorder(value: Boolean): Self = StObject.set(x, "ShowBorder", value.asInstanceOf[js.Any])
  }
}
