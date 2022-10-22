package typingsJapgolly.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jestTypes.anon.Name
  - typingsJapgolly.jestTypes.anon.`0`
  - typingsJapgolly.jestTypes.anon.Hook
  - typingsJapgolly.jestTypes.anon.DescribeBlock
  - typingsJapgolly.jestTypes.anon.Error
  - typingsJapgolly.jestTypes.anon.Test
  - typingsJapgolly.jestTypes.anon.NameTest
  - typingsJapgolly.jestTypes.anon.ErrorName
  - typingsJapgolly.jestTypes.anon.TestTestEntry
  - typingsJapgolly.jestTypes.anon.NameTestTestEntry
  - typingsJapgolly.jestTypes.anon.`1`
  - typingsJapgolly.jestTypes.anon.`2`
  - typingsJapgolly.jestTypes.anon.`3`
  - typingsJapgolly.jestTypes.anon.DescribeBlockName
  - typingsJapgolly.jestTypes.anon.DescribeBlockDescribeBlock
  - typingsJapgolly.jestTypes.anon.`4`
  - typingsJapgolly.jestTypes.anon.`5`
  - typingsJapgolly.jestTypes.anon.`6`
*/
trait AsyncEvent
  extends StObject
     with Event2
object AsyncEvent {
  
  inline def `0`(): typingsJapgolly.jestTypes.anon.`0` = {
    val __obj = js.Dynamic.literal(name = "include_test_location_in_result")
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.`0`]
  }
  
  inline def `1`(test: TestEntry): typingsJapgolly.jestTypes.anon.`1` = {
    val __obj = js.Dynamic.literal(name = "test_skip", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.`1`]
  }
  
  inline def `2`(test: TestEntry): typingsJapgolly.jestTypes.anon.`2` = {
    val __obj = js.Dynamic.literal(name = "test_todo", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.`2`]
  }
  
  inline def `3`(test: TestEntry): typingsJapgolly.jestTypes.anon.`3` = {
    val __obj = js.Dynamic.literal(name = "test_done", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.`3`]
  }
  
  inline def `4`(): typingsJapgolly.jestTypes.anon.`4` = {
    val __obj = js.Dynamic.literal(name = "run_start")
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.`4`]
  }
  
  inline def `5`(): typingsJapgolly.jestTypes.anon.`5` = {
    val __obj = js.Dynamic.literal(name = "run_finish")
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.`5`]
  }
  
  inline def `6`(): typingsJapgolly.jestTypes.anon.`6` = {
    val __obj = js.Dynamic.literal(name = "teardown")
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.`6`]
  }
  
  inline def DescribeBlock(hook: Hook): typingsJapgolly.jestTypes.anon.DescribeBlock = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = "hook_success")
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.DescribeBlock]
  }
  
  inline def DescribeBlockDescribeBlock(describeBlock: DescribeBlock): typingsJapgolly.jestTypes.anon.DescribeBlockDescribeBlock = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = "run_describe_finish")
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.DescribeBlockDescribeBlock]
  }
  
  inline def DescribeBlockName(describeBlock: DescribeBlock): typingsJapgolly.jestTypes.anon.DescribeBlockName = {
    val __obj = js.Dynamic.literal(describeBlock = describeBlock.asInstanceOf[js.Any], name = "run_describe_start")
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.DescribeBlockName]
  }
  
  inline def Error(error: String | Exception, hook: Hook): typingsJapgolly.jestTypes.anon.Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], hook = hook.asInstanceOf[js.Any], name = "hook_failure")
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.Error]
  }
  
  inline def ErrorName(error: Exception, test: TestEntry): typingsJapgolly.jestTypes.anon.ErrorName = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "test_fn_failure", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.ErrorName]
  }
  
  inline def Hook(hook: typingsJapgolly.jestTypes.mod.Hook): typingsJapgolly.jestTypes.anon.Hook = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = "hook_start")
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.Hook]
  }
  
  inline def Name(parentProcess: Process, runtimeGlobals: JestGlobals): typingsJapgolly.jestTypes.anon.Name = {
    val __obj = js.Dynamic.literal(name = "setup", parentProcess = parentProcess.asInstanceOf[js.Any], runtimeGlobals = runtimeGlobals.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.Name]
  }
  
  inline def NameTest(test: TestEntry): typingsJapgolly.jestTypes.anon.NameTest = {
    val __obj = js.Dynamic.literal(name = "test_fn_success", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.NameTest]
  }
  
  inline def NameTestTestEntry(test: TestEntry): typingsJapgolly.jestTypes.anon.NameTestTestEntry = {
    val __obj = js.Dynamic.literal(name = "test_start", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.NameTestTestEntry]
  }
  
  inline def Test(test: TestEntry): typingsJapgolly.jestTypes.anon.Test = {
    val __obj = js.Dynamic.literal(name = "test_fn_start", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.Test]
  }
  
  inline def TestTestEntry(test: TestEntry): typingsJapgolly.jestTypes.anon.TestTestEntry = {
    val __obj = js.Dynamic.literal(name = "test_retry", test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jestTypes.anon.TestTestEntry]
  }
}
