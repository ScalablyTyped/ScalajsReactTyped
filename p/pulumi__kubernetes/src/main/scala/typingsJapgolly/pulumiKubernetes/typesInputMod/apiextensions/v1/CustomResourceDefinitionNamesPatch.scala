package typingsJapgolly.pulumiKubernetes.typesInputMod.apiextensions.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition
  */
trait CustomResourceDefinitionNamesPatch extends StObject {
  
  /**
    * categories is a list of grouped resources this custom resource belongs to (e.g. 'all'). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.
    */
  var categories: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the `kind` attribute in API calls.
    */
  var kind: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * listKind is the serialized kind of the list for this resource. Defaults to "`kind`List".
    */
  var listKind: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * plural is the plural name of the resource to serve. The custom resources are served under `/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`). Must be all lowercase.
    */
  var plural: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get <shortname>`. It must be all lowercase.
    */
  var shortNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`.
    */
  var singular: js.UndefOr[Input[String]] = js.undefined
}
object CustomResourceDefinitionNamesPatch {
  
  inline def apply(): CustomResourceDefinitionNamesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomResourceDefinitionNamesPatch]
  }
  
  extension [Self <: CustomResourceDefinitionNamesPatch](x: Self) {
    
    inline def setCategories(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: Input[String]*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setListKind(value: Input[String]): Self = StObject.set(x, "listKind", value.asInstanceOf[js.Any])
    
    inline def setListKindUndefined: Self = StObject.set(x, "listKind", js.undefined)
    
    inline def setPlural(value: Input[String]): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
    
    inline def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
    
    inline def setShortNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "shortNames", value.asInstanceOf[js.Any])
    
    inline def setShortNamesUndefined: Self = StObject.set(x, "shortNames", js.undefined)
    
    inline def setShortNamesVarargs(value: Input[String]*): Self = StObject.set(x, "shortNames", js.Array(value*))
    
    inline def setSingular(value: Input[String]): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
    
    inline def setSingularUndefined: Self = StObject.set(x, "singular", js.undefined)
  }
}
