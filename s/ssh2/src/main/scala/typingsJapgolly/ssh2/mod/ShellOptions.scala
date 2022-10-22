package typingsJapgolly.ssh2.mod

import typingsJapgolly.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShellOptions extends StObject {
  
  /** An environment to use for the execution of the shell. */
  var env: js.UndefOr[ProcessEnv] = js.undefined
  
  /** Set either to `true` to use defaults, a number to specify a specific screen number, or an object containing x11 settings. */
  var x11: js.UndefOr[X11Options | Double | Boolean] = js.undefined
}
object ShellOptions {
  
  inline def apply(): ShellOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShellOptions]
  }
  
  extension [Self <: ShellOptions](x: Self) {
    
    inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setX11(value: X11Options | Double | Boolean): Self = StObject.set(x, "x11", value.asInstanceOf[js.Any])
    
    inline def setX11Undefined: Self = StObject.set(x, "x11", js.undefined)
  }
}
