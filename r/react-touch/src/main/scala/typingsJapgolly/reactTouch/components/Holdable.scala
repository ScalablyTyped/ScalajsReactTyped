package typingsJapgolly.reactTouch.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactTouch.mod.HoldableConfig
import typingsJapgolly.reactTouch.mod.HoldableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Holdable {
  
  @JSImport("react-touch", "Holdable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactTouch.mod.Holdable] {
    
    inline def config(value: HoldableConfig): this.type = set("config", value.asInstanceOf[js.Any])
    
    inline def onHoldComplete(value: Callback): this.type = set("onHoldComplete", value.toJsFn)
    
    inline def onHoldProgress(value: Callback): this.type = set("onHoldProgress", value.toJsFn)
    
    inline def onMouseDown(value: Callback): this.type = set("onMouseDown", value.toJsFn)
    
    inline def onTouchStart(value: Callback): this.type = set("onTouchStart", value.toJsFn)
  }
  
  implicit def make(companion: Holdable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HoldableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
