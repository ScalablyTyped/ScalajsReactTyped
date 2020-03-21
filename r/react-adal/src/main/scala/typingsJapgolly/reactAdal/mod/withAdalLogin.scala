package typingsJapgolly.reactAdal.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-adal", "withAdalLogin")
@js.native
object withAdalLogin extends js.Object {
  def apply(authContext: AuthenticationContext, resource: String): js.Function3[
    /* wrappedComponent */ ComponentClassP[js.Object] | StatelessComponent[js.Object], 
    /* renderLoading */ js.Function0[Element | Null], 
    /* renderError */ js.Function1[/* error */ js.Any, Element | Null], 
    ComponentClassP[js.Object]
  ] = js.native
}

