package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.linkTypesMod.ILink
import typingsJapgolly.officeUiFabricReact.linkTypesMod.ILinkProps
import typingsJapgolly.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Link/Link.base", JSImport.Namespace)
@js.native
object linkBaseMod extends js.Object {
  @js.native
  class LinkBase ()
    extends BaseComponent[ILinkProps, js.Any]
       with ILink {
    var _adjustPropsForRootType: js.Any = js.native
    var _getRootType: js.Any = js.native
    var _link: js.Any = js.native
    var _onClick: js.Any = js.native
    /** Sets focus to the link. */
    /* CompleteClass */
    override def focus(): Unit = js.native
  }
  
}

