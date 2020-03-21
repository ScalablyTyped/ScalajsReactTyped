package typingsJapgolly.ionicReact.ionTabsMod

import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.ionicReact.navContextMod.NavContextState
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ContextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/navigation/IonTabs", "IonTabs")
@js.native
class IonTabs protected ()
  extends Component[Props, js.Object, js.Any] {
  def this(props: Props) = this()
  @JSName("context")
  var context_IonTabs: ContextType[Context[NavContextState]] = js.native
  var routerOutletRef: Ref = js.native
}

/* static members */
@JSImport("@ionic/react/dist/types/components/navigation/IonTabs", "IonTabs")
@js.native
object IonTabs extends js.Object {
  def contextType(): Context[NavContextState] = js.native
}

