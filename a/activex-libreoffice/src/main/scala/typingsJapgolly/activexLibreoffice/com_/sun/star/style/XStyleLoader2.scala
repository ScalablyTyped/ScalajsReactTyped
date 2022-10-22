package typingsJapgolly.activexLibreoffice.com_.sun.star.style

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extends {@link XStyleLoader} interface to import styles from an already opened component.
  * @see com.sun.star.style.XStyleLoader
  * @since LibreOffice 4.4
  */
trait XStyleLoader2
  extends StObject
     with XStyleLoader {
  
  /**
    * loads styles from a given document
    * @param aSourceComponent a valid XComponent reference to source document
    * @param aOptions Specifies which of the {@link Style} families the method should load. The `sequence<PropertyValue>` has the following, optional items: b
    */
  def loadStylesFromDocument(aSourceComponent: XComponent, aOptions: SeqEquiv[PropertyValue]): Unit
}
object XStyleLoader2 {
  
  inline def apply(
    StyleLoaderOptions: SafeArray[PropertyValue],
    acquire: Callback,
    getStyleLoaderOptions: CallbackTo[SafeArray[PropertyValue]],
    loadStylesFromDocument: (XComponent, SeqEquiv[PropertyValue]) => Callback,
    loadStylesFromURL: (String, SeqEquiv[PropertyValue]) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XStyleLoader2 = {
    val __obj = js.Dynamic.literal(StyleLoaderOptions = StyleLoaderOptions.asInstanceOf[js.Any], acquire = acquire.toJsFn, getStyleLoaderOptions = getStyleLoaderOptions.toJsFn, loadStylesFromDocument = js.Any.fromFunction2((t0: XComponent, t1: SeqEquiv[PropertyValue]) => (loadStylesFromDocument(t0, t1)).runNow()), loadStylesFromURL = js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (loadStylesFromURL(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XStyleLoader2]
  }
  
  extension [Self <: XStyleLoader2](x: Self) {
    
    inline def setLoadStylesFromDocument(value: (XComponent, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "loadStylesFromDocument", js.Any.fromFunction2((t0: XComponent, t1: SeqEquiv[PropertyValue]) => (value(t0, t1)).runNow()))
  }
}
