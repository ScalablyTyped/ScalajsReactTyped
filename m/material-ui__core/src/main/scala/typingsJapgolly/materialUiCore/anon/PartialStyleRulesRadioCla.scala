package typingsJapgolly.materialUiCore.anon

import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.CSSProperties
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.PropsFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/Radio.RadioClassKey, {}>> */
trait PartialStyleRulesRadioCla extends StObject {
  
  var checked: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var colorPrimary: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var colorSecondary: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var disabled: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var input: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var root: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
}
object PartialStyleRulesRadioCla {
  
  inline def apply(): PartialStyleRulesRadioCla = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesRadioCla]
  }
  
  extension [Self <: PartialStyleRulesRadioCla](x: Self) {
    
    inline def setChecked(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "checked", js.Any.fromFunction1(value))
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setColorPrimary(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
    
    inline def setColorPrimaryFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "colorPrimary", js.Any.fromFunction1(value))
    
    inline def setColorPrimaryUndefined: Self = StObject.set(x, "colorPrimary", js.undefined)
    
    inline def setColorSecondary(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
    
    inline def setColorSecondaryFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "colorSecondary", js.Any.fromFunction1(value))
    
    inline def setColorSecondaryUndefined: Self = StObject.set(x, "colorSecondary", js.undefined)
    
    inline def setDisabled(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "disabled", js.Any.fromFunction1(value))
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setInput(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setRoot(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
