package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`[SecondaryTypographyComponent /* <: ElementType */] extends StObject {
  
  var component: js.UndefOr[SecondaryTypographyComponent] = js.undefined
}
object `6` {
  
  inline def apply[SecondaryTypographyComponent /* <: ElementType */](): `6`[SecondaryTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`[SecondaryTypographyComponent]]
  }
  
  extension [Self <: `6`[?], SecondaryTypographyComponent /* <: ElementType */](x: Self & `6`[SecondaryTypographyComponent]) {
    
    inline def setComponent(value: SecondaryTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
