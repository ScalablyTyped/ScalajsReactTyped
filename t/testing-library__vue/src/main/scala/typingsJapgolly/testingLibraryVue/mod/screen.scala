package typingsJapgolly.testingLibraryVue.mod

import typingsJapgolly.prettyFormat.mod.OptionsReceived
import typingsJapgolly.std.Element
import typingsJapgolly.std.HTMLDocument
import typingsJapgolly.testingLibraryDom.getQueriesForElementMod.BoundFunction
import typingsJapgolly.testingLibraryDom.queriesMod.AllByBoundAttribute
import typingsJapgolly.testingLibraryDom.queriesMod.AllByRole
import typingsJapgolly.testingLibraryDom.queriesMod.AllByText
import typingsJapgolly.testingLibraryDom.queriesMod.FindAllByBoundAttribute
import typingsJapgolly.testingLibraryDom.queriesMod.FindAllByRole_
import typingsJapgolly.testingLibraryDom.queriesMod.FindAllByText_
import typingsJapgolly.testingLibraryDom.queriesMod.FindByBoundAttribute
import typingsJapgolly.testingLibraryDom.queriesMod.FindByRole_
import typingsJapgolly.testingLibraryDom.queriesMod.FindByText_
import typingsJapgolly.testingLibraryDom.queriesMod.GetByBoundAttribute
import typingsJapgolly.testingLibraryDom.queriesMod.GetByRole_
import typingsJapgolly.testingLibraryDom.queriesMod.GetByText_
import typingsJapgolly.testingLibraryDom.queriesMod.QueryByBoundAttribute
import typingsJapgolly.testingLibraryDom.queriesMod.QueryByRole_
import typingsJapgolly.testingLibraryDom.queriesMod.QueryByText_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/vue", "screen")
@js.native
object screen extends js.Object {
  var findAllByAltText: BoundFunction[FindAllByBoundAttribute] = js.native
  var findAllByDisplayValue: BoundFunction[FindAllByBoundAttribute] = js.native
  var findAllByLabelText: BoundFunction[FindAllByText_] = js.native
  var findAllByPlaceholderText: BoundFunction[FindAllByBoundAttribute] = js.native
  var findAllByRole: BoundFunction[FindAllByRole_] = js.native
  var findAllByTestId: BoundFunction[FindAllByBoundAttribute] = js.native
  var findAllByText: BoundFunction[FindAllByText_] = js.native
  var findAllByTitle: BoundFunction[FindAllByBoundAttribute] = js.native
  var findByAltText: BoundFunction[FindByBoundAttribute] = js.native
  var findByDisplayValue: BoundFunction[FindByBoundAttribute] = js.native
  var findByLabelText: BoundFunction[FindByText_] = js.native
  var findByPlaceholderText: BoundFunction[FindByBoundAttribute] = js.native
  var findByRole: BoundFunction[FindByRole_] = js.native
  var findByTestId: BoundFunction[FindByBoundAttribute] = js.native
  var findByText: BoundFunction[FindByText_] = js.native
  var findByTitle: BoundFunction[FindByBoundAttribute] = js.native
  var getAllByAltText: BoundFunction[AllByBoundAttribute] = js.native
  var getAllByDisplayValue: BoundFunction[AllByBoundAttribute] = js.native
  var getAllByLabelText: BoundFunction[AllByText] = js.native
  var getAllByPlaceholderText: BoundFunction[AllByBoundAttribute] = js.native
  var getAllByRole: BoundFunction[AllByRole] = js.native
  var getAllByTestId: BoundFunction[AllByBoundAttribute] = js.native
  var getAllByText: BoundFunction[AllByText] = js.native
  var getAllByTitle: BoundFunction[AllByBoundAttribute] = js.native
  var getByAltText: BoundFunction[GetByBoundAttribute] = js.native
  var getByDisplayValue: BoundFunction[GetByBoundAttribute] = js.native
  var getByLabelText: BoundFunction[GetByText_] = js.native
  var getByPlaceholderText: BoundFunction[GetByBoundAttribute] = js.native
  var getByRole: BoundFunction[GetByRole_] = js.native
  var getByTestId: BoundFunction[GetByBoundAttribute] = js.native
  var getByText: BoundFunction[GetByText_] = js.native
  var getByTitle: BoundFunction[GetByBoundAttribute] = js.native
  var queryAllByAltText: BoundFunction[AllByBoundAttribute] = js.native
  var queryAllByDisplayValue: BoundFunction[AllByBoundAttribute] = js.native
  var queryAllByLabelText: BoundFunction[AllByText] = js.native
  var queryAllByPlaceholderText: BoundFunction[AllByBoundAttribute] = js.native
  var queryAllByRole: BoundFunction[AllByRole] = js.native
  var queryAllByTestId: BoundFunction[AllByBoundAttribute] = js.native
  var queryAllByText: BoundFunction[AllByText] = js.native
  var queryAllByTitle: BoundFunction[AllByBoundAttribute] = js.native
  var queryByAltText: BoundFunction[QueryByBoundAttribute] = js.native
  var queryByDisplayValue: BoundFunction[QueryByBoundAttribute] = js.native
  var queryByLabelText: BoundFunction[QueryByText_] = js.native
  var queryByPlaceholderText: BoundFunction[QueryByBoundAttribute] = js.native
  var queryByRole: BoundFunction[QueryByRole_] = js.native
  var queryByTestId: BoundFunction[QueryByBoundAttribute] = js.native
  var queryByText: BoundFunction[QueryByText_] = js.native
  var queryByTitle: BoundFunction[QueryByBoundAttribute] = js.native
  def debug(element: js.Array[Element | HTMLDocument]): Unit = js.native
  def debug(element: js.Array[Element | HTMLDocument], maxLength: Double): Unit = js.native
  def debug(element: js.Array[Element | HTMLDocument], maxLength: Double, options: OptionsReceived): Unit = js.native
  /**
    * Convenience function for `pretty-dom` which also allows an array
    * of elements
    */
  def debug(element: Element): Unit = js.native
  def debug(element: Element, maxLength: Double): Unit = js.native
  def debug(element: Element, maxLength: Double, options: OptionsReceived): Unit = js.native
  def debug(element: HTMLDocument): Unit = js.native
  def debug(element: HTMLDocument, maxLength: Double): Unit = js.native
  def debug(element: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = js.native
}

