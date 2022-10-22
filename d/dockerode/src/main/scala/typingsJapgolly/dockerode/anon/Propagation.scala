package typingsJapgolly.dockerode.anon

import typingsJapgolly.dockerode.mod.MountPropagation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Propagation extends StObject {
  
  var Propagation: MountPropagation
}
object Propagation {
  
  inline def apply(Propagation: MountPropagation): Propagation = {
    val __obj = js.Dynamic.literal(Propagation = Propagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Propagation]
  }
  
  extension [Self <: Propagation](x: Self) {
    
    inline def setPropagation(value: MountPropagation): Self = StObject.set(x, "Propagation", value.asInstanceOf[js.Any])
  }
}
