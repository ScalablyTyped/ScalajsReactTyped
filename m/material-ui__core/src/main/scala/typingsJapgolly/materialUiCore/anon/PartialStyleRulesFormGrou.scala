package typingsJapgolly.materialUiCore.anon

import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.CSSProperties
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.CreateCSSProperties
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.PropsFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/FormGroup.FormGroupClassKey, {}>> */
trait PartialStyleRulesFormGrou extends StObject {
  
  var root: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
  
  var row: js.UndefOr[
    CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
  ] = js.undefined
}
object PartialStyleRulesFormGrou {
  
  inline def apply(): PartialStyleRulesFormGrou = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesFormGrou]
  }
  
  extension [Self <: PartialStyleRulesFormGrou](x: Self) {
    
    inline def setRoot(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setRow(
      value: CSSProperties | CreateCSSProperties[js.Object] | (PropsFunc[js.Object, CreateCSSProperties[js.Object]])
    ): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowFunction1(value: js.Object => CreateCSSProperties[js.Object]): Self = StObject.set(x, "row", js.Any.fromFunction1(value))
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
