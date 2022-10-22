package typingsJapgolly.antDesignPro.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.anon.Name
import typingsJapgolly.antDesignPro.libChartsTagCloudMod.ITagCloudProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TagCloud {
  
  inline def apply(data: js.Array[Name], height: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ITagCloudProps]))
  }
  
  @JSImport("ant-design-pro/lib/Charts", "TagCloud")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.libChartsMod.TagCloud] {
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ITagCloudProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
