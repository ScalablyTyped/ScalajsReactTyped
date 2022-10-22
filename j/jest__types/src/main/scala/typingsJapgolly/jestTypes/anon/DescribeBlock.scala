package typingsJapgolly.jestTypes.anon

import typingsJapgolly.jestTypes.jestTypesStrings.hook_success
import typingsJapgolly.jestTypes.mod.AsyncEvent
import typingsJapgolly.jestTypes.mod.TestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBlock
  extends StObject
     with AsyncEvent {
  
  var describeBlock: js.UndefOr[typingsJapgolly.jestTypes.mod.DescribeBlock] = js.undefined
  
  var hook: typingsJapgolly.jestTypes.mod.Hook
  
  var name: hook_success
  
  var test: js.UndefOr[TestEntry] = js.undefined
}
object DescribeBlock {
  
  inline def apply(hook: typingsJapgolly.jestTypes.mod.Hook): DescribeBlock = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = "hook_success")
    __obj.asInstanceOf[DescribeBlock]
  }
  
  extension [Self <: DescribeBlock](x: Self) {
    
    inline def setDescribeBlock(value: typingsJapgolly.jestTypes.mod.DescribeBlock): Self = StObject.set(x, "describeBlock", value.asInstanceOf[js.Any])
    
    inline def setDescribeBlockUndefined: Self = StObject.set(x, "describeBlock", js.undefined)
    
    inline def setHook(value: typingsJapgolly.jestTypes.mod.Hook): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    inline def setName(value: hook_success): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTest(value: TestEntry): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
