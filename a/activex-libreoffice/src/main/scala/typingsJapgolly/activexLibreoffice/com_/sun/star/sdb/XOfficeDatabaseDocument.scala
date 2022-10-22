package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XDocumentSubStorageSupplier
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XDataSource
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** simplifies the accessing of data sources, and it's corresponding database document and forms, and reports. */
trait XOfficeDatabaseDocument
  extends StObject
     with XFormDocumentsSupplier
     with XReportDocumentsSupplier
     with XDocumentSubStorageSupplier {
  
  /** provides access to the one and only {@link DataSource} associated with this document */
  var DataSource: XDataSource
}
object XOfficeDatabaseDocument {
  
  inline def apply(
    DataSource: XDataSource,
    DocumentSubStoragesNames: SafeArray[String],
    FormDocuments: XNameAccess,
    ReportDocuments: XNameAccess,
    acquire: Callback,
    getDocumentSubStorage: (String, Double) => XStorage,
    getDocumentSubStoragesNames: CallbackTo[SafeArray[String]],
    getFormDocuments: CallbackTo[XNameAccess],
    getReportDocuments: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XOfficeDatabaseDocument = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any], DocumentSubStoragesNames = DocumentSubStoragesNames.asInstanceOf[js.Any], FormDocuments = FormDocuments.asInstanceOf[js.Any], ReportDocuments = ReportDocuments.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDocumentSubStorage = js.Any.fromFunction2(getDocumentSubStorage), getDocumentSubStoragesNames = getDocumentSubStoragesNames.toJsFn, getFormDocuments = getFormDocuments.toJsFn, getReportDocuments = getReportDocuments.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XOfficeDatabaseDocument]
  }
  
  extension [Self <: XOfficeDatabaseDocument](x: Self) {
    
    inline def setDataSource(value: XDataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
  }
}
