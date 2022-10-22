package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to an {@link XUndoManager} .
  * @since OOo 3.4
  */
trait XUndoManagerSupplier extends StObject {
  
  /** returns the Undo manager associated with the component. */
  val UndoManager: XUndoManager
  
  /** returns the Undo manager associated with the component. */
  def getUndoManager(): XUndoManager
}
object XUndoManagerSupplier {
  
  inline def apply(UndoManager: XUndoManager, getUndoManager: CallbackTo[XUndoManager]): XUndoManagerSupplier = {
    val __obj = js.Dynamic.literal(UndoManager = UndoManager.asInstanceOf[js.Any], getUndoManager = getUndoManager.toJsFn)
    __obj.asInstanceOf[XUndoManagerSupplier]
  }
  
  extension [Self <: XUndoManagerSupplier](x: Self) {
    
    inline def setGetUndoManager(value: CallbackTo[XUndoManager]): Self = StObject.set(x, "getUndoManager", value.toJsFn)
    
    inline def setUndoManager(value: XUndoManager): Self = StObject.set(x, "UndoManager", value.asInstanceOf[js.Any])
  }
}
