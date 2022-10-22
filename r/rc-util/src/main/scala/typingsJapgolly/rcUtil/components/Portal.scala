package typingsJapgolly.rcUtil.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcUtil.libPortalMod.PortalProps
import typingsJapgolly.rcUtil.libPortalMod.PortalRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  inline def apply(getContainer: CallbackTo[HTMLElement]): Builder = {
    val __props = js.Dynamic.literal(getContainer = getContainer.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[PortalProps & RefAttributes[PortalRef]]))
  }
  
  @JSImport("rc-util/lib/Portal", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[PortalRef & js.Object] {
    
    inline def didUpdate(value: PortalProps => Callback): this.type = set("didUpdate", js.Any.fromFunction1((t0: PortalProps) => value(t0).runNow()))
  }
  
  def withProps(p: PortalProps & RefAttributes[PortalRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
