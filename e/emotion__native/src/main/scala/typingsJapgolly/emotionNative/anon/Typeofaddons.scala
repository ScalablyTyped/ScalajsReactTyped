package typingsJapgolly.emotionNative.anon

import typingsJapgolly.reactNative.mod.addons.TestModuleStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofaddons extends StObject {
  
  val TestModule: TestModuleStatic
}
object Typeofaddons {
  
  inline def apply(TestModule: TestModuleStatic): Typeofaddons = {
    val __obj = js.Dynamic.literal(TestModule = TestModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofaddons]
  }
  
  extension [Self <: Typeofaddons](x: Self) {
    
    inline def setTestModule(value: TestModuleStatic): Self = StObject.set(x, "TestModule", value.asInstanceOf[js.Any])
  }
}
