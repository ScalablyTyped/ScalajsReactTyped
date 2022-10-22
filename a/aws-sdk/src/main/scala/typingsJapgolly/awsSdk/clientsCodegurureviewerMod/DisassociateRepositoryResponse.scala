package typingsJapgolly.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateRepositoryResponse extends StObject {
  
  /**
    * Information about the disassociated repository.
    */
  var RepositoryAssociation: js.UndefOr[typingsJapgolly.awsSdk.clientsCodegurureviewerMod.RepositoryAssociation] = js.undefined
  
  /**
    * An array of key-value pairs used to tag an associated repository. A tag is a custom attribute label with two parts:   A tag key (for example, CostCenter, Environment, Project, or Secret). Tag keys are case sensitive.   An optional field known as a tag value (for example, 111122223333, Production, or a team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag values are case sensitive.  
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object DisassociateRepositoryResponse {
  
  inline def apply(): DisassociateRepositoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateRepositoryResponse]
  }
  
  extension [Self <: DisassociateRepositoryResponse](x: Self) {
    
    inline def setRepositoryAssociation(value: RepositoryAssociation): Self = StObject.set(x, "RepositoryAssociation", value.asInstanceOf[js.Any])
    
    inline def setRepositoryAssociationUndefined: Self = StObject.set(x, "RepositoryAssociation", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
