package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sysctl defines a kernel parameter to be set
  */
trait Sysctl extends StObject {
  
  /**
    * Name of a property to set
    */
  var name: Input[String]
  
  /**
    * Value of a property to set
    */
  var value: Input[String]
}
object Sysctl {
  
  inline def apply(name: Input[String], value: Input[String]): Sysctl = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sysctl]
  }
  
  extension [Self <: Sysctl](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
