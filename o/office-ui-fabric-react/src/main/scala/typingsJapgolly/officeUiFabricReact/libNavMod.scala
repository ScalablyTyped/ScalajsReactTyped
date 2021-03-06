package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.navTypesMod.INavProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Nav", JSImport.Namespace)
@js.native
object libNavMod extends js.Object {
  @js.native
  class NavBase protected ()
    extends typingsJapgolly.officeUiFabricReact.navMod.NavBase {
    def this(props: INavProps) = this()
  }
  
  val Nav: FunctionComponent[INavProps] = js.native
  def isRelativeUrl(url: String): Boolean = js.native
  /* static members */
  @js.native
  object NavBase extends js.Object {
    var defaultProps: INavProps = js.native
  }
  
}

