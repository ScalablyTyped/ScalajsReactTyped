package typingsJapgolly.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EngineAPI {
  /**
    * BookmarkListObject width extend GenericObject
    */
  type IBookmarkListObject = typingsJapgolly.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typingsJapgolly.qlikEngineapi.EngineAPI.IGenericBookmarkListProperties, 
    typingsJapgolly.qlikEngineapi.EngineAPI.IGenericBookmarkListLayout
  ]
  type IDimensionListObject = typingsJapgolly.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typingsJapgolly.qlikEngineapi.EngineAPI.IGenericDimensionsListProperties, 
    typingsJapgolly.qlikEngineapi.EngineAPI.IGenericDimensionListLayout
  ]
  /**
    * FieldListObject width extend GenericObject
    */
  type IFieldListObject = typingsJapgolly.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typingsJapgolly.qlikEngineapi.EngineAPI.IGenericFieldListProperties, 
    typingsJapgolly.qlikEngineapi.EngineAPI.IGenericFieldLayout
  ]
  /**
    * GenericBookmarkProperties width extend GenericProperties
    */
  type IGenericBookmarkProperties = typingsJapgolly.qlikEngineapi.EngineAPI.IGenericProperties
  type IGenericDerivedFieldProperties = typingsJapgolly.qlikEngineapi.EngineAPI.IGenericProperties
  /**
    * GenericList...
    */
  type IGenericList = typingsJapgolly.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typingsJapgolly.qlikEngineapi.EngineAPI.IGenericListProperties, 
    typingsJapgolly.qlikEngineapi.EngineAPI.IGenericListLayout
  ]
  /**
    * HyperCubeObject width extend GenericObjectPrototype<GenericHyperCubeProperties, GenericHyperCubeLayout>
    */
  type IHyperCubeObject = typingsJapgolly.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typingsJapgolly.qlikEngineapi.EngineAPI.IGenericHyperCubeProperties, 
    typingsJapgolly.qlikEngineapi.EngineAPI.IGenericHyperCubeLayout
  ]
  /**
    * IMeassureListObject
    */
  type IMeassureListObject = typingsJapgolly.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typingsJapgolly.qlikEngineapi.EngineAPI.IGenericMeasureListProperties, 
    typingsJapgolly.qlikEngineapi.EngineAPI.IGenericMeasureListLayout
  ]
  /**
    * NxCellRows...
    */
  type INxCellRows = js.Array[typingsJapgolly.qlikEngineapi.EngineAPI.INxCell]
  /**
    * VariableListObject width extend GenericObject
    */
  type IVariableListObject = typingsJapgolly.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typingsJapgolly.qlikEngineapi.EngineAPI.IGenericVariableListProperties, 
    typingsJapgolly.qlikEngineapi.EngineAPI.IGenericVariableListLayout
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.N
    - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.H
    - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.C
    - java.lang.String
  */
  type NxGrpType = typingsJapgolly.qlikEngineapi.EngineAPI._NxGrpType | java.lang.String
}
