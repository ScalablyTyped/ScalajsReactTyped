package typingsJapgolly.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerTaskSpec
  extends StObject
     with TaskSpecBase
     with TaskSpec {
  
  var ContainerSpec: js.UndefOr[typingsJapgolly.dockerode.mod.ContainerSpec] = js.undefined
}
object ContainerTaskSpec {
  
  inline def apply(): ContainerTaskSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerTaskSpec]
  }
  
  extension [Self <: ContainerTaskSpec](x: Self) {
    
    inline def setContainerSpec(value: ContainerSpec): Self = StObject.set(x, "ContainerSpec", value.asInstanceOf[js.Any])
    
    inline def setContainerSpecUndefined: Self = StObject.set(x, "ContainerSpec", js.undefined)
  }
}
