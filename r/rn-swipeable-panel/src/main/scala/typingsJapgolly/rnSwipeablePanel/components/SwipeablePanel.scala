package typingsJapgolly.rnSwipeablePanel.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ScrollViewProps
import typingsJapgolly.rnSwipeablePanel.distPanelMod.SwipeablePanelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwipeablePanel {
  
  inline def apply(isActive: Boolean, onClose: Callback): Builder = {
    val __props = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], onClose = onClose.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[SwipeablePanelProps]))
  }
  
  @JSImport("rn-swipeable-panel", "SwipeablePanel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.rnSwipeablePanel.mod.SwipeablePanel] {
    
    inline def allowTouchOutside(value: Boolean): this.type = set("allowTouchOutside", value.asInstanceOf[js.Any])
    
    inline def barContainerStyle(value: js.Object): this.type = set("barContainerStyle", value.asInstanceOf[js.Any])
    
    inline def barStyle(value: js.Object): this.type = set("barStyle", value.asInstanceOf[js.Any])
    
    inline def closeIconStyle(value: js.Object): this.type = set("closeIconStyle", value.asInstanceOf[js.Any])
    
    inline def closeOnTouchOutside(value: Boolean): this.type = set("closeOnTouchOutside", value.asInstanceOf[js.Any])
    
    inline def closeRootStyle(value: js.Object): this.type = set("closeRootStyle", value.asInstanceOf[js.Any])
    
    inline def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
    
    inline def noBackgroundOpacity(value: Boolean): this.type = set("noBackgroundOpacity", value.asInstanceOf[js.Any])
    
    inline def noBar(value: Boolean): this.type = set("noBar", value.asInstanceOf[js.Any])
    
    inline def onlyLarge(value: Boolean): this.type = set("onlyLarge", value.asInstanceOf[js.Any])
    
    inline def onlySmall(value: Boolean): this.type = set("onlySmall", value.asInstanceOf[js.Any])
    
    inline def openLarge(value: Boolean): this.type = set("openLarge", value.asInstanceOf[js.Any])
    
    inline def scrollViewProps(value: ScrollViewProps): this.type = set("scrollViewProps", value.asInstanceOf[js.Any])
    
    inline def showCloseButton(value: Boolean): this.type = set("showCloseButton", value.asInstanceOf[js.Any])
    
    inline def smallPanelHeight(value: Double): this.type = set("smallPanelHeight", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SwipeablePanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
