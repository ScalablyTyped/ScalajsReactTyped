package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.angularDevkitCore.mod.virtualFs.test.TestHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoftest extends StObject {
  
  var TestHost: Instantiable0[typingsJapgolly.angularDevkitCore.mod.virtualFs.test.TestHost]
}
object Typeoftest {
  
  inline def apply(TestHost: Instantiable0[TestHost]): Typeoftest = {
    val __obj = js.Dynamic.literal(TestHost = TestHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoftest]
  }
  
  extension [Self <: Typeoftest](x: Self) {
    
    inline def setTestHost(value: Instantiable0[TestHost]): Self = StObject.set(x, "TestHost", value.asInstanceOf[js.Any])
  }
}
