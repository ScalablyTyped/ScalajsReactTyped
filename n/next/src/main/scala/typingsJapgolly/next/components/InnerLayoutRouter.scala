package typingsJapgolly.next.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.next.anon.ChildNodes
import typingsJapgolly.next.distServerAppRenderMod.ChildProp
import typingsJapgolly.next.distServerAppRenderMod.FlightRouterState
import typingsJapgolly.next.distServerAppRenderMod.FlightSegmentPath
import typingsJapgolly.next.distSharedLibAppRouterContextMod.ChildSegmentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InnerLayoutRouter {
  
  inline def apply(
    childNodes: ChildSegmentMap,
    isActive: Boolean,
    parallelRouterKey: String,
    path: String,
    rootLayoutIncluded: Boolean,
    segmentPath: FlightSegmentPath,
    tree: FlightRouterState,
    url: String
  ): Builder = {
    val __props = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], parallelRouterKey = parallelRouterKey.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rootLayoutIncluded = rootLayoutIncluded.asInstanceOf[js.Any], segmentPath = segmentPath.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ChildNodes]))
  }
  
  @JSImport("next/dist/client/components/layout-router.client", "InnerLayoutRouter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def childProp(value: ChildProp): this.type = set("childProp", value.asInstanceOf[js.Any])
    
    inline def childPropNull: this.type = set("childProp", null)
  }
  
  def withProps(p: ChildNodes): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
