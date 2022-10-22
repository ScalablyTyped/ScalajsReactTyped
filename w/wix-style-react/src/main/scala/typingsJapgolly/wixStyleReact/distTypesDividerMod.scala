package typingsJapgolly.wixStyleReact

import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDividerMod {
  
  @JSImport("wix-style-react/dist/types/Divider", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[DividerProps, js.Object, Any]
  
  type Divider = PureComponent[DividerProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.horizontal
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.vertical
  */
  trait DividerDirection extends StObject
  object DividerDirection {
    
    inline def horizontal: typingsJapgolly.wixStyleReact.wixStyleReactStrings.horizontal = "horizontal".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.horizontal]
    
    inline def vertical: typingsJapgolly.wixStyleReact.wixStyleReactStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.vertical]
  }
  
  trait DividerProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[DividerDirection] = js.undefined
    
    var skin: js.UndefOr[DividerSkin] = js.undefined
  }
  object DividerProps {
    
    inline def apply(): DividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DividerProps]
    }
    
    extension [Self <: DividerProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDirection(value: DividerDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setSkin(value: DividerSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.light
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.success
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium
  */
  trait DividerSkin extends StObject
  object DividerSkin {
    
    inline def dark: typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def destructive: typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive = "destructive".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive]
    
    inline def light: typingsJapgolly.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.light]
    
    inline def premium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def standard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def success: typingsJapgolly.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.success]
    
    inline def warning: typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning]
  }
}
