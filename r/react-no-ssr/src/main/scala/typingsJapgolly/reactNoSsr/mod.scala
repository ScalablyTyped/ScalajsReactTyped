package typingsJapgolly.reactNoSsr

import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-no-ssr", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default ()
    extends Component[AnonOnSSR, js.Object, js.Any]
  
  type NoSSR = japgolly.scalajs.react.raw.React.Component[AnonOnSSR with js.Object, js.Object]
}

