package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.breadcrumbTypesMod.IBreadcrumbProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Breadcrumb", JSImport.Namespace)
@js.native
object breadcrumbMod extends js.Object {
  @js.native
  class BreadcrumbBase protected ()
    extends typingsJapgolly.officeUiFabricReact.breadcrumbBaseMod.BreadcrumbBase {
    def this(props: IBreadcrumbProps) = this()
  }
  
  val Breadcrumb: FunctionComponent[IBreadcrumbProps] = js.native
  /* static members */
  @js.native
  object BreadcrumbBase extends js.Object {
    var defaultProps: IBreadcrumbProps = js.native
  }
  
}

