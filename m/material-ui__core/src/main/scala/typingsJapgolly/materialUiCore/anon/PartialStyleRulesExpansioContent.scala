package typingsJapgolly.materialUiCore.anon

import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.CSSProperties
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.PropsFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/ExpansionPanelSummary.ExpansionPanelSummaryClassKey, {}>> */
trait PartialStyleRulesExpansioContent extends StObject {
  
  var content: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var disabled: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var expandIcon: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var expanded: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var focused: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var root: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
}
object PartialStyleRulesExpansioContent {
  
  inline def apply(): PartialStyleRulesExpansioContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesExpansioContent]
  }
  
  extension [Self <: PartialStyleRulesExpansioContent](x: Self) {
    
    inline def setContent(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDisabled(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExpandIcon(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
    
    inline def setExpandIconFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
    
    inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
    
    inline def setExpanded(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "expanded", js.Any.fromFunction1(value))
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setFocused(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFocusedFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "focused", js.Any.fromFunction1(value))
    
    inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    inline def setRoot(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
