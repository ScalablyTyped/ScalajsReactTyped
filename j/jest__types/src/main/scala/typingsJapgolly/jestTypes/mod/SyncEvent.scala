package typingsJapgolly.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jestTypes.anon.AsyncError
  - typingsJapgolly.jestTypes.anon.BlockName
  - typingsJapgolly.jestTypes.anon.Fn
  - typingsJapgolly.jestTypes.anon.Concurrent
  - typingsJapgolly.jestTypes.anon.ErrorException
*/
trait SyncEvent
  extends StObject
     with Event2
object SyncEvent {
  
  inline def AsyncError(asyncError: js.Error, blockName: BlockName2, mode: BlockMode): typingsJapgolly.jestTypes.anon.AsyncError = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = "start_describe_definition")
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.AsyncError]
  }
  
  inline def BlockName(blockName: BlockName2, mode: BlockMode): typingsJapgolly.jestTypes.anon.BlockName = {
    val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = "finish_describe_definition")
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.BlockName]
  }
  
  inline def Concurrent(asyncError: js.Error, concurrent: Boolean, failing: Boolean, fn: TestFn2, testName: TestName2): typingsJapgolly.jestTypes.anon.Concurrent = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], concurrent = concurrent.asInstanceOf[js.Any], failing = failing.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], name = "add_test", testName = testName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.Concurrent]
  }
  
  inline def ErrorException(error: Exception): typingsJapgolly.jestTypes.anon.ErrorException = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "error")
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.ErrorException]
  }
  
  inline def Fn(asyncError: js.Error, fn: HookFn2, hookType: HookType): typingsJapgolly.jestTypes.anon.Fn = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], hookType = hookType.asInstanceOf[js.Any], name = "add_hook")
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.Fn]
  }
}
