package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFSearchFlags
import typingsJapgolly.mfiles.MFiles.MFViewFlag
import typingsJapgolly.mfiles.MFiles.MFViewType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IView extends js.Object {
  var AccessControlList: IAccessControlList
  var Common: Boolean
  val GUID: String
  var HasParent: Boolean
  var ID: Double
  var Levels: IExpressionExs
  var LookInAllVersions: Boolean
  var Name: String
  var Parent: Double
  var ReturnLatestVisibleVersion: Boolean
  var SearchConditions: ISearchConditions
  var SearchDef: ISearchDef
  var SearchFlags: MFSearchFlags
  var ViewFlags: MFViewFlag
  var ViewLocation: IViewLocation
  var ViewType: MFViewType
  var Visible: Boolean
  def Clone(): IView
  def CloneFrom(View: IView): Unit
}

object IView {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    Clone: CallbackTo[IView],
    CloneFrom: IView => Callback,
    Common: Boolean,
    GUID: String,
    HasParent: Boolean,
    ID: Double,
    Levels: IExpressionExs,
    LookInAllVersions: Boolean,
    Name: String,
    Parent: Double,
    ReturnLatestVisibleVersion: Boolean,
    SearchConditions: ISearchConditions,
    SearchDef: ISearchDef,
    SearchFlags: MFSearchFlags,
    ViewFlags: MFViewFlag,
    ViewLocation: IViewLocation,
    ViewType: MFViewType,
    Visible: Boolean
  ): IView = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], Common = Common.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], HasParent = HasParent.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Levels = Levels.asInstanceOf[js.Any], LookInAllVersions = LookInAllVersions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReturnLatestVisibleVersion = ReturnLatestVisibleVersion.asInstanceOf[js.Any], SearchConditions = SearchConditions.asInstanceOf[js.Any], SearchDef = SearchDef.asInstanceOf[js.Any], SearchFlags = SearchFlags.asInstanceOf[js.Any], ViewFlags = ViewFlags.asInstanceOf[js.Any], ViewLocation = ViewLocation.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("CloneFrom")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IView) => CloneFrom(t0).runNow()))
    __obj.asInstanceOf[IView]
  }
}

