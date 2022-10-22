package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is implemented by objects that can be linked to a {@link MasterPage} .
  * @see DrawPage
  */
trait XMasterPageTarget
  extends StObject
     with XInterface {
  
  /** @returns the {@link MasterPage} linked to this object. */
  var MasterPage: XDrawPage
  
  /** @returns the {@link MasterPage} linked to this object. */
  def getMasterPage(): XDrawPage
  
  /**
    * links a {@link MasterPage} to this object.
    * @param xMasterPage the {@link MasterPage} that is linked to this object
    */
  def setMasterPage(xMasterPage: XDrawPage): Unit
}
object XMasterPageTarget {
  
  inline def apply(
    MasterPage: XDrawPage,
    acquire: Callback,
    getMasterPage: CallbackTo[XDrawPage],
    queryInterface: `type` => Any,
    release: Callback,
    setMasterPage: XDrawPage => Callback
  ): XMasterPageTarget = {
    val __obj = js.Dynamic.literal(MasterPage = MasterPage.asInstanceOf[js.Any], acquire = acquire.toJsFn, getMasterPage = getMasterPage.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setMasterPage = js.Any.fromFunction1((t0: XDrawPage) => setMasterPage(t0).runNow()))
    __obj.asInstanceOf[XMasterPageTarget]
  }
  
  extension [Self <: XMasterPageTarget](x: Self) {
    
    inline def setGetMasterPage(value: CallbackTo[XDrawPage]): Self = StObject.set(x, "getMasterPage", value.toJsFn)
    
    inline def setMasterPage(value: XDrawPage): Self = StObject.set(x, "MasterPage", value.asInstanceOf[js.Any])
    
    inline def setSetMasterPage(value: XDrawPage => Callback): Self = StObject.set(x, "setMasterPage", js.Any.fromFunction1((t0: XDrawPage) => value(t0).runNow()))
  }
}
