package typingsJapgolly.reactScrollSync.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactScrollSync.mod.ScrollSyncProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollSync {
  
  @JSImport("react-scroll-sync", "ScrollSync")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def onSync(value: /* el */ Element => Callback): this.type = set("onSync", js.Any.fromFunction1((t0: /* el */ Element) => value(t0).runNow()))
    
    inline def proportional(value: Boolean): this.type = set("proportional", value.asInstanceOf[js.Any])
    
    inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ScrollSync.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScrollSyncProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
