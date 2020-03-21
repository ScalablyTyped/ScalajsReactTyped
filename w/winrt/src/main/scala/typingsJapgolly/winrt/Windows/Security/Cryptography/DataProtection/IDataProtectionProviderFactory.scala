package typingsJapgolly.winrt.Windows.Security.Cryptography.DataProtection

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataProtectionProviderFactory extends js.Object {
  def createOverloadExplicit(protectionDescriptor: String): DataProtectionProvider
}

object IDataProtectionProviderFactory {
  @scala.inline
  def apply(createOverloadExplicit: String => CallbackTo[DataProtectionProvider]): IDataProtectionProviderFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createOverloadExplicit")(js.Any.fromFunction1((t0: java.lang.String) => createOverloadExplicit(t0).runNow()))
    __obj.asInstanceOf[IDataProtectionProviderFactory]
  }
}

