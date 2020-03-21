package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.searchBoxTypesMod.ISearchBoxProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/SearchBox", JSImport.Namespace)
@js.native
object libSearchBoxMod extends js.Object {
  @js.native
  class SearchBoxBase protected ()
    extends typingsJapgolly.officeUiFabricReact.searchBoxMod.SearchBoxBase {
    def this(props: ISearchBoxProps) = this()
  }
  
  val SearchBox: FunctionComponent[ISearchBoxProps] = js.native
  /* static members */
  @js.native
  object SearchBoxBase extends js.Object {
    var defaultProps: PickISearchBoxPropsdisabl = js.native
  }
  
}

