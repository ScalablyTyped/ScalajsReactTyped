package typingsJapgolly.listJs

import org.scalajs.dom.HTMLElement
import typingsJapgolly.listJs.anon.Attr
import typingsJapgolly.listJs.anon.Data
import typingsJapgolly.listJs.anon.InnerWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("list.js", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with typingsJapgolly.listJs.mod.List {
    def this(element: String) = this()
    def this(element: HTMLElement) = this()
    def this(element: String, options: ListOptions) = this()
    def this(element: HTMLElement, options: ListOptions) = this()
    def this(element: String, options: Unit, values: js.Array[js.Object]) = this()
    def this(element: String, options: ListOptions, values: js.Array[js.Object]) = this()
    def this(element: HTMLElement, options: Unit, values: js.Array[js.Object]) = this()
    def this(element: HTMLElement, options: ListOptions, values: js.Array[js.Object]) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.listJs.listJsStrings.updated
    - typingsJapgolly.listJs.listJsStrings.filterStart
    - typingsJapgolly.listJs.listJsStrings.filterComplete
    - typingsJapgolly.listJs.listJsStrings.searchStart
    - typingsJapgolly.listJs.listJsStrings.searchComplete
    - typingsJapgolly.listJs.listJsStrings.sortStart
    - typingsJapgolly.listJs.listJsStrings.sortComplete
  */
  trait Event extends StObject
  object Event {
    
    inline def filterComplete: typingsJapgolly.listJs.listJsStrings.filterComplete = "filterComplete".asInstanceOf[typingsJapgolly.listJs.listJsStrings.filterComplete]
    
    inline def filterStart: typingsJapgolly.listJs.listJsStrings.filterStart = "filterStart".asInstanceOf[typingsJapgolly.listJs.listJsStrings.filterStart]
    
    inline def searchComplete: typingsJapgolly.listJs.listJsStrings.searchComplete = "searchComplete".asInstanceOf[typingsJapgolly.listJs.listJsStrings.searchComplete]
    
    inline def searchStart: typingsJapgolly.listJs.listJsStrings.searchStart = "searchStart".asInstanceOf[typingsJapgolly.listJs.listJsStrings.searchStart]
    
    inline def sortComplete: typingsJapgolly.listJs.listJsStrings.sortComplete = "sortComplete".asInstanceOf[typingsJapgolly.listJs.listJsStrings.sortComplete]
    
    inline def sortStart: typingsJapgolly.listJs.listJsStrings.sortStart = "sortStart".asInstanceOf[typingsJapgolly.listJs.listJsStrings.sortStart]
    
    inline def updated: typingsJapgolly.listJs.listJsStrings.updated = "updated".asInstanceOf[typingsJapgolly.listJs.listJsStrings.updated]
  }
  
  trait FuzzySearchOptions extends StObject {
    
    var distance: js.UndefOr[Double] = js.undefined
    
    var location: js.UndefOr[Double] = js.undefined
    
    var multiSearch: js.UndefOr[Boolean] = js.undefined
    
    var searchClass: js.UndefOr[String] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object FuzzySearchOptions {
    
    inline def apply(): FuzzySearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FuzzySearchOptions]
    }
    
    extension [Self <: FuzzySearchOptions](x: Self) {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMultiSearch(value: Boolean): Self = StObject.set(x, "multiSearch", value.asInstanceOf[js.Any])
      
      inline def setMultiSearchUndefined: Self = StObject.set(x, "multiSearch", js.undefined)
      
      inline def setSearchClass(value: String): Self = StObject.set(x, "searchClass", value.asInstanceOf[js.Any])
      
      inline def setSearchClassUndefined: Self = StObject.set(x, "searchClass", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  @js.native
  trait List extends StObject {
    
    def add(values: js.Array[js.Object]): Unit = js.native
    def add(values: js.Array[js.Object], callback: js.Function1[/* item */ ListItem, Unit]): Unit = js.native
    
    var alphabet: String = js.native
    
    def clear(): Unit = js.native
    
    def filter(): Unit = js.native
    def filter(filterFunction: js.Function1[/* item */ ListItem, Boolean]): Unit = js.native
    
    var filtered: Boolean = js.native
    
    def fuzzySearch(searchString: String): Unit = js.native
    def fuzzySearch(searchString: String, columns: js.Array[String]): Unit = js.native
    
    def get(valueName: String, value: Any): js.Array[ListItem] = js.native
    
    var items: js.Array[js.Object] = js.native
    
    var list: HTMLElement = js.native
    
    var listContainer: HTMLElement = js.native
    
    var matchingItems: js.Array[js.Object] = js.native
    
    def on(event: Event, callback: js.Function1[/* list */ this.type, Unit]): typingsJapgolly.listJs.mod.List = js.native
    
    def reIndex(): Unit = js.native
    
    def remove(valueName: String, value: Any): Double = js.native
    
    def search(searchString: String): Unit = js.native
    def search(searchString: String, columns: js.Array[String]): Unit = js.native
    
    var searched: Boolean = js.native
    
    def show(i: Double, page: Double): Unit = js.native
    
    def size(): Double = js.native
    
    def sort(valueName: String, options: SortOptions): Unit = js.native
    
    def update(): Unit = js.native
    
    var visibleItems: js.Array[js.Object] = js.native
  }
  
  @js.native
  trait ListItem extends StObject {
    
    var elm: HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def matching(): Boolean = js.native
    
    def show(): Unit = js.native
    
    def values(): js.Object = js.native
    def values(newValues: js.Object): Unit = js.native
    
    def visible(): Boolean = js.native
  }
  
  trait ListOptions extends StObject {
    
    var fuzzySearch: js.UndefOr[FuzzySearchOptions] = js.undefined
    
    var i: js.UndefOr[Double] = js.undefined
    
    var indexAsync: js.UndefOr[Boolean] = js.undefined
    
    var item: js.UndefOr[String] = js.undefined
    
    var listClass: js.UndefOr[String] = js.undefined
    
    var page: js.UndefOr[Double] = js.undefined
    
    var pagination: js.UndefOr[InnerWindow] = js.undefined
    
    var searchClass: js.UndefOr[String] = js.undefined
    
    var sortClass: js.UndefOr[String] = js.undefined
    
    var valueNames: js.UndefOr[js.Array[String | Data | Attr]] = js.undefined
  }
  object ListOptions {
    
    inline def apply(): ListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOptions]
    }
    
    extension [Self <: ListOptions](x: Self) {
      
      inline def setFuzzySearch(value: FuzzySearchOptions): Self = StObject.set(x, "fuzzySearch", value.asInstanceOf[js.Any])
      
      inline def setFuzzySearchUndefined: Self = StObject.set(x, "fuzzySearch", js.undefined)
      
      inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIUndefined: Self = StObject.set(x, "i", js.undefined)
      
      inline def setIndexAsync(value: Boolean): Self = StObject.set(x, "indexAsync", value.asInstanceOf[js.Any])
      
      inline def setIndexAsyncUndefined: Self = StObject.set(x, "indexAsync", js.undefined)
      
      inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setListClass(value: String): Self = StObject.set(x, "listClass", value.asInstanceOf[js.Any])
      
      inline def setListClassUndefined: Self = StObject.set(x, "listClass", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPagination(value: InnerWindow): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      inline def setSearchClass(value: String): Self = StObject.set(x, "searchClass", value.asInstanceOf[js.Any])
      
      inline def setSearchClassUndefined: Self = StObject.set(x, "searchClass", js.undefined)
      
      inline def setSortClass(value: String): Self = StObject.set(x, "sortClass", value.asInstanceOf[js.Any])
      
      inline def setSortClassUndefined: Self = StObject.set(x, "sortClass", js.undefined)
      
      inline def setValueNames(value: js.Array[String | Data | Attr]): Self = StObject.set(x, "valueNames", value.asInstanceOf[js.Any])
      
      inline def setValueNamesUndefined: Self = StObject.set(x, "valueNames", js.undefined)
      
      inline def setValueNamesVarargs(value: (String | Data | Attr)*): Self = StObject.set(x, "valueNames", js.Array(value*))
    }
  }
  
  trait SortOptions extends StObject {
    
    var alphabet: js.UndefOr[String] = js.undefined
    
    var insensitive: js.UndefOr[Boolean] = js.undefined
    
    var order: js.UndefOr[String] = js.undefined
    
    var sortFunction: js.UndefOr[js.Function2[/* a */ js.Object, /* b */ js.Object, js.UndefOr[Double]]] = js.undefined
  }
  object SortOptions {
    
    inline def apply(): SortOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortOptions]
    }
    
    extension [Self <: SortOptions](x: Self) {
      
      inline def setAlphabet(value: String): Self = StObject.set(x, "alphabet", value.asInstanceOf[js.Any])
      
      inline def setAlphabetUndefined: Self = StObject.set(x, "alphabet", js.undefined)
      
      inline def setInsensitive(value: Boolean): Self = StObject.set(x, "insensitive", value.asInstanceOf[js.Any])
      
      inline def setInsensitiveUndefined: Self = StObject.set(x, "insensitive", js.undefined)
      
      inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setSortFunction(value: (/* a */ js.Object, /* b */ js.Object) => js.UndefOr[Double]): Self = StObject.set(x, "sortFunction", js.Any.fromFunction2(value))
      
      inline def setSortFunctionUndefined: Self = StObject.set(x, "sortFunction", js.undefined)
    }
  }
}
