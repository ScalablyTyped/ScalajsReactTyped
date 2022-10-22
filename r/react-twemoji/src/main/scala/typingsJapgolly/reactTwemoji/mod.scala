package typingsJapgolly.reactTwemoji

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-twemoji", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TwemojiProps, js.Object, Any]
  
  type Twemoji = japgolly.scalajs.react.facade.React.Component[TwemojiProps & js.Object, js.Object]
  
  trait TwemojiProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * When it is true, Twemoji will not render a wrapping element (with tag)
      * to contain its children. Note that since twemoji.parse needs a DOM element
      * reference, any direct pure text child of Twemoji is not parsed when
      * noWrapper is true. E.g. foo in
      * <Twemoji noWrapper={true}>foo<p>bar</p></Twemoji> is not parsed.
      */
    var noWrapper: js.UndefOr[Boolean] = js.undefined
    
    /**
      * twemoji.parse options.
      */
    var options: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The tag of the wrapping element. This option is ignored when noWrapper is
      * true.
      */
    var tag: js.UndefOr[String] = js.undefined
  }
  object TwemojiProps {
    
    inline def apply(): TwemojiProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TwemojiProps]
    }
    
    extension [Self <: TwemojiProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setNoWrapper(value: Boolean): Self = StObject.set(x, "noWrapper", value.asInstanceOf[js.Any])
      
      inline def setNoWrapperUndefined: Self = StObject.set(x, "noWrapper", js.undefined)
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
