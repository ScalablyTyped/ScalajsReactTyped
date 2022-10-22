package typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod

import typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildDefinitionRevision extends StObject {
  
  /**
    * The change type (add, edit, delete).
    */
  var changeType: AuditAction
  
  /**
    * The identity of the person or process that changed the definition.
    */
  var changedBy: IdentityRef
  
  /**
    * The date and time that the definition was changed.
    */
  var changedDate: js.Date
  
  /**
    * The comment associated with the change.
    */
  var comment: String
  
  /**
    * A link to the definition at this revision.
    */
  var definitionUrl: String
  
  /**
    * The name of the definition.
    */
  var name: String
  
  /**
    * The revision number.
    */
  var revision: Double
}
object BuildDefinitionRevision {
  
  inline def apply(
    changeType: AuditAction,
    changedBy: IdentityRef,
    changedDate: js.Date,
    comment: String,
    definitionUrl: String,
    name: String,
    revision: Double
  ): BuildDefinitionRevision = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], changedBy = changedBy.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], definitionUrl = definitionUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionRevision]
  }
  
  extension [Self <: BuildDefinitionRevision](x: Self) {
    
    inline def setChangeType(value: AuditAction): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setChangedBy(value: IdentityRef): Self = StObject.set(x, "changedBy", value.asInstanceOf[js.Any])
    
    inline def setChangedDate(value: js.Date): Self = StObject.set(x, "changedDate", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUrl(value: String): Self = StObject.set(x, "definitionUrl", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
