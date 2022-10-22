package typingsJapgolly.stdMocks

import typingsJapgolly.stdMocks.anon.Optionsprintbooleanundefi
import typingsJapgolly.stdMocks.anon.Optionsstderrfalse
import typingsJapgolly.stdMocks.anon.Optionsstdoutfalse
import typingsJapgolly.stdMocks.anon.Optionsstdoutfalsestderrf
import typingsJapgolly.stdMocks.anon.Stderr
import typingsJapgolly.stdMocks.anon.StderrStdout
import typingsJapgolly.stdMocks.anon.Stdout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("std-mocks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flush(): StderrStdout = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[StderrStdout]
  inline def flush(opts: Optionsstderrfalse): Stdout = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(opts.asInstanceOf[js.Any]).asInstanceOf[Stdout]
  inline def flush(opts: Optionsstdoutfalse): Stderr = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(opts.asInstanceOf[js.Any]).asInstanceOf[Stderr]
  inline def flush(opts: Optionsstdoutfalsestderrf): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def flush(opts: Options): StderrStdout = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(opts.asInstanceOf[js.Any]).asInstanceOf[StderrStdout]
  
  inline def restore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")().asInstanceOf[Unit]
  inline def restore(opts: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def use(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")().asInstanceOf[Unit]
  inline def use(opts: Optionsprintbooleanundefi): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var stderr: js.UndefOr[Boolean] = js.undefined
    
    var stdout: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
}
