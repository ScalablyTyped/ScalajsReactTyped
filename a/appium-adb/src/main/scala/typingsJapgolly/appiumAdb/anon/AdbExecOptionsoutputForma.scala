package typingsJapgolly.appiumAdb.anon

import typingsJapgolly.appiumAdb.appiumAdbStrings.full
import typingsJapgolly.appiumAdb.appiumAdbStrings.stdout
import typingsJapgolly.appiumAdb.appiumAdbStrings.undefined
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.node.processMod.global.NodeJS.ProcessEnv
import typingsJapgolly.node.processMod.global.NodeJS.Signals
import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.teenProcess.anon.Debug
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined appium-adb.appium-adb/lib/tools/system-calls.AdbExecOptions & {  outputFormat :'full'} */
trait AdbExecOptionsoutputForma extends StObject {
  
  var cwd: js.UndefOr[String | URL_] = js.undefined
  
  /**
    * Character encoding to use when converting `stdout` and `stderr` to a string.
    * Has no effect if `isBuffer` is set to true.
    * @default 'utf8'
    */
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
  
  var env: js.UndefOr[ProcessEnv] = js.undefined
  
  var exclusive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Useful if you have a very chatty process whose output you don't care about and
    * don't want to add it to the memory consumed by your program.
    * @default false
    */
  var ignoreOutput: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies that the returned standard I/O is an instance of a Buffer.
    * @default false
    * @example
    * let {stdout, stderr} = await exec('cat', [filename], {isBuffer: true});
    * Buffer.isBuffer(stdout); // true
    */
  var isBuffer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The signal value to be used when the spawned process will be killed by the abort signal.
    * @default 'SIGTERM'
    */
  var killSignal: js.UndefOr[Signals | Double] = js.undefined
  
  /**
    * Allows stdout and stderr to be sent to a particular logger, as it it received.
    * This is overridden by the `ignoreOutput` option.
    */
  var logger: js.UndefOr[Debug] = js.undefined
  
  /**
    * @default 100 * 1024 * 1024 // 100 MB
    */
  var maxStderrBufferSize: js.UndefOr[Double] = js.undefined
  
  /**
    * @default 100 * 1024 * 1024 // 100 MB
    */
  var maxStdoutBufferSize: js.UndefOr[Double] = js.undefined
  
  var outputFormat: (js.UndefOr[stdout | full | undefined]) & full
  
  /**
    * If you're on Windows, you'll want to pass `shell: true`, because exec actually uses spawn under the hood,
    * and is therefore subject to the issues noted about Windows + spawn in the Node docs.
    * @see https://nodejs.org/api/child_process.html
    */
  var shell: js.UndefOr[Boolean | String] = js.undefined
  
  /**
    * @default 'inherit'
    */
  var stdio: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object AdbExecOptionsoutputForma {
  
  inline def apply(outputFormat: (js.UndefOr[stdout | full | undefined]) & full): AdbExecOptionsoutputForma = {
    val __obj = js.Dynamic.literal(outputFormat = outputFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdbExecOptionsoutputForma]
  }
  
  extension [Self <: AdbExecOptionsoutputForma](x: Self) {
    
    inline def setCwd(value: String | URL_): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    inline def setIgnoreOutput(value: Boolean): Self = StObject.set(x, "ignoreOutput", value.asInstanceOf[js.Any])
    
    inline def setIgnoreOutputUndefined: Self = StObject.set(x, "ignoreOutput", js.undefined)
    
    inline def setIsBuffer(value: Boolean): Self = StObject.set(x, "isBuffer", value.asInstanceOf[js.Any])
    
    inline def setIsBufferUndefined: Self = StObject.set(x, "isBuffer", js.undefined)
    
    inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
    
    inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
    
    inline def setLogger(value: Debug): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setMaxStderrBufferSize(value: Double): Self = StObject.set(x, "maxStderrBufferSize", value.asInstanceOf[js.Any])
    
    inline def setMaxStderrBufferSizeUndefined: Self = StObject.set(x, "maxStderrBufferSize", js.undefined)
    
    inline def setMaxStdoutBufferSize(value: Double): Self = StObject.set(x, "maxStdoutBufferSize", value.asInstanceOf[js.Any])
    
    inline def setMaxStdoutBufferSizeUndefined: Self = StObject.set(x, "maxStdoutBufferSize", js.undefined)
    
    inline def setOutputFormat(value: (js.UndefOr[stdout | full | undefined]) & full): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    
    inline def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
    
    inline def setStdio(value: String): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
