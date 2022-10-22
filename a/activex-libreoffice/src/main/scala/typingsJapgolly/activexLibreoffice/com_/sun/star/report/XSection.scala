package typingsJapgolly.activexLibreoffice.com_.sun.star.report

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XChild
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainerListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShapes
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * identifies a {@link XSection} inside a report.
  *
  * A section acts like a container of report components. This generic construction allows the definition of hierarchies of reports and their dependent
  * subreports.
  * @see XReportDefinition
  * @see XGroup
  */
trait XSection
  extends StObject
     with XChild
     with XContainer
     with XShapes
     with XEnumerationAccess
     with XPropertySet
     with XComponent {
  
  /** Defines the back ground color of the section. */
  var BackColor: Color
  
  /** determines if the back ground color is set to transparent. */
  var BackTransparent: Boolean
  
  /**
    * Specifies that elements with dynamic state will be expanded vertically when then content of the element is larger than it's container. If this
    * property is disabled the content will be truncated when its size is larger than the container.
    */
  var CanGrow: Boolean
  
  /** Represents ... */
  var CanShrink: Boolean
  
  /**
    * Defines the expression which is executed before printing the section. If the return value of the expression is `TRUE` then the section will be
    * printed.
    */
  var ConditionalPrintExpression: String
  
  /**
    * Specifies whether the section is printed on a separate page.
    *
    * Not valid for page header or page footer.
    * @see ForceNewPage
    */
  var ForceNewPage: Double
  
  /** Specifies the parent of the section if it is a group header or group footer. */
  var Group: XGroup
  
  /** Defines the height of the section. */
  var Height: Double
  
  /**
    * Specifies that the section is printed on one page.
    *
    * Not valid for page header or page footer.
    */
  var KeepTogether: Boolean
  
  /** Defines the name of the section. */
  var Name: String
  
  /**
    * Specifies whether the section is printed in a new row or column within a multi column report.
    *
    * Not valid for page header or page footer.
    * @see ForceNewPage
    */
  var NewRowOrCol: Double
  
  /** Defines that the group header should be repeated on the next page when a group spans more than one page. It only applies to group headers. */
  var RepeatSection: Boolean
  
  /** Specifies the parent of the section if it is a page header or page footer. */
  var ReportDefinition: XReportDefinition
  
  /** Defines if the section should be visible in report. */
  var Visible: Boolean
}
object XSection {
  
  inline def apply(
    BackColor: Color,
    BackTransparent: Boolean,
    CanGrow: Boolean,
    CanShrink: Boolean,
    ConditionalPrintExpression: String,
    Count: Double,
    ElementType: `type`,
    ForceNewPage: Double,
    Group: XGroup,
    Height: Double,
    KeepTogether: Boolean,
    Name: String,
    NewRowOrCol: Double,
    Parent: XInterface,
    PropertySetInfo: XPropertySetInfo,
    RepeatSection: Boolean,
    ReportDefinition: XReportDefinition,
    Visible: Boolean,
    acquire: Callback,
    add: typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape => Callback,
    addContainerListener: XContainerListener => Callback,
    addEventListener: XEventListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    createEnumeration: CallbackTo[XEnumeration],
    dispose: Callback,
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    getParent: CallbackTo[XInterface],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    remove: typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape => Callback,
    removeContainerListener: XContainerListener => Callback,
    removeEventListener: XEventListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setParent: XInterface => Callback,
    setPropertyValue: (String, Any) => Callback
  ): XSection = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], CanGrow = CanGrow.asInstanceOf[js.Any], CanShrink = CanShrink.asInstanceOf[js.Any], ConditionalPrintExpression = ConditionalPrintExpression.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], ForceNewPage = ForceNewPage.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], KeepTogether = KeepTogether.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NewRowOrCol = NewRowOrCol.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RepeatSection = RepeatSection.asInstanceOf[js.Any], ReportDefinition = ReportDefinition.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], acquire = acquire.toJsFn, add = js.Any.fromFunction1((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape) => add(t0).runNow()), addContainerListener = js.Any.fromFunction1((t0: XContainerListener) => addContainerListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), createEnumeration = createEnumeration.toJsFn, dispose = dispose.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, getParent = getParent.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remove = js.Any.fromFunction1((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape) => remove(t0).runNow()), removeContainerListener = js.Any.fromFunction1((t0: XContainerListener) => removeContainerListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[XSection]
  }
  
  extension [Self <: XSection](x: Self) {
    
    inline def setBackColor(value: Color): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    inline def setBackTransparent(value: Boolean): Self = StObject.set(x, "BackTransparent", value.asInstanceOf[js.Any])
    
    inline def setCanGrow(value: Boolean): Self = StObject.set(x, "CanGrow", value.asInstanceOf[js.Any])
    
    inline def setCanShrink(value: Boolean): Self = StObject.set(x, "CanShrink", value.asInstanceOf[js.Any])
    
    inline def setConditionalPrintExpression(value: String): Self = StObject.set(x, "ConditionalPrintExpression", value.asInstanceOf[js.Any])
    
    inline def setForceNewPage(value: Double): Self = StObject.set(x, "ForceNewPage", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: XGroup): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setKeepTogether(value: Boolean): Self = StObject.set(x, "KeepTogether", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNewRowOrCol(value: Double): Self = StObject.set(x, "NewRowOrCol", value.asInstanceOf[js.Any])
    
    inline def setRepeatSection(value: Boolean): Self = StObject.set(x, "RepeatSection", value.asInstanceOf[js.Any])
    
    inline def setReportDefinition(value: XReportDefinition): Self = StObject.set(x, "ReportDefinition", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
