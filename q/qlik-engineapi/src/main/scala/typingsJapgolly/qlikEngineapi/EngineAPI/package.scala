package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * BookmarkListObject width extend GenericObject
  */
type IBookmarkListObject = IGenericObjectPrototype[IGenericBookmarkListProperties, IGenericBookmarkListLayout]

type IDimensionListObject = IGenericObjectPrototype[IGenericDimensionsListProperties, IGenericDimensionListLayout]

/**
  * FieldListObject width extend GenericObject
  */
type IFieldListObject = IGenericObjectPrototype[IGenericFieldListProperties, IGenericFieldLayout]

/**
  * GenericBookmarkProperties width extend GenericProperties
  */
type IGenericBookmarkProperties = IGenericProperties

type IGenericDerivedFieldProperties = IGenericProperties

/**
  * GenericList...
  */
type IGenericList = IGenericObjectPrototype[IGenericListProperties, IGenericListLayout]

/**
  * HyperCubeObject width extend GenericObjectPrototype<GenericHyperCubeProperties, GenericHyperCubeLayout>
  */
type IHyperCubeObject = IGenericObjectPrototype[IGenericHyperCubeProperties, IGenericHyperCubeLayout]

/**
  * IMeassureListObject
  */
type IMeassureListObject = IGenericObjectPrototype[IGenericMeasureListProperties, IGenericMeasureListLayout]

/**
  * NxCellRows...
  */
type INxCellRows = js.Array[INxCell]

/**
  * VariableListObject width extend GenericObject
  */
type IVariableListObject = IGenericObjectPrototype[IGenericVariableListProperties, IGenericVariableListLayout]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.N
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.H
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.C
  - java.lang.String
*/
type NxGrpType = _NxGrpType | String
