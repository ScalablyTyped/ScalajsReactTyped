package typingsJapgolly.devtoolsProtocol.mod.Protocol.Page

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.allow_
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.default_
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.deny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDownloadBehaviorRequest extends StObject {
  
  /**
    * Whether to allow all or deny all download requests, or use default Chrome behavior if
    * available (otherwise deny). (SetDownloadBehaviorRequestBehavior enum)
    */
  var behavior: deny | allow_ | default_
  
  /**
    * The default path to save downloaded files to. This is required if behavior is set to 'allow'
    */
  var downloadPath: js.UndefOr[String] = js.undefined
}
object SetDownloadBehaviorRequest {
  
  inline def apply(behavior: deny | allow_ | default_): SetDownloadBehaviorRequest = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDownloadBehaviorRequest]
  }
  
  extension [Self <: SetDownloadBehaviorRequest](x: Self) {
    
    inline def setBehavior(value: deny | allow_ | default_): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setDownloadPath(value: String): Self = StObject.set(x, "downloadPath", value.asInstanceOf[js.Any])
    
    inline def setDownloadPathUndefined: Self = StObject.set(x, "downloadPath", js.undefined)
  }
}
