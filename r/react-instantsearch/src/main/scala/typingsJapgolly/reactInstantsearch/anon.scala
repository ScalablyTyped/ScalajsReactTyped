package typingsJapgolly.reactInstantsearch

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLFormElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactInstantsearch.reactInstantsearchStrings.Asterisk
import typingsJapgolly.reactInstantsearchCore.anon.Attribute
import typingsJapgolly.reactInstantsearchCore.anon.Results
import typingsJapgolly.reactInstantsearchDom.anon.SeeAllOption
import typingsJapgolly.reactInstantsearchDom.mod.RefinementItem
import typingsJapgolly.reactInstantsearchDom.mod.RelevantSortComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<react-instantsearch-dom.anon.ButtonTextComponent> */
  trait ReadonlyButtonTextCompone extends StObject {
    
    val buttonTextComponent: js.UndefOr[FunctionComponent[RelevantSortComponentProps]] = js.undefined
    
    val textComponent: js.UndefOr[FunctionComponent[RelevantSortComponentProps]] = js.undefined
  }
  object ReadonlyButtonTextCompone {
    
    inline def apply(): ReadonlyButtonTextCompone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyButtonTextCompone]
    }
    
    extension [Self <: ReadonlyButtonTextCompone](x: Self) {
      
      inline def setButtonTextComponent(value: FunctionComponent[RelevantSortComponentProps]): Self = StObject.set(x, "buttonTextComponent", value.asInstanceOf[js.Any])
      
      inline def setButtonTextComponentUndefined: Self = StObject.set(x, "buttonTextComponent", js.undefined)
      
      inline def setTextComponent(value: FunctionComponent[RelevantSortComponentProps]): Self = StObject.set(x, "textComponent", value.asInstanceOf[js.Any])
      
      inline def setTextComponentUndefined: Self = StObject.set(x, "textComponent", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-instantsearch-dom.react-instantsearch-dom.DynamicWidgetsProps> */
  trait ReadonlyDynamicWidgetsPro extends StObject {
    
    val children: js.UndefOr[ReactChild] = js.undefined
    
    val className: js.UndefOr[String] = js.undefined
    
    val facets: js.UndefOr[js.Array[Asterisk | scala.Nothing]] = js.undefined
    
    val fallbackComponent: js.UndefOr[ComponentType[Attribute]] = js.undefined
    
    val maxValuesPerFacet: js.UndefOr[Double] = js.undefined
    
    val transformItems: js.UndefOr[js.Function2[/* items */ js.Array[String], /* meta */ Results, Any]] = js.undefined
  }
  object ReadonlyDynamicWidgetsPro {
    
    inline def apply(): ReadonlyDynamicWidgetsPro = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyDynamicWidgetsPro]
    }
    
    extension [Self <: ReadonlyDynamicWidgetsPro](x: Self) {
      
      inline def setChildren(value: ReactChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFacets(value: js.Array[Asterisk | scala.Nothing]): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
      
      inline def setFacetsUndefined: Self = StObject.set(x, "facets", js.undefined)
      
      inline def setFacetsVarargs(value: (Asterisk | scala.Nothing)*): Self = StObject.set(x, "facets", js.Array(value*))
      
      inline def setFallbackComponent(value: ComponentType[Attribute]): Self = StObject.set(x, "fallbackComponent", value.asInstanceOf[js.Any])
      
      inline def setFallbackComponentUndefined: Self = StObject.set(x, "fallbackComponent", js.undefined)
      
      inline def setMaxValuesPerFacet(value: Double): Self = StObject.set(x, "maxValuesPerFacet", value.asInstanceOf[js.Any])
      
      inline def setMaxValuesPerFacetUndefined: Self = StObject.set(x, "maxValuesPerFacet", js.undefined)
      
      inline def setTransformItems(value: (/* items */ js.Array[String], /* meta */ Results) => Any): Self = StObject.set(x, "transformItems", js.Any.fromFunction2(value))
      
      inline def setTransformItemsUndefined: Self = StObject.set(x, "transformItems", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-instantsearch-dom.react-instantsearch-dom.HitsPerPageProps> */
  trait ReadonlyHitsPerPageProps extends StObject {
    
    val className: js.UndefOr[String] = js.undefined
    
    val defaultRefinement: Double
    
    val id: js.UndefOr[String] = js.undefined
    
    val items: js.Array[RefinementItem[Double]]
    
    val transformItems: js.UndefOr[
        js.Function1[/* items */ js.Array[RefinementItem[Double]], js.Array[RefinementItem[Double]]]
      ] = js.undefined
  }
  object ReadonlyHitsPerPageProps {
    
    inline def apply(defaultRefinement: Double, items: js.Array[RefinementItem[Double]]): ReadonlyHitsPerPageProps = {
      val __obj = js.Dynamic.literal(defaultRefinement = defaultRefinement.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyHitsPerPageProps]
    }
    
    extension [Self <: ReadonlyHitsPerPageProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultRefinement(value: Double): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItems(value: js.Array[RefinementItem[Double]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: RefinementItem[Double]*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setTransformItems(value: /* items */ js.Array[RefinementItem[Double]] => js.Array[RefinementItem[Double]]): Self = StObject.set(x, "transformItems", js.Any.fromFunction1(value))
      
      inline def setTransformItemsUndefined: Self = StObject.set(x, "transformItems", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-instantsearch-dom.react-instantsearch-dom.MenuSelectProps> */
  trait ReadonlyMenuSelectProps extends StObject {
    
    val attribute: String
    
    val className: js.UndefOr[String] = js.undefined
    
    val defaultRefinement: js.UndefOr[String] = js.undefined
    
    val id: js.UndefOr[String] = js.undefined
    
    val limit: js.UndefOr[Double] = js.undefined
    
    val transformItems: js.UndefOr[
        js.Function1[/* items */ js.Array[RefinementItem[String]], js.Array[RefinementItem[String]]]
      ] = js.undefined
    
    val translations: js.UndefOr[SeeAllOption] = js.undefined
  }
  object ReadonlyMenuSelectProps {
    
    inline def apply(attribute: String): ReadonlyMenuSelectProps = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyMenuSelectProps]
    }
    
    extension [Self <: ReadonlyMenuSelectProps](x: Self) {
      
      inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultRefinement(value: String): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
      
      inline def setDefaultRefinementUndefined: Self = StObject.set(x, "defaultRefinement", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setTransformItems(value: /* items */ js.Array[RefinementItem[String]] => js.Array[RefinementItem[String]]): Self = StObject.set(x, "transformItems", js.Any.fromFunction1(value))
      
      inline def setTransformItemsUndefined: Self = StObject.set(x, "transformItems", js.undefined)
      
      inline def setTranslations(value: SeeAllOption): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-instantsearch-dom.react-instantsearch-dom.SearchBoxProps> */
  trait ReadonlySearchBoxProps extends StObject {
    
    val autoFocus: js.UndefOr[Boolean] = js.undefined
    
    val className: js.UndefOr[String] = js.undefined
    
    val defaultRefinement: js.UndefOr[String] = js.undefined
    
    val focusShortcuts: js.UndefOr[js.Array[String]] = js.undefined
    
    val inputId: js.UndefOr[String] = js.undefined
    
    val inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
    
    val loadingIndicator: js.UndefOr[Element] = js.undefined
    
    val onChange: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLInputElement], Any]] = js.undefined
    
    val onKeyDown: js.UndefOr[js.Function1[/* event */ ReactKeyboardEventFrom[HTMLInputElement], Any]] = js.undefined
    
    val onReset: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLFormElement], Any]] = js.undefined
    
    val onSubmit: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLFormElement], Any]] = js.undefined
    
    val reset: js.UndefOr[Element] = js.undefined
    
    val searchAsYouType: js.UndefOr[Boolean] = js.undefined
    
    val showLoadingIndicator: js.UndefOr[Boolean] = js.undefined
    
    val submit: js.UndefOr[Element] = js.undefined
    
    val translations: js.UndefOr[StringDictionary[String | (js.Function1[/* repeated */ Any, Any])]] = js.undefined
  }
  object ReadonlySearchBoxProps {
    
    inline def apply(): ReadonlySearchBoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlySearchBoxProps]
    }
    
    extension [Self <: ReadonlySearchBoxProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultRefinement(value: String): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
      
      inline def setDefaultRefinementUndefined: Self = StObject.set(x, "defaultRefinement", js.undefined)
      
      inline def setFocusShortcuts(value: js.Array[String]): Self = StObject.set(x, "focusShortcuts", value.asInstanceOf[js.Any])
      
      inline def setFocusShortcutsUndefined: Self = StObject.set(x, "focusShortcuts", js.undefined)
      
      inline def setFocusShortcutsVarargs(value: String*): Self = StObject.set(x, "focusShortcuts", js.Array(value*))
      
      inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      inline def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
      
      inline def setInputRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: HTMLInputElement | Null => Callback): Self = StObject.set(x, "inputRef", js.Any.fromFunction1((t0: HTMLInputElement | Null) => value(t0).runNow()))
      
      inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setLoadingIndicator(value: VdomElement): Self = StObject.set(x, "loadingIndicator", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLoadingIndicatorUndefined: Self = StObject.set(x, "loadingIndicator", js.undefined)
      
      inline def setOnChange(value: /* event */ ReactEventFrom[HTMLInputElement] => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnKeyDown(value: /* event */ ReactKeyboardEventFrom[HTMLInputElement] => Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnReset(value: /* event */ ReactEventFrom[HTMLFormElement] => Any): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnSubmit(value: /* event */ ReactEventFrom[HTMLFormElement] => Any): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setReset(value: VdomElement): Self = StObject.set(x, "reset", value.rawElement.asInstanceOf[js.Any])
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setSearchAsYouType(value: Boolean): Self = StObject.set(x, "searchAsYouType", value.asInstanceOf[js.Any])
      
      inline def setSearchAsYouTypeUndefined: Self = StObject.set(x, "searchAsYouType", js.undefined)
      
      inline def setShowLoadingIndicator(value: Boolean): Self = StObject.set(x, "showLoadingIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowLoadingIndicatorUndefined: Self = StObject.set(x, "showLoadingIndicator", js.undefined)
      
      inline def setSubmit(value: VdomElement): Self = StObject.set(x, "submit", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
      
      inline def setTranslations(value: StringDictionary[String | (js.Function1[/* repeated */ Any, Any])]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-instantsearch-dom.react-instantsearch-dom.SortByProps> */
  trait ReadonlySortByProps extends StObject {
    
    val className: js.UndefOr[String] = js.undefined
    
    val defaultRefinement: String
    
    val id: js.UndefOr[String] = js.undefined
    
    val items: js.Array[RefinementItem[String]]
    
    val transformItems: js.UndefOr[
        js.Function1[/* items */ js.Array[RefinementItem[String]], js.Array[RefinementItem[String]]]
      ] = js.undefined
  }
  object ReadonlySortByProps {
    
    inline def apply(defaultRefinement: String, items: js.Array[RefinementItem[String]]): ReadonlySortByProps = {
      val __obj = js.Dynamic.literal(defaultRefinement = defaultRefinement.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlySortByProps]
    }
    
    extension [Self <: ReadonlySortByProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultRefinement(value: String): Self = StObject.set(x, "defaultRefinement", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItems(value: js.Array[RefinementItem[String]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: RefinementItem[String]*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setTransformItems(value: /* items */ js.Array[RefinementItem[String]] => js.Array[RefinementItem[String]]): Self = StObject.set(x, "transformItems", js.Any.fromFunction1(value))
      
      inline def setTransformItemsUndefined: Self = StObject.set(x, "transformItems", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<react-instantsearch-dom.anon.Translations> */
  trait ReadonlyTranslations extends StObject {
    
    val translations: js.UndefOr[
        StringDictionary[
          js.Function4[
            /* n */ Double, 
            /* ms */ Double, 
            /* nSortedHits */ Double, 
            /* areHitsSorted */ Boolean, 
            String
          ]
        ]
      ] = js.undefined
  }
  object ReadonlyTranslations {
    
    inline def apply(): ReadonlyTranslations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyTranslations]
    }
    
    extension [Self <: ReadonlyTranslations](x: Self) {
      
      inline def setTranslations(
        value: StringDictionary[
              js.Function4[
                /* n */ Double, 
                /* ms */ Double, 
                /* nSortedHits */ Double, 
                /* areHitsSorted */ Boolean, 
                String
              ]
            ]
      ): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
