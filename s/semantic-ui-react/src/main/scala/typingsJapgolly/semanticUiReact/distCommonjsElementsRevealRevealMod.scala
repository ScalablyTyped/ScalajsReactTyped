package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.semanticUiReact.distCommonjsElementsRevealRevealContentMod.RevealContentProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`move down`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`move right`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`move up`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`rotate left`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`small fade`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.fade
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.move
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.rotate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsRevealRevealMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Reveal/Reveal", JSImport.Default)
  @js.native
  val default: RevealComponent = js.native
  
  @js.native
  trait RevealComponent
    extends StObject
       with FunctionComponent[RevealProps] {
    
    var Content: FC[RevealContentProps] = js.native
  }
  
  trait RevealProps
    extends StObject
       with StrictRevealProps
       with /* key */ StringDictionary[Any]
  object RevealProps {
    
    inline def apply(): RevealProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevealProps]
    }
  }
  
  trait StrictRevealProps extends StObject {
    
    /** An active reveal displays its hidden content. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An animation name that will be applied to Reveal. */
    var animated: js.UndefOr[
        fade | (`small fade`) | move | (`move right`) | (`move up`) | (`move down`) | rotate | (`rotate left`)
      ] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A disabled reveal will not animate when hovered. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** An element can show its content without delay. */
    var instant: js.UndefOr[Boolean] = js.undefined
  }
  object StrictRevealProps {
    
    inline def apply(): StrictRevealProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictRevealProps]
    }
    
    extension [Self <: StrictRevealProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAnimated(
        value: fade | (`small fade`) | move | (`move right`) | (`move up`) | (`move down`) | rotate | (`rotate left`)
      ): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInstant(value: Boolean): Self = StObject.set(x, "instant", value.asInstanceOf[js.Any])
      
      inline def setInstantUndefined: Self = StObject.set(x, "instant", js.undefined)
    }
  }
  
  type _To = RevealComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsRevealRevealMod.foo` */
  override def _to: RevealComponent = default
}
