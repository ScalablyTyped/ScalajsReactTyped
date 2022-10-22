package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * use {@link com.sun.star.document.XExtendedFilterDetection} instead of this
  * @deprecated Deprecated
  */
trait XFilterDetect
  extends StObject
     with XInterface {
  
  def getContentType(URL: String): String
  
  def useExternBrowser(URL: String): Boolean
}
object XFilterDetect {
  
  inline def apply(
    acquire: Callback,
    getContentType: String => String,
    queryInterface: `type` => Any,
    release: Callback,
    useExternBrowser: String => Boolean
  ): XFilterDetect = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getContentType = js.Any.fromFunction1(getContentType), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, useExternBrowser = js.Any.fromFunction1(useExternBrowser))
    __obj.asInstanceOf[XFilterDetect]
  }
  
  extension [Self <: XFilterDetect](x: Self) {
    
    inline def setGetContentType(value: String => String): Self = StObject.set(x, "getContentType", js.Any.fromFunction1(value))
    
    inline def setUseExternBrowser(value: String => Boolean): Self = StObject.set(x, "useExternBrowser", js.Any.fromFunction1(value))
  }
}
