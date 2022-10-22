package typingsJapgolly.reactSpringCore.anon

import typingsJapgolly.reactSpringCore.reactSpringCoreInts.`120`
import typingsJapgolly.reactSpringCore.reactSpringCoreInts.`14`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tension extends StObject {
  
  val friction: `14`
  
  val tension: `120`
}
object Tension {
  
  inline def apply(): Tension = {
    val __obj = js.Dynamic.literal(friction = 14, tension = 120)
    __obj.asInstanceOf[Tension]
  }
  
  extension [Self <: Tension](x: Self) {
    
    inline def setFriction(value: `14`): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    inline def setTension(value: `120`): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
  }
}
