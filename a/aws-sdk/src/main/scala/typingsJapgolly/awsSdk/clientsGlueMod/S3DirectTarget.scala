package typingsJapgolly.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DirectTarget extends StObject {
  
  /**
    * Specifies how the data is compressed. This is generally not necessary if the data has a standard file extension. Possible values are "gzip" and "bzip").
    */
  var Compression: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * Specifies the data output format for the target.
    */
  var Format: TargetFormat
  
  /**
    * The nodes that are inputs to the data target.
    */
  var Inputs: OneInput
  
  /**
    * The name of the data target.
    */
  var Name: NodeName
  
  /**
    * Specifies native partitioning using a sequence of keys.
    */
  var PartitionKeys: js.UndefOr[GlueStudioPathList] = js.undefined
  
  /**
    * A single Amazon S3 path to write to.
    */
  var Path: EnclosedInStringProperty
  
  /**
    * A policy that specifies update behavior for the crawler.
    */
  var SchemaChangePolicy: js.UndefOr[DirectSchemaChangePolicy] = js.undefined
}
object S3DirectTarget {
  
  inline def apply(Format: TargetFormat, Inputs: OneInput, Name: NodeName, Path: EnclosedInStringProperty): S3DirectTarget = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DirectTarget]
  }
  
  extension [Self <: S3DirectTarget](x: Self) {
    
    inline def setCompression(value: EnclosedInStringProperty): Self = StObject.set(x, "Compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "Compression", js.undefined)
    
    inline def setFormat(value: TargetFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeys(value: GlueStudioPathList): Self = StObject.set(x, "PartitionKeys", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeysUndefined: Self = StObject.set(x, "PartitionKeys", js.undefined)
    
    inline def setPartitionKeysVarargs(value: EnclosedInStringProperties*): Self = StObject.set(x, "PartitionKeys", js.Array(value*))
    
    inline def setPath(value: EnclosedInStringProperty): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setSchemaChangePolicy(value: DirectSchemaChangePolicy): Self = StObject.set(x, "SchemaChangePolicy", value.asInstanceOf[js.Any])
    
    inline def setSchemaChangePolicyUndefined: Self = StObject.set(x, "SchemaChangePolicy", js.undefined)
  }
}
