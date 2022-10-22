package typingsJapgolly.pulumiKubernetes.typesInputMod.apiextensions.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceDefinitionVersion describes a version for CRD.
  */
trait CustomResourceDefinitionVersionPatch extends StObject {
  
  /**
    * additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. Top-level and per-version columns are mutually exclusive. Per-version columns must not all be set to identical values (top-level columns should be used instead). If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used.
    */
  var additionalPrinterColumns: js.UndefOr[Input[js.Array[Input[CustomResourceColumnDefinitionPatch]]]] = js.undefined
  
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
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * schema describes the schema used for validation and pruning of this version of the custom resource. Top-level and per-version schemas are mutually exclusive. Per-version schemas must not all be set to identical values (top-level validation schema should be used instead).
    */
  var schema: js.UndefOr[Input[CustomResourceValidationPatch]] = js.undefined
  
  /**
    * served is a flag enabling/disabling this version from being served via REST APIs
    */
  var served: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * storage indicates this version should be used when persisting custom resources to storage. There must be exactly one version with storage=true.
    */
  var storage: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * subresources specify what subresources this version of the defined custom resource have. Top-level and per-version subresources are mutually exclusive. Per-version subresources must not all be set to identical values (top-level subresources should be used instead).
    */
  var subresources: js.UndefOr[Input[CustomResourceSubresourcesPatch]] = js.undefined
}
object CustomResourceDefinitionVersionPatch {
  
  inline def apply(): CustomResourceDefinitionVersionPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomResourceDefinitionVersionPatch]
  }
  
  extension [Self <: CustomResourceDefinitionVersionPatch](x: Self) {
    
    inline def setAdditionalPrinterColumns(value: Input[js.Array[Input[CustomResourceColumnDefinitionPatch]]]): Self = StObject.set(x, "additionalPrinterColumns", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPrinterColumnsUndefined: Self = StObject.set(x, "additionalPrinterColumns", js.undefined)
    
    inline def setAdditionalPrinterColumnsVarargs(value: Input[CustomResourceColumnDefinitionPatch]*): Self = StObject.set(x, "additionalPrinterColumns", js.Array(value*))
    
    inline def setDeprecated(value: Input[Boolean]): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDeprecationWarning(value: Input[String]): Self = StObject.set(x, "deprecationWarning", value.asInstanceOf[js.Any])
    
    inline def setDeprecationWarningUndefined: Self = StObject.set(x, "deprecationWarning", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSchema(value: Input[CustomResourceValidationPatch]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setServed(value: Input[Boolean]): Self = StObject.set(x, "served", value.asInstanceOf[js.Any])
    
    inline def setServedUndefined: Self = StObject.set(x, "served", js.undefined)
    
    inline def setStorage(value: Input[Boolean]): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    inline def setSubresources(value: Input[CustomResourceSubresourcesPatch]): Self = StObject.set(x, "subresources", value.asInstanceOf[js.Any])
    
    inline def setSubresourcesUndefined: Self = StObject.set(x, "subresources", js.undefined)
  }
}
