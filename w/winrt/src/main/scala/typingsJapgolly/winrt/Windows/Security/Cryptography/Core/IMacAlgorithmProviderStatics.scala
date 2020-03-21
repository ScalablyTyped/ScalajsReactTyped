package typingsJapgolly.winrt.Windows.Security.Cryptography.Core

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMacAlgorithmProviderStatics extends js.Object {
  def openAlgorithm(algorithm: String): MacAlgorithmProvider
}

object IMacAlgorithmProviderStatics {
  @scala.inline
  def apply(openAlgorithm: String => CallbackTo[MacAlgorithmProvider]): IMacAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openAlgorithm")(js.Any.fromFunction1((t0: java.lang.String) => openAlgorithm(t0).runNow()))
    __obj.asInstanceOf[IMacAlgorithmProviderStatics]
  }
}

