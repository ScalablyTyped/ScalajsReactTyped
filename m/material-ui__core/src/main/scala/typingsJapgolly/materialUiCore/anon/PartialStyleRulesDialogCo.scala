package typingsJapgolly.materialUiCore.anon

import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.CSSProperties
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.PropsFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/DialogContent.DialogContentClassKey, {}>> */
trait PartialStyleRulesDialogCo extends StObject {
  
  var dividers: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var root: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
}
object PartialStyleRulesDialogCo {
  
  inline def apply(): PartialStyleRulesDialogCo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesDialogCo]
  }
  
  extension [Self <: PartialStyleRulesDialogCo](x: Self) {
    
    inline def setDividers(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "dividers", value.asInstanceOf[js.Any])
    
    inline def setDividersFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "dividers", js.Any.fromFunction1(value))
    
    inline def setDividersUndefined: Self = StObject.set(x, "dividers", js.undefined)
    
    inline def setRoot(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
