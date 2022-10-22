package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectFieldSelector selects an APIVersioned field of an object.
  */
trait ObjectFieldSelectorPatch extends StObject {
  
  /**
    * Version of the schema the FieldPath is written in terms of, defaults to "v1".
    */
  var apiVersion: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Path of the field to select in the specified API version.
    */
  var fieldPath: js.UndefOr[Input[String]] = js.undefined
}
object ObjectFieldSelectorPatch {
  
  inline def apply(): ObjectFieldSelectorPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectFieldSelectorPatch]
  }
  
  extension [Self <: ObjectFieldSelectorPatch](x: Self) {
    
    inline def setApiVersion(value: Input[String]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setFieldPath(value: Input[String]): Self = StObject.set(x, "fieldPath", value.asInstanceOf[js.Any])
    
    inline def setFieldPathUndefined: Self = StObject.set(x, "fieldPath", js.undefined)
  }
}
