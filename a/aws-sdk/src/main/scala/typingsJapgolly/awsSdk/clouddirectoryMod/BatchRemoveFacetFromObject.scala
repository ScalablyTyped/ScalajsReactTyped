package typingsJapgolly.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchRemoveFacetFromObject extends js.Object {
  /**
    * A reference to the object whose facet will be removed.
    */
  var ObjectReference: typingsJapgolly.awsSdk.clouddirectoryMod.ObjectReference = js.native
  /**
    * The facet to remove from the object.
    */
  var SchemaFacet: typingsJapgolly.awsSdk.clouddirectoryMod.SchemaFacet = js.native
}

object BatchRemoveFacetFromObject {
  @scala.inline
  def apply(ObjectReference: ObjectReference, SchemaFacet: SchemaFacet): BatchRemoveFacetFromObject = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchRemoveFacetFromObject]
  }
}

