package typingsJapgolly.azdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DivBuilder = typingsJapgolly.azdata.mod.ContainerBuilder[
    typingsJapgolly.azdata.mod.DivContainer, 
    typingsJapgolly.azdata.mod.DivLayout, 
    typingsJapgolly.azdata.mod.DivItemLayout
  ]
  type EditCommitParams = typingsJapgolly.azdata.mod.IEditSessionOperationParams
  type EditCreateRowParams = typingsJapgolly.azdata.mod.IEditSessionOperationParams
  type EditDeleteRowParams = typingsJapgolly.azdata.mod.IEditRowOperationParams
  type EditDisposeParams = typingsJapgolly.azdata.mod.IEditSessionOperationParams
  type EditRevertCellResult = typingsJapgolly.azdata.mod.EditCellResult
  type EditRevertRowParams = typingsJapgolly.azdata.mod.IEditRowOperationParams
  type EditUpdateCellResult = typingsJapgolly.azdata.mod.EditCellResult
  type FlexBuilder = typingsJapgolly.azdata.mod.ContainerBuilder[
    typingsJapgolly.azdata.mod.FlexContainer, 
    typingsJapgolly.azdata.mod.FlexLayout, 
    typingsJapgolly.azdata.mod.FlexItemLayout
  ]
  type FlexContainer = typingsJapgolly.azdata.mod.Container[typingsJapgolly.azdata.mod.FlexLayout, typingsJapgolly.azdata.mod.FlexItemLayout]
  type FormContainer = typingsJapgolly.azdata.mod.Container[typingsJapgolly.azdata.mod.FormLayout, typingsJapgolly.azdata.mod.FormItemLayout]
  type GroupBuilder = typingsJapgolly.azdata.mod.ContainerBuilder[
    typingsJapgolly.azdata.mod.GroupContainer, 
    typingsJapgolly.azdata.mod.GroupLayout, 
    typingsJapgolly.azdata.mod.GroupItemLayout
  ]
  type NavContainer = typingsJapgolly.azdata.mod.Container[js.Any, js.Any]
  type SplitViewBuilder = typingsJapgolly.azdata.mod.ContainerBuilder[
    typingsJapgolly.azdata.mod.SplitViewContainer, 
    typingsJapgolly.azdata.mod.SplitViewLayout, 
    typingsJapgolly.azdata.mod.FlexItemLayout
  ]
  type SplitViewContainer = typingsJapgolly.azdata.mod.Container[
    typingsJapgolly.azdata.mod.SplitViewLayout, 
    typingsJapgolly.azdata.mod.FlexItemLayout
  ]
  type ToolbarContainer = typingsJapgolly.azdata.mod.Container[typingsJapgolly.azdata.mod.ToolbarLayout, js.Any]
}
