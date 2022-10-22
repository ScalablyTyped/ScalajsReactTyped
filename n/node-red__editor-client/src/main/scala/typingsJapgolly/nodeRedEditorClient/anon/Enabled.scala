package typingsJapgolly.nodeRedEditorClient.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodeRedEditorClient.mod.NodeInstance
import typingsJapgolly.nodeRedEditorClient.mod.NodeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled[TInstProps /* <: TProps */, TProps /* <: NodeProperties */] extends StObject {
  
  /** Function to dynamically enable and disable the button based on the node’s current configuration. */
  var enabled: js.UndefOr[js.ThisFunction0[/* this */ NodeInstance[TInstProps], Boolean]] = js.undefined
  
  /** Called when the button is clicked */
  def onclick(): Unit
  
  /** Function to determine whether the button should be shown at all. */
  var visible: js.UndefOr[js.ThisFunction0[/* this */ NodeInstance[TInstProps], Boolean]] = js.undefined
}
object Enabled {
  
  inline def apply[TInstProps /* <: TProps */, TProps /* <: NodeProperties */](onclick: Callback): Enabled[TInstProps, TProps] = {
    val __obj = js.Dynamic.literal(onclick = onclick.toJsFn)
    __obj.asInstanceOf[Enabled[TInstProps, TProps]]
  }
  
  extension [Self <: Enabled[?, ?], TInstProps /* <: TProps */, TProps /* <: NodeProperties */](x: Self & (Enabled[TInstProps, TProps])) {
    
    inline def setEnabled(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setOnclick(value: Callback): Self = StObject.set(x, "onclick", value.toJsFn)
    
    inline def setVisible(value: js.ThisFunction0[/* this */ NodeInstance[TInstProps], Boolean]): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
