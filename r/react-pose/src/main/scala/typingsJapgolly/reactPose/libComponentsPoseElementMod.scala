package typingsJapgolly.reactPose

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import typingsJapgolly.popmotionPose.libTypesMod.DomPopmotionConfig
import typingsJapgolly.popmotionPose.libTypesMod.DomPopmotionPoser
import typingsJapgolly.react.mod.ConsumerProps
import typingsJapgolly.react.mod.ExoticComponent
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.reactPose.anon.Dictkey
import typingsJapgolly.reactPose.libComponentsPoseElementTypesMod.ChildRegistration
import typingsJapgolly.reactPose.libComponentsPoseElementTypesMod.CurrentPose
import typingsJapgolly.reactPose.libComponentsPoseElementTypesMod.PopStyle
import typingsJapgolly.reactPose.libComponentsPoseElementTypesMod.PoseElementInternalProps
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPoseElementMod {
  
  @JSImport("react-pose/lib/components/PoseElement", "PoseElement")
  @js.native
  open class PoseElement protected ()
    extends PureComponent[PoseElementInternalProps, js.Object, Any] {
    def this(props: PoseElementInternalProps) = this()
    
    var children: Set[ChildRegistration] = js.native
    
    /* private */ var childrenHandlers: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPoseElement(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPoseElement(prevProps: PoseElementInternalProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPoseElement(): Unit = js.native
    
    def flushChildren(): Unit = js.native
    
    def getFirstPose(): CurrentPose | Unit = js.native
    
    def getInitialPose(): CurrentPose | Unit = js.native
    
    def getSetProps(): Dictkey = js.native
    
    @JSName("getSnapshotBeforeUpdate")
    def getSnapshotBeforeUpdate_MPoseElement(): Null = js.native
    
    def initPoser(poser: DomPopmotionPoser): Unit = js.native
    
    var popStyle: js.UndefOr[PopStyle] = js.native
    
    var poseConfig: DomPopmotionConfig = js.native
    
    var poser: DomPopmotionPoser = js.native
    
    var ref: Element = js.native
    
    def setPose(pose: CurrentPose): Unit = js.native
    
    def setRef(ref: Element): Unit = js.native
    
    def shouldForwardProp(key: String): Boolean = js.native
    
    var styleProps: StringDictionary[Any] = js.native
  }
  
  @JSImport("react-pose/lib/components/PoseElement", "PoseParentConsumer")
  @js.native
  val PoseParentConsumer: ExoticComponent[ConsumerProps[js.Object]] = js.native
}
