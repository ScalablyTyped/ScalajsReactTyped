package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.ReactNodeArray
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInfoIconInfoIconMod {
  
  object default {
    
    inline def apply(hasDataHookContentSizeTooltipPropsClassName: Content): Element = ^.asInstanceOf[js.Dynamic].apply(hasDataHookContentSizeTooltipPropsClassName.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/InfoIcon/InfoIcon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/InfoIcon/InfoIcon", "default.defaultProps.size_1")
      @js.native
      val size1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/InfoIcon/InfoIcon", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/InfoIcon/InfoIcon", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/InfoIcon/InfoIcon", "default.propTypes.content")
      @js.native
      val content: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      
      @JSImport("wix-style-react/dist/types/InfoIcon/InfoIcon", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/InfoIcon/InfoIcon", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/InfoIcon/InfoIcon", "default.propTypes.tooltipProps")
      @js.native
      val tooltipProps: Requireable[InferProps[Any]] = js.native
    }
  }
}
