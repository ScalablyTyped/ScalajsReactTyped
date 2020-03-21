package typingsJapgolly.agGrid.filterManagerMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.agGrid.columnMod.Column
import typingsJapgolly.agGrid.iFilterMod.IFilterComp
import typingsJapgolly.agGrid.utilsMod.ExternalPromise
import typingsJapgolly.agGrid.utilsMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterWrapper extends js.Object {
  var column: Column
  var compiledElement: js.Any
  var filterPromise: Promise[IFilterComp]
  var guiPromise: ExternalPromise[HTMLElement]
  var scope: js.Any
}

object FilterWrapper {
  @scala.inline
  def apply(
    column: Column,
    compiledElement: js.Any,
    filterPromise: Promise[IFilterComp],
    guiPromise: ExternalPromise[HTMLElement],
    scope: js.Any
  ): FilterWrapper = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], compiledElement = compiledElement.asInstanceOf[js.Any], filterPromise = filterPromise.asInstanceOf[js.Any], guiPromise = guiPromise.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FilterWrapper]
  }
}

