package typingsJapgolly.nodeDhtSensor

import typingsJapgolly.nodeDhtSensor.mod.SensorData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Fake extends StObject {
    
    var fake: SensorData
  }
  object Fake {
    
    inline def apply(fake: SensorData): Fake = {
      val __obj = js.Dynamic.literal(fake = fake.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fake]
    }
    
    extension [Self <: Fake](x: Self) {
      
      inline def setFake(value: SensorData): Self = StObject.set(x, "fake", value.asInstanceOf[js.Any])
    }
  }
  
  trait Test extends StObject {
    
    var test: Fake
  }
  object Test {
    
    inline def apply(test: Fake): Test = {
      val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[Test]
    }
    
    extension [Self <: Test](x: Self) {
      
      inline def setTest(value: Fake): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
}
