package typingsJapgolly.reactToolbox

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsCardCardTextMod {
  
  @JSImport("react-toolbox/components/card/CardText", JSImport.Default)
  @js.native
  open class default protected () extends CardText {
    def this(props: CardTextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CardTextProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/card/CardText", "CardText")
  @js.native
  open class CardText protected ()
    extends Component[CardTextProps, js.Object, Any] {
    def this(props: CardTextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CardTextProps, context: Any) = this()
  }
  
  trait CardTextProps
    extends StObject
       with Props
       with /**
    * Additional properties passed to inner input element.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[CardTextTheme] = js.undefined
  }
  object CardTextProps {
    
    inline def apply(): CardTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardTextProps]
    }
    
    extension [Self <: CardTextProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTheme(value: CardTextTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait CardTextTheme extends StObject {
    
    /**
      * Used for the main root element.
      */
    var cardText: js.UndefOr[String] = js.undefined
  }
  object CardTextTheme {
    
    inline def apply(): CardTextTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardTextTheme]
    }
    
    extension [Self <: CardTextTheme](x: Self) {
      
      inline def setCardText(value: String): Self = StObject.set(x, "cardText", value.asInstanceOf[js.Any])
      
      inline def setCardTextUndefined: Self = StObject.set(x, "cardText", js.undefined)
    }
  }
}
