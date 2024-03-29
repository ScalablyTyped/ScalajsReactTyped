package typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssumedRoleUser extends StObject {
  
  /**
    * <p>The ARN of the temporary security credentials that are returned from the <a>AssumeRole</a> action. For more information about ARNs and how to use them in
    *          policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM Identifiers</a> in the
    *             <i>IAM User Guide</i>.</p>
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A unique identifier that contains the role ID and the role session name of the role that
    *          is being assumed. The role ID is generated by Amazon Web Services when the role is created.</p>
    */
  var AssumedRoleId: js.UndefOr[String] = js.undefined
}
object AssumedRoleUser {
  
  inline def apply(): AssumedRoleUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssumedRoleUser]
  }
  
  extension [Self <: AssumedRoleUser](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAssumedRoleId(value: String): Self = StObject.set(x, "AssumedRoleId", value.asInstanceOf[js.Any])
    
    inline def setAssumedRoleIdUndefined: Self = StObject.set(x, "AssumedRoleId", js.undefined)
  }
}
