package typingsJapgolly.reactSelect

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.emotionUtils.mod.EmotionCache
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcNonceProviderMod {
  
  @JSImport("react-select/dist/declarations/src/NonceProvider", JSImport.Default)
  @js.native
  open class default protected () extends NonceProvider {
    def this(props: NonceProviderProps) = this()
  }
  
  @js.native
  trait NonceProvider
    extends Component[NonceProviderProps, js.Object, Any] {
    
    def createEmotionCache(nonce: String, key: String): EmotionCache = js.native
  }
  
  trait NonceProviderProps extends StObject {
    
    var cacheKey: String
    
    var children: Node
    
    var nonce: String
  }
  object NonceProviderProps {
    
    inline def apply(cacheKey: String, nonce: String): NonceProviderProps = {
      val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[NonceProviderProps]
    }
    
    extension [Self <: NonceProviderProps](x: Self) {
      
      inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    }
  }
}
