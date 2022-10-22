package typingsJapgolly.testcafeReporterDashboard.anon

import typingsJapgolly.ioTs.mod.ArrayC
import typingsJapgolly.ioTs.mod.BrandC
import typingsJapgolly.ioTs.mod.ExactC
import typingsJapgolly.ioTs.mod.ReadonlyC
import typingsJapgolly.ioTs.mod.StringC
import typingsJapgolly.ioTs.mod.TypeC
import typingsJapgolly.testcafeReporterDashboard.libTypesCommonMod.MaxLengthString
import typingsJapgolly.testcafeReporterDashboard.testcafeReporterDashboardInts.`300`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var id: BrandC[StringC, MaxLengthString[`300`]]
  
  var name: BrandC[StringC, MaxLengthString[`300`]]
  
  var tests: ArrayC[ReadonlyC[ExactC[TypeC[Id]]]]
}
object Name {
  
  inline def apply(
    id: BrandC[StringC, MaxLengthString[`300`]],
    name: BrandC[StringC, MaxLengthString[`300`]],
    tests: ArrayC[ReadonlyC[ExactC[TypeC[Id]]]]
  ): Name = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setId(value: BrandC[StringC, MaxLengthString[`300`]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: BrandC[StringC, MaxLengthString[`300`]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTests(value: ArrayC[ReadonlyC[ExactC[TypeC[Id]]]]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
  }
}
