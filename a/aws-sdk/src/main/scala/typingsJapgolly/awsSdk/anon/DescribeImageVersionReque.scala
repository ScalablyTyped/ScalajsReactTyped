package typingsJapgolly.awsSdk.anon

import typingsJapgolly.awsSdk.clientsSagemakerMod.ImageName
import typingsJapgolly.awsSdk.clientsSagemakerMod.ImageVersionNumber
import typingsJapgolly.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/sagemaker.DescribeImageVersionRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeImageVersionReque extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The name of the image.
    */
  var ImageName: typingsJapgolly.awsSdk.clientsSagemakerMod.ImageName
  
  /**
    * The version of the image. If not specified, the latest version is described.
    */
  var Version: js.UndefOr[ImageVersionNumber] = js.undefined
}
object DescribeImageVersionReque {
  
  inline def apply(ImageName: ImageName): DescribeImageVersionReque = {
    val __obj = js.Dynamic.literal(ImageName = ImageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImageVersionReque]
  }
  
  extension [Self <: DescribeImageVersionReque](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setImageName(value: ImageName): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: ImageVersionNumber): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
