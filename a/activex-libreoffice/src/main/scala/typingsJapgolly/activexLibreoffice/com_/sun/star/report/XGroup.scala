package typingsJapgolly.activexLibreoffice.com_.sun.star.report

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
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

/**
  * identifies a {@link XGroup} . A group is always a child of the groups collection in the report.
  * @see XReportDefinition
  * @see XGroups
  */
trait XGroup
  extends StObject
     with XChild
     with XPropertySet
     with XComponent
     with XFunctionsSupplier {
  
  /** Defines either a column name or an expression. */
  var Expression: String
  
  /**
    * returns the group footer.
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the group has the footer disabled.
    */
  var Footer: XSection
  
  /** Defines if a group has a footer. */
  var FooterOn: Boolean
  
  /** Defines an interval value that rows are grouped by. */
  var GroupInterval: Double
  
  /**
    * Specifies how to group data.
    * @see GroupOn
    */
  var GroupOn: Double
  
  /**
    * Specifies the parent of the group.
    * @see XChild
    */
  var Groups: XGroups
  
  /**
    * returns the group header.
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the group has the header disabled.
    */
  var Header: XSection
  
  /** Defines if a group has a header. */
  var HeaderOn: Boolean
  
  /**
    * Specifies if a group header, detail, and footer section is printed on the same page.
    * @see KeepTogether
    */
  var KeepTogether: Double
  
  /** Specifies that the group header should always be printed on a new page and the reset of the page number to zero. */
  var ResetPageNumber: Boolean
  
  /** Defines if the group is sorted ascending or descending. The default is `TRUE` . */
  var SortAscending: Boolean
  
  /** Specifies that the group header should always be printed on a new column. */
  var StartNewColumn: Boolean
}
object XGroup {
  
  inline def apply(
    Expression: String,
    Footer: XSection,
    FooterOn: Boolean,
    Functions: XFunctions,
    GroupInterval: Double,
    GroupOn: Double,
    Groups: XGroups,
    Header: XSection,
    HeaderOn: Boolean,
    KeepTogether: Double,
    Parent: XInterface,
    PropertySetInfo: XPropertySetInfo,
    ResetPageNumber: Boolean,
    SortAscending: Boolean,
    StartNewColumn: Boolean,
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
  ): XGroup = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], Footer = Footer.asInstanceOf[js.Any], FooterOn = FooterOn.asInstanceOf[js.Any], Functions = Functions.asInstanceOf[js.Any], GroupInterval = GroupInterval.asInstanceOf[js.Any], GroupOn = GroupOn.asInstanceOf[js.Any], Groups = Groups.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], HeaderOn = HeaderOn.asInstanceOf[js.Any], KeepTogether = KeepTogether.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ResetPageNumber = ResetPageNumber.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any], StartNewColumn = StartNewColumn.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), dispose = dispose.toJsFn, getParent = getParent.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[XGroup]
  }
  
  extension [Self <: XGroup](x: Self) {
    
    inline def setExpression(value: String): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setFooter(value: XSection): Self = StObject.set(x, "Footer", value.asInstanceOf[js.Any])
    
    inline def setFooterOn(value: Boolean): Self = StObject.set(x, "FooterOn", value.asInstanceOf[js.Any])
    
    inline def setGroupInterval(value: Double): Self = StObject.set(x, "GroupInterval", value.asInstanceOf[js.Any])
    
    inline def setGroupOn(value: Double): Self = StObject.set(x, "GroupOn", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: XGroups): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: XSection): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setHeaderOn(value: Boolean): Self = StObject.set(x, "HeaderOn", value.asInstanceOf[js.Any])
    
    inline def setKeepTogether(value: Double): Self = StObject.set(x, "KeepTogether", value.asInstanceOf[js.Any])
    
    inline def setResetPageNumber(value: Boolean): Self = StObject.set(x, "ResetPageNumber", value.asInstanceOf[js.Any])
    
    inline def setSortAscending(value: Boolean): Self = StObject.set(x, "SortAscending", value.asInstanceOf[js.Any])
    
    inline def setStartNewColumn(value: Boolean): Self = StObject.set(x, "StartNewColumn", value.asInstanceOf[js.Any])
  }
}
