package typingsJapgolly.reactPose.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.popmotionPose.libTypesMod.DomPopmotionConfig
import typingsJapgolly.popmotionPose.libTypesMod.DomPopmotionPoser
import typingsJapgolly.reactPose.anon.Current
import typingsJapgolly.reactPose.libComponentsPoseElementTypesMod.ChildRegistration
import typingsJapgolly.reactPose.libComponentsPoseElementTypesMod.ConfigFactory
import typingsJapgolly.reactPose.libComponentsPoseElementTypesMod.CurrentPose
import typingsJapgolly.reactPose.libComponentsPoseElementTypesMod.PoseElementInternalProps
import typingsJapgolly.reactPose.libComponentsPoseElementTypesMod.RefFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PoseElement {
  
  inline def apply(elementType: Any, poseConfig: DomPopmotionConfig | ConfigFactory): Builder = {
    val __props = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], poseConfig = poseConfig.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PoseElementInternalProps]))
  }
  
  @JSImport("react-pose/lib/components/PoseElement", "PoseElement")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactPose.libComponentsPoseElementMod.PoseElement] {
    
    inline def _pose(value: CurrentPose): this.type = set("_pose", value.asInstanceOf[js.Any])
    
    inline def _poseVarargs(value: String*): this.type = set("_pose", js.Array(value*))
    
    inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def getInitialPoseFromParent(value: CallbackTo[CurrentPose | Unit]): this.type = set("getInitialPoseFromParent", value.toJsFn)
    
    inline def getParentPoseConfig(value: CallbackTo[DomPopmotionConfig]): this.type = set("getParentPoseConfig", value.toJsFn)
    
    inline def initialPose(value: CurrentPose): this.type = set("initialPose", value.asInstanceOf[js.Any])
    
    inline def initialPoseVarargs(value: String*): this.type = set("initialPose", js.Array(value*))
    
    inline def innerRef(value: Current | RefFunc): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    inline def innerRefFunction1(value: /* el */ Element => Any): this.type = set("innerRef", js.Any.fromFunction1(value))
    
    inline def onPoseComplete(value: /* pose */ CurrentPose => Any): this.type = set("onPoseComplete", js.Any.fromFunction1(value))
    
    inline def onUnmount(value: /* child */ DomPopmotionPoser => Any): this.type = set("onUnmount", js.Any.fromFunction1(value))
    
    inline def pose(value: CurrentPose): this.type = set("pose", value.asInstanceOf[js.Any])
    
    inline def poseVarargs(value: String*): this.type = set("pose", js.Array(value*))
    
    inline def registerChild(value: /* props */ ChildRegistration => Callback): this.type = set("registerChild", js.Any.fromFunction1((t0: /* props */ ChildRegistration) => value(t0).runNow()))
    
    inline def withParent(value: Boolean): this.type = set("withParent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PoseElementInternalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
