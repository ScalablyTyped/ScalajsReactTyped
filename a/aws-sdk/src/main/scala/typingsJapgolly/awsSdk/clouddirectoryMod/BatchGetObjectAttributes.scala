package typingsJapgolly.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetObjectAttributes extends js.Object {
  /**
    * List of attribute names whose values will be retrieved.
    */
  var AttributeNames: AttributeNameList = js.native
  /**
    * Reference that identifies the object whose attributes will be retrieved.
    */
  var ObjectReference: typingsJapgolly.awsSdk.clouddirectoryMod.ObjectReference = js.native
  /**
    * Identifier for the facet whose attributes will be retrieved. See SchemaFacet for details.
    */
  var SchemaFacet: typingsJapgolly.awsSdk.clouddirectoryMod.SchemaFacet = js.native
}

object BatchGetObjectAttributes {
  @scala.inline
  def apply(AttributeNames: AttributeNameList, ObjectReference: ObjectReference, SchemaFacet: SchemaFacet): BatchGetObjectAttributes = {
    val __obj = js.Dynamic.literal(AttributeNames = AttributeNames.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any], SchemaFacet = SchemaFacet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchGetObjectAttributes]
  }
}

