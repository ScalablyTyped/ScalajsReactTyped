package typingsJapgolly.storybookTheming.anon

import typingsJapgolly.storybookTheming.`distTs3Dot9Modules@emotionReactNodeModules@emotionSerializeTypesIndexMod`.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Styles extends StObject {
  
  var styles: Interpolation[typingsJapgolly.storybookTheming.mod.Theme]
}
object Styles {
  
  inline def apply(): Styles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Styles]
  }
  
  extension [Self <: Styles](x: Self) {
    
    inline def setStyles(value: Interpolation[typingsJapgolly.storybookTheming.mod.Theme]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesNull: Self = StObject.set(x, "styles", null)
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
