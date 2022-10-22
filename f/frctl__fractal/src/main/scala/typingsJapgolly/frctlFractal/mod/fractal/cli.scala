package typingsJapgolly.frctlFractal.mod.fractal

import typingsJapgolly.frctlFractal.anon.ClifractalFractal
import typingsJapgolly.frctlFractal.anon.Current
import typingsJapgolly.frctlFractal.anon.Description
import typingsJapgolly.frctlFractal.mod.CliTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cli {
  
  @JSImport("@frctl/fractal", "fractal.cli.Cli")
  @js.native
  open class Cli () extends StObject {
    
    def command(
      commandString: String,
      callback: js.ThisFunction2[/* this */ ClifractalFractal, /* args */ Any, /* done */ js.Function0[Unit], Unit]
    ): Unit = js.native
    def command(
      commandString: String,
      callback: js.ThisFunction2[/* this */ ClifractalFractal, /* args */ Any, /* done */ js.Function0[Unit], Unit],
      opts: String
    ): Unit = js.native
    def command(
      commandString: String,
      callback: js.ThisFunction2[/* this */ ClifractalFractal, /* args */ Any, /* done */ js.Function0[Unit], Unit],
      opts: Description
    ): Unit = js.native
    
    var console: Console = js.native
    
    def error(message: String): Unit = js.native
    
    def exec(command: String): Unit = js.native
    
    def get(command: String): Any = js.native
    
    def has(command: String): Boolean = js.native
    
    def isInteractive(): Boolean = js.native
    
    def log(message: String): Unit = js.native
    
    @JSName("notify")
    var notify_FCli: Notifier = js.native
  }
  
  @JSImport("@frctl/fractal", "fractal.cli.Console")
  @js.native
  open class Console () extends StObject {
    
    def box(): this.type = js.native
    def box(header: String): this.type = js.native
    def box(header: String, body: js.Array[String]): this.type = js.native
    def box(header: String, body: js.Array[String], footer: String): this.type = js.native
    def box(header: String, body: Unit, footer: String): this.type = js.native
    def box(header: Unit, body: js.Array[String]): this.type = js.native
    def box(header: Unit, body: js.Array[String], footer: String): this.type = js.native
    def box(header: Unit, body: Unit, footer: String): this.type = js.native
    
    def br(): this.type = js.native
    
    def clear(): this.type = js.native
    
    def columns(data: Any): this.type = js.native
    def columns(data: Any, options: Any): this.type = js.native
    
    def debug(text: String): this.type = js.native
    def debug(text: String, data: Any): this.type = js.native
    
    def debugMode(status: Boolean): Unit = js.native
    
    def dump(data: Any): Unit = js.native
    
    def error(err: String, data: js.Error): this.type = js.native
    def error(err: js.Error): this.type = js.native
    
    def isSlogging(): Boolean = js.native
    
    def log(text: String): this.type = js.native
    
    def persist(): this.type = js.native
    
    def slog(): this.type = js.native
    
    def success(text: String): this.type = js.native
    
    var theme: CliTheme = js.native
    
    def unslog(): this.type = js.native
    
    def update(text: String): this.type = js.native
    def update(text: String, `type`: String): this.type = js.native
    
    def warn(text: String): this.type = js.native
    
    def write(str: String): Unit = js.native
    def write(str: String, `type`: String): Unit = js.native
  }
  
  @JSImport("@frctl/fractal", "fractal.cli.Notifier")
  @js.native
  open class Notifier () extends StObject {
    
    def updateAvailable(details: Current): Unit = js.native
    
    def versionMismatch(details: typingsJapgolly.frctlFractal.anon.Cli): Unit = js.native
  }
}
