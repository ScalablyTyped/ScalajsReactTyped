package typingsJapgolly.wixStyleReact

import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCounterBadgeMod {
  
  @JSImport("wix-style-react/dist/types/CounterBadge", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[CounterBadgeProps, js.Object, Any]
  
  type CounterBadge = PureComponent[CounterBadgeProps, js.Object, Any]
  
  trait CounterBadgeProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var showShadow: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[CounterBadgeSize] = js.undefined
    
    var skin: js.UndefOr[CounterBadgeSkin] = js.undefined
  }
  object CounterBadgeProps {
    
    inline def apply(): CounterBadgeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CounterBadgeProps]
    }
    
    extension [Self <: CounterBadgeProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setShowShadow(value: Boolean): Self = StObject.set(x, "showShadow", value.asInstanceOf[js.Any])
      
      inline def setShowShadowUndefined: Self = StObject.set(x, "showShadow", js.undefined)
      
      inline def setSize(value: CounterBadgeSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: CounterBadgeSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
  */
  trait CounterBadgeSize extends StObject
  object CounterBadgeSize {
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.general
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.danger
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.urgent
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.success
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralStandard
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.light
  */
  trait CounterBadgeSkin extends StObject
  object CounterBadgeSkin {
    
    inline def danger: typingsJapgolly.wixStyleReact.wixStyleReactStrings.danger = "danger".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.danger]
    
    inline def general: typingsJapgolly.wixStyleReact.wixStyleReactStrings.general = "general".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.general]
    
    inline def light: typingsJapgolly.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.light]
    
    inline def neutralStandard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralStandard = "neutralStandard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralStandard]
    
    inline def standard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def success: typingsJapgolly.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.success]
    
    inline def urgent: typingsJapgolly.wixStyleReact.wixStyleReactStrings.urgent = "urgent".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.urgent]
    
    inline def warning: typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning]
  }
}
