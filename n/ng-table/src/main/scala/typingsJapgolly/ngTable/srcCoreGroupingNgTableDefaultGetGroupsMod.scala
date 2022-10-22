package typingsJapgolly.ngTable

import typingsJapgolly.angular.mod.IQService
import typingsJapgolly.ngTable.srcCoreDataNgTableDefaultGetDataMod.IDefaultGetData
import typingsJapgolly.ngTable.srcCoreDataResultsMod.IDataRowGroup
import typingsJapgolly.ngTable.srcCoreGroupingGetGroupMod.IGetGroupFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreGroupingNgTableDefaultGetGroupsMod {
  
  @JSImport("ng-table/src/core/grouping/ngTableDefaultGetGroups", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ngTableDefaultGetGroups[T]($q: IQService, ngTableDefaultGetData: IDefaultGetData[IDataRowGroup[T]]): IGetGroupFunc[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ngTableDefaultGetGroups")($q.asInstanceOf[js.Any], ngTableDefaultGetData.asInstanceOf[js.Any])).asInstanceOf[IGetGroupFunc[T]]
}
