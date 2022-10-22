package typingsJapgolly.reactLazylog

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactLazylog.anon.PartialSearchBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSearchBarMod {
  
  @JSImport("react-lazylog/build/SearchBar", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SearchBarProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("react-lazylog/build/SearchBar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-lazylog/build/SearchBar", "default.defaultProps")
    @js.native
    def defaultProps: PartialSearchBarProps = js.native
    inline def defaultProps_=(x: PartialSearchBarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type SearchBar = japgolly.scalajs.react.facade.React.Component[SearchBarProps & js.Object, js.Object]
  
  trait SearchBarProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var filterActive: js.UndefOr[Boolean] = js.undefined
    
    var onClearSearch: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFilterLinesWithMatches: js.UndefOr[js.Function1[/* isFiltered */ Boolean, Unit]] = js.undefined
    
    var onSearch: js.UndefOr[js.Function1[/* keyword */ String, Unit]] = js.undefined
    
    var resultsCount: js.UndefOr[Double] = js.undefined
  }
  object SearchBarProps {
    
    inline def apply(): SearchBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchBarProps]
    }
    
    extension [Self <: SearchBarProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFilterActive(value: Boolean): Self = StObject.set(x, "filterActive", value.asInstanceOf[js.Any])
      
      inline def setFilterActiveUndefined: Self = StObject.set(x, "filterActive", js.undefined)
      
      inline def setOnClearSearch(value: Callback): Self = StObject.set(x, "onClearSearch", value.toJsFn)
      
      inline def setOnClearSearchUndefined: Self = StObject.set(x, "onClearSearch", js.undefined)
      
      inline def setOnFilterLinesWithMatches(value: /* isFiltered */ Boolean => Callback): Self = StObject.set(x, "onFilterLinesWithMatches", js.Any.fromFunction1((t0: /* isFiltered */ Boolean) => value(t0).runNow()))
      
      inline def setOnFilterLinesWithMatchesUndefined: Self = StObject.set(x, "onFilterLinesWithMatches", js.undefined)
      
      inline def setOnSearch(value: /* keyword */ String => Callback): Self = StObject.set(x, "onSearch", js.Any.fromFunction1((t0: /* keyword */ String) => value(t0).runNow()))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setResultsCount(value: Double): Self = StObject.set(x, "resultsCount", value.asInstanceOf[js.Any])
      
      inline def setResultsCountUndefined: Self = StObject.set(x, "resultsCount", js.undefined)
    }
  }
}
