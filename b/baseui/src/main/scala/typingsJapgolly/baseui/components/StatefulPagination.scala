package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonEventAny
import typingsJapgolly.baseui.AnonNextPage
import typingsJapgolly.baseui.baseuiStrings.change_
import typingsJapgolly.baseui.paginationMod.Labels
import typingsJapgolly.baseui.paginationMod.PaginationOverrides
import typingsJapgolly.baseui.paginationMod.State
import typingsJapgolly.baseui.paginationMod.StatefulPaginationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulPagination {
  def apply(
    numPages: Double,
    initialState: State = null,
    labels: Labels = null,
    onNextClick: /* args */ AnonEventAny => CallbackTo[js.Any] = null,
    onPageChange: /* args */ AnonNextPage => CallbackTo[js.Any] = null,
    onPrevClick: /* args */ AnonEventAny => CallbackTo[js.Any] = null,
    overrides: PaginationOverrides = null,
    stateReducer: (change_, /* changes */ State, /* currentState */ State) => CallbackTo[State] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    StatefulPaginationProps, 
    MountedWithRawType[StatefulPaginationProps, js.Object, RawMounted[StatefulPaginationProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(numPages = numPages.asInstanceOf[js.Any])
  
      if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (onNextClick != null) __obj.updateDynamic("onNextClick")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonEventAny) => onNextClick(t0).runNow()))
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonNextPage) => onPageChange(t0).runNow()))
    if (onPrevClick != null) __obj.updateDynamic("onPrevClick")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonEventAny) => onPrevClick(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: typingsJapgolly.baseui.baseuiStrings.change_, t1: /* changes */ typingsJapgolly.baseui.paginationMod.State, t2: /* currentState */ typingsJapgolly.baseui.paginationMod.State) => stateReducer(t0, t1, t2).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.paginationMod.StatefulPaginationProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.paginationMod.StatefulPaginationProps])(children: _*)
  }
  @JSImport("baseui/pagination", "StatefulPagination")
  @js.native
  object componentImport extends js.Object
  
}

