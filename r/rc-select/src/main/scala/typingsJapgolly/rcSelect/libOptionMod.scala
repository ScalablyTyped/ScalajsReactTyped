package typingsJapgolly.rcSelect

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOptionMod extends Shortcut {
  
  /** This is a placeholder, not real render in dom */
  @JSImport("rc-select/lib/Option", JSImport.Default)
  @js.native
  val default: OptionFC = js.native
  
  @js.native
  trait OptionFC
    extends StObject
       with FunctionComponent[OptionProps] {
    
    /** Legacy for check if is a Option Group */
    var isSelectOption: Boolean = js.native
  }
  
  /* Inlined parent std.Omit<rc-select.rc-select/lib/Select.DefaultOptionType, 'label'> */
  trait OptionProps
    extends StObject
       with /* name */ StringDictionary[Any] {
    
    var children: Node
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String | Double | Null] = js.undefined
  }
  object OptionProps {
    
    inline def apply(): OptionProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[OptionProps]
    }
    
    extension [Self <: OptionProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = OptionFC
  
  /* This means you don't have to write `default`, but can instead just say `libOptionMod.foo` */
  override def _to: OptionFC = default
}
