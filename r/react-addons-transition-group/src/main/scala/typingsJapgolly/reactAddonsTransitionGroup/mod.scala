package typingsJapgolly.reactAddonsTransitionGroup

import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactAddonsTransitionGroup.mod.reactAugmentingMod.TransitionGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-addons-transition-group", JSImport.Namespace)
  @js.native
  val ^ : ReactTransitionGroup = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-addons-transition-group", JSImport.Namespace)
  @js.native
  open class Class protected ()
    extends Component[TransitionGroupProps, js.Object, Any] {
    def this(props: TransitionGroupProps) = this()
    def this(props: TransitionGroupProps, context: Any) = this()
  }
  
  type ReactTransitionGroup = ComponentClassP[TransitionGroupProps & js.Object]
  
  type _To = ReactTransitionGroup
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ReactTransitionGroup = ^
  
  /* augmented module */
  object reactAugmentingMod {
    
    trait HTMLTransitionGroupProps[T]
      extends StObject
         with HTMLAttributes[T] {
      
      var childFactory: js.UndefOr[js.Function1[/* child */ Element, Element]] = js.undefined
      
      var component: js.UndefOr[ElementType] = js.undefined
    }
    object HTMLTransitionGroupProps {
      
      inline def apply[T](): HTMLTransitionGroupProps[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTMLTransitionGroupProps[T]]
      }
      
      extension [Self <: HTMLTransitionGroupProps[?], T](x: Self & HTMLTransitionGroupProps[T]) {
        
        inline def setChildFactory(value: /* child */ Element => Element): Self = StObject.set(x, "childFactory", js.Any.fromFunction1(value))
        
        inline def setChildFactoryUndefined: Self = StObject.set(x, "childFactory", js.undefined)
        
        inline def setComponent(value: ElementType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
        
        inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      }
    }
    
    trait TransitionGroupProps
      extends StObject
         with HTMLTransitionGroupProps[ComponentClassP[TransitionGroupProps & js.Object]]
    object TransitionGroupProps {
      
      inline def apply(): TransitionGroupProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TransitionGroupProps]
      }
    }
  }
}
