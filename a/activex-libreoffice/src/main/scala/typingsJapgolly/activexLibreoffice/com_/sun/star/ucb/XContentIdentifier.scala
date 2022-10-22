package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An identifier for contents.
  * @author Kai Sommerfeld
  * @see XContent
  * @version 1.0
  */
trait XContentIdentifier
  extends StObject
     with XInterface {
  
  /**
    * returns the content identifier string.
    * @returns the content identifier string. This must be a valid URI (Uniform Resource Identifier, see RFC 2396). This string is required. If a content provid
    */
  val ContentIdentifier: String
  
  /**
    * returns the content provider scheme string.
    *
    * This string will be calculated from the content identifier string and must be lower-cased(!). It is the "scheme" the content provider is registered
    * for. In example, a provider for FTP contents will use ftp-URLs as content identifiers. The content provider scheme for all contents provided by that
    * provider will be "ftp".
    * @returns the content provider scheme string.
    */
  val ContentProviderScheme: String
  
  /**
    * returns the content identifier string.
    * @returns the content identifier string. This must be a valid URI (Uniform Resource Identifier, see RFC 2396). This string is required. If a content provid
    */
  def getContentIdentifier(): String
  
  /**
    * returns the content provider scheme string.
    *
    * This string will be calculated from the content identifier string and must be lower-cased(!). It is the "scheme" the content provider is registered
    * for. In example, a provider for FTP contents will use ftp-URLs as content identifiers. The content provider scheme for all contents provided by that
    * provider will be "ftp".
    * @returns the content provider scheme string.
    */
  def getContentProviderScheme(): String
}
object XContentIdentifier {
  
  inline def apply(
    ContentIdentifier: String,
    ContentProviderScheme: String,
    acquire: Callback,
    getContentIdentifier: CallbackTo[String],
    getContentProviderScheme: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XContentIdentifier = {
    val __obj = js.Dynamic.literal(ContentIdentifier = ContentIdentifier.asInstanceOf[js.Any], ContentProviderScheme = ContentProviderScheme.asInstanceOf[js.Any], acquire = acquire.toJsFn, getContentIdentifier = getContentIdentifier.toJsFn, getContentProviderScheme = getContentProviderScheme.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XContentIdentifier]
  }
  
  extension [Self <: XContentIdentifier](x: Self) {
    
    inline def setContentIdentifier(value: String): Self = StObject.set(x, "ContentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setContentProviderScheme(value: String): Self = StObject.set(x, "ContentProviderScheme", value.asInstanceOf[js.Any])
    
    inline def setGetContentIdentifier(value: CallbackTo[String]): Self = StObject.set(x, "getContentIdentifier", value.toJsFn)
    
    inline def setGetContentProviderScheme(value: CallbackTo[String]): Self = StObject.set(x, "getContentProviderScheme", value.toJsFn)
  }
}
