package typingsJapgolly.reactIntl

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcComponentsPluralMod extends Shortcut {
  
  @JSImport("react-intl/lib/src/components/plural", JSImport.Default)
  @js.native
  val default: FC[Props] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatPluralOptions * / any */ trait Props extends StObject {
    
    var children: js.UndefOr[js.Function1[/* value */ Node, Element | Null]] = js.undefined
    
    var few: js.UndefOr[Node] = js.undefined
    
    var many: js.UndefOr[Node] = js.undefined
    
    var one: js.UndefOr[Node] = js.undefined
    
    var other: Node
    
    var two: js.UndefOr[Node] = js.undefined
    
    var value: Double
    
    var zero: js.UndefOr[Node] = js.undefined
  }
  object Props {
    
    inline def apply(value: Double): Props = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], other = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: /* value */ Node => Element | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFew(value: VdomNode): Self = StObject.set(x, "few", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFewNull: Self = StObject.set(x, "few", null)
      
      inline def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
      
      inline def setFewVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "few", js.Array(value*))
      
      inline def setFewVdomElement(value: VdomElement): Self = StObject.set(x, "few", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMany(value: VdomNode): Self = StObject.set(x, "many", value.rawNode.asInstanceOf[js.Any])
      
      inline def setManyNull: Self = StObject.set(x, "many", null)
      
      inline def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
      
      inline def setManyVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "many", js.Array(value*))
      
      inline def setManyVdomElement(value: VdomElement): Self = StObject.set(x, "many", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOne(value: VdomNode): Self = StObject.set(x, "one", value.rawNode.asInstanceOf[js.Any])
      
      inline def setOneNull: Self = StObject.set(x, "one", null)
      
      inline def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
      
      inline def setOneVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "one", js.Array(value*))
      
      inline def setOneVdomElement(value: VdomElement): Self = StObject.set(x, "one", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOther(value: VdomNode): Self = StObject.set(x, "other", value.rawNode.asInstanceOf[js.Any])
      
      inline def setOtherNull: Self = StObject.set(x, "other", null)
      
      inline def setOtherVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "other", js.Array(value*))
      
      inline def setOtherVdomElement(value: VdomElement): Self = StObject.set(x, "other", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTwo(value: VdomNode): Self = StObject.set(x, "two", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTwoNull: Self = StObject.set(x, "two", null)
      
      inline def setTwoUndefined: Self = StObject.set(x, "two", js.undefined)
      
      inline def setTwoVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "two", js.Array(value*))
      
      inline def setTwoVdomElement(value: VdomElement): Self = StObject.set(x, "two", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setZero(value: VdomNode): Self = StObject.set(x, "zero", value.rawNode.asInstanceOf[js.Any])
      
      inline def setZeroNull: Self = StObject.set(x, "zero", null)
      
      inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
      
      inline def setZeroVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "zero", js.Array(value*))
      
      inline def setZeroVdomElement(value: VdomElement): Self = StObject.set(x, "zero", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[Props]
  
  /* This means you don't have to write `default`, but can instead just say `libSrcComponentsPluralMod.foo` */
  override def _to: FC[Props] = default
}
