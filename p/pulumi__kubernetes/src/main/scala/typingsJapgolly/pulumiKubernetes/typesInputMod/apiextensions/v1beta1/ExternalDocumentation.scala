package typingsJapgolly.pulumiKubernetes.typesInputMod.apiextensions.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExternalDocumentation allows referencing an external resource for extended documentation.
  */
trait ExternalDocumentation extends StObject {
  
  var description: js.UndefOr[Input[String]] = js.undefined
  
  var url: js.UndefOr[Input[String]] = js.undefined
}
object ExternalDocumentation {
  
  inline def apply(): ExternalDocumentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalDocumentation]
  }
  
  extension [Self <: ExternalDocumentation](x: Self) {
    
    inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setUrl(value: Input[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
