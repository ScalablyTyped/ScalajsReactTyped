package typingsJapgolly.semanticUiDimmer.anon

import typingsJapgolly.semanticUiDimmer.SemanticUI.Dimmer.SelectorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl, 'dimmer'> & std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl>> */
trait PickImpldimmerPartialPick
  extends StObject
     with Param {
  
  var content: js.UndefOr[String] = js.undefined
  
  var dimmable: js.UndefOr[String] = js.undefined
  
  var dimmer: String & js.UndefOr[String]
}
object PickImpldimmerPartialPick {
  
  inline def apply(dimmer: String & js.UndefOr[String]): PickImpldimmerPartialPick = {
    val __obj = js.Dynamic.literal(dimmer = dimmer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimmerPartialPick]
  }
  
  extension [Self <: PickImpldimmerPartialPick](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDimmable(value: String): Self = StObject.set(x, "dimmable", value.asInstanceOf[js.Any])
    
    inline def setDimmableUndefined: Self = StObject.set(x, "dimmable", js.undefined)
    
    inline def setDimmer(value: String & js.UndefOr[String]): Self = StObject.set(x, "dimmer", value.asInstanceOf[js.Any])
  }
}
