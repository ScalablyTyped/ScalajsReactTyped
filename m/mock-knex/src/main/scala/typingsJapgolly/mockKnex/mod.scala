package typingsJapgolly.mockKnex

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mockKnex.mockKnexStrings.query
import typingsJapgolly.mockKnex.mod.Knex.Sql
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mock-knex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTracker(): Tracker = ^.asInstanceOf[js.Dynamic].applyDynamic("getTracker")().asInstanceOf[Tracker]
  
  inline def mock(knex: Knex): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mock")(knex.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unmock(knex: Knex): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmock")(knex.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Knex extends StObject {
    
    var client: Any
  }
  object Knex {
    
    inline def apply(client: Any): Knex = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[Knex]
    }
    
    extension [Self <: Knex](x: Self) {
      
      inline def setClient(value: Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
    
    trait Sql extends StObject {
      
      var bindings: Any
      
      var method: String
      
      var options: Any
      
      var sql: String
      
      def toNative(): Any
    }
    object Sql {
      
      inline def apply(bindings: Any, method: String, options: Any, sql: String, toNative: CallbackTo[Any]): Sql = {
        val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any], toNative = toNative.toJsFn)
        __obj.asInstanceOf[Sql]
      }
      
      extension [Self <: Sql](x: Self) {
        
        inline def setBindings(value: Any): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
        
        inline def setToNative(value: CallbackTo[Any]): Self = StObject.set(x, "toNative", value.toJsFn)
      }
    }
  }
  
  trait Queries extends StObject {
    
    /**
      * Returns the number of queries tracked so far.
      */
    def count(): Double
    
    /**
      * Returns the first (oldest) tracked query, if any have been tracked.
      */
    def first(): QueryDetails
    
    /**
      * Returns the last (most recent) tracked query, if any have been tracked.
      */
    def last(): QueryDetails
    
    /**
      * The queries tracked so far
      */
    var queries: js.Array[QueryDetails]
    
    /**
      * Reset this query tracker, clears the 'queries' array.
      */
    def reset(): this.type
    
    /**
      * Return the tracked query at the given point in the list of queries tracked so far.
      * NOTE: this is a 1 based number! NOT a zero based index.
      */
    def step(stepNum: Double): QueryDetails
    
    /**
      * If tracking is enabled, adds a 'mock' property to the 'query' argument with the following properties, among others:
      *  - response(response, options?) - calls 'resolve()' with the 'query' or the '{ response }' as a parameter depending on 'options.stream'
      *  - resolve(result) - calls 'query.response(result)'
      *  - reject(error) - calls back the 'reject' argument
      * Also emits a tracker 'query' event.
      * Else, calls 'resolve()' without arguments.
      */
    def track[T /* <: js.Object */](
      query: T,
      resolve: js.Function1[/* query */ T, Unit],
      reject: js.Function1[/* error */ js.Error, Unit]
    ): Unit
    
    /**
      * The parent tracker that this 'queries' property belongs to
      */
    var tracker: Tracker
  }
  object Queries {
    
    inline def apply(
      count: CallbackTo[Double],
      first: CallbackTo[QueryDetails],
      last: CallbackTo[QueryDetails],
      queries: js.Array[QueryDetails],
      reset: CallbackTo[Queries],
      step: Double => QueryDetails,
      track: (Any, js.Function1[Any, Unit], js.Function1[/* error */ js.Error, Unit]) => Callback,
      tracker: Tracker
    ): Queries = {
      val __obj = js.Dynamic.literal(count = count.toJsFn, first = first.toJsFn, last = last.toJsFn, queries = queries.asInstanceOf[js.Any], reset = reset.toJsFn, step = js.Any.fromFunction1(step), track = js.Any.fromFunction3((t0: Any, t1: js.Function1[Any, Unit], t2: js.Function1[/* error */ js.Error, Unit]) => (track(t0, t1, t2)).runNow()), tracker = tracker.asInstanceOf[js.Any])
      __obj.asInstanceOf[Queries]
    }
    
    extension [Self <: Queries](x: Self) {
      
      inline def setCount(value: CallbackTo[Double]): Self = StObject.set(x, "count", value.toJsFn)
      
      inline def setFirst(value: CallbackTo[QueryDetails]): Self = StObject.set(x, "first", value.toJsFn)
      
      inline def setLast(value: CallbackTo[QueryDetails]): Self = StObject.set(x, "last", value.toJsFn)
      
      inline def setQueries(value: js.Array[QueryDetails]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
      
      inline def setQueriesVarargs(value: QueryDetails*): Self = StObject.set(x, "queries", js.Array(value*))
      
      inline def setReset(value: CallbackTo[Queries]): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setStep(value: Double => QueryDetails): Self = StObject.set(x, "step", js.Any.fromFunction1(value))
      
      inline def setTrack(value: (Any, js.Function1[Any, Unit], js.Function1[/* error */ js.Error, Unit]) => Callback): Self = StObject.set(x, "track", js.Any.fromFunction3((t0: Any, t1: js.Function1[Any, Unit], t2: js.Function1[/* error */ js.Error, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setTracker(value: Tracker): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueryDetails
    extends StObject
       with Sql {
    
    def reject(error: String): Unit = js.native
    /**
      * Function that needs to be called to mock database query result for knex.
      *
      * @param error The Error, string or instance of Error, which represents why the result was rejected
      */
    def reject(error: js.Error): Unit = js.native
    
    /**
      * Alias for 'response()'
      */
    def resolve(result: Any): Unit = js.native
    
    /**
      * Function that needs to be called to mock database query result for knex.
      *
      * @param values An array of mock data to be returned by database. For Bookshelf this is mostly array of objects. Knex could return any type of data.
      */
    def response(values: Any): Unit = js.native
    def response(values: Any, options: QueryDetailsResponseOption): Unit = js.native
    
    var transacting: Boolean = js.native
  }
  
  trait QueryDetailsResponseOption extends StObject {
    
    /**
      * Is this a stream response, defaults to false
      */
    var stream: js.UndefOr[Boolean] = js.undefined
  }
  object QueryDetailsResponseOption {
    
    inline def apply(): QueryDetailsResponseOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryDetailsResponseOption]
    }
    
    extension [Self <: QueryDetailsResponseOption](x: Self) {
      
      inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
  
  @js.native
  trait Tracker extends EventEmitter {
    
    /**
      * Enables query tracking mock on mocked knex client
      */
    def install(): Unit = js.native
    
    /**
      * Add event listener for 'query' event. It gets esecuted for each query that should end up in database.
      * Instead of this callback gets executed and its up to you to assert queries and mock database responses.
      *
      * @param callback A function that gets executed on 'query' event.
      */
    @JSName("on")
    def on_query(event: query, callback: js.Function2[/* query */ QueryDetails, /* step */ Double, Unit]): this.type = js.native
    
    @JSName("once")
    def once_query(event: query, callback: js.Function2[/* query */ QueryDetails, /* step */ Double, Unit]): this.type = js.native
    
    /**
      * The queries tracked so far by this tracker
      */
    var queries: Queries = js.native
    
    /**
      * Whether tracking is currently enabled for this tracker
      */
    var tracking: Boolean = js.native
    
    /**
      * Disables query tracking mock on mocked knex client. Also resets 'step' counter.
      */
    def uninstall(): Unit = js.native
    
    /**
      * Calls 'this.with()'
      */
    def withMock(): Unit = js.native
    
    /**
      * Install the tracker, run the callback, and uninstall the tracker.
      */
    def wrap(cb: js.Function0[Unit]): Unit = js.native
  }
}
