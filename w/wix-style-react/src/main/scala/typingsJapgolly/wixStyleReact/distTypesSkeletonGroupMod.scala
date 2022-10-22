package typingsJapgolly.wixStyleReact

import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSkeletonGroupMod {
  
  @JSImport("wix-style-react/dist/types/SkeletonGroup", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SkeletonGroupProps, js.Object, Any]
  
  type SkeletonGroup = PureComponent[SkeletonGroupProps, js.Object, Any]
  
  trait SkeletonGroupProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var skin: js.UndefOr[SkeletonGroupSkin] = js.undefined
  }
  object SkeletonGroupProps {
    
    inline def apply(): SkeletonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonGroupProps]
    }
    
    extension [Self <: SkeletonGroupProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setSkin(value: SkeletonGroupSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.light
  */
  trait SkeletonGroupSkin extends StObject
  object SkeletonGroupSkin {
    
    inline def dark: typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def light: typingsJapgolly.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.light]
  }
}
