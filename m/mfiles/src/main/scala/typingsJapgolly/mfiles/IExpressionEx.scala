package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFFolderListingAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExpressionEx extends js.Object {
  var Conditions: ISearchConditions
  var Expression: IExpression
  var FolderListingAlgorithm: MFFolderListingAlgorithm
  var NULLFolderName: String
  var ShowContentsAsJITFolders: Boolean
  var ShowEmptyFolders: Boolean
  var ShowMatchingObjectsOnThisLevel: Boolean
  var ShowNULLFolder: Boolean
  var ShowNULLFolderContentsOnThisLevel: Boolean
  def Clone(): IExpressionEx
}

object IExpressionEx {
  @scala.inline
  def apply(
    Clone: CallbackTo[IExpressionEx],
    Conditions: ISearchConditions,
    Expression: IExpression,
    FolderListingAlgorithm: MFFolderListingAlgorithm,
    NULLFolderName: String,
    ShowContentsAsJITFolders: Boolean,
    ShowEmptyFolders: Boolean,
    ShowMatchingObjectsOnThisLevel: Boolean,
    ShowNULLFolder: Boolean,
    ShowNULLFolderContentsOnThisLevel: Boolean
  ): IExpressionEx = {
    val __obj = js.Dynamic.literal(Conditions = Conditions.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], FolderListingAlgorithm = FolderListingAlgorithm.asInstanceOf[js.Any], NULLFolderName = NULLFolderName.asInstanceOf[js.Any], ShowContentsAsJITFolders = ShowContentsAsJITFolders.asInstanceOf[js.Any], ShowEmptyFolders = ShowEmptyFolders.asInstanceOf[js.Any], ShowMatchingObjectsOnThisLevel = ShowMatchingObjectsOnThisLevel.asInstanceOf[js.Any], ShowNULLFolder = ShowNULLFolder.asInstanceOf[js.Any], ShowNULLFolderContentsOnThisLevel = ShowNULLFolderContentsOnThisLevel.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IExpressionEx]
  }
}

