package typingsJapgolly.wixStyleReact

import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStatusIndicatorMod {
  
  @JSImport("wix-style-react/dist/types/StatusIndicator", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[StatusIndicatorProps, js.Object, Any]
  
  type StatusIndicator = PureComponent[StatusIndicatorProps, js.Object, Any]
  
  trait StatusIndicatorProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[StatusIndicatorState] = js.undefined
    
    var tooltipPlacement: js.UndefOr[StatusIndicatorTooltipPlacement] = js.undefined
  }
  object StatusIndicatorProps {
    
    inline def apply(): StatusIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusIndicatorProps]
    }
    
    extension [Self <: StatusIndicatorProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setStatus(value: StatusIndicatorState): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTooltipPlacement(value: StatusIndicatorTooltipPlacement): Self = StObject.set(x, "tooltipPlacement", value.asInstanceOf[js.Any])
      
      inline def setTooltipPlacementUndefined: Self = StObject.set(x, "tooltipPlacement", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.error
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading
  */
  trait StatusIndicatorState extends StObject
  object StatusIndicatorState {
    
    inline def error: typingsJapgolly.wixStyleReact.wixStyleReactStrings.error = "error".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.error]
    
    inline def loading: typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading = "loading".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading]
    
    inline def warning: typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.top
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.right
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.bottom
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.left
  */
  trait StatusIndicatorTooltipPlacement extends StObject
  object StatusIndicatorTooltipPlacement {
    
    inline def bottom: typingsJapgolly.wixStyleReact.wixStyleReactStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.bottom]
    
    inline def left: typingsJapgolly.wixStyleReact.wixStyleReactStrings.left = "left".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.left]
    
    inline def right: typingsJapgolly.wixStyleReact.wixStyleReactStrings.right = "right".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.right]
    
    inline def top: typingsJapgolly.wixStyleReact.wixStyleReactStrings.top = "top".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.top]
  }
}
