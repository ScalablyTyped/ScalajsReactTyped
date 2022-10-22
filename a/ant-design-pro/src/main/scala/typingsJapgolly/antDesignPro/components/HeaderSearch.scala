package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.libHeaderSearchMod.HeaderSearchProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HeaderSearch {
  
  @JSImport("ant-design-pro", "HeaderSearch")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.mod.HeaderSearch] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataSource(value: js.Array[String]): this.type = set("dataSource", value.asInstanceOf[js.Any])
    
    inline def dataSourceVarargs(value: String*): this.type = set("dataSource", js.Array(value*))
    
    inline def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* value */ String => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onPressEnter(value: /* value */ String => Callback): this.type = set("onPressEnter", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onSearch(value: /* value */ String => Callback): this.type = set("onSearch", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onVisibleChange(value: /* visible */ Boolean => Callback): this.type = set("onVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: HeaderSearch.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HeaderSearchProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
