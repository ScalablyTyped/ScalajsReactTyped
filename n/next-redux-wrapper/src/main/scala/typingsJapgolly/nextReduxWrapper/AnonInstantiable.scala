package typingsJapgolly.nextReduxWrapper

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.nextReduxWrapper.mod.NextJSAppContext
import typingsJapgolly.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInstantiable
  extends Instantiable2[/* props */ js.Any, /* context */ js.Any, AnonComponentDidCatch] {
  var contextType: js.UndefOr[Context[_]] = js.native
  var displayName: String = js.native
  def getInitialProps(appCtx: NextJSAppContext): js.Promise[AnonInitialProps] = js.native
}

