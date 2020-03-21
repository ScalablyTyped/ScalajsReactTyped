package typingsJapgolly.reactInstantsearch

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactInstantsearchCore.PartialCurrentRefinements
import typingsJapgolly.reactInstantsearchCore.PartialMenuProvided
import typingsJapgolly.reactInstantsearchCore.PartialNumericMenuProvide
import typingsJapgolly.reactInstantsearchCore.PartialRefinementListProv
import typingsJapgolly.reactInstantsearchCore.PartialSearchBoxProvided
import typingsJapgolly.reactInstantsearchCore.PartialStateResultsProvid
import typingsJapgolly.reactInstantsearchCore.PartialStatsProvided
import typingsJapgolly.reactInstantsearchCore.mod.AutocompleteExposed
import typingsJapgolly.reactInstantsearchCore.mod.AutocompleteProvided
import typingsJapgolly.reactInstantsearchCore.mod.BasicDoc
import typingsJapgolly.reactInstantsearchCore.mod.CurrentRefinementsExposed
import typingsJapgolly.reactInstantsearchCore.mod.CurrentRefinementsProvided
import typingsJapgolly.reactInstantsearchCore.mod.GeoSearchExposed
import typingsJapgolly.reactInstantsearchCore.mod.GeoSearchProvided
import typingsJapgolly.reactInstantsearchCore.mod.HighlightPassedThru
import typingsJapgolly.reactInstantsearchCore.mod.HighlightProps
import typingsJapgolly.reactInstantsearchCore.mod.HighlightProvided
import typingsJapgolly.reactInstantsearchCore.mod.HitsProvided
import typingsJapgolly.reactInstantsearchCore.mod.InfiniteHitsProvided
import typingsJapgolly.reactInstantsearchCore.mod.MenuExposed
import typingsJapgolly.reactInstantsearchCore.mod.MenuProvided
import typingsJapgolly.reactInstantsearchCore.mod.NumericMenuExposed
import typingsJapgolly.reactInstantsearchCore.mod.NumericMenuProvided
import typingsJapgolly.reactInstantsearchCore.mod.Omit
import typingsJapgolly.reactInstantsearchCore.mod.RefinementListExposed
import typingsJapgolly.reactInstantsearchCore.mod.RefinementListProvided
import typingsJapgolly.reactInstantsearchCore.mod.SearchBoxExposed
import typingsJapgolly.reactInstantsearchCore.mod.SearchBoxProvided
import typingsJapgolly.reactInstantsearchCore.mod.StateResultsProvided
import typingsJapgolly.reactInstantsearchCore.mod.StatsProvided
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch/connectors", JSImport.Namespace)
@js.native
object connectorsMod extends js.Object {
  def connectAutoComplete[TDoc](stateless: StatelessComponent[AutocompleteProvided[TDoc]]): ComponentClassP[AutocompleteExposed with js.Object] = js.native
  def connectAutoComplete[Props /* <: AutocompleteProvided[TDoc] */, TDoc](Composed: ComponentType[Props]): ComponentClassP[
    (Omit[Props, AutocompleteProvided[TDoc]]) with AutocompleteExposed with js.Object
  ] = js.native
  def connectBreadcrumb(Composed: ComponentType[_]): ComponentClassP[js.Object] = js.native
  def connectConfigure(Composed: ComponentType[_]): ComponentClassP[js.Object] = js.native
  def connectCurrentRefinements(stateless: StatelessComponent[CurrentRefinementsProvided]): ComponentClassP[CurrentRefinementsExposed with js.Object] = js.native
  def connectCurrentRefinements[TProps /* <: PartialCurrentRefinements */](Composed: ComponentType[TProps]): ComponentClassP[
    (Omit[TProps, CurrentRefinementsProvided]) with CurrentRefinementsExposed with js.Object
  ] = js.native
  def connectGeoSearch(stateless: StatelessComponent[GeoSearchProvided[_]]): ComponentClassP[GeoSearchExposed with js.Object] = js.native
  def connectGeoSearch[TProps /* <: Partial[GeoSearchProvided[THit]] */, THit](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, GeoSearchProvided[THit]]) with GeoSearchExposed with js.Object] = js.native
  def connectHierarchicalMenu(Composed: ComponentType[_]): ComponentClassP[js.Object] = js.native
  def connectHighlight[TDoc](stateless: StatelessComponent[HighlightProps[TDoc]]): ComponentClassP[HighlightPassedThru[TDoc] with js.Object] = js.native
  def connectHighlight[TProps /* <: Partial[HighlightProps[TDoc]] */, TDoc](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, HighlightProvided[TDoc]]) with js.Object] = js.native
  def connectHits[THit](stateless: StatelessComponent[HitsProvided[THit]]): ComponentClassP[js.Object] = js.native
  def connectHits[TProps /* <: HitsProvided[THit] */, THit](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, HitsProvided[THit]]) with js.Object] = js.native
  def connectHitsPerPage(Composed: ComponentType[_]): ComponentClassP[js.Object] = js.native
  def connectInfiniteHits(Composed: ComponentType[InfiniteHitsProvided[_]]): ComponentClassP[js.Object] = js.native
  @JSName("connectInfiniteHits")
  def connectInfiniteHits_TProps_PartialInfiniteHitsProvidedTHitTHit_ConnectedComponentClass[TProps /* <: Partial[InfiniteHitsProvided[THit]] */, THit](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, InfiniteHitsProvided[THit]]) with js.Object] = js.native
  def connectMenu(stateless: StatelessComponent[MenuProvided]): ComponentClassP[MenuExposed with js.Object] = js.native
  def connectMenu[TProps /* <: PartialMenuProvided */](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, MenuProvided]) with MenuExposed with js.Object] = js.native
  def connectNumericMenu(stateless: StatelessComponent[NumericMenuProvided]): ComponentClassP[NumericMenuExposed with js.Object] = js.native
  def connectNumericMenu[TProps /* <: PartialNumericMenuProvide */](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, NumericMenuProvided]) with NumericMenuExposed with js.Object] = js.native
  def connectPagination(Composed: ComponentType[_]): ComponentClassP[js.Object] = js.native
  def connectPoweredBy(Composed: ComponentType[_]): ComponentClassP[js.Object] = js.native
  def connectRange(Composed: ComponentType[_]): ComponentClassP[js.Object] = js.native
  def connectRefinementList(stateless: StatelessComponent[RefinementListProvided]): ComponentClassP[RefinementListExposed with js.Object] = js.native
  def connectRefinementList[TProps /* <: PartialRefinementListProv */](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, RefinementListProvided]) with RefinementListExposed with js.Object] = js.native
  def connectScrollTo(Composed: ComponentType[_]): ComponentClassP[js.Object] = js.native
  def connectSearchBox(stateless: StatelessComponent[SearchBoxProvided]): ComponentClassP[SearchBoxExposed with js.Object] = js.native
  def connectSearchBox[TProps /* <: PartialSearchBoxProvided */](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, SearchBoxProvided]) with SearchBoxExposed with js.Object] = js.native
  def connectSortBy(Composed: ComponentType[_]): ComponentClassP[js.Object] = js.native
  def connectStateResults(stateless: StatelessComponent[StateResultsProvided[BasicDoc]]): ComponentClassP[js.Object] = js.native
  def connectStateResults[TProps /* <: PartialStateResultsProvid */](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, StateResultsProvided[BasicDoc]]) with js.Object] = js.native
  def connectStats(stateless: StatelessComponent[StatsProvided]): ComponentClassP[js.Object] = js.native
  def connectStats[TProps /* <: PartialStatsProvided */](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, StatsProvided]) with js.Object] = js.native
  def connectToggleRefinement(Composed: ComponentType[_]): ComponentClassP[js.Object] = js.native
}

