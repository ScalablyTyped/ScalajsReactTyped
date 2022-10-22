package typingsJapgolly.awsLambda.anon

import typingsJapgolly.awsLambda.awsLambdaStrings.AWS
import typingsJapgolly.awsLambda.awsLambdaStrings.ThirdParty
import typingsJapgolly.awsLambda.triggerCodepipelineCloudwatchActionMod.CodePipelineActionCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Category extends StObject {
  
  var category: CodePipelineActionCategory
  
  var owner: AWS | typingsJapgolly.awsLambda.awsLambdaStrings.Custom | ThirdParty
  
  var provider: String
  
  var version: Double
}
object Category {
  
  inline def apply(
    category: CodePipelineActionCategory,
    owner: AWS | typingsJapgolly.awsLambda.awsLambdaStrings.Custom | ThirdParty,
    provider: String,
    version: Double
  ): Category = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
  
  extension [Self <: Category](x: Self) {
    
    inline def setCategory(value: CodePipelineActionCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: AWS | typingsJapgolly.awsLambda.awsLambdaStrings.Custom | ThirdParty): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
