package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ConfigMap holds configuration data for pods to consume.
  */
trait ConfigMap extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.v1
  
  /**
    * BinaryData contains the binary data. Each key must consist of alphanumeric characters, '-', '_' or '.'. BinaryData can contain byte sequences that are not in the UTF-8 range. The keys stored in BinaryData must not overlap with the ones in the Data field, this is enforced during validation process. Using this field will require 1.10+ apiserver and kubelet.
    */
  var binaryData: StringDictionary[String]
  
  /**
    * Data contains the configuration data. Each key must consist of alphanumeric characters, '-', '_' or '.'. Values with non-UTF-8 byte sequences must use the BinaryData field. The keys stored in Data must not overlap with the keys in the BinaryData field, this is enforced during validation process.
    */
  var data: StringDictionary[String]
  
  /**
    * Immutable, if set to true, ensures that data stored in the ConfigMap cannot be updated (only object metadata can be modified). If not set to true, the field can be modified at any time. Defaulted to nil.
    */
  var immutable: Boolean
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ConfigMap
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta
}
object ConfigMap {
  
  inline def apply(
    binaryData: StringDictionary[String],
    data: StringDictionary[String],
    immutable: Boolean,
    metadata: ObjectMeta
  ): ConfigMap = {
    val __obj = js.Dynamic.literal(apiVersion = "v1", binaryData = binaryData.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], immutable = immutable.asInstanceOf[js.Any], kind = "ConfigMap", metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigMap]
  }
  
  extension [Self <: ConfigMap](x: Self) {
    
    inline def setApiVersion(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.v1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setBinaryData(value: StringDictionary[String]): Self = StObject.set(x, "binaryData", value.asInstanceOf[js.Any])
    
    inline def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
    
    inline def setKind(value: typingsJapgolly.pulumiKubernetes.pulumiKubernetesStrings.ConfigMap): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
