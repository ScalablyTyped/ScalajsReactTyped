package typingsJapgolly.testcafeReporterDashboard.anon

import typingsJapgolly.ioTs.mod.ExactC
import typingsJapgolly.ioTs.mod.ReadonlyC
import typingsJapgolly.ioTs.mod.TypeC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fixture extends StObject {
  
  var fixture: ReadonlyC[ExactC[TypeC[Name]]]
}
object Fixture {
  
  inline def apply(fixture: ReadonlyC[ExactC[TypeC[Name]]]): Fixture = {
    val __obj = js.Dynamic.literal(fixture = fixture.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fixture]
  }
  
  extension [Self <: Fixture](x: Self) {
    
    inline def setFixture(value: ReadonlyC[ExactC[TypeC[Name]]]): Self = StObject.set(x, "fixture", value.asInstanceOf[js.Any])
  }
}
