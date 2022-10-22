package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticTRANSITIONS
import typingsJapgolly.semanticUiReact.distCommonjsModulesTransitionTransitionMod.TransitionPropDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesTransitionTransitionGroupMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Transition/TransitionGroup", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[TransitionGroupProps, js.Object, Any] {
    def this(props: TransitionGroupProps) = this()
    def this(props: TransitionGroupProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Transition/TransitionGroup", JSImport.Default)
  @js.native
  val default: ComponentClassP[TransitionGroupProps & js.Object] = js.native
  
  trait StrictTransitionGroupProps extends StObject {
    
    /** Named animation event to used. Must be defined in CSS. */
    var animation: js.UndefOr[SemanticTRANSITIONS | String] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Whether it is directional animation event or not. Use it only for custom transitions. */
    var directional: js.UndefOr[Boolean] = js.undefined
    
    /** Duration of the CSS transition animation in milliseconds. */
    var duration: js.UndefOr[Double | String | TransitionPropDuration] = js.undefined
  }
  object StrictTransitionGroupProps {
    
    inline def apply(): StrictTransitionGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTransitionGroupProps]
    }
    
    extension [Self <: StrictTransitionGroupProps](x: Self) {
      
      inline def setAnimation(value: SemanticTRANSITIONS | String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDirectional(value: Boolean): Self = StObject.set(x, "directional", value.asInstanceOf[js.Any])
      
      inline def setDirectionalUndefined: Self = StObject.set(x, "directional", js.undefined)
      
      inline def setDuration(value: Double | String | TransitionPropDuration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
  
  type TransitionGroupComponent = ComponentClassP[TransitionGroupProps & js.Object]
  
  trait TransitionGroupProps
    extends StObject
       with StrictTransitionGroupProps
       with /* key */ StringDictionary[Any]
  object TransitionGroupProps {
    
    inline def apply(): TransitionGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionGroupProps]
    }
  }
  
  type _To = ComponentClassP[TransitionGroupProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesTransitionTransitionGroupMod.foo` */
  override def _to: ComponentClassP[TransitionGroupProps & js.Object] = default
}
