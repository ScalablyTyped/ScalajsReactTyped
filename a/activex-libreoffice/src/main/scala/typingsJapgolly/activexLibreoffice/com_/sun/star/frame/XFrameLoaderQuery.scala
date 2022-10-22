package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * use service {@link FrameLoaderFactory} instead of this
  * @deprecated Deprecated
  */
trait XFrameLoaderQuery
  extends StObject
     with XInterface {
  
  /**
    * use member {@link com.sun.star.container.XNameAccess.getElementNames()} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  val AvailableFilterNames: SafeArray[String]
  
  /**
    * use member {@link com.sun.star.container.XNameAccess.getElementNames()} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  def getAvailableFilterNames(): SafeArray[String]
  
  /**
    * use member {@link com.sun.star.container.XNameAccess.getByName()} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  def getLoaderProperties(sFilterName: String): SafeArray[PropertyValue]
  
  /**
    * use member {@link com.sun.star.container.XContainerQuery} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  def searchFilter(sURL: String, seqArguments: SeqEquiv[PropertyValue]): String
}
object XFrameLoaderQuery {
  
  inline def apply(
    AvailableFilterNames: SafeArray[String],
    acquire: Callback,
    getAvailableFilterNames: CallbackTo[SafeArray[String]],
    getLoaderProperties: String => SafeArray[PropertyValue],
    queryInterface: `type` => Any,
    release: Callback,
    searchFilter: (String, SeqEquiv[PropertyValue]) => String
  ): XFrameLoaderQuery = {
    val __obj = js.Dynamic.literal(AvailableFilterNames = AvailableFilterNames.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAvailableFilterNames = getAvailableFilterNames.toJsFn, getLoaderProperties = js.Any.fromFunction1(getLoaderProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, searchFilter = js.Any.fromFunction2(searchFilter))
    __obj.asInstanceOf[XFrameLoaderQuery]
  }
  
  extension [Self <: XFrameLoaderQuery](x: Self) {
    
    inline def setAvailableFilterNames(value: SafeArray[String]): Self = StObject.set(x, "AvailableFilterNames", value.asInstanceOf[js.Any])
    
    inline def setGetAvailableFilterNames(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getAvailableFilterNames", value.toJsFn)
    
    inline def setGetLoaderProperties(value: String => SafeArray[PropertyValue]): Self = StObject.set(x, "getLoaderProperties", js.Any.fromFunction1(value))
    
    inline def setSearchFilter(value: (String, SeqEquiv[PropertyValue]) => String): Self = StObject.set(x, "searchFilter", js.Any.fromFunction2(value))
  }
}
