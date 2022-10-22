package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitItemRequestData extends StObject {
  
  /**
    * Whether to include metadata for all items
    */
  var includeContentMetadata: Boolean
  
  /**
    * Whether to include the _links field on the shallow references
    */
  var includeLinks: Boolean
  
  /**
    * Collection of items to fetch, including path, version, and recursion level
    */
  var itemDescriptors: js.Array[GitItemDescriptor]
  
  /**
    * Whether to include shallow ref to commit that last changed each item
    */
  var latestProcessedChange: Boolean
}
object GitItemRequestData {
  
  inline def apply(
    includeContentMetadata: Boolean,
    includeLinks: Boolean,
    itemDescriptors: js.Array[GitItemDescriptor],
    latestProcessedChange: Boolean
  ): GitItemRequestData = {
    val __obj = js.Dynamic.literal(includeContentMetadata = includeContentMetadata.asInstanceOf[js.Any], includeLinks = includeLinks.asInstanceOf[js.Any], itemDescriptors = itemDescriptors.asInstanceOf[js.Any], latestProcessedChange = latestProcessedChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitItemRequestData]
  }
  
  extension [Self <: GitItemRequestData](x: Self) {
    
    inline def setIncludeContentMetadata(value: Boolean): Self = StObject.set(x, "includeContentMetadata", value.asInstanceOf[js.Any])
    
    inline def setIncludeLinks(value: Boolean): Self = StObject.set(x, "includeLinks", value.asInstanceOf[js.Any])
    
    inline def setItemDescriptors(value: js.Array[GitItemDescriptor]): Self = StObject.set(x, "itemDescriptors", value.asInstanceOf[js.Any])
    
    inline def setItemDescriptorsVarargs(value: GitItemDescriptor*): Self = StObject.set(x, "itemDescriptors", js.Array(value*))
    
    inline def setLatestProcessedChange(value: Boolean): Self = StObject.set(x, "latestProcessedChange", value.asInstanceOf[js.Any])
  }
}
