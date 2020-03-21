package typingsJapgolly.ngTable

import typingsJapgolly.angular.JQLite
import typingsJapgolly.angular.mod.IAttributes
import typingsJapgolly.angular.mod.IController
import typingsJapgolly.angular.mod.IDirective
import typingsJapgolly.angular.mod.IParseService
import typingsJapgolly.angular.mod.IQService
import typingsJapgolly.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTable.directive", JSImport.Namespace)
@js.native
object ngTableDirectiveMod extends js.Object {
  def ngTable($q: IQService, $parse: IParseService): IDirective[IScope, JQLite, IAttributes, IController] = js.native
}

