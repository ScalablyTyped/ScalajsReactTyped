package typingsJapgolly.ink.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.ink.buildComponentsAppMod.Props
import typingsJapgolly.ink.buildComponentsAppMod.default
import typingsJapgolly.node.processMod.global.NodeJS.ReadStream
import typingsJapgolly.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object App {
  
  inline def apply(
    exitOnCtrlC: Boolean,
    onExit: js.UndefOr[js.Error] => Callback,
    stderr: WriteStream,
    stdin: ReadStream,
    stdout: WriteStream,
    writeToStderr: String => Callback,
    writeToStdout: String => Callback
  ): Default[default] = {
    val __props = js.Dynamic.literal(exitOnCtrlC = exitOnCtrlC.asInstanceOf[js.Any], onExit = js.Any.fromFunction1((t0: js.UndefOr[js.Error]) => onExit(t0).runNow()), stderr = stderr.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], writeToStderr = js.Any.fromFunction1((t0: String) => writeToStderr(t0).runNow()), writeToStdout = js.Any.fromFunction1((t0: String) => writeToStdout(t0).runNow()))
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("ink/build/components/App", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
