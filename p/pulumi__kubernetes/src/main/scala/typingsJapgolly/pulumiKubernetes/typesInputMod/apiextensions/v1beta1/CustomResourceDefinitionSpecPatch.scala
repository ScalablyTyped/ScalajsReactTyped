package typingsJapgolly.pulumiKubernetes.typesInputMod.apiextensions.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceDefinitionSpec describes how a user wants their resource to appear
  */
trait CustomResourceDefinitionSpecPatch extends StObject {
  
  /**
    * additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If present, this field configures columns for all versions. Top-level and per-version columns are mutually exclusive. If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used.
    */
  var additionalPrinterColumns: js.UndefOr[Input[js.Array[Input[CustomResourceColumnDefinitionPatch]]]] = js.undefined
  
  /**
    * conversion defines conversion settings for the CRD.
    */
  var conversion: js.UndefOr[Input[CustomResourceConversionPatch]] = js.undefined
  
  /**
    * group is the API group of the defined custom resource. The custom resources are served under `/apis/<group>/...`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`).
    */
  var group: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * names specify the resource and kind names for the custom resource.
    */
  var names: js.UndefOr[Input[CustomResourceDefinitionNamesPatch]] = js.undefined
  
  /**
    * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage. apiVersion, kind, metadata and known fields inside metadata are always preserved. If false, schemas must be defined for all versions. Defaults to true in v1beta for backwards compatibility. Deprecated: will be required to be false in v1. Preservation of unknown fields can be specified in the validation schema using the `x-kubernetes-preserve-unknown-fields: true` extension. See https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields for details.
    */
  var preserveUnknownFields: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed values are `Cluster` and `Namespaced`. Default is `Namespaced`.
    */
  var scope: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * subresources specify what subresources the defined custom resource has. If present, this field configures subresources for all versions. Top-level and per-version subresources are mutually exclusive.
    */
  var subresources: js.UndefOr[Input[CustomResourceSubresourcesPatch]] = js.undefined
  
  /**
    * validation describes the schema used for validation and pruning of the custom resource. If present, this validation schema is used to validate all versions. Top-level and per-version schemas are mutually exclusive.
    */
  var validation: js.UndefOr[Input[CustomResourceValidationPatch]] = js.undefined
  
  /**
    * version is the API version of the defined custom resource. The custom resources are served under `/apis/<group>/<version>/...`. Must match the name of the first item in the `versions` list if `version` and `versions` are both specified. Optional if `versions` is specified. Deprecated: use `versions` instead.
    */
  var version: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * versions is the list of all API versions of the defined custom resource. Optional if `version` is specified. The name of the first item in the `versions` list must match the `version` field if `version` and `versions` are both specified. Version names are used to compute the order in which served versions are listed in API discovery. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
    */
  var versions: js.UndefOr[Input[js.Array[Input[CustomResourceDefinitionVersionPatch]]]] = js.undefined
}
object CustomResourceDefinitionSpecPatch {
  
  inline def apply(): CustomResourceDefinitionSpecPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomResourceDefinitionSpecPatch]
  }
  
  extension [Self <: CustomResourceDefinitionSpecPatch](x: Self) {
    
    inline def setAdditionalPrinterColumns(value: Input[js.Array[Input[CustomResourceColumnDefinitionPatch]]]): Self = StObject.set(x, "additionalPrinterColumns", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPrinterColumnsUndefined: Self = StObject.set(x, "additionalPrinterColumns", js.undefined)
    
    inline def setAdditionalPrinterColumnsVarargs(value: Input[CustomResourceColumnDefinitionPatch]*): Self = StObject.set(x, "additionalPrinterColumns", js.Array(value*))
    
    inline def setConversion(value: Input[CustomResourceConversionPatch]): Self = StObject.set(x, "conversion", value.asInstanceOf[js.Any])
    
    inline def setConversionUndefined: Self = StObject.set(x, "conversion", js.undefined)
    
    inline def setGroup(value: Input[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setNames(value: Input[CustomResourceDefinitionNamesPatch]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setPreserveUnknownFields(value: Input[Boolean]): Self = StObject.set(x, "preserveUnknownFields", value.asInstanceOf[js.Any])
    
    inline def setPreserveUnknownFieldsUndefined: Self = StObject.set(x, "preserveUnknownFields", js.undefined)
    
    inline def setScope(value: Input[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSubresources(value: Input[CustomResourceSubresourcesPatch]): Self = StObject.set(x, "subresources", value.asInstanceOf[js.Any])
    
    inline def setSubresourcesUndefined: Self = StObject.set(x, "subresources", js.undefined)
    
    inline def setValidation(value: Input[CustomResourceValidationPatch]): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
    
    inline def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersions(value: Input[js.Array[Input[CustomResourceDefinitionVersionPatch]]]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: Input[CustomResourceDefinitionVersionPatch]*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
