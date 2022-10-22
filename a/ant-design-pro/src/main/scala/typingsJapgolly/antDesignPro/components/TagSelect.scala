package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.anon.CollapseText
import typingsJapgolly.antDesignPro.libTagSelectMod.TagSelectProps
import typingsJapgolly.antDesignPro.libTagSelectTagSelectOptionMod.TagSelectOptionProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TagSelect {
  
  inline def apply(Option: TagSelectOptionProps, children: Element | js.Array[Element], className: String): Builder = {
    val __props = js.Dynamic.literal(Option = Option.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TagSelectProps]))
  }
  
  @JSImport("ant-design-pro", "TagSelect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.mod.TagSelect] {
    
    inline def actionsText(value: CollapseText): this.type = set("actionsText", value.asInstanceOf[js.Any])
    
    inline def expandable(value: Boolean): this.type = set("expandable", value.asInstanceOf[js.Any])
    
    inline def hideCheckAll(value: Boolean): this.type = set("hideCheckAll", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* value */ js.Array[String] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ js.Array[String]) => value(t0).runNow()))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Array[Double | String]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: (Double | String)*): this.type = set("value", js.Array(value*))
  }
  
  def withProps(p: TagSelectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
