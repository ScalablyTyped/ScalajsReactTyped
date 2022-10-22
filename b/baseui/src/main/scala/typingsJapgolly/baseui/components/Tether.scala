package typingsJapgolly.baseui.components

import typingsJapgolly.baseui.layerTetherMod.default
import typingsJapgolly.baseui.layerTypesMod.NormalizedOffsets
import typingsJapgolly.baseui.layerTypesMod.PopperDataObject
import typingsJapgolly.baseui.layerTypesMod.TetherPlacement
import typingsJapgolly.baseui.layerTypesMod.TetherProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tether {
  
  inline def apply(
    onPopperUpdate: (NormalizedOffsets, PopperDataObject) => Any,
    placement: TetherPlacement,
    popperOptions: Any
  ): SharedBuilder_TetherProps721941856[default] = {
    val __props = js.Dynamic.literal(onPopperUpdate = js.Any.fromFunction2(onPopperUpdate), placement = placement.asInstanceOf[js.Any], popperOptions = popperOptions.asInstanceOf[js.Any])
    new SharedBuilder_TetherProps721941856[default](js.Array(this.component, __props.asInstanceOf[TetherProps]))
  }
  
  @JSImport("baseui/layer/tether", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TetherProps): SharedBuilder_TetherProps721941856[default] = new SharedBuilder_TetherProps721941856[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
