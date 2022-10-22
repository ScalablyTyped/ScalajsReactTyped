package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.LookupValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a view selector item. This object contains data that identifies a view. Use this as a parameter to
  * the ViewSelector.setCurrentView method.
  */
trait ViewSelectorItem extends StObject {
  
  /**
    * Returns a LookupValue that references this view.
    * @returns The entity reference.
    */
  def getEntityReference(): LookupValue
}
object ViewSelectorItem {
  
  inline def apply(getEntityReference: CallbackTo[LookupValue]): ViewSelectorItem = {
    val __obj = js.Dynamic.literal(getEntityReference = getEntityReference.toJsFn)
    __obj.asInstanceOf[ViewSelectorItem]
  }
  
  extension [Self <: ViewSelectorItem](x: Self) {
    
    inline def setGetEntityReference(value: CallbackTo[LookupValue]): Self = StObject.set(x, "getEntityReference", value.toJsFn)
  }
}
