package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antDesignPro.anon.CollapseText
import typingsJapgolly.antDesignPro.anon.TypeofTagSelectOption
import typingsJapgolly.antDesignPro.libTagSelectTagSelectOptionMod.TagSelectOptionProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTagSelectMod {
  
  @JSImport("ant-design-pro/lib/TagSelect", JSImport.Default)
  @js.native
  open class default () extends TagSelect
  /* static members */
  object default {
    
    @JSImport("ant-design-pro/lib/TagSelect", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro/lib/TagSelect", "default.Option")
    @js.native
    def Option: TypeofTagSelectOption = js.native
    inline def Option_=(x: TypeofTagSelectOption): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Option")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TagSelect extends Component[TagSelectProps, Any, Any] {
    
    /* private */ var children: Element | js.Array[Element] = js.native
  }
  
  trait TagSelectProps extends StObject {
    
    var Option: TagSelectOptionProps
    
    var actionsText: js.UndefOr[CollapseText] = js.undefined
    
    var children: Element | js.Array[Element]
    
    var className: String
    
    var expandable: js.UndefOr[Boolean] = js.undefined
    
    var hideCheckAll: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.Array[String], Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var value: js.UndefOr[js.Array[Double | String]] = js.undefined
  }
  object TagSelectProps {
    
    inline def apply(Option: TagSelectOptionProps, children: Element | js.Array[Element], className: String): TagSelectProps = {
      val __obj = js.Dynamic.literal(Option = Option.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagSelectProps]
    }
    
    extension [Self <: TagSelectProps](x: Self) {
      
      inline def setActionsText(value: CollapseText): Self = StObject.set(x, "actionsText", value.asInstanceOf[js.Any])
      
      inline def setActionsTextUndefined: Self = StObject.set(x, "actionsText", js.undefined)
      
      inline def setChildren(value: Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
      
      inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
      
      inline def setHideCheckAll(value: Boolean): Self = StObject.set(x, "hideCheckAll", value.asInstanceOf[js.Any])
      
      inline def setHideCheckAllUndefined: Self = StObject.set(x, "hideCheckAll", js.undefined)
      
      inline def setOnChange(value: /* value */ js.Array[String] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ js.Array[String]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOption(value: TagSelectOptionProps): Self = StObject.set(x, "Option", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: js.Array[Double | String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (Double | String)*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
