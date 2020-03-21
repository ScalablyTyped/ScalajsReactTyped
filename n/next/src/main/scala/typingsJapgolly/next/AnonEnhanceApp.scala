package typingsJapgolly.next

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.next.utilsMod.AppType
import typingsJapgolly.next.utilsMod.Enhancer
import typingsJapgolly.next.utilsMod.NextComponentType
import typingsJapgolly.next.utilsMod.NextPageContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnhanceApp extends js.Object {
  var enhanceApp: js.UndefOr[Enhancer[AppType]] = js.undefined
  var enhanceComponent: js.UndefOr[Enhancer[NextComponentType[NextPageContext, js.Object, js.Object]]] = js.undefined
}

object AnonEnhanceApp {
  @scala.inline
  def apply(
    enhanceApp: AppType => CallbackTo[AppType] = null,
    enhanceComponent: NextComponentType[NextPageContext, js.Object, js.Object] => CallbackTo[NextComponentType[NextPageContext, js.Object, js.Object]] = null
  ): AnonEnhanceApp = {
    val __obj = js.Dynamic.literal()
    if (enhanceApp != null) __obj.updateDynamic("enhanceApp")(js.Any.fromFunction1((t0: typingsJapgolly.next.utilsMod.AppType) => enhanceApp(t0).runNow()))
    if (enhanceComponent != null) __obj.updateDynamic("enhanceComponent")(js.Any.fromFunction1((t0: typingsJapgolly.next.utilsMod.NextComponentType[typingsJapgolly.next.utilsMod.NextPageContext, js.Object, js.Object]) => enhanceComponent(t0).runNow()))
    __obj.asInstanceOf[AnonEnhanceApp]
  }
}

