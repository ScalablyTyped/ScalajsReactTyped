package typingsJapgolly.ngTable

import typingsJapgolly.angular.JQLite
import typingsJapgolly.angular.mod.IAttributes
import typingsJapgolly.angular.mod.ICompileService
import typingsJapgolly.angular.mod.IController
import typingsJapgolly.angular.mod.IDirective
import typingsJapgolly.angular.mod.IDocumentService
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.ngTable.srcCoreMod.NgTableEventsChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBrowserNgTablePaginationDotdirectiveMod {
  
  @JSImport("ng-table/src/browser/ngTablePagination.directive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ngTablePagination[T]($compile: ICompileService, $document: IDocumentService, ngTableEventsChannel: NgTableEventsChannel): IDirective[IScope, JQLite, IAttributes, IController] = (^.asInstanceOf[js.Dynamic].applyDynamic("ngTablePagination")($compile.asInstanceOf[js.Any], $document.asInstanceOf[js.Any], ngTableEventsChannel.asInstanceOf[js.Any])).asInstanceOf[IDirective[IScope, JQLite, IAttributes, IController]]
}
