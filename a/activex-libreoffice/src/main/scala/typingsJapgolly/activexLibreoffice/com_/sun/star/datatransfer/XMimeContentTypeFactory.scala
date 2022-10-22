package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implementations of this interface do create a {@link com.sun.star.datatransfer.XMimeContentType} from a given string that represents a MIME
  * content-type (see [Rfc2045]{@link url="ftp://ftp.isi.edu/in-notes/rfc2045.txt"} and [Rfc2046]{@link url="ftp://ftp.isi.edu/in-notes/rfc2046.txt"} ).
  */
trait XMimeContentTypeFactory
  extends StObject
     with XInterface {
  
  /**
    * Creates an object that implements {@link XMimeContentType} .
    * @param aContentType A string that represents a MIME content-type as specified in [Rfc2045]{@link url="ftp://ftp.isi.edu/in-notes/rfc2045.txt"} and [Rfc2
    * @returns An object that implements {@link XMimeContentType} .
    * @see com.sun.star.datatransfer.XMimeContentType
    * @throws com::sun::star::lang::IllegalArgumentException if the string does not conform to [Rfc2045]{@link url="ftp://ftp.isi.edu/in-notes/rfc2045.txt"} an
    */
  def createMimeContentType(aContentType: String): XMimeContentType
}
object XMimeContentTypeFactory {
  
  inline def apply(
    acquire: Callback,
    createMimeContentType: String => XMimeContentType,
    queryInterface: `type` => Any,
    release: Callback
  ): XMimeContentTypeFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createMimeContentType = js.Any.fromFunction1(createMimeContentType), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XMimeContentTypeFactory]
  }
  
  extension [Self <: XMimeContentTypeFactory](x: Self) {
    
    inline def setCreateMimeContentType(value: String => XMimeContentType): Self = StObject.set(x, "createMimeContentType", js.Any.fromFunction1(value))
  }
}
