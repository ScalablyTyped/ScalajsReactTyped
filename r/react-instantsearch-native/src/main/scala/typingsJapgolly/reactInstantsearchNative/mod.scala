package typingsJapgolly.reactInstantsearchNative

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactInstantsearchCore.anon.PartialCurrentRefinements
import typingsJapgolly.reactInstantsearchCore.anon.PartialMenuProvided
import typingsJapgolly.reactInstantsearchCore.anon.PartialNumericMenuProvide
import typingsJapgolly.reactInstantsearchCore.anon.PartialRefinementListProv
import typingsJapgolly.reactInstantsearchCore.anon.PartialSearchBoxProvided
import typingsJapgolly.reactInstantsearchCore.anon.PartialStateResultsProvid
import typingsJapgolly.reactInstantsearchCore.anon.PartialStatsProvided
import typingsJapgolly.reactInstantsearchCore.mod.AdditionalWidgetProperties
import typingsJapgolly.reactInstantsearchCore.mod.AutocompleteExposed
import typingsJapgolly.reactInstantsearchCore.mod.AutocompleteProvided
import typingsJapgolly.reactInstantsearchCore.mod.BasicDoc
import typingsJapgolly.reactInstantsearchCore.mod.ConnectedComponentClass
import typingsJapgolly.reactInstantsearchCore.mod.ConnectorDescription
import typingsJapgolly.reactInstantsearchCore.mod.ConnectorProvided
import typingsJapgolly.reactInstantsearchCore.mod.CurrentRefinementsExposed
import typingsJapgolly.reactInstantsearchCore.mod.CurrentRefinementsProvided
import typingsJapgolly.reactInstantsearchCore.mod.GeoSearchExposed
import typingsJapgolly.reactInstantsearchCore.mod.GeoSearchProvided
import typingsJapgolly.reactInstantsearchCore.mod.HighlightPassedThru
import typingsJapgolly.reactInstantsearchCore.mod.HighlightProps
import typingsJapgolly.reactInstantsearchCore.mod.HighlightProvided
import typingsJapgolly.reactInstantsearchCore.mod.HitsProvided
import typingsJapgolly.reactInstantsearchCore.mod.IndexProps
import typingsJapgolly.reactInstantsearchCore.mod.InfiniteHitsProvided
import typingsJapgolly.reactInstantsearchCore.mod.InstantSearchProps
import typingsJapgolly.reactInstantsearchCore.mod.MenuExposed
import typingsJapgolly.reactInstantsearchCore.mod.MenuProvided
import typingsJapgolly.reactInstantsearchCore.mod.NumericMenuExposed
import typingsJapgolly.reactInstantsearchCore.mod.NumericMenuProvided
import typingsJapgolly.reactInstantsearchCore.mod.RefinementListExposed
import typingsJapgolly.reactInstantsearchCore.mod.RefinementListProvided
import typingsJapgolly.reactInstantsearchCore.mod.SearchBoxExposed
import typingsJapgolly.reactInstantsearchCore.mod.SearchBoxProvided
import typingsJapgolly.reactInstantsearchCore.mod.StateResultsProvided
import typingsJapgolly.reactInstantsearchCore.mod.StatsProvided
import typingsJapgolly.reactInstantsearchCore.mod.TranslatableExposed
import typingsJapgolly.reactInstantsearchCore.mod.TranslatableProvided
import typingsJapgolly.reactInstantsearchNative.anon.ReadonlyIndexProps
import typingsJapgolly.reactInstantsearchNative.anon.ReadonlyInstantSearchProp
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-instantsearch-native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-instantsearch-native", "Configure")
  @js.native
  open class Configure protected ()
    extends typingsJapgolly.reactInstantsearchCore.mod.Configure {
    def this(props: Any) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Any, context: Any) = this()
  }
  
  object HIGHLIGHT_TAGS {
    
    @JSImport("react-instantsearch-native", "HIGHLIGHT_TAGS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-instantsearch-native", "HIGHLIGHT_TAGS.highlightPostTag")
    @js.native
    def highlightPostTag: String = js.native
    inline def highlightPostTag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlightPostTag")(x.asInstanceOf[js.Any])
    
    @JSImport("react-instantsearch-native", "HIGHLIGHT_TAGS.highlightPreTag")
    @js.native
    def highlightPreTag: String = js.native
    inline def highlightPreTag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlightPreTag")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-instantsearch-native", "Index")
  @js.native
  open class Index protected ()
    extends typingsJapgolly.reactInstantsearchCore.mod.Index {
    def this(props: IndexProps) = this()
    def this(props: ReadonlyIndexProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IndexProps, context: Any) = this()
  }
  
  @JSImport("react-instantsearch-native", "InstantSearch")
  @js.native
  open class InstantSearch protected ()
    extends typingsJapgolly.reactInstantsearchCore.mod.InstantSearch {
    def this(props: InstantSearchProps) = this()
    def this(props: ReadonlyInstantSearchProp) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InstantSearchProps, context: Any) = this()
  }
  
  inline def connectAutoComplete[TDoc](
    // tslint:disable-next-line:no-unnecessary-generics
  stateless: FunctionComponent[AutocompleteProvided[TDoc]]
  ): ComponentClassP[AutocompleteExposed & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectAutoComplete")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[AutocompleteExposed & js.Object]]
  inline def connectAutoComplete[Props /* <: AutocompleteProvided[TDoc] */, TDoc](Composed: ComponentType[Props]): ConnectedComponentClass[Props, AutocompleteProvided[TDoc], AutocompleteExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectAutoComplete")(Composed.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[Props, AutocompleteProvided[TDoc], AutocompleteExposed]]
  
  inline def connectBreadcrumb(Composed: ComponentType[Any]): ComponentClassP[Any & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectBreadcrumb")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[Any & js.Object]]
  
  inline def connectConfigure(Composed: ComponentType[Any]): ComponentClassP[Any & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectConfigure")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[Any & js.Object]]
  
  inline def connectCurrentRefinements(stateless: FunctionComponent[CurrentRefinementsProvided]): ComponentClassP[CurrentRefinementsExposed & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectCurrentRefinements")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[CurrentRefinementsExposed & js.Object]]
  inline def connectCurrentRefinements[TProps /* <: PartialCurrentRefinements */](Composed: ComponentType[TProps]): ConnectedComponentClass[TProps, CurrentRefinementsProvided, CurrentRefinementsExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectCurrentRefinements")(Composed.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, CurrentRefinementsProvided, CurrentRefinementsExposed]]
  
  inline def connectGeoSearch(stateless: FunctionComponent[GeoSearchProvided[Any]]): ComponentClassP[GeoSearchExposed & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectGeoSearch")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[GeoSearchExposed & js.Object]]
  inline def connectGeoSearch[TProps /* <: Partial[GeoSearchProvided[THit]] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, GeoSearchProvided[THit], GeoSearchExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectGeoSearch")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, GeoSearchProvided[THit], GeoSearchExposed]]
  
  inline def connectHierarchicalMenu(Composed: ComponentType[Any]): ComponentClassP[Any & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHierarchicalMenu")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[Any & js.Object]]
  
  inline def connectHighlight[TDoc](stateless: FunctionComponent[HighlightProps[TDoc]]): ComponentClassP[HighlightPassedThru[TDoc] & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHighlight")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[HighlightPassedThru[TDoc] & js.Object]]
  inline def connectHighlight[TProps /* <: Partial[HighlightProps[TDoc]] */, TDoc](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, HighlightProvided[TDoc], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHighlight")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, HighlightProvided[TDoc], js.Object]]
  
  inline def connectHits[THit](
    // tslint:disable-next-line:no-unnecessary-generics
  stateless: FunctionComponent[HitsProvided[THit]]
  ): ComponentClassP[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHits")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[js.Object]]
  inline def connectHits[TProps /* <: HitsProvided[THit] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, HitsProvided[THit], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHits")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, HitsProvided[THit], js.Object]]
  
  inline def connectHitsPerPage(Composed: ComponentType[Any]): ComponentClassP[Any & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectHitsPerPage")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[Any & js.Object]]
  
  inline def connectInfiniteHits(Composed: ComponentType[InfiniteHitsProvided[Any]]): ComponentClassP[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectInfiniteHits")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[js.Object]]
  
  inline def connectInfiniteHits_TPropsTHit_ConnectedComponentClass[TProps /* <: Partial[InfiniteHitsProvided[THit]] */, THit](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, InfiniteHitsProvided[THit], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectInfiniteHits")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, InfiniteHitsProvided[THit], js.Object]]
  
  inline def connectMenu(stateless: FunctionComponent[MenuProvided]): ComponentClassP[MenuExposed & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectMenu")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[MenuExposed & js.Object]]
  inline def connectMenu[TProps /* <: PartialMenuProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, MenuProvided, MenuExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectMenu")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, MenuProvided, MenuExposed]]
  
  inline def connectNumericMenu(stateless: FunctionComponent[NumericMenuProvided]): ComponentClassP[NumericMenuExposed & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectNumericMenu")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[NumericMenuExposed & js.Object]]
  inline def connectNumericMenu[TProps /* <: PartialNumericMenuProvide */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, NumericMenuProvided, NumericMenuExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectNumericMenu")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, NumericMenuProvided, NumericMenuExposed]]
  
  inline def connectPagination(Composed: ComponentType[Any]): ComponentClassP[Any & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectPagination")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[Any & js.Object]]
  
  inline def connectPoweredBy(Composed: ComponentType[Any]): ComponentClassP[Any & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectPoweredBy")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[Any & js.Object]]
  
  inline def connectRange(Composed: ComponentType[Any]): ComponentClassP[Any & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectRange")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[Any & js.Object]]
  
  inline def connectRefinementList(stateless: FunctionComponent[RefinementListProvided]): ComponentClassP[RefinementListExposed & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectRefinementList")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[RefinementListExposed & js.Object]]
  inline def connectRefinementList[TProps /* <: PartialRefinementListProv */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, RefinementListProvided, RefinementListExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectRefinementList")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, RefinementListProvided, RefinementListExposed]]
  
  inline def connectRelevantSort(Composed: ComponentType[Any]): ComponentClassP[Any & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectRelevantSort")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[Any & js.Object]]
  
  inline def connectScrollTo(Composed: ComponentType[Any]): ComponentClassP[Any & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectScrollTo")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[Any & js.Object]]
  
  inline def connectSearchBox(stateless: FunctionComponent[SearchBoxProvided]): ComponentClassP[SearchBoxExposed & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectSearchBox")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[SearchBoxExposed & js.Object]]
  inline def connectSearchBox[TProps /* <: PartialSearchBoxProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, SearchBoxProvided, SearchBoxExposed] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectSearchBox")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, SearchBoxProvided, SearchBoxExposed]]
  
  inline def connectSortBy(Composed: ComponentType[Any]): ComponentClassP[Any & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectSortBy")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[Any & js.Object]]
  
  inline def connectStateResults(stateless: FunctionComponent[StateResultsProvided[BasicDoc]]): ComponentClassP[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectStateResults")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[js.Object]]
  inline def connectStateResults[TProps /* <: PartialStateResultsProvid */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, StateResultsProvided[BasicDoc], js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectStateResults")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, StateResultsProvided[BasicDoc], js.Object]]
  
  inline def connectStats(stateless: FunctionComponent[StatsProvided]): ComponentClassP[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectStats")(stateless.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[js.Object]]
  inline def connectStats[TProps /* <: PartialStatsProvided */](ctor: ComponentType[TProps]): ConnectedComponentClass[TProps, StatsProvided, js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectStats")(ctor.asInstanceOf[js.Any]).asInstanceOf[ConnectedComponentClass[TProps, StatsProvided, js.Object]]
  
  inline def connectToggleRefinement(Composed: ComponentType[Any]): ComponentClassP[Any & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectToggleRefinement")(Composed.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[Any & js.Object]]
  
  inline def createConnector[TProvided, TExposed](connectorDesc: ConnectorDescription[TProvided, TExposed]): (js.Function2[
    /* stateless */ FunctionComponent[ConnectorProvided[TProvided]], 
    /* additionalWidgetProperties */ js.UndefOr[AdditionalWidgetProperties], 
    ComponentClassP[TExposed & js.Object]
  ]) & (js.Function2[
    /* Composed */ ComponentType[Partial[ConnectorProvided[TProvided]]], 
    /* additionalWidgetProperties */ js.UndefOr[AdditionalWidgetProperties], 
    ConnectedComponentClass[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided], TExposed]
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnector")(connectorDesc.asInstanceOf[js.Any]).asInstanceOf[(js.Function2[
    /* stateless */ FunctionComponent[ConnectorProvided[TProvided]], 
    /* additionalWidgetProperties */ js.UndefOr[AdditionalWidgetProperties], 
    ComponentClassP[TExposed & js.Object]
  ]) & (js.Function2[
    /* Composed */ ComponentType[Partial[ConnectorProvided[TProvided]]], 
    /* additionalWidgetProperties */ js.UndefOr[AdditionalWidgetProperties], 
    ConnectedComponentClass[Partial[ConnectorProvided[TProvided]], ConnectorProvided[TProvided], TExposed]
  ])]
  
  inline def translatable(defaultTranslations: StringDictionary[String | (js.Function1[/* repeated */ Any, String])]): js.Function1[
    /* ctor */ ComponentType[TranslatableProvided], 
    ConnectedComponentClass[TranslatableProvided, TranslatableProvided, TranslatableExposed]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("translatable")(defaultTranslations.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ctor */ ComponentType[TranslatableProvided], 
    ConnectedComponentClass[TranslatableProvided, TranslatableProvided, TranslatableExposed]
  ]]
}
