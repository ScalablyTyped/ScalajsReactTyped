package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesCommonScrollableContainerMod.ScrollAreaData
import typingsJapgolly.wixStyleReact.distTypesCommonScrollableContainerMod.ScrollableContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollableContainer {
  
  @JSImport("wix-style-react/dist/types/common/ScrollableContainer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def onScrollAreaChanged(value: /* scrollChangedData */ ScrollAreaData => Callback): this.type = set("onScrollAreaChanged", js.Any.fromFunction1((t0: /* scrollChangedData */ ScrollAreaData) => value(t0).runNow()))
    
    inline def onScrollChanged(value: /* target */ HTMLElement => Callback): this.type = set("onScrollChanged", js.Any.fromFunction1((t0: /* target */ HTMLElement) => value(t0).runNow()))
    
    inline def scrollThrottleWait(value: Double): this.type = set("scrollThrottleWait", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ScrollableContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScrollableContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
