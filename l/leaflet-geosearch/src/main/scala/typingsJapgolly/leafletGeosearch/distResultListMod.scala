package typingsJapgolly.leafletGeosearch

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.leafletGeosearch.anon.Item
import typingsJapgolly.leafletGeosearch.anon.ResultSearchResult
import typingsJapgolly.leafletGeosearch.distProvidersProviderMod.SearchResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResultListMod {
  
  @JSImport("leaflet-geosearch/dist/resultList", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ResultList {
    def this(hasHandleClickClassNamesNotFoundMessage: ResultListProps) = this()
  }
  
  @js.native
  trait ResultList extends StObject {
    
    def clear(): Unit = js.native
    
    var container: HTMLDivElement = js.native
    
    def count(): Double = js.native
    
    var handleClick: js.UndefOr[js.Function1[/* args */ ResultSearchResult, Unit]] = js.native
    
    var notFoundMessage: js.UndefOr[HTMLDivElement] = js.native
    
    def onClick(event: Event): Unit = js.native
    
    def render(
      results: js.Array[SearchResult[Any]],
      resultFormat: js.Function1[/* args */ ResultSearchResult, String]
    ): Unit = js.native
    def render(results: Unit, resultFormat: js.Function1[/* args */ ResultSearchResult, String]): Unit = js.native
    
    var resultItem: HTMLDivElement = js.native
    
    var results: js.Array[SearchResult[Any]] = js.native
    
    def select(index: Double): SearchResult[Any] = js.native
    
    var selected: Double = js.native
  }
  
  trait ResultListProps extends StObject {
    
    var classNames: js.UndefOr[Item] = js.undefined
    
    def handleClick(args: ResultSearchResult): Unit
    
    var notFoundMessage: js.UndefOr[String] = js.undefined
  }
  object ResultListProps {
    
    inline def apply(handleClick: ResultSearchResult => Callback): ResultListProps = {
      val __obj = js.Dynamic.literal(handleClick = js.Any.fromFunction1((t0: ResultSearchResult) => handleClick(t0).runNow()))
      __obj.asInstanceOf[ResultListProps]
    }
    
    extension [Self <: ResultListProps](x: Self) {
      
      inline def setClassNames(value: Item): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setHandleClick(value: ResultSearchResult => Callback): Self = StObject.set(x, "handleClick", js.Any.fromFunction1((t0: ResultSearchResult) => value(t0).runNow()))
      
      inline def setNotFoundMessage(value: String): Self = StObject.set(x, "notFoundMessage", value.asInstanceOf[js.Any])
      
      inline def setNotFoundMessageUndefined: Self = StObject.set(x, "notFoundMessage", js.undefined)
    }
  }
}
