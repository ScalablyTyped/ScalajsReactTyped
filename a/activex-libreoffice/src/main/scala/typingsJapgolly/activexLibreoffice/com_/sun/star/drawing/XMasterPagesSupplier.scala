package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** must be supported to provide access to the {@link MasterPages} of a multi-page drawing-layer. */
trait XMasterPagesSupplier
  extends StObject
     with XInterface {
  
  /** @returns an indexed container with the service {@link MasterPages} . */
  val MasterPages: XDrawPages
  
  /** @returns an indexed container with the service {@link MasterPages} . */
  def getMasterPages(): XDrawPages
}
object XMasterPagesSupplier {
  
  inline def apply(
    MasterPages: XDrawPages,
    acquire: Callback,
    getMasterPages: CallbackTo[XDrawPages],
    queryInterface: `type` => Any,
    release: Callback
  ): XMasterPagesSupplier = {
    val __obj = js.Dynamic.literal(MasterPages = MasterPages.asInstanceOf[js.Any], acquire = acquire.toJsFn, getMasterPages = getMasterPages.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XMasterPagesSupplier]
  }
  
  extension [Self <: XMasterPagesSupplier](x: Self) {
    
    inline def setGetMasterPages(value: CallbackTo[XDrawPages]): Self = StObject.set(x, "getMasterPages", value.toJsFn)
    
    inline def setMasterPages(value: XDrawPages): Self = StObject.set(x, "MasterPages", value.asInstanceOf[js.Any])
  }
}
