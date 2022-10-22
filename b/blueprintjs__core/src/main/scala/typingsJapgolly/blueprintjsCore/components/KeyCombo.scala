package typingsJapgolly.blueprintjsCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysKeyComboMod.IKeyComboProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KeyCombo {
  
  inline def apply(combo: String): Builder = {
    val __props = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IKeyComboProps]))
  }
  
  @JSImport("@blueprintjs/core", "KeyCombo")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.KeyCombo] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def minimal(value: Boolean): this.type = set("minimal", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IKeyComboProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
