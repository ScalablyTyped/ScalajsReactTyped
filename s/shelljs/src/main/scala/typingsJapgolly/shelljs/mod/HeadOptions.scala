package typingsJapgolly.shelljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadOptions extends StObject {
  
  /** Show the first <num> lines of the files. */
  var `-n`: Double
}
object HeadOptions {
  
  inline def apply(`-n`: Double): HeadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("-n")(`-n`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadOptions]
  }
  
  extension [Self <: HeadOptions](x: Self) {
    
    inline def `set-n`(value: Double): Self = StObject.set(x, "-n", value.asInstanceOf[js.Any])
  }
}
