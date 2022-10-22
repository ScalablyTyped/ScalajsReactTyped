package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.DetailedReactHTMLElement
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.First
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHighlighterHighlightedItemMod {
  
  @JSImport("wix-style-react/dist/types/Highlighter/HighlightedItem", JSImport.Default)
  @js.native
  open class default protected () extends HighlightedItem {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Highlighter/HighlightedItem", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Highlighter/HighlightedItem", "default.propTypes.caseSensitive")
      @js.native
      def caseSensitive: Requireable[Boolean] = js.native
      inline def caseSensitive_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/Highlighter/HighlightedItem", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Highlighter/HighlightedItem", "default.propTypes.match")
      @js.native
      val `match`: Requireable[String] = js.native
    }
  }
  
  @js.native
  trait HighlightedItem extends PureComponent[Any, Any, Any] {
    
    def getMatchBoundaries(subject: Any, matchRegExp: Any): js.UndefOr[First] = js.native
    
    def getMatchReactKey(index: Any): String = js.native
    
    def getMatchRegExp(): js.RegExp = js.native
    
    def highlightChildren(children: Any, matchRegExp: Any): js.Array[Element] = js.native
    
    def renderElement(): Node = js.native
    
    def renderHighlight(matchString: Any, key: Any): DetailedReactHTMLElement[HTMLAttributes[HTMLElement], HTMLElement] = js.native
    
    def renderPlain(plainString: Any, key: Any): Element = js.native
  }
}
