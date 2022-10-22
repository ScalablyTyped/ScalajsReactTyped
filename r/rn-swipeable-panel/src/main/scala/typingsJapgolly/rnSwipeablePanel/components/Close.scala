package typingsJapgolly.rnSwipeablePanel.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rnSwipeablePanel.distCloseMod.CloseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Close {
  
  inline def apply(onPress: Callback): Builder = {
    val __props = js.Dynamic.literal(onPress = onPress.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[CloseProps]))
  }
  
  @JSImport("rn-swipeable-panel/dist/Close", "Close")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def iconStyle(value: js.Object): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    
    inline def rootStyle(value: js.Object): this.type = set("rootStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CloseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
