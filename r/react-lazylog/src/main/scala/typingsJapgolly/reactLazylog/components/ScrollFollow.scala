package typingsJapgolly.reactLazylog.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactLazylog.buildScrollFollowMod.ScrollFollowProps
import typingsJapgolly.reactLazylog.buildScrollFollowMod.ScrollFollowRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollFollow {
  
  inline def apply(render: ScrollFollowRenderProps => Node): Builder = {
    val __props = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    new Builder(js.Array(this.component, __props.asInstanceOf[ScrollFollowProps]))
  }
  
  @JSImport("react-lazylog", "ScrollFollow")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactLazylog.mod.ScrollFollow] {
    
    inline def startFollowing(value: Boolean): this.type = set("startFollowing", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ScrollFollowProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
