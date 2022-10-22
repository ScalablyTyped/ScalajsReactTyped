package typingsJapgolly.activexLibreoffice.com_.sun.star.report

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XDocumentSubStorageSupplier
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XEventBroadcaster
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XStorageBasedDocument
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XStorageChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XViewDataSupplier
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.VisualRepresentation
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XVisualObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XController
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XLoadable
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.XStyleFamiliesSupplier
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.XUIConfigurationManager
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.XUIConfigurationManagerSupplier
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloneable
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloseListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloseable
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifiable2
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * identifies a {@link XReportComponent} as being a (sub-) report.
  *
  * This interface does not really provide an own functionality, it is only for easier runtime identification of report components.
  *
  * A report fulfills several tasks, like storing the structure of its report components and it provides the event environment for its contained elements.
  * @see XReportComponent
  */
trait XReportDefinition
  extends StObject
     with XModel
     with XLoadable
     with XVisualObject
     with XStorageBasedDocument
     with XViewDataSupplier
     with XCloseable
     with XUIConfigurationManagerSupplier
     with XDocumentSubStorageSupplier
     with XStyleFamiliesSupplier
     with XModifiable2
     with XReportComponent
     with XFunctionsSupplier {
  
  /** specifies the active connection which is used to create the resulting report. */
  var ActiveConnection: XConnection
  
  /** returns a sequence of the currently supported output formats. */
  val AvailableMimeTypes: SafeArray[String]
  
  /** Represents the title of the report in print preview. */
  var Caption: String
  
  /**
    * is the command which should be executed, the type of command depends on the CommandType.
    *
    * In case of a {@link CommandType} of CommandType::COMMAND, means in case the {@link Command} specifies an SQL statement, the inherited {@link
    * com.sun.star.sdbc.RowSet.EscapeProcessing} becomes relevant: ;  It then can be to used to specify whether the SQL statement should be analyzed on the
    * client side before sending it to the database server. ;  The default value for {@link com.sun.star.sdbc.RowSet.EscapeProcessing} is `TRUE` . By
    * switching it to `FALSE` , you can pass backend-specific SQL statements, which are not standard SQL, to your database.
    * @see com.sun.star.sdb.CommandType
    */
  var Command: String
  
  /**
    * specifies the type of the command to be executed to retrieve a result set.
    *
    * {@link Command} needs to be interpreted depending on the value of this property.
    *
    * This property is only meaningful together with the {@link Command} property, thus either **both** or **none** of them are present.
    * @see com.sun.star.sdb.CommandType
    */
  var CommandType: Double
  
  /** is the name of the datasource to use, this could be a named datasource or the URL of a data access component. */
  var DataSourceName: String
  
  /**
    * returns the detail section.
    * @see XSection
    */
  var Detail: XSection
  
  /**
    * specifies if the {@link Command} should be analyzed on the client side before sending it to the database server.
    *
    * The default value of this property is `TRUE` . By switching it to `FALSE` , you can pass backend-specific SQL statements, which are not standard SQL,
    * to your database.
    *
    * This property is usually present together with the {@link Command} and {@link CommandType} properties, and is evaluated if and only if {@link
    * CommandType} equals CommandType::COMMAND.
    */
  var EscapeProcessing: Boolean
  
  /**
    * makes it possible to register listeners which are called whenever a document event occurs. This is a workaround due to the fact that this interface
    * can not be directly inherited from {@link com.sun.star.document.XEventBroadcaster} because the methods addEventListener and removeEventListener are
    * already defined in {@link com.sun.star.lang.XComponent} . A queryInterface call is still supported to the {@link
    * com.sun.star.document.XEventBroadcaster} interface.
    */
  val EventBroadcaster: XEventBroadcaster
  
  /**
    * specifies an additional filter to optionally use.
    *
    * The Filter string has to form a SQL WHERE-clause, **without** the WHERE-string itself.
    *
    * If a {@link DataSourceName} , {@link Command} and {@link CommandType} are specified, a RowSet can be created with this information. If the results
    * provided by the row set are to be additionally filtered, the Filter property can be used.
    *
    * Note that the Filter property does not make sense if a ResultSet has been specified in the DataAccessDescriptor.
    * @see com.sun.star.sdb.RowSet
    * @see ResultSet
    */
  var Filter: String
  
  /**
    * Specifies whether groups in a multi column report are kept together.
    * @see com.sun.star.report.GroupKeepTogether
    */
  var GroupKeepTogether: Double
  
  /** Represents the groups of the report. */
  var Groups: XGroups
  
  /** Represents the output format (media (mime) type) of the resulting document when executing this report. */
  var MimeType: String
  
  /**
    * returns the page footer if the {@link PageFooterOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the report has the page footer disabled.
    */
  var PageFooter: XSection
  
  /** Defines that the page footer is on. Default is `TRUE` . */
  var PageFooterOn: Boolean
  
  /**
    * Represents the location of the page footer.
    * @see ReportPrintOption
    */
  var PageFooterOption: Double
  
  /**
    * returns the page header if the {@link PageHeaderOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the report has the page header disabled.
    */
  var PageHeader: XSection
  
  /** Defines that the page header is on. Default is `TRUE` . */
  var PageHeaderOn: Boolean
  
  /**
    * Represents the location of the page header.
    * @see ReportPrintOption
    */
  var PageHeaderOption: Double
  
  /**
    * returns the report footer if the {@link ReportFooterOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NullPointerException If the report has the report footer disabled.
    */
  var ReportFooter: XSection
  
  /** Defines that the report footer is on. Default is `FALSE` . */
  var ReportFooterOn: Boolean
  
  /**
    * returns the report header if the {@link ReportHeaderOn} is `TRUE` .
    * @see XSection
    * @throws com::sun::star::container::NoSuchElementException If the report has the report header disabled.
    */
  var ReportHeader: XSection
  
  /** Defines that the report header is on. Default is `FALSE` . */
  var ReportHeaderOn: Boolean
  
  /** returns a sequence of the currently supported output formats. */
  def getAvailableMimeTypes(): SafeArray[String]
  
  /**
    * makes it possible to register listeners which are called whenever a document event occurs. This is a workaround due to the fact that this interface
    * can not be directly inherited from {@link com.sun.star.document.XEventBroadcaster} because the methods addEventListener and removeEventListener are
    * already defined in {@link com.sun.star.lang.XComponent} . A queryInterface call is still supported to the {@link
    * com.sun.star.document.XEventBroadcaster} interface.
    */
  def getEventBroadcaster(): XEventBroadcaster
}
object XReportDefinition {
  
  inline def apply(
    ActiveConnection: XConnection,
    Args: SafeArray[PropertyValue],
    AvailableMimeTypes: SafeArray[String],
    Caption: String,
    Command: String,
    CommandType: Double,
    ControlBorder: Double,
    ControlBorderColor: Double,
    CurrentController: XController,
    CurrentSelection: XInterface,
    DataSourceName: String,
    Detail: XSection,
    DetailFields: SafeArray[String],
    DocumentStorage: XStorage,
    DocumentSubStoragesNames: SafeArray[String],
    EscapeProcessing: Boolean,
    EventBroadcaster: XEventBroadcaster,
    Filter: String,
    Functions: XFunctions,
    GroupKeepTogether: Double,
    Groups: XGroups,
    Height: Double,
    MasterFields: SafeArray[String],
    MimeType: String,
    Name: String,
    PageFooter: XSection,
    PageFooterOn: Boolean,
    PageFooterOption: Double,
    PageHeader: XSection,
    PageHeaderOn: Boolean,
    PageHeaderOption: Double,
    Parent: XInterface,
    Position: Point,
    PositionX: Double,
    PositionY: Double,
    PrintRepeatedValues: Boolean,
    PropertySetInfo: XPropertySetInfo,
    ReportFooter: XSection,
    ReportFooterOn: Boolean,
    ReportHeader: XSection,
    ReportHeaderOn: Boolean,
    Section: XSection,
    ShapeType: String,
    Size: Size,
    StyleFamilies: XNameAccess,
    UIConfigurationManager: XUIConfigurationManager,
    URL: String,
    ViewData: XIndexAccess,
    Width: Double,
    acquire: Callback,
    addCloseListener: XCloseListener => Callback,
    addEventListener: XEventListener => Callback,
    addModifyListener: XModifyListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addStorageChangeListener: XStorageChangeListener => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    attachResource: (String, SeqEquiv[PropertyValue]) => Boolean,
    close: Boolean => Callback,
    connectController: XController => Callback,
    createClone: CallbackTo[XCloneable],
    disableSetModified: CallbackTo[Boolean],
    disconnectController: XController => Callback,
    dispose: Callback,
    enableSetModified: CallbackTo[Boolean],
    getArgs: CallbackTo[SafeArray[PropertyValue]],
    getAvailableMimeTypes: CallbackTo[SafeArray[String]],
    getCurrentController: CallbackTo[XController],
    getCurrentSelection: CallbackTo[XInterface],
    getDocumentStorage: CallbackTo[XStorage],
    getDocumentSubStorage: (String, Double) => XStorage,
    getDocumentSubStoragesNames: CallbackTo[SafeArray[String]],
    getEventBroadcaster: CallbackTo[XEventBroadcaster],
    getMapUnit: Double => Double,
    getParent: CallbackTo[XInterface],
    getPosition: CallbackTo[Point],
    getPreferredVisualRepresentation: Double => VisualRepresentation,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getShapeType: CallbackTo[String],
    getSize: CallbackTo[Size],
    getStyleFamilies: CallbackTo[XNameAccess],
    getUIConfigurationManager: CallbackTo[XUIConfigurationManager],
    getURL: CallbackTo[String],
    getViewData: CallbackTo[XIndexAccess],
    getVisualAreaSize: Double => Size,
    hasControllersLocked: CallbackTo[Boolean],
    initNew: Callback,
    isModified: CallbackTo[Boolean],
    isSetModifiedEnabled: CallbackTo[Boolean],
    load: SeqEquiv[PropertyValue] => Callback,
    loadFromStorage: (XStorage, SeqEquiv[PropertyValue]) => Callback,
    lockControllers: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeCloseListener: XCloseListener => Callback,
    removeEventListener: XEventListener => Callback,
    removeModifyListener: XModifyListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeStorageChangeListener: XStorageChangeListener => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setCurrentController: XController => Callback,
    setModified: Boolean => Callback,
    setParent: XInterface => Callback,
    setPosition: Point => Callback,
    setPropertyValue: (String, Any) => Callback,
    setSize: Size => Callback,
    setViewData: XIndexAccess => Callback,
    setVisualAreaSize: (Double, Size) => Callback,
    storeToStorage: (XStorage, SeqEquiv[PropertyValue]) => Callback,
    switchToStorage: XStorage => Callback,
    unlockControllers: Callback
  ): XReportDefinition = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], AvailableMimeTypes = AvailableMimeTypes.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any], CommandType = CommandType.asInstanceOf[js.Any], ControlBorder = ControlBorder.asInstanceOf[js.Any], ControlBorderColor = ControlBorderColor.asInstanceOf[js.Any], CurrentController = CurrentController.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], DataSourceName = DataSourceName.asInstanceOf[js.Any], Detail = Detail.asInstanceOf[js.Any], DetailFields = DetailFields.asInstanceOf[js.Any], DocumentStorage = DocumentStorage.asInstanceOf[js.Any], DocumentSubStoragesNames = DocumentSubStoragesNames.asInstanceOf[js.Any], EscapeProcessing = EscapeProcessing.asInstanceOf[js.Any], EventBroadcaster = EventBroadcaster.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], Functions = Functions.asInstanceOf[js.Any], GroupKeepTogether = GroupKeepTogether.asInstanceOf[js.Any], Groups = Groups.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], MasterFields = MasterFields.asInstanceOf[js.Any], MimeType = MimeType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PageFooter = PageFooter.asInstanceOf[js.Any], PageFooterOn = PageFooterOn.asInstanceOf[js.Any], PageFooterOption = PageFooterOption.asInstanceOf[js.Any], PageHeader = PageHeader.asInstanceOf[js.Any], PageHeaderOn = PageHeaderOn.asInstanceOf[js.Any], PageHeaderOption = PageHeaderOption.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], PrintRepeatedValues = PrintRepeatedValues.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReportFooter = ReportFooter.asInstanceOf[js.Any], ReportFooterOn = ReportFooterOn.asInstanceOf[js.Any], ReportHeader = ReportHeader.asInstanceOf[js.Any], ReportHeaderOn = ReportHeaderOn.asInstanceOf[js.Any], Section = Section.asInstanceOf[js.Any], ShapeType = ShapeType.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], StyleFamilies = StyleFamilies.asInstanceOf[js.Any], UIConfigurationManager = UIConfigurationManager.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = acquire.toJsFn, addCloseListener = js.Any.fromFunction1((t0: XCloseListener) => addCloseListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addStorageChangeListener = js.Any.fromFunction1((t0: XStorageChangeListener) => addStorageChangeListener(t0).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), attachResource = js.Any.fromFunction2(attachResource), close = js.Any.fromFunction1((t0: Boolean) => close(t0).runNow()), connectController = js.Any.fromFunction1((t0: XController) => connectController(t0).runNow()), createClone = createClone.toJsFn, disableSetModified = disableSetModified.toJsFn, disconnectController = js.Any.fromFunction1((t0: XController) => disconnectController(t0).runNow()), dispose = dispose.toJsFn, enableSetModified = enableSetModified.toJsFn, getArgs = getArgs.toJsFn, getAvailableMimeTypes = getAvailableMimeTypes.toJsFn, getCurrentController = getCurrentController.toJsFn, getCurrentSelection = getCurrentSelection.toJsFn, getDocumentStorage = getDocumentStorage.toJsFn, getDocumentSubStorage = js.Any.fromFunction2(getDocumentSubStorage), getDocumentSubStoragesNames = getDocumentSubStoragesNames.toJsFn, getEventBroadcaster = getEventBroadcaster.toJsFn, getMapUnit = js.Any.fromFunction1(getMapUnit), getParent = getParent.toJsFn, getPosition = getPosition.toJsFn, getPreferredVisualRepresentation = js.Any.fromFunction1(getPreferredVisualRepresentation), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getShapeType = getShapeType.toJsFn, getSize = getSize.toJsFn, getStyleFamilies = getStyleFamilies.toJsFn, getUIConfigurationManager = getUIConfigurationManager.toJsFn, getURL = getURL.toJsFn, getViewData = getViewData.toJsFn, getVisualAreaSize = js.Any.fromFunction1(getVisualAreaSize), hasControllersLocked = hasControllersLocked.toJsFn, initNew = initNew.toJsFn, isModified = isModified.toJsFn, isSetModifiedEnabled = isSetModifiedEnabled.toJsFn, load = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => load(t0).runNow()), loadFromStorage = js.Any.fromFunction2((t0: XStorage, t1: SeqEquiv[PropertyValue]) => (loadFromStorage(t0, t1)).runNow()), lockControllers = lockControllers.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeCloseListener = js.Any.fromFunction1((t0: XCloseListener) => removeCloseListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeStorageChangeListener = js.Any.fromFunction1((t0: XStorageChangeListener) => removeStorageChangeListener(t0).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setCurrentController = js.Any.fromFunction1((t0: XController) => setCurrentController(t0).runNow()), setModified = js.Any.fromFunction1((t0: Boolean) => setModified(t0).runNow()), setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()), setPosition = js.Any.fromFunction1((t0: Point) => setPosition(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setSize = js.Any.fromFunction1((t0: Size) => setSize(t0).runNow()), setViewData = js.Any.fromFunction1((t0: XIndexAccess) => setViewData(t0).runNow()), setVisualAreaSize = js.Any.fromFunction2((t0: Double, t1: Size) => (setVisualAreaSize(t0, t1)).runNow()), storeToStorage = js.Any.fromFunction2((t0: XStorage, t1: SeqEquiv[PropertyValue]) => (storeToStorage(t0, t1)).runNow()), switchToStorage = js.Any.fromFunction1((t0: XStorage) => switchToStorage(t0).runNow()), unlockControllers = unlockControllers.toJsFn)
    __obj.asInstanceOf[XReportDefinition]
  }
  
  extension [Self <: XReportDefinition](x: Self) {
    
    inline def setActiveConnection(value: XConnection): Self = StObject.set(x, "ActiveConnection", value.asInstanceOf[js.Any])
    
    inline def setAvailableMimeTypes(value: SafeArray[String]): Self = StObject.set(x, "AvailableMimeTypes", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: String): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setCommandType(value: Double): Self = StObject.set(x, "CommandType", value.asInstanceOf[js.Any])
    
    inline def setDataSourceName(value: String): Self = StObject.set(x, "DataSourceName", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: XSection): Self = StObject.set(x, "Detail", value.asInstanceOf[js.Any])
    
    inline def setEscapeProcessing(value: Boolean): Self = StObject.set(x, "EscapeProcessing", value.asInstanceOf[js.Any])
    
    inline def setEventBroadcaster(value: XEventBroadcaster): Self = StObject.set(x, "EventBroadcaster", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setGetAvailableMimeTypes(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getAvailableMimeTypes", value.toJsFn)
    
    inline def setGetEventBroadcaster(value: CallbackTo[XEventBroadcaster]): Self = StObject.set(x, "getEventBroadcaster", value.toJsFn)
    
    inline def setGroupKeepTogether(value: Double): Self = StObject.set(x, "GroupKeepTogether", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: XGroups): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "MimeType", value.asInstanceOf[js.Any])
    
    inline def setPageFooter(value: XSection): Self = StObject.set(x, "PageFooter", value.asInstanceOf[js.Any])
    
    inline def setPageFooterOn(value: Boolean): Self = StObject.set(x, "PageFooterOn", value.asInstanceOf[js.Any])
    
    inline def setPageFooterOption(value: Double): Self = StObject.set(x, "PageFooterOption", value.asInstanceOf[js.Any])
    
    inline def setPageHeader(value: XSection): Self = StObject.set(x, "PageHeader", value.asInstanceOf[js.Any])
    
    inline def setPageHeaderOn(value: Boolean): Self = StObject.set(x, "PageHeaderOn", value.asInstanceOf[js.Any])
    
    inline def setPageHeaderOption(value: Double): Self = StObject.set(x, "PageHeaderOption", value.asInstanceOf[js.Any])
    
    inline def setReportFooter(value: XSection): Self = StObject.set(x, "ReportFooter", value.asInstanceOf[js.Any])
    
    inline def setReportFooterOn(value: Boolean): Self = StObject.set(x, "ReportFooterOn", value.asInstanceOf[js.Any])
    
    inline def setReportHeader(value: XSection): Self = StObject.set(x, "ReportHeader", value.asInstanceOf[js.Any])
    
    inline def setReportHeaderOn(value: Boolean): Self = StObject.set(x, "ReportHeaderOn", value.asInstanceOf[js.Any])
  }
}
