package typingsJapgolly.reactFullScreen.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFullScreen.distMod.FullScreenHandle
import typingsJapgolly.reactFullScreen.distMod.FullScreenProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FullScreen {
  
  inline def apply(children: Any, handle: FullScreenHandle): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FullScreenProps]))
  }
  
  @JSImport("react-full-screen/dist", "FullScreen")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def onChange(value: (/* state */ Boolean, /* handle */ FullScreenHandle) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* state */ Boolean, t1: /* handle */ FullScreenHandle) => (value(t0, t1)).runNow()))
  }
  
  def withProps(p: FullScreenProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
