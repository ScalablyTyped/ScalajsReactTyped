package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[TitleTypographyComponent /* <: ElementType */] extends StObject {
  
  var component: js.UndefOr[TitleTypographyComponent] = js.undefined
}
object `2` {
  
  inline def apply[TitleTypographyComponent /* <: ElementType */](): `2`[TitleTypographyComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[TitleTypographyComponent]]
  }
  
  extension [Self <: `2`[?], TitleTypographyComponent /* <: ElementType */](x: Self & `2`[TitleTypographyComponent]) {
    
    inline def setComponent(value: TitleTypographyComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
