package typingsJapgolly.winrt.Windows.Foundation

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWwwFormUrlDecoderRuntimeClassFactory extends js.Object {
  def createWwwFormUrlDecoder(query: String): WwwFormUrlDecoder
}

object IWwwFormUrlDecoderRuntimeClassFactory {
  @scala.inline
  def apply(createWwwFormUrlDecoder: String => CallbackTo[WwwFormUrlDecoder]): IWwwFormUrlDecoderRuntimeClassFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createWwwFormUrlDecoder")(js.Any.fromFunction1((t0: java.lang.String) => createWwwFormUrlDecoder(t0).runNow()))
    __obj.asInstanceOf[IWwwFormUrlDecoderRuntimeClassFactory]
  }
}

