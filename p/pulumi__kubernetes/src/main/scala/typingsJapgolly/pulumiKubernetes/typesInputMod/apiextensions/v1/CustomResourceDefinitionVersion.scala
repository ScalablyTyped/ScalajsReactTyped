package typingsJapgolly.pulumiKubernetes.typesInputMod.apiextensions.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceDefinitionVersion describes a version for CRD.
  */
trait CustomResourceDefinitionVersion extends StObject {
  
  /**
    * additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If no columns are specified, a single column displaying the age of the custom resource is used.
    */
  var additionalPrinterColumns: js.UndefOr[Input[js.Array[Input[CustomResourceColumnDefinition]]]] = js.undefined
  
  /**
    * deprecated indicates this version of the custom resource API is deprecated. When set to true, API requests to this version receive a warning header in the server response. Defaults to false.
    */
  var deprecated: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * deprecationWarning overrides the default warning returned to API clients. May only be set when `deprecated` is true. The default warning indicates this version is deprecated and recommends use of the newest served version of equal or greater stability, if one exists.
    */
  var deprecationWarning: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at `/apis/<group>/<version>/...` if `served` is true.
    */
  var name: Input[String]
  
  /**
    * schema describes the schema used for validation, pruning, and defaulting of this version of the custom resource.
    */
  var schema: js.UndefOr[Input[CustomResourceValidation]] = js.undefined
  
  /**
    * served is a flag enabling/disabling this version from being served via REST APIs
    */
  var served: Input[Boolean]
  
  /**
    * storage indicates this version should be used when persisting custom resources to storage. There must be exactly one version with storage=true.
    */
  var storage: Input[Boolean]
  
  /**
    * subresources specify what subresources this version of the defined custom resource have.
    */
  var subresources: js.UndefOr[Input[CustomResourceSubresources]] = js.undefined
}
object CustomResourceDefinitionVersion {
  
  inline def apply(name: Input[String], served: Input[Boolean], storage: Input[Boolean]): CustomResourceDefinitionVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], served = served.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionVersion]
  }
  
  extension [Self <: CustomResourceDefinitionVersion](x: Self) {
    
    inline def setAdditionalPrinterColumns(value: Input[js.Array[Input[CustomResourceColumnDefinition]]]): Self = StObject.set(x, "additionalPrinterColumns", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPrinterColumnsUndefined: Self = StObject.set(x, "additionalPrinterColumns", js.undefined)
    
    inline def setAdditionalPrinterColumnsVarargs(value: Input[CustomResourceColumnDefinition]*): Self = StObject.set(x, "additionalPrinterColumns", js.Array(value*))
    
    inline def setDeprecated(value: Input[Boolean]): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDeprecationWarning(value: Input[String]): Self = StObject.set(x, "deprecationWarning", value.asInstanceOf[js.Any])
    
    inline def setDeprecationWarningUndefined: Self = StObject.set(x, "deprecationWarning", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: Input[CustomResourceValidation]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setServed(value: Input[Boolean]): Self = StObject.set(x, "served", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: Input[Boolean]): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setSubresources(value: Input[CustomResourceSubresources]): Self = StObject.set(x, "subresources", value.asInstanceOf[js.Any])
    
    inline def setSubresourcesUndefined: Self = StObject.set(x, "subresources", js.undefined)
  }
}
