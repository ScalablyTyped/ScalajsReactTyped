package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLoaderMod {
  
  @JSImport("wix-style-react/dist/types/Loader", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[LoaderProps, js.Object, Any]
  
  type Loader = PureComponent[LoaderProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.blue
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.white
  */
  trait LoaderColor extends StObject
  object LoaderColor {
    
    inline def blue: typingsJapgolly.wixStyleReact.wixStyleReactStrings.blue = "blue".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.blue]
    
    inline def white: typingsJapgolly.wixStyleReact.wixStyleReactStrings.white = "white".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.white]
  }
  
  trait LoaderProps extends StObject {
    
    var color: js.UndefOr[LoaderColor] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[LoaderSize] = js.undefined
    
    var status: js.UndefOr[LoaderStatus] = js.undefined
    
    var statusMessage: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[Node] = js.undefined
  }
  object LoaderProps {
    
    inline def apply(): LoaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderProps]
    }
    
    extension [Self <: LoaderProps](x: Self) {
      
      inline def setColor(value: LoaderColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setSize(value: LoaderSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: LoaderStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setText(value: VdomNode): Self = StObject.set(x, "text", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "text", js.Array(value*))
      
      inline def setTextVdomElement(value: VdomElement): Self = StObject.set(x, "text", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
  */
  trait LoaderSize extends StObject
  object LoaderSize {
    
    inline def large: typingsJapgolly.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.success
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.error
  */
  trait LoaderStatus extends StObject
  object LoaderStatus {
    
    inline def error: typingsJapgolly.wixStyleReact.wixStyleReactStrings.error = "error".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.error]
    
    inline def loading: typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading = "loading".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading]
    
    inline def success: typingsJapgolly.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.success]
  }
}
