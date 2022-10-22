package typingsJapgolly.semanticUiTransition.anon

import typingsJapgolly.semanticUiTransition.SemanticUI.Transition.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.Transition.ClassNameSettings._Impl, 'hidden'> & std.Partial<std.Pick<semantic-ui-transition.SemanticUI.Transition.ClassNameSettings._Impl, keyof semantic-ui-transition.SemanticUI.Transition.ClassNameSettings._Impl>> */
trait PickImplhiddenPartialPick
  extends StObject
     with Param {
  
  var animating: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[String] = js.undefined
  
  var hidden: String & js.UndefOr[String]
  
  var inward: js.UndefOr[String] = js.undefined
  
  var loading: js.UndefOr[String] = js.undefined
  
  var looping: js.UndefOr[String] = js.undefined
  
  var outward: js.UndefOr[String] = js.undefined
  
  var transition: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[String] = js.undefined
}
object PickImplhiddenPartialPick {
  
  inline def apply(hidden: String & js.UndefOr[String]): PickImplhiddenPartialPick = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhiddenPartialPick]
  }
  
  extension [Self <: PickImplhiddenPartialPick](x: Self) {
    
    inline def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
    
    inline def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHidden(value: String & js.UndefOr[String]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setInward(value: String): Self = StObject.set(x, "inward", value.asInstanceOf[js.Any])
    
    inline def setInwardUndefined: Self = StObject.set(x, "inward", js.undefined)
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setLooping(value: String): Self = StObject.set(x, "looping", value.asInstanceOf[js.Any])
    
    inline def setLoopingUndefined: Self = StObject.set(x, "looping", js.undefined)
    
    inline def setOutward(value: String): Self = StObject.set(x, "outward", value.asInstanceOf[js.Any])
    
    inline def setOutwardUndefined: Self = StObject.set(x, "outward", js.undefined)
    
    inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
