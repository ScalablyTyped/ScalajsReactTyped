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
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticWIDTHS
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.equal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCollectionsFormFormGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Form/FormGroup", JSImport.Default)
  @js.native
  val default: FC[FormGroupProps] = js.native
  
  trait FormGroupProps
    extends StObject
       with StrictFormGroupProps
       with /* key */ StringDictionary[Any]
  object FormGroupProps {
    
    inline def apply(): FormGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormGroupProps]
    }
  }
  
  trait StrictFormGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Fields can show related choices. */
    var grouped: js.UndefOr[Boolean] = js.undefined
    
    /** Multiple fields may be inline in a row. */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /** A form group can prevent itself from stacking on mobile. */
    var unstackable: js.UndefOr[Boolean] = js.undefined
    
    /** Fields Groups can specify their width in grid columns or automatically divide fields to be equal width. */
    var widths: js.UndefOr[SemanticWIDTHS | equal] = js.undefined
  }
  object StrictFormGroupProps {
    
    inline def apply(): StrictFormGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFormGroupProps]
    }
    
    extension [Self <: StrictFormGroupProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setGrouped(value: Boolean): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
      
      inline def setGroupedUndefined: Self = StObject.set(x, "grouped", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setUnstackable(value: Boolean): Self = StObject.set(x, "unstackable", value.asInstanceOf[js.Any])
      
      inline def setUnstackableUndefined: Self = StObject.set(x, "unstackable", js.undefined)
      
      inline def setWidths(value: SemanticWIDTHS | equal): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
    }
  }
  
  type _To = FC[FormGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsCollectionsFormFormGroupMod.foo` */
  override def _to: FC[FormGroupProps] = default
}
