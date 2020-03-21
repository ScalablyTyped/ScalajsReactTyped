package typingsJapgolly.nextServer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nextServer.libUtilsMod.AppType
import typingsJapgolly.nextServer.libUtilsMod.Enhancer
import typingsJapgolly.nextServer.libUtilsMod.NextComponentType
import typingsJapgolly.nextServer.libUtilsMod.NextPageContext
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
    if (enhanceApp != null) __obj.updateDynamic("enhanceApp")(js.Any.fromFunction1((t0: typingsJapgolly.nextServer.libUtilsMod.AppType) => enhanceApp(t0).runNow()))
    if (enhanceComponent != null) __obj.updateDynamic("enhanceComponent")(js.Any.fromFunction1((t0: typingsJapgolly.nextServer.libUtilsMod.NextComponentType[typingsJapgolly.nextServer.libUtilsMod.NextPageContext, js.Object, js.Object]) => enhanceComponent(t0).runNow()))
    __obj.asInstanceOf[AnonEnhanceApp]
  }
}

