package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.baseui.toastTypesMod.PlacementType
import typingsJapgolly.baseui.toastTypesMod.ToasterOverrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<baseui.baseui/toast/types.ToasterProps> */
trait PartialToasterProps extends StObject {
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var autoHideDuration: js.UndefOr[Double] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var closeable: js.UndefOr[Boolean] = js.undefined
  
  var overrides: js.UndefOr[ToasterOverrides] = js.undefined
  
  var placement: js.UndefOr[PlacementType] = js.undefined
  
  var resetAutoHideTimerOnUpdate: js.UndefOr[Boolean] = js.undefined
  
  var usePortal: js.UndefOr[Boolean] = js.undefined
}
object PartialToasterProps {
  
  inline def apply(): PartialToasterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialToasterProps]
  }
  
  extension [Self <: PartialToasterProps](x: Self) {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
    
    inline def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
    
    inline def setCloseableUndefined: Self = StObject.set(x, "closeable", js.undefined)
    
    inline def setOverrides(value: ToasterOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPlacement(value: PlacementType): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setResetAutoHideTimerOnUpdate(value: Boolean): Self = StObject.set(x, "resetAutoHideTimerOnUpdate", value.asInstanceOf[js.Any])
    
    inline def setResetAutoHideTimerOnUpdateUndefined: Self = StObject.set(x, "resetAutoHideTimerOnUpdate", js.undefined)
    
    inline def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
    
    inline def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
  }
}
