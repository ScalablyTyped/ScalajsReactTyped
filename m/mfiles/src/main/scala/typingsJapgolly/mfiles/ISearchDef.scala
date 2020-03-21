package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFSearchFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchDef extends js.Object {
  var Conditions: ISearchConditions
  var Levels: IExpressionExs
  var LookInAllVersions: Boolean
  var ReturnLatestVisibleVersion: Boolean
  var SearchFlags: MFSearchFlags
  def Clone(): ISearchDef
  def IsIndirectionUsed(): Boolean
}

object ISearchDef {
  @scala.inline
  def apply(
    Clone: CallbackTo[ISearchDef],
    Conditions: ISearchConditions,
    IsIndirectionUsed: CallbackTo[Boolean],
    Levels: IExpressionExs,
    LookInAllVersions: Boolean,
    ReturnLatestVisibleVersion: Boolean,
    SearchFlags: MFSearchFlags
  ): ISearchDef = {
    val __obj = js.Dynamic.literal(Conditions = Conditions.asInstanceOf[js.Any], Levels = Levels.asInstanceOf[js.Any], LookInAllVersions = LookInAllVersions.asInstanceOf[js.Any], ReturnLatestVisibleVersion = ReturnLatestVisibleVersion.asInstanceOf[js.Any], SearchFlags = SearchFlags.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("IsIndirectionUsed")(IsIndirectionUsed.toJsFn)
    __obj.asInstanceOf[ISearchDef]
  }
}

