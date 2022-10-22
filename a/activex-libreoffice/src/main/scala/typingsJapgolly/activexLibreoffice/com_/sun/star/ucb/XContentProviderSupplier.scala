package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a supplier for a content provider.
  * @author Kai Sommerfeld
  * @see XContentProvider
  * @version 1.0
  */
trait XContentProviderSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns a content provider.
    * @returns a content provider.
    */
  val ContentProvider: XContentProvider
  
  /**
    * returns a content provider.
    * @returns a content provider.
    */
  def getContentProvider(): XContentProvider
}
object XContentProviderSupplier {
  
  inline def apply(
    ContentProvider: XContentProvider,
    acquire: Callback,
    getContentProvider: CallbackTo[XContentProvider],
    queryInterface: `type` => Any,
    release: Callback
  ): XContentProviderSupplier = {
    val __obj = js.Dynamic.literal(ContentProvider = ContentProvider.asInstanceOf[js.Any], acquire = acquire.toJsFn, getContentProvider = getContentProvider.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XContentProviderSupplier]
  }
  
  extension [Self <: XContentProviderSupplier](x: Self) {
    
    inline def setContentProvider(value: XContentProvider): Self = StObject.set(x, "ContentProvider", value.asInstanceOf[js.Any])
    
    inline def setGetContentProvider(value: CallbackTo[XContentProvider]): Self = StObject.set(x, "getContentProvider", value.toJsFn)
  }
}
