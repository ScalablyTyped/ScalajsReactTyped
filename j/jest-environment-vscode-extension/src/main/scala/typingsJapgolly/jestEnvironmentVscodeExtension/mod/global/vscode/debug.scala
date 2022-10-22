package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.mod.BreakpointsChangeEvent
import typingsJapgolly.vscode.mod.DebugAdapterDescriptorFactory
import typingsJapgolly.vscode.mod.DebugAdapterTrackerFactory
import typingsJapgolly.vscode.mod.DebugConfiguration
import typingsJapgolly.vscode.mod.DebugConfigurationProvider
import typingsJapgolly.vscode.mod.DebugConsole
import typingsJapgolly.vscode.mod.DebugProtocolSource
import typingsJapgolly.vscode.mod.DebugSession
import typingsJapgolly.vscode.mod.DebugSessionCustomEvent
import typingsJapgolly.vscode.mod.DebugSessionOptions
import typingsJapgolly.vscode.mod.Event
import typingsJapgolly.vscode.mod.WorkspaceFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debug {
  
  @JSGlobal("vscode.debug")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("vscode.debug.activeDebugConsole")
  @js.native
  def activeDebugConsole: DebugConsole = js.native
  inline def activeDebugConsole_=(x: DebugConsole): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeDebugConsole")(x.asInstanceOf[js.Any])
  
  @JSGlobal("vscode.debug.activeDebugSession")
  @js.native
  def activeDebugSession: js.UndefOr[DebugSession] = js.native
  inline def activeDebugSession_=(x: js.UndefOr[DebugSession]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeDebugSession")(x.asInstanceOf[js.Any])
  
  inline def addBreakpoints(breakpoints: js.Array[typingsJapgolly.vscode.mod.Breakpoint]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBreakpoints")(breakpoints.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def asDebugSourceUri(source: DebugProtocolSource): typingsJapgolly.vscode.mod.Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("asDebugSourceUri")(source.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.Uri]
  inline def asDebugSourceUri(source: DebugProtocolSource, session: DebugSession): typingsJapgolly.vscode.mod.Uri = (^.asInstanceOf[js.Dynamic].applyDynamic("asDebugSourceUri")(source.asInstanceOf[js.Any], session.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Uri]
  
  @JSGlobal("vscode.debug.breakpoints")
  @js.native
  def breakpoints: js.Array[typingsJapgolly.vscode.mod.Breakpoint] = js.native
  inline def breakpoints_=(x: js.Array[typingsJapgolly.vscode.mod.Breakpoint]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("breakpoints")(x.asInstanceOf[js.Any])
  
  @JSGlobal("vscode.debug.onDidChangeActiveDebugSession")
  @js.native
  val onDidChangeActiveDebugSession: Event[js.UndefOr[DebugSession]] = js.native
  
  @JSGlobal("vscode.debug.onDidChangeBreakpoints")
  @js.native
  val onDidChangeBreakpoints: Event[BreakpointsChangeEvent] = js.native
  
  @JSGlobal("vscode.debug.onDidReceiveDebugSessionCustomEvent")
  @js.native
  val onDidReceiveDebugSessionCustomEvent: Event[DebugSessionCustomEvent] = js.native
  
  @JSGlobal("vscode.debug.onDidStartDebugSession")
  @js.native
  val onDidStartDebugSession: Event[DebugSession] = js.native
  
  @JSGlobal("vscode.debug.onDidTerminateDebugSession")
  @js.native
  val onDidTerminateDebugSession: Event[DebugSession] = js.native
  
  inline def registerDebugAdapterDescriptorFactory(debugType: String, factory: DebugAdapterDescriptorFactory): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDebugAdapterDescriptorFactory")(debugType.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerDebugAdapterTrackerFactory(debugType: String, factory: DebugAdapterTrackerFactory): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDebugAdapterTrackerFactory")(debugType.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def registerDebugConfigurationProvider(debugType: String, provider: DebugConfigurationProvider): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDebugConfigurationProvider")(debugType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  inline def registerDebugConfigurationProvider(
    debugType: String,
    provider: DebugConfigurationProvider,
    triggerKind: typingsJapgolly.vscode.mod.DebugConfigurationProviderTriggerKind
  ): typingsJapgolly.vscode.mod.Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDebugConfigurationProvider")(debugType.asInstanceOf[js.Any], provider.asInstanceOf[js.Any], triggerKind.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscode.mod.Disposable]
  
  inline def removeBreakpoints(breakpoints: js.Array[typingsJapgolly.vscode.mod.Breakpoint]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBreakpoints")(breakpoints.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def startDebugging(folder: Unit, nameOrConfiguration: String): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(folder: Unit, nameOrConfiguration: String, parentSessionOrOptions: DebugSession): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any], parentSessionOrOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(folder: Unit, nameOrConfiguration: String, parentSessionOrOptions: DebugSessionOptions): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any], parentSessionOrOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(folder: Unit, nameOrConfiguration: DebugConfiguration): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(folder: Unit, nameOrConfiguration: DebugConfiguration, parentSessionOrOptions: DebugSession): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any], parentSessionOrOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(folder: Unit, nameOrConfiguration: DebugConfiguration, parentSessionOrOptions: DebugSessionOptions): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any], parentSessionOrOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(folder: WorkspaceFolder, nameOrConfiguration: String): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(folder: WorkspaceFolder, nameOrConfiguration: String, parentSessionOrOptions: DebugSession): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any], parentSessionOrOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(folder: WorkspaceFolder, nameOrConfiguration: String, parentSessionOrOptions: DebugSessionOptions): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any], parentSessionOrOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(folder: WorkspaceFolder, nameOrConfiguration: DebugConfiguration): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(
    folder: WorkspaceFolder,
    nameOrConfiguration: DebugConfiguration,
    parentSessionOrOptions: DebugSession
  ): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any], parentSessionOrOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  inline def startDebugging(
    folder: WorkspaceFolder,
    nameOrConfiguration: DebugConfiguration,
    parentSessionOrOptions: DebugSessionOptions
  ): Thenable[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startDebugging")(folder.asInstanceOf[js.Any], nameOrConfiguration.asInstanceOf[js.Any], parentSessionOrOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[Boolean]]
  
  inline def stopDebugging(): Thenable[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stopDebugging")().asInstanceOf[Thenable[Unit]]
  inline def stopDebugging(session: DebugSession): Thenable[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stopDebugging")(session.asInstanceOf[js.Any]).asInstanceOf[Thenable[Unit]]
}
