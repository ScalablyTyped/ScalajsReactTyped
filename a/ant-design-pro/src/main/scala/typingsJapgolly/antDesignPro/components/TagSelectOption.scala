package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.libTagSelectTagSelectOptionMod.TagSelectOptionProps
import typingsJapgolly.antDesignPro.libTagSelectTagSelectOptionMod.default
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TagSelectOption {
  
  @JSImport("ant-design-pro/lib/TagSelect/TagSelectOption", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* value */ String | Double, /* state */ Boolean) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* value */ String | Double, t1: /* state */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TagSelectOption.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TagSelectOptionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
