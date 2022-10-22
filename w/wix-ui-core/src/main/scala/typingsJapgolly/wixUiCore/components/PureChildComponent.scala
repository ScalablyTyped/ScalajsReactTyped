package typingsJapgolly.wixUiCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcHocsFocusableFocusableHOCDotdriverMod.IPureChildComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PureChildComponent {
  
  inline def apply(focusableOnBlur: Any, focusableOnFocus: Any, id: String): Builder = {
    val __props = js.Dynamic.literal(focusableOnBlur = focusableOnBlur.asInstanceOf[js.Any], focusableOnFocus = focusableOnFocus.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IPureChildComponentProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src/hocs/Focusable/FocusableHOC.driver", "PureChildComponent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.wixUiCore.distEsSrcHocsFocusableFocusableHOCDotdriverMod.PureChildComponent
        ] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IPureChildComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
