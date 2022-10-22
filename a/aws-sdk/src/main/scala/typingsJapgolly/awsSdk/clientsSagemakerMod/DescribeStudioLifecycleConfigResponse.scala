package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStudioLifecycleConfigResponse extends StObject {
  
  /**
    * The creation time of the Studio Lifecycle Configuration.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * This value is equivalent to CreationTime because Studio Lifecycle Configurations are immutable.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The App type that the Lifecycle Configuration is attached to.
    */
  var StudioLifecycleConfigAppType: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.StudioLifecycleConfigAppType] = js.undefined
  
  /**
    * The ARN of the Lifecycle Configuration to describe.
    */
  var StudioLifecycleConfigArn: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.StudioLifecycleConfigArn] = js.undefined
  
  /**
    * The content of your Studio Lifecycle Configuration script.
    */
  var StudioLifecycleConfigContent: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.StudioLifecycleConfigContent] = js.undefined
  
  /**
    * The name of the Studio Lifecycle Configuration that is described.
    */
  var StudioLifecycleConfigName: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.StudioLifecycleConfigName] = js.undefined
}
object DescribeStudioLifecycleConfigResponse {
  
  inline def apply(): DescribeStudioLifecycleConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStudioLifecycleConfigResponse]
  }
  
  extension [Self <: DescribeStudioLifecycleConfigResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setStudioLifecycleConfigAppType(value: StudioLifecycleConfigAppType): Self = StObject.set(x, "StudioLifecycleConfigAppType", value.asInstanceOf[js.Any])
    
    inline def setStudioLifecycleConfigAppTypeUndefined: Self = StObject.set(x, "StudioLifecycleConfigAppType", js.undefined)
    
    inline def setStudioLifecycleConfigArn(value: StudioLifecycleConfigArn): Self = StObject.set(x, "StudioLifecycleConfigArn", value.asInstanceOf[js.Any])
    
    inline def setStudioLifecycleConfigArnUndefined: Self = StObject.set(x, "StudioLifecycleConfigArn", js.undefined)
    
    inline def setStudioLifecycleConfigContent(value: StudioLifecycleConfigContent): Self = StObject.set(x, "StudioLifecycleConfigContent", value.asInstanceOf[js.Any])
    
    inline def setStudioLifecycleConfigContentUndefined: Self = StObject.set(x, "StudioLifecycleConfigContent", js.undefined)
    
    inline def setStudioLifecycleConfigName(value: StudioLifecycleConfigName): Self = StObject.set(x, "StudioLifecycleConfigName", value.asInstanceOf[js.Any])
    
    inline def setStudioLifecycleConfigNameUndefined: Self = StObject.set(x, "StudioLifecycleConfigName", js.undefined)
  }
}
