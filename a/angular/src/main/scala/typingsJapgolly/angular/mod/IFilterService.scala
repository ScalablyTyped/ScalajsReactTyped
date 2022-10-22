package typingsJapgolly.angular.mod

import typingsJapgolly.angular.angularStrings.currency
import typingsJapgolly.angular.angularStrings.date
import typingsJapgolly.angular.angularStrings.filter
import typingsJapgolly.angular.angularStrings.json
import typingsJapgolly.angular.angularStrings.limitTo
import typingsJapgolly.angular.angularStrings.lowercase
import typingsJapgolly.angular.angularStrings.number
import typingsJapgolly.angular.angularStrings.orderBy
import typingsJapgolly.angular.angularStrings.uppercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * $filter - $filterProvider - service in module ng
  *
  * Filters are used for formatting data displayed to the user.
  *
  * see https://docs.angularjs.org/api/ng/service/$filter
  */
@js.native
trait IFilterService extends StObject {
  
  def apply(name: currency): IFilterCurrency = js.native
  def apply(name: date): IFilterDate = js.native
  def apply(name: filter): IFilterFilter = js.native
  def apply(name: json): IFilterJson = js.native
  def apply(name: limitTo): IFilterLimitTo = js.native
  def apply(name: lowercase): IFilterLowercase = js.native
  def apply(name: number): IFilterNumber = js.native
  def apply(name: orderBy): IFilterOrderBy = js.native
  def apply(name: uppercase): IFilterUppercase = js.native
  /**
    * Usage:
    * $filter(name);
    *
    * @param name Name of the filter function to retrieve
    */
  def apply[T](name: String): T = js.native
}
