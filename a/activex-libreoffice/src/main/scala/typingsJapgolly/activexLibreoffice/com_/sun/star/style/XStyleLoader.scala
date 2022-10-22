package typingsJapgolly.activexLibreoffice.com_.sun.star.style

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

/** enables the object to import styles from documents. */
trait XStyleLoader
  extends StObject
     with XInterface {
  
  /** @returns a sequence of the supported properties as declared in {@link XStyleLoader.loadStylesFromURL()} with their current values. */
  val StyleLoaderOptions: SafeArray[PropertyValue]
  
  /** @returns a sequence of the supported properties as declared in {@link XStyleLoader.loadStylesFromURL()} with their current values. */
  def getStyleLoaderOptions(): SafeArray[PropertyValue]
  
  /**
    * loads styles from a document at the given URL.
    *
    * If **OverwriteStyles** is `TRUE` , then all styles will be loaded. Otherwise, only styles which are not already defined in this document are loaded.
    * @param URL The directory and the filename from document with the styles
    * @param aOptions Specifies which of the {@link Style} families the method should load. The `sequence<PropertyValue>` has the following, optional items: b
    */
  def loadStylesFromURL(URL: String, aOptions: SeqEquiv[PropertyValue]): Unit
}
object XStyleLoader {
  
  inline def apply(
    StyleLoaderOptions: SafeArray[PropertyValue],
    acquire: Callback,
    getStyleLoaderOptions: CallbackTo[SafeArray[PropertyValue]],
    loadStylesFromURL: (String, SeqEquiv[PropertyValue]) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XStyleLoader = {
    val __obj = js.Dynamic.literal(StyleLoaderOptions = StyleLoaderOptions.asInstanceOf[js.Any], acquire = acquire.toJsFn, getStyleLoaderOptions = getStyleLoaderOptions.toJsFn, loadStylesFromURL = js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (loadStylesFromURL(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XStyleLoader]
  }
  
  extension [Self <: XStyleLoader](x: Self) {
    
    inline def setGetStyleLoaderOptions(value: CallbackTo[SafeArray[PropertyValue]]): Self = StObject.set(x, "getStyleLoaderOptions", value.toJsFn)
    
    inline def setLoadStylesFromURL(value: (String, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "loadStylesFromURL", js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (value(t0, t1)).runNow()))
    
    inline def setStyleLoaderOptions(value: SafeArray[PropertyValue]): Self = StObject.set(x, "StyleLoaderOptions", value.asInstanceOf[js.Any])
  }
}
