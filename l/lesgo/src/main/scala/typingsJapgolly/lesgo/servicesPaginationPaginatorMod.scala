package typingsJapgolly.lesgo

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.lesgo.anon.Limit
import typingsJapgolly.lesgo.lesgoBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesPaginationPaginatorMod {
  
  @JSImport("lesgo/services/pagination/Paginator", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Paginator {
    def this(
      db: typingsJapgolly.lesgo.servicesAuroraDbRDSProxyServiceMod.default,
      sql: String,
      sqlParams: js.Array[Any]
    ) = this()
    def this(db: typingsJapgolly.lesgo.servicesAuroraDbRDSProxyServiceMod.default, sql: String, sqlParams: Any) = this()
    def this(
      db: typingsJapgolly.lesgo.servicesAuroraDbServiceMod.default,
      sql: String,
      sqlParams: js.Array[Any]
    ) = this()
    def this(db: typingsJapgolly.lesgo.servicesAuroraDbServiceMod.default, sql: String, sqlParams: Any) = this()
    def this(
      db: typingsJapgolly.lesgo.servicesAuroraDbRDSProxyServiceMod.default,
      sql: String,
      sqlParams: js.Array[Any],
      options: PaginatorOptions
    ) = this()
    def this(
      db: typingsJapgolly.lesgo.servicesAuroraDbRDSProxyServiceMod.default,
      sql: String,
      sqlParams: Any,
      options: PaginatorOptions
    ) = this()
    def this(
      db: typingsJapgolly.lesgo.servicesAuroraDbServiceMod.default,
      sql: String,
      sqlParams: js.Array[Any],
      options: PaginatorOptions
    ) = this()
    def this(
      db: typingsJapgolly.lesgo.servicesAuroraDbServiceMod.default,
      sql: String,
      sqlParams: Any,
      options: PaginatorOptions
    ) = this()
    
    /* protected */ /* CompleteClass */
    var calculateTotalNumberOfPages: js.Promise[Double] = js.native
    
    /* CompleteClass */
    override def count(): js.Promise[Double] = js.native
    
    /* protected */ /* CompleteClass */
    var countTotalItems: js.Promise[Double] = js.native
    
    /* CompleteClass */
    override def currentPage(): Double = js.native
    
    /* CompleteClass */
    override def executeQuery(): js.Promise[js.Array[Any]] = js.native
    
    /* CompleteClass */
    override def firstItem(): js.Promise[Any] = js.native
    
    /* protected */ /* CompleteClass */
    override def generatePaginationSqlSnippet(): String = js.native
    
    /* protected */ /* CompleteClass */
    override def getLimitAndOffsetByPageAndContentPerPage(): Limit = js.native
    
    /* CompleteClass */
    override def items(): js.Promise[js.Array[Any]] = js.native
    
    /* CompleteClass */
    override def lastItem(): js.Promise[Any] = js.native
    
    /* CompleteClass */
    override def lastPage(): js.Promise[Double] = js.native
    
    /* CompleteClass */
    override def nextPage(): js.Promise[Double | `false`] = js.native
    
    /* CompleteClass */
    override def perPage(): Double = js.native
    
    /* CompleteClass */
    override def previousPage(): Double | `false` = js.native
    
    /* CompleteClass */
    override def toObject(): js.Promise[PaginatorObject[Any]] = js.native
    
    /* CompleteClass */
    override def total(): js.Promise[Double | Null] = js.native
  }
  
  trait Paginator extends StObject {
    
    /* protected */ var calculateTotalNumberOfPages: js.Promise[Double]
    
    def count(): js.Promise[Double]
    
    /* protected */ var countTotalItems: js.Promise[Double]
    
    def currentPage(): Double
    
    def executeQuery(): js.Promise[js.Array[Any]]
    
    def firstItem(): js.Promise[Any]
    
    /* protected */ def generatePaginationSqlSnippet(): String
    
    /* protected */ def getLimitAndOffsetByPageAndContentPerPage(): Limit
    
    def items(): js.Promise[js.Array[Any]]
    
    def lastItem(): js.Promise[Any]
    
    def lastPage(): js.Promise[Double]
    
    def nextPage(): js.Promise[Double | `false`]
    
    def perPage(): Double
    
    def previousPage(): Double | `false`
    
    def toObject(): js.Promise[PaginatorObject[Any]]
    
    def total(): js.Promise[Double | Null]
  }
  object Paginator {
    
    inline def apply(
      calculateTotalNumberOfPages: js.Promise[Double],
      count: CallbackTo[js.Promise[Double]],
      countTotalItems: js.Promise[Double],
      currentPage: CallbackTo[Double],
      executeQuery: CallbackTo[js.Promise[js.Array[Any]]],
      firstItem: CallbackTo[js.Promise[Any]],
      generatePaginationSqlSnippet: CallbackTo[String],
      getLimitAndOffsetByPageAndContentPerPage: CallbackTo[Limit],
      items: CallbackTo[js.Promise[js.Array[Any]]],
      lastItem: CallbackTo[js.Promise[Any]],
      lastPage: CallbackTo[js.Promise[Double]],
      nextPage: CallbackTo[js.Promise[Double | `false`]],
      perPage: CallbackTo[Double],
      previousPage: CallbackTo[Double | `false`],
      toObject: CallbackTo[js.Promise[PaginatorObject[Any]]],
      total: CallbackTo[js.Promise[Double | Null]]
    ): Paginator = {
      val __obj = js.Dynamic.literal(calculateTotalNumberOfPages = calculateTotalNumberOfPages.asInstanceOf[js.Any], count = count.toJsFn, countTotalItems = countTotalItems.asInstanceOf[js.Any], currentPage = currentPage.toJsFn, executeQuery = executeQuery.toJsFn, firstItem = firstItem.toJsFn, generatePaginationSqlSnippet = generatePaginationSqlSnippet.toJsFn, getLimitAndOffsetByPageAndContentPerPage = getLimitAndOffsetByPageAndContentPerPage.toJsFn, items = items.toJsFn, lastItem = lastItem.toJsFn, lastPage = lastPage.toJsFn, nextPage = nextPage.toJsFn, perPage = perPage.toJsFn, previousPage = previousPage.toJsFn, toObject = toObject.toJsFn, total = total.toJsFn)
      __obj.asInstanceOf[Paginator]
    }
    
    extension [Self <: Paginator](x: Self) {
      
      inline def setCalculateTotalNumberOfPages(value: js.Promise[Double]): Self = StObject.set(x, "calculateTotalNumberOfPages", value.asInstanceOf[js.Any])
      
      inline def setCount(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "count", value.toJsFn)
      
      inline def setCountTotalItems(value: js.Promise[Double]): Self = StObject.set(x, "countTotalItems", value.asInstanceOf[js.Any])
      
      inline def setCurrentPage(value: CallbackTo[Double]): Self = StObject.set(x, "currentPage", value.toJsFn)
      
      inline def setExecuteQuery(value: CallbackTo[js.Promise[js.Array[Any]]]): Self = StObject.set(x, "executeQuery", value.toJsFn)
      
      inline def setFirstItem(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "firstItem", value.toJsFn)
      
      inline def setGeneratePaginationSqlSnippet(value: CallbackTo[String]): Self = StObject.set(x, "generatePaginationSqlSnippet", value.toJsFn)
      
      inline def setGetLimitAndOffsetByPageAndContentPerPage(value: CallbackTo[Limit]): Self = StObject.set(x, "getLimitAndOffsetByPageAndContentPerPage", value.toJsFn)
      
      inline def setItems(value: CallbackTo[js.Promise[js.Array[Any]]]): Self = StObject.set(x, "items", value.toJsFn)
      
      inline def setLastItem(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "lastItem", value.toJsFn)
      
      inline def setLastPage(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "lastPage", value.toJsFn)
      
      inline def setNextPage(value: CallbackTo[js.Promise[Double | `false`]]): Self = StObject.set(x, "nextPage", value.toJsFn)
      
      inline def setPerPage(value: CallbackTo[Double]): Self = StObject.set(x, "perPage", value.toJsFn)
      
      inline def setPreviousPage(value: CallbackTo[Double | `false`]): Self = StObject.set(x, "previousPage", value.toJsFn)
      
      inline def setToObject(value: CallbackTo[js.Promise[PaginatorObject[Any]]]): Self = StObject.set(x, "toObject", value.toJsFn)
      
      inline def setTotal(value: CallbackTo[js.Promise[Double | Null]]): Self = StObject.set(x, "total", value.toJsFn)
    }
  }
  
  trait PaginatorObject[DataT] extends StObject {
    
    var count: Double
    
    var current_page: Double
    
    var items: js.Array[DataT]
    
    var last_page: Double
    
    var next_page: Double | `false`
    
    var per_page: Double
    
    var previous_page: Double | `false`
    
    var total: Double
  }
  object PaginatorObject {
    
    inline def apply[DataT](
      count: Double,
      current_page: Double,
      items: js.Array[DataT],
      last_page: Double,
      next_page: Double | `false`,
      per_page: Double,
      previous_page: Double | `false`,
      total: Double
    ): PaginatorObject[DataT] = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], current_page = current_page.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], last_page = last_page.asInstanceOf[js.Any], next_page = next_page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], previous_page = previous_page.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginatorObject[DataT]]
    }
    
    extension [Self <: PaginatorObject[?], DataT](x: Self & PaginatorObject[DataT]) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCurrent_page(value: Double): Self = StObject.set(x, "current_page", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[DataT]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: DataT*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLast_page(value: Double): Self = StObject.set(x, "last_page", value.asInstanceOf[js.Any])
      
      inline def setNext_page(value: Double | `false`): Self = StObject.set(x, "next_page", value.asInstanceOf[js.Any])
      
      inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
      
      inline def setPrevious_page(value: Double | `false`): Self = StObject.set(x, "previous_page", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaginatorOptions extends StObject {
    
    var total: Double
  }
  object PaginatorOptions {
    
    inline def apply(total: Double): PaginatorOptions = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginatorOptions]
    }
    
    extension [Self <: PaginatorOptions](x: Self) {
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
