package typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceContextStatics extends js.Object {
  def createMatchingContext(result: IIterable[ResourceQualifier]): ResourceContext
}

object IResourceContextStatics {
  @scala.inline
  def apply(createMatchingContext: IIterable[ResourceQualifier] => CallbackTo[ResourceContext]): IResourceContextStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createMatchingContext")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable[typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceQualifier]) => createMatchingContext(t0).runNow()))
    __obj.asInstanceOf[IResourceContextStatics]
  }
}

