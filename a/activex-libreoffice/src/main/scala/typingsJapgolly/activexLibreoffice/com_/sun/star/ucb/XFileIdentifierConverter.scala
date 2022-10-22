package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies methods to convert between (file) URLs and file paths in system dependent notation.
  * @author Andreas Bille
  * @version 1.0
  */
trait XFileIdentifierConverter
  extends StObject
     with XInterface {
  
  /**
    * Get information about the "locality" of a file content provider.
    *
    * The returned information can be used to chose the "best" among a number of file content providers implementing this interface.
    * @param BaseURL the base (file) URL used to specify a file content provider.
    * @returns an appropriate value representing the "locality" of the specified file content provider. Generally, higher (non-negative) numbers denote file con
    */
  def getFileProviderLocality(BaseURL: String): Double
  
  /**
    * converts a file path in system dependent notation to a (file) URL.
    * @param BaseURL the base (file) URL relative to which the file path shall be interpreted.
    * @param SystemPath a file path in system dependent notation.
    * @returns the URL corresponding to the file path, or an empty string if the file path cannot be converted into a URL.
    */
  def getFileURLFromSystemPath(BaseURL: String, SystemPath: String): String
  
  /**
    * converts a (file) URL to a file path in system dependent notation.
    * @param URL a (file) URL.
    * @returns the file path corresponding to the URL, or an empty string if the URL cannot be converted into a file path.
    */
  def getSystemPathFromFileURL(URL: String): String
}
object XFileIdentifierConverter {
  
  inline def apply(
    acquire: Callback,
    getFileProviderLocality: String => Double,
    getFileURLFromSystemPath: (String, String) => String,
    getSystemPathFromFileURL: String => String,
    queryInterface: `type` => Any,
    release: Callback
  ): XFileIdentifierConverter = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getFileProviderLocality = js.Any.fromFunction1(getFileProviderLocality), getFileURLFromSystemPath = js.Any.fromFunction2(getFileURLFromSystemPath), getSystemPathFromFileURL = js.Any.fromFunction1(getSystemPathFromFileURL), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XFileIdentifierConverter]
  }
  
  extension [Self <: XFileIdentifierConverter](x: Self) {
    
    inline def setGetFileProviderLocality(value: String => Double): Self = StObject.set(x, "getFileProviderLocality", js.Any.fromFunction1(value))
    
    inline def setGetFileURLFromSystemPath(value: (String, String) => String): Self = StObject.set(x, "getFileURLFromSystemPath", js.Any.fromFunction2(value))
    
    inline def setGetSystemPathFromFileURL(value: String => String): Self = StObject.set(x, "getSystemPathFromFileURL", js.Any.fromFunction1(value))
  }
}
