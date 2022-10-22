package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdb.DataAccessDescriptor
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XResultSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XJob
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCancellable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gives access to mail merge functionality.
  * @since OOo 1.1.2
  */
trait MailMerge
  extends StObject
     with XJob
     with XCancellable
     with XPropertySet
     with XMailMergeBroadcaster
     with DataAccessDescriptor {
  
  /**
    * contains the name of the data base column that contains the e-Mail address to the e-Mail to.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var AddressFromColumn: String
  
  /**
    * contains the name of the document filter to save the attached mail merge document. This property is only valid if "SendAsAttachment" is set to `TRUE`
    * .
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var AttachmentFilter: String
  
  /**
    * contains the name of the attachment. This property is only valid if "SendAsAttachment" is set to `TRUE` .
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var AttachmentName: String
  
  /**
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var BlindCopiesTo: SafeArray[String]
  
  /**
    * contains a list of e-Mail addresses to
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var CopiesTo: SafeArray[String]
  
  /**
    * contains the URL of a text document that is to be processed.
    *
    * If this property is not set an empty document is created.
    */
  var DocumentURL: String
  
  /**
    * determines whether file names of created files are generated using the content of a database column.
    *
    * This property is only evaluated for file output.
    */
  var FileNameFromColumn: Boolean
  
  /**
    * contains the name of the column to generate the output file names.
    *
    * If FileNameFromColumn is true the content of the related column is added to the OutputURL.
    *
    * If "OutputURL" or "FileNamePrefix" are empty the missing value is generated from the location or title of the source documents.
    *
    * This property is only evaluated for file output.
    */
  var FileNamePrefix: String
  
  /**
    * Contains the password of the incoming mail server. It is necessary to set this if the mail server configuration is set to "SMTP after POP"
    * authentication and the password is not already stored in the configuration for security reasons.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var InServerPassword: String
  
  /**
    * contains the text of the mail body. This property is only valid if the property "SendAsAttachment" is set to `TRUE`
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var MailBody: String
  
  /**
    * provides access to the model of the document to be processed.
    *
    * This property will automatically be set to the documents model if a document URL was set.
    */
  var Model: XModel
  
  /**
    * Contains the password of the outgoing mail server. It is necessary to set this if the password is not already stored in the configuration for security
    * reasons.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var OutServerPassword: String
  
  /**
    * determines the destination of the mail merge action.
    * @see com.sun.star.text.MailMergeType
    */
  var OutputType: Double
  
  /**
    * contains the path where generated files are created.
    *
    * If "OutputURL" or "FileNamePrefix" are empty the missing value is generated from the location or title of the source documents.
    *
    * This property is only evaluated for file output.
    */
  var OutputURL: String
  
  /**
    * contains the properties that are defined in < {@link com.sun.star.view.PrintOptions} >.
    *
    * This property is only evaluated for printer output.
    * @since OOo 2.0
    */
  var PrintOptions: SafeArray[PropertyValue]
  
  /**
    * determines that the output of the mail merge is save in one single file.
    *
    * This property is only evaluated for file output.
    * @since OOo 2.0
    */
  var SaveAsSingleFile: Boolean
  
  /**
    * contains the name of the document filter to save the output file(s).
    *
    * This property is only evaluated for file output.
    * @since OOo 2.0
    */
  var SaveFilter: String
  
  /**
    * determines that the created mail merge document is sent as attachment.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var SendAsAttachment: Boolean
  
  /**
    * determines that the created mail merge document is sent as body in HTML format. This property is only valid if the property "SendAsAttachment" is set
    * to `FALSE` .
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var SendAsHTML: Boolean
  
  /**
    * determines whether single print jobs will be generated per output document.
    *
    * This property is only evaluated for printer output.
    */
  var SinglePrintJobs: Boolean
  
  /**
    * contains the subject of the e-Mail message.
    *
    * This property is only evaluated for e-Mail output.
    * @since OOo 2.0
    */
  var Subject: String
}
object MailMerge {
  
  inline def apply(
    ActiveConnection: XConnection,
    AddressFromColumn: String,
    AttachmentFilter: String,
    AttachmentName: String,
    BlindCopiesTo: SafeArray[String],
    BookmarkSelection: Boolean,
    Column: XPropertySet,
    ColumnName: String,
    Command: String,
    CommandType: Double,
    ConnectionInfo: SafeArray[PropertyValue],
    ConnectionResource: String,
    CopiesTo: SafeArray[String],
    DataSourceName: String,
    DatabaseLocation: String,
    DocumentURL: String,
    EscapeProcessing: Boolean,
    FileNameFromColumn: Boolean,
    FileNamePrefix: String,
    Filter: String,
    GroupBy: String,
    HavingClause: String,
    InServerPassword: String,
    MailBody: String,
    Model: XModel,
    Order: String,
    OutServerPassword: String,
    OutputType: Double,
    OutputURL: String,
    PrintOptions: SafeArray[PropertyValue],
    PropertySetInfo: XPropertySetInfo,
    ResultSet: XResultSet,
    SaveAsSingleFile: Boolean,
    SaveFilter: String,
    Selection: SafeArray[Any],
    SendAsAttachment: Boolean,
    SendAsHTML: Boolean,
    SinglePrintJobs: Boolean,
    Subject: String,
    acquire: Callback,
    addMailMergeEventListener: XMailMergeListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    cancel: Callback,
    execute: SeqEquiv[NamedValue] => Any,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: Callback,
    removeMailMergeEventListener: XMailMergeListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback
  ): MailMerge = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], AddressFromColumn = AddressFromColumn.asInstanceOf[js.Any], AttachmentFilter = AttachmentFilter.asInstanceOf[js.Any], AttachmentName = AttachmentName.asInstanceOf[js.Any], BlindCopiesTo = BlindCopiesTo.asInstanceOf[js.Any], BookmarkSelection = BookmarkSelection.asInstanceOf[js.Any], Column = Column.asInstanceOf[js.Any], ColumnName = ColumnName.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any], CommandType = CommandType.asInstanceOf[js.Any], ConnectionInfo = ConnectionInfo.asInstanceOf[js.Any], ConnectionResource = ConnectionResource.asInstanceOf[js.Any], CopiesTo = CopiesTo.asInstanceOf[js.Any], DataSourceName = DataSourceName.asInstanceOf[js.Any], DatabaseLocation = DatabaseLocation.asInstanceOf[js.Any], DocumentURL = DocumentURL.asInstanceOf[js.Any], EscapeProcessing = EscapeProcessing.asInstanceOf[js.Any], FileNameFromColumn = FileNameFromColumn.asInstanceOf[js.Any], FileNamePrefix = FileNamePrefix.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], GroupBy = GroupBy.asInstanceOf[js.Any], HavingClause = HavingClause.asInstanceOf[js.Any], InServerPassword = InServerPassword.asInstanceOf[js.Any], MailBody = MailBody.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Order = Order.asInstanceOf[js.Any], OutServerPassword = OutServerPassword.asInstanceOf[js.Any], OutputType = OutputType.asInstanceOf[js.Any], OutputURL = OutputURL.asInstanceOf[js.Any], PrintOptions = PrintOptions.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ResultSet = ResultSet.asInstanceOf[js.Any], SaveAsSingleFile = SaveAsSingleFile.asInstanceOf[js.Any], SaveFilter = SaveFilter.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], SendAsAttachment = SendAsAttachment.asInstanceOf[js.Any], SendAsHTML = SendAsHTML.asInstanceOf[js.Any], SinglePrintJobs = SinglePrintJobs.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], acquire = acquire.toJsFn, addMailMergeEventListener = js.Any.fromFunction1((t0: XMailMergeListener) => addMailMergeEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), cancel = cancel.toJsFn, execute = js.Any.fromFunction1(execute), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeMailMergeEventListener = js.Any.fromFunction1((t0: XMailMergeListener) => removeMailMergeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[MailMerge]
  }
  
  extension [Self <: MailMerge](x: Self) {
    
    inline def setAddressFromColumn(value: String): Self = StObject.set(x, "AddressFromColumn", value.asInstanceOf[js.Any])
    
    inline def setAttachmentFilter(value: String): Self = StObject.set(x, "AttachmentFilter", value.asInstanceOf[js.Any])
    
    inline def setAttachmentName(value: String): Self = StObject.set(x, "AttachmentName", value.asInstanceOf[js.Any])
    
    inline def setBlindCopiesTo(value: SafeArray[String]): Self = StObject.set(x, "BlindCopiesTo", value.asInstanceOf[js.Any])
    
    inline def setCopiesTo(value: SafeArray[String]): Self = StObject.set(x, "CopiesTo", value.asInstanceOf[js.Any])
    
    inline def setDocumentURL(value: String): Self = StObject.set(x, "DocumentURL", value.asInstanceOf[js.Any])
    
    inline def setFileNameFromColumn(value: Boolean): Self = StObject.set(x, "FileNameFromColumn", value.asInstanceOf[js.Any])
    
    inline def setFileNamePrefix(value: String): Self = StObject.set(x, "FileNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setInServerPassword(value: String): Self = StObject.set(x, "InServerPassword", value.asInstanceOf[js.Any])
    
    inline def setMailBody(value: String): Self = StObject.set(x, "MailBody", value.asInstanceOf[js.Any])
    
    inline def setModel(value: XModel): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setOutServerPassword(value: String): Self = StObject.set(x, "OutServerPassword", value.asInstanceOf[js.Any])
    
    inline def setOutputType(value: Double): Self = StObject.set(x, "OutputType", value.asInstanceOf[js.Any])
    
    inline def setOutputURL(value: String): Self = StObject.set(x, "OutputURL", value.asInstanceOf[js.Any])
    
    inline def setPrintOptions(value: SafeArray[PropertyValue]): Self = StObject.set(x, "PrintOptions", value.asInstanceOf[js.Any])
    
    inline def setSaveAsSingleFile(value: Boolean): Self = StObject.set(x, "SaveAsSingleFile", value.asInstanceOf[js.Any])
    
    inline def setSaveFilter(value: String): Self = StObject.set(x, "SaveFilter", value.asInstanceOf[js.Any])
    
    inline def setSendAsAttachment(value: Boolean): Self = StObject.set(x, "SendAsAttachment", value.asInstanceOf[js.Any])
    
    inline def setSendAsHTML(value: Boolean): Self = StObject.set(x, "SendAsHTML", value.asInstanceOf[js.Any])
    
    inline def setSinglePrintJobs(value: Boolean): Self = StObject.set(x, "SinglePrintJobs", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
  }
}
