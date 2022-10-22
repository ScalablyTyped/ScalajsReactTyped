package typingsJapgolly.shelljs.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.glob.mod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShellConfig extends StObject {
  
  /**
    * Absolute path of the Node binary. Default is null (inferred).
    */
  var execPath: String | Null
  
  /**
    * If true the script will die on errors. Default is false.
    */
  var fatal: Boolean
  
  /**
    * Passed to glob.sync() instead of the default options ({}).
    */
  var globOptions: IOptions
  
  /**
    * Reset shell.config to the defaults.
    */
  def reset(): Unit
  
  /**
    * Suppresses all command output if true, except for echo() calls. Default is false.
    */
  var silent: Boolean
  
  /**
    * Will print each executed command to the screen.
    *
    * @default false
    */
  var verbose: Boolean
}
object ShellConfig {
  
  inline def apply(fatal: Boolean, globOptions: IOptions, reset: Callback, silent: Boolean, verbose: Boolean): ShellConfig = {
    val __obj = js.Dynamic.literal(fatal = fatal.asInstanceOf[js.Any], globOptions = globOptions.asInstanceOf[js.Any], reset = reset.toJsFn, silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], execPath = null)
    __obj.asInstanceOf[ShellConfig]
  }
  
  extension [Self <: ShellConfig](x: Self) {
    
    inline def setExecPath(value: String): Self = StObject.set(x, "execPath", value.asInstanceOf[js.Any])
    
    inline def setExecPathNull: Self = StObject.set(x, "execPath", null)
    
    inline def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    
    inline def setGlobOptions(value: IOptions): Self = StObject.set(x, "globOptions", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
  }
}
