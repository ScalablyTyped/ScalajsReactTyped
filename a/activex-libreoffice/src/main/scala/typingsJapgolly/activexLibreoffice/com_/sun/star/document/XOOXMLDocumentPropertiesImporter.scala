package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to import the document properties from OOXML format */
trait XOOXMLDocumentPropertiesImporter
  extends StObject
     with XInterface {
  
  /**
    * allows to import the document properties from OOXML format
    *
    * The implementation should parse the document properties from OOXML format storage and set them to the target {@link XDocumentProperties}
    * implementation.
    *
    * The storage must represent OOXML format and support {@link com.sun.star.embed.XRelationshipAccess} interface. Please see {@link
    * com.sun.star.embed.StorageFactory} for details regarding creation of such a storage.
    * @param xSource the source storage representing OOXML document
    * @param xDocumentProperties the target {@link XDocumentProperties} interface implementation
    * @throws com::sun::star::lang::IllegalArgumentException the exception is thrown in case unexpected arguments are provided
    * @throws com::sun::star::xml::sax::SAXException the exception is thrown in case of parsing problems
    * @throws com::sun::star::uno::Exception the exception is thrown in case of other problems during the import
    */
  def importProperties(xSource: XStorage, xDocumentProperties: XDocumentProperties): Unit
}
object XOOXMLDocumentPropertiesImporter {
  
  inline def apply(
    acquire: Callback,
    importProperties: (XStorage, XDocumentProperties) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XOOXMLDocumentPropertiesImporter = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, importProperties = js.Any.fromFunction2((t0: XStorage, t1: XDocumentProperties) => (importProperties(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XOOXMLDocumentPropertiesImporter]
  }
  
  extension [Self <: XOOXMLDocumentPropertiesImporter](x: Self) {
    
    inline def setImportProperties(value: (XStorage, XDocumentProperties) => Callback): Self = StObject.set(x, "importProperties", js.Any.fromFunction2((t0: XStorage, t1: XDocumentProperties) => (value(t0, t1)).runNow()))
  }
}
