package typingsJapgolly.atlassianConnectJs.anon

import typingsJapgolly.atlassianConnectJs.atlassianConnectJsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  /**
    * If this is set to true, the developer is specifying a request for an attachment consisting of binary data (e.g. an image) and the format of the response will be set to "arraybuffer".
    */
  var binaryAttachment: `true`
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(binaryAttachment = true)
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setBinaryAttachment(value: `true`): Self = StObject.set(x, "binaryAttachment", value.asInstanceOf[js.Any])
  }
}
