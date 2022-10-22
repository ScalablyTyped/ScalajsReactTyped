package typingsJapgolly.antDesignPro.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.antDesignProStrings.down
import typingsJapgolly.antDesignPro.antDesignProStrings.up
import typingsJapgolly.antDesignPro.libTrendMod.ITrendProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Trend {
  
  inline def apply(flag: up | down): Builder = {
    val __props = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITrendProps]))
  }
  
  @JSImport("ant-design-pro", "Trend")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.mod.Trend] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def colorful(value: Boolean): this.type = set("colorful", value.asInstanceOf[js.Any])
    
    inline def reverseColor(value: Boolean): this.type = set("reverseColor", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITrendProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
