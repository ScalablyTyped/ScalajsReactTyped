package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixStyleReact.distTypesFloatingHelperMod.FloatingHelperAppearance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingHelperFloatingHelperContentMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelperContent", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[FloatingHelperContentProps, js.Object, Any] {
    def this(props: FloatingHelperContentProps) = this()
    def this(props: FloatingHelperContentProps, context: Any) = this()
  }
  @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelperContent", JSImport.Default)
  @js.native
  val default: ComponentClassP[FloatingHelperContentProps & js.Object] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelperContent", "FloatingHelperContent")
  @js.native
  open class FloatingHelperContent protected ()
    extends Component[FloatingHelperContentProps, js.Object, Any] {
    def this(props: FloatingHelperContentProps) = this()
    def this(props: FloatingHelperContentProps, context: Any) = this()
  }
  @JSImport("wix-style-react/dist/types/FloatingHelper/FloatingHelperContent", "FloatingHelperContent")
  @js.native
  val FloatingHelperContent: ComponentClassP[FloatingHelperContentProps & js.Object] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.white
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.lightPrimary
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.standardPrimary
  */
  trait FloatingHelperContentActionTheme extends StObject
  object FloatingHelperContentActionTheme {
    
    inline def lightPrimary: typingsJapgolly.wixStyleReact.wixStyleReactStrings.lightPrimary = "lightPrimary".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.lightPrimary]
    
    inline def premium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def standard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def standardPrimary: typingsJapgolly.wixStyleReact.wixStyleReactStrings.standardPrimary = "standardPrimary".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.standardPrimary]
    
    inline def white: typingsJapgolly.wixStyleReact.wixStyleReactStrings.white = "white".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.white]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.horizontal
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.vertical
  */
  trait FloatingHelperContentDirection extends StObject
  object FloatingHelperContentDirection {
    
    inline def horizontal: typingsJapgolly.wixStyleReact.wixStyleReactStrings.horizontal = "horizontal".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.horizontal]
    
    inline def vertical: typingsJapgolly.wixStyleReact.wixStyleReactStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.vertical]
  }
  
  trait FloatingHelperContentProps extends StObject {
    
    var actionText: js.UndefOr[String] = js.undefined
    
    var actionTheme: js.UndefOr[FloatingHelperContentActionTheme] = js.undefined
    
    var appearance: js.UndefOr[FloatingHelperAppearance] = js.undefined
    
    var body: Node
    
    var direction: js.UndefOr[FloatingHelperContentDirection] = js.undefined
    
    var footer: js.UndefOr[Node] = js.undefined
    
    var image: js.UndefOr[Node] = js.undefined
    
    var onActionClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object FloatingHelperContentProps {
    
    inline def apply(): FloatingHelperContentProps = {
      val __obj = js.Dynamic.literal(body = null)
      __obj.asInstanceOf[FloatingHelperContentProps]
    }
    
    extension [Self <: FloatingHelperContentProps](x: Self) {
      
      inline def setActionText(value: String): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
      
      inline def setActionTextUndefined: Self = StObject.set(x, "actionText", js.undefined)
      
      inline def setActionTheme(value: FloatingHelperContentActionTheme): Self = StObject.set(x, "actionTheme", value.asInstanceOf[js.Any])
      
      inline def setActionThemeUndefined: Self = StObject.set(x, "actionTheme", js.undefined)
      
      inline def setAppearance(value: FloatingHelperAppearance): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      inline def setBody(value: VdomNode): Self = StObject.set(x, "body", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "body", js.Array(value*))
      
      inline def setBodyVdomElement(value: VdomElement): Self = StObject.set(x, "body", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDirection(value: FloatingHelperContentDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setFooter(value: VdomNode): Self = StObject.set(x, "footer", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFooterNull: Self = StObject.set(x, "footer", null)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "footer", js.Array(value*))
      
      inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
      
      inline def setImage(value: VdomNode): Self = StObject.set(x, "image", value.rawNode.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setImageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "image", js.Array(value*))
      
      inline def setImageVdomElement(value: VdomElement): Self = StObject.set(x, "image", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnActionClick(value: Callback): Self = StObject.set(x, "onActionClick", value.toJsFn)
      
      inline def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ComponentClassP[FloatingHelperContentProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesFloatingHelperFloatingHelperContentMod.foo` */
  override def _to: ComponentClassP[FloatingHelperContentProps & js.Object] = default
}
