package typingsJapgolly.semanticUiSticky.anon

import typingsJapgolly.semanticUiSticky.SemanticUI.Sticky.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ErrorSettings._Impl, 'visible'> & std.Partial<std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ErrorSettings._Impl, keyof semantic-ui-sticky.SemanticUI.Sticky.ErrorSettings._Impl>> */
trait PickImplvisiblePartialPic
  extends StObject
     with Param {
  
  var container: js.UndefOr[String] = js.undefined
  
  var elementSize: js.UndefOr[String] = js.undefined
  
  var invalidContext: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var visible: String & js.UndefOr[String]
}
object PickImplvisiblePartialPic {
  
  inline def apply(visible: String & js.UndefOr[String]): PickImplvisiblePartialPic = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplvisiblePartialPic]
  }
  
  extension [Self <: PickImplvisiblePartialPic](x: Self) {
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setElementSize(value: String): Self = StObject.set(x, "elementSize", value.asInstanceOf[js.Any])
    
    inline def setElementSizeUndefined: Self = StObject.set(x, "elementSize", js.undefined)
    
    inline def setInvalidContext(value: String): Self = StObject.set(x, "invalidContext", value.asInstanceOf[js.Any])
    
    inline def setInvalidContextUndefined: Self = StObject.set(x, "invalidContext", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setVisible(value: String & js.UndefOr[String]): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
