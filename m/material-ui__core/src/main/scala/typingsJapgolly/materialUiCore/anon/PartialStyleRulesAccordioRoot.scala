package typingsJapgolly.materialUiCore.anon

import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.CSSProperties
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.PropsFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/AccordionActions.AccordionActionsClassKey, {}>> */
trait PartialStyleRulesAccordioRoot extends StObject {
  
  var root: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var spacing: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
}
object PartialStyleRulesAccordioRoot {
  
  inline def apply(): PartialStyleRulesAccordioRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesAccordioRoot]
  }
  
  extension [Self <: PartialStyleRulesAccordioRoot](x: Self) {
    
    inline def setRoot(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSpacing(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "spacing", js.Any.fromFunction1(value))
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
