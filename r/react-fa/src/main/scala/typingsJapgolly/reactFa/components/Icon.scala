package typingsJapgolly.reactFa.components

import typingsJapgolly.reactFa.mod.IconCls
import typingsJapgolly.reactFa.mod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Icon {
  
  inline def apply(name: String): SharedBuilder_IconProps_819737972[IconCls] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconProps_819737972[IconCls](js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
  
  @JSImport("react-fa", "Icon")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconProps): SharedBuilder_IconProps_819737972[IconCls] = new SharedBuilder_IconProps_819737972[IconCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
