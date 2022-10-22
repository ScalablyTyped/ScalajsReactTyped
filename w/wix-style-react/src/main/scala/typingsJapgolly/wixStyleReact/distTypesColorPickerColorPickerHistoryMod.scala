package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.Previous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorPickerColorPickerHistoryMod {
  
  object default {
    
    inline def apply(hasShowCurrentPreviousOnClick: Previous): Element | Null = ^.asInstanceOf[js.Dynamic].apply(hasShowCurrentPreviousOnClick.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerHistory", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerHistory", "default.propTypes.current")
      @js.native
      val current: Validator[js.Object] = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerHistory", "default.propTypes.onClick")
      @js.native
      val onClick: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerHistory", "default.propTypes.previous")
      @js.native
      val previous: Validator[js.Object] = js.native
      
      @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerHistory", "default.propTypes.show")
      @js.native
      val show: Validator[Boolean] = js.native
    }
  }
}
