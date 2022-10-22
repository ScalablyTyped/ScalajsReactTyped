package typingsJapgolly.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceDetails extends StObject {
  
  /**
    * The Amazon EC2 instances that Amazon Web Services recommends that you purchase.
    */
  var EC2InstanceDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsCostexplorerMod.EC2InstanceDetails] = js.undefined
  
  /**
    * The Amazon OpenSearch Service instances that Amazon Web Services recommends that you purchase.
    */
  var ESInstanceDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsCostexplorerMod.ESInstanceDetails] = js.undefined
  
  /**
    * The ElastiCache instances that Amazon Web Services recommends that you purchase.
    */
  var ElastiCacheInstanceDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsCostexplorerMod.ElastiCacheInstanceDetails] = js.undefined
  
  /**
    * The Amazon RDS instances that Amazon Web Services recommends that you purchase.
    */
  var RDSInstanceDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsCostexplorerMod.RDSInstanceDetails] = js.undefined
  
  /**
    * The Amazon Redshift instances that Amazon Web Services recommends that you purchase.
    */
  var RedshiftInstanceDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsCostexplorerMod.RedshiftInstanceDetails] = js.undefined
}
object InstanceDetails {
  
  inline def apply(): InstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceDetails]
  }
  
  extension [Self <: InstanceDetails](x: Self) {
    
    inline def setEC2InstanceDetails(value: EC2InstanceDetails): Self = StObject.set(x, "EC2InstanceDetails", value.asInstanceOf[js.Any])
    
    inline def setEC2InstanceDetailsUndefined: Self = StObject.set(x, "EC2InstanceDetails", js.undefined)
    
    inline def setESInstanceDetails(value: ESInstanceDetails): Self = StObject.set(x, "ESInstanceDetails", value.asInstanceOf[js.Any])
    
    inline def setESInstanceDetailsUndefined: Self = StObject.set(x, "ESInstanceDetails", js.undefined)
    
    inline def setElastiCacheInstanceDetails(value: ElastiCacheInstanceDetails): Self = StObject.set(x, "ElastiCacheInstanceDetails", value.asInstanceOf[js.Any])
    
    inline def setElastiCacheInstanceDetailsUndefined: Self = StObject.set(x, "ElastiCacheInstanceDetails", js.undefined)
    
    inline def setRDSInstanceDetails(value: RDSInstanceDetails): Self = StObject.set(x, "RDSInstanceDetails", value.asInstanceOf[js.Any])
    
    inline def setRDSInstanceDetailsUndefined: Self = StObject.set(x, "RDSInstanceDetails", js.undefined)
    
    inline def setRedshiftInstanceDetails(value: RedshiftInstanceDetails): Self = StObject.set(x, "RedshiftInstanceDetails", value.asInstanceOf[js.Any])
    
    inline def setRedshiftInstanceDetailsUndefined: Self = StObject.set(x, "RedshiftInstanceDetails", js.undefined)
  }
}
