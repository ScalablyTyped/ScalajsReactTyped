package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides the access to a container of database reports.
  * @see Reports
  */
trait XReportDocumentsSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the container of reports.
    * @returns the report documents
    * @see Reports
    */
  val ReportDocuments: XNameAccess
  
  /**
    * returns the container of reports.
    * @returns the report documents
    * @see Reports
    */
  def getReportDocuments(): XNameAccess
}
object XReportDocumentsSupplier {
  
  inline def apply(
    ReportDocuments: XNameAccess,
    acquire: Callback,
    getReportDocuments: CallbackTo[XNameAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XReportDocumentsSupplier = {
    val __obj = js.Dynamic.literal(ReportDocuments = ReportDocuments.asInstanceOf[js.Any], acquire = acquire.toJsFn, getReportDocuments = getReportDocuments.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XReportDocumentsSupplier]
  }
  
  extension [Self <: XReportDocumentsSupplier](x: Self) {
    
    inline def setGetReportDocuments(value: CallbackTo[XNameAccess]): Self = StObject.set(x, "getReportDocuments", value.toJsFn)
    
    inline def setReportDocuments(value: XNameAccess): Self = StObject.set(x, "ReportDocuments", value.asInstanceOf[js.Any])
  }
}
