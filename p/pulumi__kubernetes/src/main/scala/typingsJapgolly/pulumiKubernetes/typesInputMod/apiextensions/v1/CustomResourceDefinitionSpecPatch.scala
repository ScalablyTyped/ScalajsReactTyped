package typingsJapgolly.pulumiKubernetes.typesInputMod.apiextensions.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceDefinitionSpec describes how a user wants their resource to appear
  */
trait CustomResourceDefinitionSpecPatch extends StObject {
  
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
    * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage. apiVersion, kind, metadata and known fields inside metadata are always preserved. This field is deprecated in favor of setting `x-preserve-unknown-fields` to true in `spec.versions[*].schema.openAPIV3Schema`. See https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields for details.
    */
  var preserveUnknownFields: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed values are `Cluster` and `Namespaced`.
    */
  var scope: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * versions is the list of all API versions of the defined custom resource. Version names are used to compute the order in which served versions are listed in API discovery. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
    */
  var versions: js.UndefOr[Input[js.Array[Input[CustomResourceDefinitionVersionPatch]]]] = js.undefined
}
object CustomResourceDefinitionSpecPatch {
  
  inline def apply(): CustomResourceDefinitionSpecPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomResourceDefinitionSpecPatch]
  }
  
  extension [Self <: CustomResourceDefinitionSpecPatch](x: Self) {
    
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
    
    inline def setVersions(value: Input[js.Array[Input[CustomResourceDefinitionVersionPatch]]]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: Input[CustomResourceDefinitionVersionPatch]*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
