package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Secret holds secret data of a certain type. The total bytes of the values in the Data field must be less than MaxSecretSize bytes.
  *
  * Note: While Pulumi automatically encrypts the 'data' and 'stringData'
  * fields, this encryption only applies to Pulumi's context, including the state file,
  * the Service, the CLI, etc. Kubernetes does not encrypt Secret resources by default,
  * and the contents are visible to users with access to the Secret in Kubernetes using
  * tools like 'kubectl'.
  *
  * For more information on securing Kubernetes Secrets, see the following links:
  * https://kubernetes.io/docs/concepts/configuration/secret/#security-properties
  * https://kubernetes.io/docs/concepts/configuration/secret/#risks
  */
trait Secret extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.v1]] = js.undefined
  
  /**
    * Data contains the secret data. Each key must consist of alphanumeric characters, '-', '_' or '.'. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4
    */
  var data: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified). If not set to true, the field can be modified at any time. Defaulted to nil.
    */
  var immutable: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.Secret]] = js.undefined
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  
  /**
    * stringData allows specifying non-binary secret data in string form. It is provided as a write-only input field for convenience. All keys and values are merged into the data field on write, overwriting any existing values. The stringData field is never output when reading from the API.
    */
  var stringData: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * Used to facilitate programmatic handling of secret data. More info: https://kubernetes.io/docs/concepts/configuration/secret/#secret-types
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object Secret {
  
  inline def apply(): Secret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Secret]
  }
  
  extension [Self <: Secret](x: Self) {
    
    inline def setApiVersion(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.v1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setData(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setImmutable(value: Input[Boolean]): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
    
    inline def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
    
    inline def setKind(value: Input[typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.Secret]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setStringData(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "stringData", value.asInstanceOf[js.Any])
    
    inline def setStringDataUndefined: Self = StObject.set(x, "stringData", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
