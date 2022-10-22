package typingsJapgolly.ngTable

import typingsJapgolly.angular.JQLite
import typingsJapgolly.angular.mod.IAttributes
import typingsJapgolly.angular.mod.IController
import typingsJapgolly.angular.mod.IDirective
import typingsJapgolly.angular.mod.IParseService
import typingsJapgolly.angular.mod.IQService
import typingsJapgolly.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBrowserNgTableDotdirectiveMod {
  
  @JSImport("ng-table/src/browser/ngTable.directive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ngTable($q: IQService, $parse: IParseService): IDirective[IScope, JQLite, IAttributes, IController] = (^.asInstanceOf[js.Dynamic].applyDynamic("ngTable")($q.asInstanceOf[js.Any], $parse.asInstanceOf[js.Any])).asInstanceOf[IDirective[IScope, JQLite, IAttributes, IController]]
}
