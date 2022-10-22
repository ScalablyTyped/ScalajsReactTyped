package typingsJapgolly.googleCloudStorage.buildSrcBucketMod

import typingsJapgolly.googleCloudStorage.buildSrcNodejsCommonServiceObjectMod.GetConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketOptions
  extends StObject
     with GetConfig {
  
  var userProject: js.UndefOr[String] = js.undefined
}
object GetBucketOptions {
  
  inline def apply(): GetBucketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketOptions]
  }
  
  extension [Self <: GetBucketOptions](x: Self) {
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
