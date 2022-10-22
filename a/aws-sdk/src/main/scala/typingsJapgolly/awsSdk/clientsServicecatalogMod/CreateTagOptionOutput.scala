package typingsJapgolly.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTagOptionOutput extends StObject {
  
  /**
    * Information about the TagOption.
    */
  var TagOptionDetail: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.TagOptionDetail] = js.undefined
}
object CreateTagOptionOutput {
  
  inline def apply(): CreateTagOptionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTagOptionOutput]
  }
  
  extension [Self <: CreateTagOptionOutput](x: Self) {
    
    inline def setTagOptionDetail(value: TagOptionDetail): Self = StObject.set(x, "TagOptionDetail", value.asInstanceOf[js.Any])
    
    inline def setTagOptionDetailUndefined: Self = StObject.set(x, "TagOptionDetail", js.undefined)
  }
}
