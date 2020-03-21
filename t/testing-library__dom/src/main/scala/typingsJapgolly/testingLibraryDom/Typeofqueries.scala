package typingsJapgolly.testingLibraryDom

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.testingLibraryDom.matchesMod.Matcher
import typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions
import typingsJapgolly.testingLibraryDom.queriesMod.AllByBoundAttribute
import typingsJapgolly.testingLibraryDom.queriesMod.AllByRole
import typingsJapgolly.testingLibraryDom.queriesMod.AllByText
import typingsJapgolly.testingLibraryDom.queriesMod.ByRoleOptions
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
import typingsJapgolly.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions
import typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofqueries extends js.Object {
  val findAllByAltText: FindAllByBoundAttribute
  val findAllByDisplayValue: FindAllByBoundAttribute
  val findAllByLabelText: FindAllByText_
  val findAllByPlaceholderText: FindAllByBoundAttribute
  val findAllByRole: FindAllByRole_
  val findAllByTestId: FindAllByBoundAttribute
  val findAllByText: FindAllByText_
  val findAllByTitle: FindAllByBoundAttribute
  val findByAltText: FindByBoundAttribute
  val findByDisplayValue: FindByBoundAttribute
  val findByLabelText: FindByText_
  val findByPlaceholderText: FindByBoundAttribute
  val findByRole: FindByRole_
  val findByTestId: FindByBoundAttribute
  val findByText: FindByText_
  val findByTitle: FindByBoundAttribute
  val getAllByAltText: AllByBoundAttribute
  val getAllByDisplayValue: AllByBoundAttribute
  val getAllByLabelText: AllByText
  val getAllByPlaceholderText: AllByBoundAttribute
  val getAllByRole: AllByRole
  val getAllByTestId: AllByBoundAttribute
  val getAllByText: AllByText
  val getAllByTitle: AllByBoundAttribute
  val getByAltText: GetByBoundAttribute
  val getByDisplayValue: GetByBoundAttribute
  val getByLabelText: GetByText_
  val getByPlaceholderText: GetByBoundAttribute
  val getByRole: GetByRole_
  val getByTestId: GetByBoundAttribute
  val getByText: GetByText_
  val getByTitle: GetByBoundAttribute
  val queryAllByAltText: AllByBoundAttribute
  val queryAllByDisplayValue: AllByBoundAttribute
  val queryAllByLabelText: AllByText
  val queryAllByPlaceholderText: AllByBoundAttribute
  val queryAllByRole: AllByRole
  val queryAllByTestId: AllByBoundAttribute
  val queryAllByText: AllByText
  val queryAllByTitle: AllByBoundAttribute
  val queryByAltText: QueryByBoundAttribute
  val queryByDisplayValue: QueryByBoundAttribute
  val queryByLabelText: QueryByText_
  val queryByPlaceholderText: QueryByBoundAttribute
  val queryByRole: QueryByRole_
  val queryByTestId: QueryByBoundAttribute
  val queryByText: QueryByText_
  val queryByTitle: QueryByBoundAttribute
}

object Typeofqueries {
  @scala.inline
  def apply(
    findAllByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => CallbackTo[js.Promise[js.Array[HTMLElement]]],
    findAllByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => CallbackTo[js.Promise[js.Array[HTMLElement]]],
    findAllByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => CallbackTo[js.Promise[js.Array[HTMLElement]]],
    findAllByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => CallbackTo[js.Promise[js.Array[HTMLElement]]],
    findAllByRole: (/* container */ HTMLElement, /* role */ Matcher, /* options */ js.UndefOr[ByRoleOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => CallbackTo[js.Promise[js.Array[HTMLElement]]],
    findAllByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => CallbackTo[js.Promise[js.Array[HTMLElement]]],
    findAllByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => CallbackTo[js.Promise[js.Array[HTMLElement]]],
    findAllByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => CallbackTo[js.Promise[js.Array[HTMLElement]]],
    findByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => CallbackTo[js.Promise[HTMLElement]],
    findByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => CallbackTo[js.Promise[HTMLElement]],
    findByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => CallbackTo[js.Promise[HTMLElement]],
    findByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => CallbackTo[js.Promise[HTMLElement]],
    findByRole: (/* container */ HTMLElement, /* role */ Matcher, /* options */ js.UndefOr[ByRoleOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => CallbackTo[js.Promise[HTMLElement]],
    findByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => CallbackTo[js.Promise[HTMLElement]],
    findByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => CallbackTo[js.Promise[HTMLElement]],
    findByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions], /* waitForElementOptions */ js.UndefOr[WaitForElementOptions]) => CallbackTo[js.Promise[HTMLElement]],
    getAllByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[js.Array[HTMLElement]],
    getAllByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[js.Array[HTMLElement]],
    getAllByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => CallbackTo[js.Array[HTMLElement]],
    getAllByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[js.Array[HTMLElement]],
    getAllByRole: (/* container */ HTMLElement, /* role */ Matcher, /* options */ js.UndefOr[ByRoleOptions]) => CallbackTo[js.Array[HTMLElement]],
    getAllByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[js.Array[HTMLElement]],
    getAllByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => CallbackTo[js.Array[HTMLElement]],
    getAllByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[js.Array[HTMLElement]],
    getByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[HTMLElement],
    getByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[HTMLElement],
    getByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => CallbackTo[HTMLElement],
    getByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[HTMLElement],
    getByRole: (/* container */ HTMLElement, /* role */ Matcher, /* options */ js.UndefOr[ByRoleOptions]) => CallbackTo[HTMLElement],
    getByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[HTMLElement],
    getByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => CallbackTo[HTMLElement],
    getByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[HTMLElement],
    queryAllByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[js.Array[HTMLElement]],
    queryAllByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[js.Array[HTMLElement]],
    queryAllByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => CallbackTo[js.Array[HTMLElement]],
    queryAllByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[js.Array[HTMLElement]],
    queryAllByRole: (/* container */ HTMLElement, /* role */ Matcher, /* options */ js.UndefOr[ByRoleOptions]) => CallbackTo[js.Array[HTMLElement]],
    queryAllByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[js.Array[HTMLElement]],
    queryAllByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => CallbackTo[js.Array[HTMLElement]],
    queryAllByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[js.Array[HTMLElement]],
    queryByAltText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[HTMLElement | Null],
    queryByDisplayValue: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[HTMLElement | Null],
    queryByLabelText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => CallbackTo[HTMLElement | Null],
    queryByPlaceholderText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[HTMLElement | Null],
    queryByRole: (/* container */ HTMLElement, /* role */ Matcher, /* options */ js.UndefOr[ByRoleOptions]) => CallbackTo[HTMLElement | Null],
    queryByTestId: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[HTMLElement | Null],
    queryByText: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[SelectorMatcherOptions]) => CallbackTo[HTMLElement | Null],
    queryByTitle: (/* container */ HTMLElement, /* id */ Matcher, /* options */ js.UndefOr[MatcherOptions]) => CallbackTo[HTMLElement | Null]
  ): Typeofqueries = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("findAllByAltText")(js.Any.fromFunction4((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions], t3: /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions]) => findAllByAltText(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("findAllByDisplayValue")(js.Any.fromFunction4((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions], t3: /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions]) => findAllByDisplayValue(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("findAllByLabelText")(js.Any.fromFunction4((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], t3: /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions]) => findAllByLabelText(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("findAllByPlaceholderText")(js.Any.fromFunction4((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions], t3: /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions]) => findAllByPlaceholderText(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("findAllByRole")(js.Any.fromFunction4((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* role */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queriesMod.ByRoleOptions], t3: /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions]) => findAllByRole(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("findAllByTestId")(js.Any.fromFunction4((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions], t3: /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions]) => findAllByTestId(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("findAllByText")(js.Any.fromFunction4((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], t3: /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions]) => findAllByText(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("findAllByTitle")(js.Any.fromFunction4((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions], t3: /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions]) => findAllByTitle(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("findByAltText")(js.Any.fromFunction4((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions], t3: /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions]) => findByAltText(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("findByDisplayValue")(js.Any.fromFunction4((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions], t3: /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions]) => findByDisplayValue(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("findByLabelText")(js.Any.fromFunction4((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], t3: /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions]) => findByLabelText(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("findByPlaceholderText")(js.Any.fromFunction4((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions], t3: /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions]) => findByPlaceholderText(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("findByRole")(js.Any.fromFunction4((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* role */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queriesMod.ByRoleOptions], t3: /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions]) => findByRole(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("findByTestId")(js.Any.fromFunction4((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions], t3: /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions]) => findByTestId(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("findByText")(js.Any.fromFunction4((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], t3: /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions]) => findByText(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("findByTitle")(js.Any.fromFunction4((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions], t3: /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions]) => findByTitle(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getAllByAltText")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => getAllByAltText(t0, t1, t2).runNow()))
    __obj.updateDynamic("getAllByDisplayValue")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => getAllByDisplayValue(t0, t1, t2).runNow()))
    __obj.updateDynamic("getAllByLabelText")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions]) => getAllByLabelText(t0, t1, t2).runNow()))
    __obj.updateDynamic("getAllByPlaceholderText")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => getAllByPlaceholderText(t0, t1, t2).runNow()))
    __obj.updateDynamic("getAllByRole")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* role */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queriesMod.ByRoleOptions]) => getAllByRole(t0, t1, t2).runNow()))
    __obj.updateDynamic("getAllByTestId")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => getAllByTestId(t0, t1, t2).runNow()))
    __obj.updateDynamic("getAllByText")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions]) => getAllByText(t0, t1, t2).runNow()))
    __obj.updateDynamic("getAllByTitle")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => getAllByTitle(t0, t1, t2).runNow()))
    __obj.updateDynamic("getByAltText")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => getByAltText(t0, t1, t2).runNow()))
    __obj.updateDynamic("getByDisplayValue")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => getByDisplayValue(t0, t1, t2).runNow()))
    __obj.updateDynamic("getByLabelText")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions]) => getByLabelText(t0, t1, t2).runNow()))
    __obj.updateDynamic("getByPlaceholderText")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => getByPlaceholderText(t0, t1, t2).runNow()))
    __obj.updateDynamic("getByRole")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* role */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queriesMod.ByRoleOptions]) => getByRole(t0, t1, t2).runNow()))
    __obj.updateDynamic("getByTestId")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => getByTestId(t0, t1, t2).runNow()))
    __obj.updateDynamic("getByText")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions]) => getByText(t0, t1, t2).runNow()))
    __obj.updateDynamic("getByTitle")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => getByTitle(t0, t1, t2).runNow()))
    __obj.updateDynamic("queryAllByAltText")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => queryAllByAltText(t0, t1, t2).runNow()))
    __obj.updateDynamic("queryAllByDisplayValue")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => queryAllByDisplayValue(t0, t1, t2).runNow()))
    __obj.updateDynamic("queryAllByLabelText")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions]) => queryAllByLabelText(t0, t1, t2).runNow()))
    __obj.updateDynamic("queryAllByPlaceholderText")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => queryAllByPlaceholderText(t0, t1, t2).runNow()))
    __obj.updateDynamic("queryAllByRole")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* role */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queriesMod.ByRoleOptions]) => queryAllByRole(t0, t1, t2).runNow()))
    __obj.updateDynamic("queryAllByTestId")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => queryAllByTestId(t0, t1, t2).runNow()))
    __obj.updateDynamic("queryAllByText")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions]) => queryAllByText(t0, t1, t2).runNow()))
    __obj.updateDynamic("queryAllByTitle")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => queryAllByTitle(t0, t1, t2).runNow()))
    __obj.updateDynamic("queryByAltText")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => queryByAltText(t0, t1, t2).runNow()))
    __obj.updateDynamic("queryByDisplayValue")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => queryByDisplayValue(t0, t1, t2).runNow()))
    __obj.updateDynamic("queryByLabelText")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions]) => queryByLabelText(t0, t1, t2).runNow()))
    __obj.updateDynamic("queryByPlaceholderText")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => queryByPlaceholderText(t0, t1, t2).runNow()))
    __obj.updateDynamic("queryByRole")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* role */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queriesMod.ByRoleOptions]) => queryByRole(t0, t1, t2).runNow()))
    __obj.updateDynamic("queryByTestId")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => queryByTestId(t0, t1, t2).runNow()))
    __obj.updateDynamic("queryByText")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions]) => queryByText(t0, t1, t2).runNow()))
    __obj.updateDynamic("queryByTitle")(js.Any.fromFunction3((t0: /* container */ org.scalajs.dom.raw.HTMLElement, t1: /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, t2: /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions]) => queryByTitle(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Typeofqueries]
  }
}

