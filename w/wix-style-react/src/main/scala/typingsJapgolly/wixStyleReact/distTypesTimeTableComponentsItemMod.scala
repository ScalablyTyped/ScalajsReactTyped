package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.ClassNameDisabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimeTableComponentsItemMod {
  
  object default {
    
    inline def apply(hasDisabledDraggableChildrenClassName: ClassNameDisabled): Element = ^.asInstanceOf[js.Dynamic].apply(hasDisabledDraggableChildrenClassName.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/TimeTable/components/Item", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/TimeTable/components/Item", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/TimeTable/components/Item", "default.propTypes.disabled")
      @js.native
      val disabled: Validator[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/TimeTable/components/Item", "default.propTypes.draggable")
      @js.native
      val draggable: Validator[Boolean] = js.native
    }
  }
}
