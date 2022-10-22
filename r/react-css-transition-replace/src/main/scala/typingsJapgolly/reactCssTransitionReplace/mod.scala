package typingsJapgolly.reactCssTransitionReplace

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-css-transition-replace", JSImport.Namespace)
  @js.native
  val ^ : CSSTransitionReplace = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-css-transition-replace", JSImport.Namespace)
  @js.native
  open class Class protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    def this(props: Props, context: Any) = this()
  }
  
  type CSSTransitionReplace = ComponentClassP[Props & js.Object]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.CSSTransitionGroupProps * / any */ trait Props extends StObject {
    
    var changeWidth: js.UndefOr[Boolean] = js.undefined
    
    var overflowHidden: js.UndefOr[Boolean] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChangeWidth(value: Boolean): Self = StObject.set(x, "changeWidth", value.asInstanceOf[js.Any])
      
      inline def setChangeWidthUndefined: Self = StObject.set(x, "changeWidth", js.undefined)
      
      inline def setOverflowHidden(value: Boolean): Self = StObject.set(x, "overflowHidden", value.asInstanceOf[js.Any])
      
      inline def setOverflowHiddenUndefined: Self = StObject.set(x, "overflowHidden", js.undefined)
    }
  }
  
  type _To = CSSTransitionReplace
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CSSTransitionReplace = ^
}
