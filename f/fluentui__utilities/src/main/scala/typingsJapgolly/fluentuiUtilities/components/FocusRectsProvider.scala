package typingsJapgolly.fluentuiUtilities.components

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiUtilities.libFocusRectsProviderMod.FocusRectsProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FocusRectsProvider {
  
  inline def apply(providerRef: RefHandle[HTMLElement]): Builder = {
    val __props = js.Dynamic.literal(providerRef = providerRef.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FocusRectsProviderProps]))
  }
  
  @JSImport("@fluentui/utilities", "FocusRectsProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def layerRoot(value: Boolean): this.type = set("layerRoot", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FocusRectsProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
