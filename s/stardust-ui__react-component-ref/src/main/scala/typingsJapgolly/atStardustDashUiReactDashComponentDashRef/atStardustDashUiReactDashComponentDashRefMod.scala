package typingsJapgolly.atStardustDashUiReactDashComponentDashRef

import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.Node
import typingsJapgolly.atStardustDashUiReactDashComponentDashRef.distEsRefFindNodeMod.default
import typingsJapgolly.atStardustDashUiReactDashComponentDashRef.distEsTypesMod.RefProps
import typingsJapgolly.propDashTypes.propDashTypesMod.Requireable
import typingsJapgolly.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@stardust-ui/react-component-ref", JSImport.Namespace)
@js.native
object atStardustDashUiReactDashComponentDashRefMod extends js.Object {
  @js.native
  class RefFindNode () extends default
  
  @js.native
  class RefForward ()
    extends typingsJapgolly.atStardustDashUiReactDashComponentDashRef.distEsRefForwardMod.default
  
  val Ref: FunctionComponent[RefProps] = js.native
  val refPropType: Requireable[japgolly.scalajs.react.raw.React.Ref] = js.native
  /**
    * The function that correctly handles passing refs.
    *
    * @param ref An ref object or function
    * @param node A node that should be passed by ref
    */
  def handleRef[N](ref: japgolly.scalajs.react.raw.React.Ref, node: N): Unit = js.native
  /** Checks that the passed object is a valid React ref object. */
  def isRefObject(ref: js.Any): /* is react.react.RefObject<any> */ Boolean = js.native
  /** Creates a React ref object from existing DOM node. */
  def toRefObject[T /* <: Node */](node: T): RefHandle[T] = js.native
  /* static members */
  @js.native
  object RefFindNode extends js.Object {
    var displayName: String = js.native
    var propTypes: Anon_Children | Anon_ChildrenInnerRef = js.native
  }
  
  /* static members */
  @js.native
  object RefForward extends js.Object {
    var displayName: String = js.native
    var propTypes: Anon_Children | Anon_ChildrenInnerRef = js.native
  }
  
}

