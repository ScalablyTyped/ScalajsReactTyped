package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.keytipDataTypesMod.IKeytipDataProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.uifabricUtilities.irendercomponentMod.IRenderComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/KeytipData/KeytipData", JSImport.Namespace)
@js.native
object keytipDataKeytipDataMod extends js.Object {
  @js.native
  class KeytipData ()
    extends Component[IKeytipDataProps with IRenderComponent[js.Object], js.Object, js.Any] {
    /**
      * Gets the aria- and data- attributes to attach to the component
      * @param keytipProps - props for Keytip
      * @param describedByPrepend - ariaDescribedBy value to prepend
      */
    var _getKtpAttrs: js.Any = js.native
    var _getKtpProps: js.Any = js.native
    var _keytipManager: js.Any = js.native
    var _uniqueId: js.Any = js.native
    @JSName("componentDidMount")
    def componentDidMount_MKeytipData(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MKeytipData(prevProps: IKeytipDataProps with IRenderComponent[js.Object]): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MKeytipData(): Unit = js.native
  }
  
}

