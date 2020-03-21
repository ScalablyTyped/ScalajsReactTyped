package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.coachmarkTypesMod.ICoachmarkProps
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.`data-coachmarkid`
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Coachmark", JSImport.Namespace)
@js.native
object coachmarkMod extends js.Object {
  @js.native
  class CoachmarkBase protected ()
    extends typingsJapgolly.officeUiFabricReact.coachmarkBaseMod.CoachmarkBase {
    def this(props: ICoachmarkProps) = this()
  }
  
  val COACHMARK_ATTRIBUTE_NAME: `data-coachmarkid` = js.native
  val Coachmark: FunctionComponent[ICoachmarkProps] = js.native
  /* static members */
  @js.native
  object CoachmarkBase extends js.Object {
    var defaultProps: PartialICoachmarkProps = js.native
  }
  
}

