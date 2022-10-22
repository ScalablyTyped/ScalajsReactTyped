package typingsJapgolly.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedItemEventIncludedData extends StObject {
  
  /**
    * Details of what related item data is published through the case event stream.
    */
  var includeContent: Boolean
}
object RelatedItemEventIncludedData {
  
  inline def apply(includeContent: Boolean): RelatedItemEventIncludedData = {
    val __obj = js.Dynamic.literal(includeContent = includeContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedItemEventIncludedData]
  }
  
  extension [Self <: RelatedItemEventIncludedData](x: Self) {
    
    inline def setIncludeContent(value: Boolean): Self = StObject.set(x, "includeContent", value.asInstanceOf[js.Any])
  }
}
