package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatabaseKeyPrefetcherMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(database: Connection): Unit = ^.asInstanceOf[js.Dynamic].apply(database.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(database: Database): Unit = ^.asInstanceOf[js.Dynamic].apply(database.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/database/KeyPrefetcher", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with KeyPrefetcher {
    def this(database: Connection) = this()
    def this(database: Database) = this()
    
    /* CompleteClass */
    override def createKey(): Double = js.native
    
    /* private */ /* CompleteClass */
    var database_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* CompleteClass */
    override def reserve(qty: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var reservedBase_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var reservedQty_ : Any = js.native
  }
  @JSImport("@nginstack/engine/lib/database/KeyPrefetcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Connection = typingsJapgolly.nginstackEngine.libConnectionConnectionMod.^
  
  type Database = typingsJapgolly.nginstackEngine.libDatabaseDatabaseMod.^
  
  trait KeyPrefetcher extends StObject {
    
    def createKey(): Double
    
    /* private */ var database_ : Any
    
    /* private */ var logger_ : Any
    
    def reserve(qty: Double): Unit
    
    /* private */ var reservedBase_ : Any
    
    /* private */ var reservedQty_ : Any
  }
  object KeyPrefetcher {
    
    inline def apply(
      createKey: CallbackTo[Double],
      database_ : Any,
      logger_ : Any,
      reserve: Double => Callback,
      reservedBase_ : Any,
      reservedQty_ : Any
    ): KeyPrefetcher = {
      val __obj = js.Dynamic.literal(createKey = createKey.toJsFn, database_ = database_.asInstanceOf[js.Any], logger_ = logger_.asInstanceOf[js.Any], reserve = js.Any.fromFunction1((t0: Double) => reserve(t0).runNow()), reservedBase_ = reservedBase_.asInstanceOf[js.Any], reservedQty_ = reservedQty_.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyPrefetcher]
    }
    
    extension [Self <: KeyPrefetcher](x: Self) {
      
      inline def setCreateKey(value: CallbackTo[Double]): Self = StObject.set(x, "createKey", value.toJsFn)
      
      inline def setDatabase_(value: Any): Self = StObject.set(x, "database_", value.asInstanceOf[js.Any])
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setReserve(value: Double => Callback): Self = StObject.set(x, "reserve", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setReservedBase_(value: Any): Self = StObject.set(x, "reservedBase_", value.asInstanceOf[js.Any])
      
      inline def setReservedQty_(value: Any): Self = StObject.set(x, "reservedQty_", value.asInstanceOf[js.Any])
    }
  }
}
