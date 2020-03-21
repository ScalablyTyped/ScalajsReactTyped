package typingsJapgolly.vscodeLanguageserver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ClientFeature[P] = typingsJapgolly.vscodeLanguageserver.mod.Feature[typingsJapgolly.vscodeLanguageserver.mod.RemoteClient, P]
  type ConsoleFeature[P] = typingsJapgolly.vscodeLanguageserver.mod.Feature[typingsJapgolly.vscodeLanguageserver.mod.RemoteConsole, P]
  type Feature[B, P] = js.Function1[
    /* Base */ org.scalablytyped.runtime.Instantiable0[B], 
    org.scalablytyped.runtime.Instantiable0[B with P]
  ]
  type IConnection = typingsJapgolly.vscodeLanguageserver.mod.Connection[
    typingsJapgolly.vscodeLanguageserver.mod._underscore, 
    typingsJapgolly.vscodeLanguageserver.mod._underscore, 
    typingsJapgolly.vscodeLanguageserver.mod._underscore, 
    typingsJapgolly.vscodeLanguageserver.mod._underscore, 
    typingsJapgolly.vscodeLanguageserver.mod._underscore, 
    typingsJapgolly.vscodeLanguageserver.mod._underscore
  ]
  type RemoteWorkspace = typingsJapgolly.vscodeLanguageserver.mod._RemoteWorkspace with typingsJapgolly.vscodeLanguageserver.configurationMod.Configuration with typingsJapgolly.vscodeLanguageserver.workspaceFoldersMod.WorkspaceFolders
  type TelemetryFeature[P] = typingsJapgolly.vscodeLanguageserver.mod.Feature[typingsJapgolly.vscodeLanguageserver.mod.Telemetry, P]
  type TracerFeature[P] = typingsJapgolly.vscodeLanguageserver.mod.Feature[typingsJapgolly.vscodeJsonrpc.mod.Tracer, P]
  type WindowFeature[P] = typingsJapgolly.vscodeLanguageserver.mod.Feature[typingsJapgolly.vscodeLanguageserver.mod.RemoteWindow, P]
  type WorkspaceFeature[P] = typingsJapgolly.vscodeLanguageserver.mod.Feature[typingsJapgolly.vscodeLanguageserver.mod.RemoteWorkspace, P]
}
