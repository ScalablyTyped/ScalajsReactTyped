package typingsJapgolly.vscodeLanguageserver.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverStrings.features
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] extends js.Object {
  var __brand: features
  var client: js.UndefOr[ClientFeature[PClient]] = js.undefined
  var console: js.UndefOr[ConsoleFeature[PConsole]] = js.undefined
  var telemetry: js.UndefOr[TelemetryFeature[PTelemetry]] = js.undefined
  var tracer: js.UndefOr[TracerFeature[PTracer]] = js.undefined
  var window: js.UndefOr[WindowFeature[PWindow]] = js.undefined
  var workspace: js.UndefOr[WorkspaceFeature[PWorkspace]] = js.undefined
}

object Features {
  @scala.inline
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](
    __brand: features,
    client: /* Base */ Instantiable0[RemoteClient] => CallbackTo[Instantiable0[RemoteClient with PClient]] = null,
    console: /* Base */ Instantiable0[RemoteConsole] => CallbackTo[Instantiable0[RemoteConsole with PConsole]] = null,
    telemetry: /* Base */ Instantiable0[Telemetry] => CallbackTo[Instantiable0[Telemetry with PTelemetry]] = null,
    tracer: /* Base */ Instantiable0[typingsJapgolly.vscodeJsonrpc.mod.Tracer] => CallbackTo[Instantiable0[typingsJapgolly.vscodeJsonrpc.mod.Tracer with PTracer]] = null,
    window: /* Base */ Instantiable0[RemoteWindow] => CallbackTo[Instantiable0[RemoteWindow with PWindow]] = null,
    workspace: /* Base */ Instantiable0[RemoteWorkspace] => CallbackTo[Instantiable0[RemoteWorkspace with PWorkspace]] = null
  ): Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = {
    val __obj = js.Dynamic.literal(__brand = __brand.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(js.Any.fromFunction1((t0: /* Base */ org.scalablytyped.runtime.Instantiable0[typingsJapgolly.vscodeLanguageserver.mod.RemoteClient]) => client(t0).runNow()))
    if (console != null) __obj.updateDynamic("console")(js.Any.fromFunction1((t0: /* Base */ org.scalablytyped.runtime.Instantiable0[typingsJapgolly.vscodeLanguageserver.mod.RemoteConsole]) => console(t0).runNow()))
    if (telemetry != null) __obj.updateDynamic("telemetry")(js.Any.fromFunction1((t0: /* Base */ org.scalablytyped.runtime.Instantiable0[typingsJapgolly.vscodeLanguageserver.mod.Telemetry]) => telemetry(t0).runNow()))
    if (tracer != null) __obj.updateDynamic("tracer")(js.Any.fromFunction1((t0: /* Base */ org.scalablytyped.runtime.Instantiable0[typingsJapgolly.vscodeJsonrpc.mod.Tracer]) => tracer(t0).runNow()))
    if (window != null) __obj.updateDynamic("window")(js.Any.fromFunction1((t0: /* Base */ org.scalablytyped.runtime.Instantiable0[typingsJapgolly.vscodeLanguageserver.mod.RemoteWindow]) => window(t0).runNow()))
    if (workspace != null) __obj.updateDynamic("workspace")(js.Any.fromFunction1((t0: /* Base */ org.scalablytyped.runtime.Instantiable0[typingsJapgolly.vscodeLanguageserver.mod.RemoteWorkspace]) => workspace(t0).runNow()))
    __obj.asInstanceOf[Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace]]
  }
}

