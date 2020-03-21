package typingsJapgolly.mendixmodelsdk.deltasDeltasMod

import typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.ATTACH_ELEMENT
import typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.CREATE_ELEMENT_TREE
import typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.CREATE_UNIT_TREE
import typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.DELETE_ELEMENT
import typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.DELETE_UNIT
import typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.DETACH_ELEMENT
import typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.UPDATE_PROPERTY_VALUE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mendixmodelsdk.deltasDeltasMod.ICreateElementTreeDelta
  - typingsJapgolly.mendixmodelsdk.deltasDeltasMod.IDeleteElementDelta
  - typingsJapgolly.mendixmodelsdk.deltasDeltasMod.IAttachElementDelta
  - typingsJapgolly.mendixmodelsdk.deltasDeltasMod.IDetachElementDelta
  - typingsJapgolly.mendixmodelsdk.deltasDeltasMod.ICreateUnitTreeDelta
  - typingsJapgolly.mendixmodelsdk.deltasDeltasMod.IDeleteUnitDelta
  - typingsJapgolly.mendixmodelsdk.deltasDeltasMod.IUpdatePropertyValueDelta
*/
trait Delta extends js.Object

object Delta {
  @scala.inline
  def ICreateElementTreeDelta(
    deltaType: CREATE_ELEMENT_TREE,
    elementTree: IStructureJSON,
    parentId: String,
    parentPropertyName: String,
    unitId: String,
    additionIndex: Int | Double = null
  ): Delta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementTree = elementTree.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], parentPropertyName = parentPropertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    if (additionIndex != null) __obj.updateDynamic("additionIndex")(additionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  @scala.inline
  def ICreateUnitTreeDelta(
    containerId: String,
    containmentName: String,
    contentType: String,
    deltaType: CREATE_UNIT_TREE,
    unitId: String,
    unitTree: IStructureJSON
  ): Delta = {
    val __obj = js.Dynamic.literal(containerId = containerId.asInstanceOf[js.Any], containmentName = containmentName.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], deltaType = deltaType.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any], unitTree = unitTree.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Delta]
  }
  @scala.inline
  def IUpdatePropertyValueDelta(
    deltaType: UPDATE_PROPERTY_VALUE,
    elementId: String,
    mutator: Mutator,
    propertyName: String,
    unitId: String
  ): Delta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], mutator = mutator.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Delta]
  }
  @scala.inline
  def IDeleteUnitDelta(deltaType: DELETE_UNIT, unitId: String): Delta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Delta]
  }
  @scala.inline
  def IDeleteElementDelta(deltaType: DELETE_ELEMENT, elementId: String, unitId: String): Delta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Delta]
  }
  @scala.inline
  def IDetachElementDelta(deltaType: DETACH_ELEMENT, elementId: String, unitId: String): Delta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Delta]
  }
  @scala.inline
  def IAttachElementDelta(
    deltaType: ATTACH_ELEMENT,
    elementId: String,
    newParentId: String,
    newParentPropertyName: String,
    unitId: String,
    newIndex: Int | Double = null
  ): Delta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], newParentId = newParentId.asInstanceOf[js.Any], newParentPropertyName = newParentPropertyName.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    if (newIndex != null) __obj.updateDynamic("newIndex")(newIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
}

