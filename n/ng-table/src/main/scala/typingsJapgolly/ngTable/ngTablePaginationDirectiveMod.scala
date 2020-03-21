package typingsJapgolly.ngTable

import typingsJapgolly.angular.JQLite
import typingsJapgolly.angular.mod.IAttributes
import typingsJapgolly.angular.mod.ICompileService
import typingsJapgolly.angular.mod.IController
import typingsJapgolly.angular.mod.IDirective
import typingsJapgolly.angular.mod.IDocumentService
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.ngTable.coreMod.NgTableEventsChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTablePagination.directive", JSImport.Namespace)
@js.native
object ngTablePaginationDirectiveMod extends js.Object {
  def ngTablePagination[T]($compile: ICompileService, $document: IDocumentService, ngTableEventsChannel: NgTableEventsChannel): IDirective[IScope, JQLite, IAttributes, IController] = js.native
}

