package typingsJapgolly.reactScrollSync.components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactScrollSync.mod.ScrollSyncPaneProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollSyncPane {
  
  @JSImport("react-scroll-sync", "ScrollSyncPane")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def attachTo(value: HTMLElement): this.type = set("attachTo", value.asInstanceOf[js.Any])
    
    inline def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    inline def group(value: String | js.Array[String]): this.type = set("group", value.asInstanceOf[js.Any])
    
    inline def groupVarargs(value: String*): this.type = set("group", js.Array(value*))
  }
  
  implicit def make(companion: ScrollSyncPane.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScrollSyncPaneProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
