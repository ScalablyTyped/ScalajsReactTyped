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

object componentsCardCardActionsMod {
  
  @JSImport("react-toolbox/components/card/CardActions", JSImport.Default)
  @js.native
  open class default protected () extends CardActions {
    def this(props: CardActionsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CardActionsProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/card/CardActions", "CardActions")
  @js.native
  open class CardActions protected ()
    extends Component[CardActionsProps, js.Object, Any] {
    def this(props: CardActionsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CardActionsProps, context: Any) = this()
  }
  
  trait CardActionsProps
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
    var theme: js.UndefOr[CardActionsTheme] = js.undefined
  }
  object CardActionsProps {
    
    inline def apply(): CardActionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardActionsProps]
    }
    
    extension [Self <: CardActionsProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTheme(value: CardActionsTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait CardActionsTheme extends StObject {
    
    /**
      * Used for a wrapper around actions as the root element.
      */
    var cardActions: js.UndefOr[String] = js.undefined
  }
  object CardActionsTheme {
    
    inline def apply(): CardActionsTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardActionsTheme]
    }
    
    extension [Self <: CardActionsTheme](x: Self) {
      
      inline def setCardActions(value: String): Self = StObject.set(x, "cardActions", value.asInstanceOf[js.Any])
      
      inline def setCardActionsUndefined: Self = StObject.set(x, "cardActions", js.undefined)
    }
  }
}
