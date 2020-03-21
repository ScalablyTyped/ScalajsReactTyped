package typingsJapgolly.nextServer.dynamicMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/lib/dynamic", "noSSR")
@js.native
object noSSR extends js.Object {
  def apply[P](LoadableInitializer: LoadableFn[P], loadableOptions: LoadableOptions[P]): (ComponentClassP[P with js.Object]) | FunctionComponent[P] | js.Function0[Element] = js.native
}

