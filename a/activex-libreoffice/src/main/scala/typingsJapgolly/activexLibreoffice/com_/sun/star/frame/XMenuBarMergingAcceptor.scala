package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functions to set and remove a merged menu bar for inplace editing.
  * @since OOo 2.0
  */
trait XMenuBarMergingAcceptor
  extends StObject
     with XInterface {
  
  /** removes a previously set merged menu bar and sets a previously created menu bar back. */
  def removeMergedMenuBar(): Unit
  
  /**
    * allows to set a merged menu bar.
    * @param xMergedMenuBar specifies the merged menu bar.  This function is normally used to provide inplace editing where functions from two application par
    * @see com.sun.star.ui.UIElementSettings
    * @see com.sun.star.frame.XDispatchProvider
    * @see com.sun.star.frame.XLayoutManager
    */
  def setMergedMenuBar(xMergedMenuBar: XIndexAccess): Boolean
}
object XMenuBarMergingAcceptor {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeMergedMenuBar: Callback,
    setMergedMenuBar: XIndexAccess => Boolean
  ): XMenuBarMergingAcceptor = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeMergedMenuBar = removeMergedMenuBar.toJsFn, setMergedMenuBar = js.Any.fromFunction1(setMergedMenuBar))
    __obj.asInstanceOf[XMenuBarMergingAcceptor]
  }
  
  extension [Self <: XMenuBarMergingAcceptor](x: Self) {
    
    inline def setRemoveMergedMenuBar(value: Callback): Self = StObject.set(x, "removeMergedMenuBar", value.toJsFn)
    
    inline def setSetMergedMenuBar(value: XIndexAccess => Boolean): Self = StObject.set(x, "setMergedMenuBar", js.Any.fromFunction1(value))
  }
}
