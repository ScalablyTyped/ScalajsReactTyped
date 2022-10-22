package typingsJapgolly.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachObjectRequest extends StObject {
  
  /**
    * The child object reference to be attached to the object.
    */
  var ChildReference: ObjectReference
  
  /**
    * Amazon Resource Name (ARN) that is associated with the Directory where both objects reside. For more information, see arns.
    */
  var DirectoryArn: Arn
  
  /**
    * The link name with which the child object is attached to the parent.
    */
  var LinkName: typingsJapgolly.awsSdk.clientsClouddirectoryMod.LinkName
  
  /**
    * The parent object reference.
    */
  var ParentReference: ObjectReference
}
object AttachObjectRequest {
  
  inline def apply(
    ChildReference: ObjectReference,
    DirectoryArn: Arn,
    LinkName: LinkName,
    ParentReference: ObjectReference
  ): AttachObjectRequest = {
    val __obj = js.Dynamic.literal(ChildReference = ChildReference.asInstanceOf[js.Any], DirectoryArn = DirectoryArn.asInstanceOf[js.Any], LinkName = LinkName.asInstanceOf[js.Any], ParentReference = ParentReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachObjectRequest]
  }
  
  extension [Self <: AttachObjectRequest](x: Self) {
    
    inline def setChildReference(value: ObjectReference): Self = StObject.set(x, "ChildReference", value.asInstanceOf[js.Any])
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    inline def setLinkName(value: LinkName): Self = StObject.set(x, "LinkName", value.asInstanceOf[js.Any])
    
    inline def setParentReference(value: ObjectReference): Self = StObject.set(x, "ParentReference", value.asInstanceOf[js.Any])
  }
}
