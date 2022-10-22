package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * enables access to the panes in a view.
  * @deprecated Deprecated
  */
trait XViewPanesSupplier
  extends StObject
     with XInterface {
  
  /** returns the collection of panes in the view. */
  val ViewPanes: XIndexAccess
  
  /** returns the collection of panes in the view. */
  def getViewPanes(): XIndexAccess
}
object XViewPanesSupplier {
  
  inline def apply(
    ViewPanes: XIndexAccess,
    acquire: Callback,
    getViewPanes: CallbackTo[XIndexAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XViewPanesSupplier = {
    val __obj = js.Dynamic.literal(ViewPanes = ViewPanes.asInstanceOf[js.Any], acquire = acquire.toJsFn, getViewPanes = getViewPanes.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XViewPanesSupplier]
  }
  
  extension [Self <: XViewPanesSupplier](x: Self) {
    
    inline def setGetViewPanes(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getViewPanes", value.toJsFn)
    
    inline def setViewPanes(value: XIndexAccess): Self = StObject.set(x, "ViewPanes", value.asInstanceOf[js.Any])
  }
}
