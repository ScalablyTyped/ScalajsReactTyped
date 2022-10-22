package typingsJapgolly.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rollup.anon.`0`
  - typingsJapgolly.rollup.anon.Input
  - typingsJapgolly.rollup.anon.Duration
  - typingsJapgolly.rollup.anon.`1`
  - typingsJapgolly.rollup.anon.Error
*/
trait RollupWatcherEvent extends StObject
object RollupWatcherEvent {
  
  inline def `0`(): typingsJapgolly.rollup.anon.`0` = {
    val __obj = js.Dynamic.literal(code = "START")
    __obj.asInstanceOf[typingsJapgolly.rollup.anon.`0`]
  }
  
  inline def `1`(): typingsJapgolly.rollup.anon.`1` = {
    val __obj = js.Dynamic.literal(code = "END")
    __obj.asInstanceOf[typingsJapgolly.rollup.anon.`1`]
  }
  
  inline def Duration(duration: Double, output: js.Array[String], result: RollupBuild): typingsJapgolly.rollup.anon.Duration = {
    val __obj = js.Dynamic.literal(code = "BUNDLE_END", duration = duration.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.rollup.anon.Duration]
  }
  
  inline def Error(error: RollupError): typingsJapgolly.rollup.anon.Error = {
    val __obj = js.Dynamic.literal(code = "ERROR", error = error.asInstanceOf[js.Any], result = null)
    __obj.asInstanceOf[typingsJapgolly.rollup.anon.Error]
  }
  
  inline def Input(output: js.Array[String]): typingsJapgolly.rollup.anon.Input = {
    val __obj = js.Dynamic.literal(code = "BUNDLE_START", output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.rollup.anon.Input]
  }
}
