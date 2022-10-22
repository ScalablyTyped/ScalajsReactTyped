package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Adds and removes POSIX capabilities from running containers.
  */
trait CapabilitiesPatch extends StObject {
  
  /**
    * Added capabilities
    */
  var add: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * Removed capabilities
    */
  var drop: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object CapabilitiesPatch {
  
  inline def apply(): CapabilitiesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapabilitiesPatch]
  }
  
  extension [Self <: CapabilitiesPatch](x: Self) {
    
    inline def setAdd(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAddVarargs(value: Input[String]*): Self = StObject.set(x, "add", js.Array(value*))
    
    inline def setDrop(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setDropVarargs(value: Input[String]*): Self = StObject.set(x, "drop", js.Array(value*))
  }
}
