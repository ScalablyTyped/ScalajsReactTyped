package typingsJapgolly.ngTable

import typingsJapgolly.angular.mod.IQService
import typingsJapgolly.ngTable.getGroupMod.IGetGroupFunc
import typingsJapgolly.ngTable.ngTableDefaultGetDataMod.IDefaultGetData
import typingsJapgolly.ngTable.resultsMod.IDataRowGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/core/grouping/ngTableDefaultGetGroups", JSImport.Namespace)
@js.native
object ngTableDefaultGetGroupsMod extends js.Object {
  def ngTableDefaultGetGroups[T]($q: IQService, ngTableDefaultGetData: IDefaultGetData[IDataRowGroup[T]]): IGetGroupFunc[T] = js.native
}

