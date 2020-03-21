package typingsJapgolly.ionicReact.ionBackButtonMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.ionicReact.AnonClickButton
import typingsJapgolly.ionicReact.ReadonlyProps
import typingsJapgolly.ionicReact.navContextMod.NavContextState
import typingsJapgolly.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/components/navigation/IonBackButton", "IonBackButton")
@js.native
class IonBackButton protected () extends AnonClickButton {
  def this(props: ReadonlyProps) = this()
  def this(props: Props) = this()
  def this(props: Props, context: js.Any) = this()
}

@JSImport("@ionic/react/dist/types/components/navigation/IonBackButton", "IonBackButton")
@js.native
object IonBackButton
  extends Instantiable1[(/* props */ Props) | (/* props */ ReadonlyProps), AnonClickButton]
     with Instantiable2[/* props */ Props, /* context */ js.Any, AnonClickButton] {
  val contextType: Context[NavContextState] = js.native
  val displayName: String = js.native
}

