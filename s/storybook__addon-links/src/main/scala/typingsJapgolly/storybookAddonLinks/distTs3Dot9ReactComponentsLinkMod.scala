package typingsJapgolly.storybookAddonLinks

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

object distTs3Dot9ReactComponentsLinkMod {
  
  @JSImport("@storybook/addon-links/dist/ts3.9/react/components/link", JSImport.Default)
  @js.native
  open class default () extends LinkTo
  /* static members */
  object default {
    
    @JSImport("@storybook/addon-links/dist/ts3.9/react/components/link", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-links/dist/ts3.9/react/components/link", "default.defaultProps")
    @js.native
    def defaultProps: Props = js.native
    inline def defaultProps_=(x: Props): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LinkTo extends PureComponent[Props, State, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MLinkTo(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MLinkTo(prevProps: Props): Unit = js.native
    
    def handleClick(): Unit = js.native
    
    def updateHref(): js.Promise[Unit] = js.native
  }
  
  trait Props extends StObject {
    
    var children: Node
    
    var kind: String
    
    var story: String
  }
  object Props {
    
    inline def apply(kind: String, story: String): Props = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setStory(value: String): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var href: String
  }
  object State {
    
    inline def apply(href: String): State = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    }
  }
}
