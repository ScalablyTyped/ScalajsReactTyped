package typingsJapgolly.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImportInput extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) associated with the table you're importing to. 
    */
  var ImportArn: typingsJapgolly.awsSdk.clientsDynamodbMod.ImportArn
}
object DescribeImportInput {
  
  inline def apply(ImportArn: ImportArn): DescribeImportInput = {
    val __obj = js.Dynamic.literal(ImportArn = ImportArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImportInput]
  }
  
  extension [Self <: DescribeImportInput](x: Self) {
    
    inline def setImportArn(value: ImportArn): Self = StObject.set(x, "ImportArn", value.asInstanceOf[js.Any])
  }
}
