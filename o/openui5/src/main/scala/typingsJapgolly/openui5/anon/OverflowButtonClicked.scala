package typingsJapgolly.openui5.anon

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverflowButtonClicked extends StObject {
  
  /**
    * indicates if the overflow button is clicked
    */
  var overflowButtonClicked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The DOM ref of the clicked item.
    */
  var targetRef: js.UndefOr[HTMLElement] = js.undefined
}
object OverflowButtonClicked {
  
  inline def apply(): OverflowButtonClicked = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverflowButtonClicked]
  }
  
  extension [Self <: OverflowButtonClicked](x: Self) {
    
    inline def setOverflowButtonClicked(value: Boolean): Self = StObject.set(x, "overflowButtonClicked", value.asInstanceOf[js.Any])
    
    inline def setOverflowButtonClickedUndefined: Self = StObject.set(x, "overflowButtonClicked", js.undefined)
    
    inline def setTargetRef(value: HTMLElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
    
    inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
  }
}
