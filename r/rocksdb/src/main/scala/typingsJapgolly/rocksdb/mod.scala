package typingsJapgolly.rocksdb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.abstractLeveldown.mod.AbstractBatch
import typingsJapgolly.abstractLeveldown.mod.AbstractChainedBatch
import typingsJapgolly.abstractLeveldown.mod.AbstractGetOptions
import typingsJapgolly.abstractLeveldown.mod.AbstractIterator
import typingsJapgolly.abstractLeveldown.mod.AbstractIteratorOptions
import typingsJapgolly.abstractLeveldown.mod.AbstractLevelDOWN
import typingsJapgolly.abstractLeveldown.mod.AbstractOpenOptions
import typingsJapgolly.abstractLeveldown.mod.AbstractOptions
import typingsJapgolly.abstractLeveldown.mod.ErrorCallback
import typingsJapgolly.abstractLeveldown.mod.ErrorKeyValueCallback
import typingsJapgolly.abstractLeveldown.mod.ErrorValueCallback
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.rocksdb.mod.RocksDB.BatchOptions
import typingsJapgolly.rocksdb.mod.RocksDB.Bytes
import typingsJapgolly.rocksdb.mod.RocksDB.Constructor
import typingsJapgolly.rocksdb.mod.RocksDB.DelOptions
import typingsJapgolly.rocksdb.mod.RocksDB.ErrorSizeCallback
import typingsJapgolly.rocksdb.mod.RocksDB.GetOptions
import typingsJapgolly.rocksdb.mod.RocksDB.Iterator
import typingsJapgolly.rocksdb.mod.RocksDB.IteratorOptions
import typingsJapgolly.rocksdb.mod.RocksDB.PutOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("rocksdb", JSImport.Default)
    @js.native
    open class ^ protected ()
      extends StObject
         with RocksDB {
      def this(location: String) = this()
    }
    
    @JSImport("rocksdb", JSImport.Default)
    @js.native
    val ^ : Constructor = js.native
    
    type _To = Constructor
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: Constructor = ^
  }
  
  @js.native
  trait RocksDB
    extends StObject
       with AbstractLevelDOWN[Bytes, Bytes] {
    
    def approximateSize(start: Bytes, end: Bytes, cb: ErrorSizeCallback): Unit = js.native
    
    def batch(array: js.Array[AbstractBatch[Any, Any]], options: BatchOptions, cb: ErrorCallback): AbstractChainedBatch[Bytes, Bytes] = js.native
    
    def compactRange(start: Bytes, end: Bytes, cb: ErrorCallback): Unit = js.native
    
    def del(key: Bytes, options: DelOptions, cb: ErrorCallback): Unit = js.native
    
    def destroy(location: String, cb: ErrorCallback): Unit = js.native
    
    def get(key: Bytes, options: GetOptions, cb: ErrorValueCallback[Bytes]): Unit = js.native
    
    def getProperty(property: String): String = js.native
    
    def iterator(options: IteratorOptions): Iterator = js.native
    
    def put(key: Bytes, value: Bytes, options: PutOptions, cb: ErrorCallback): Unit = js.native
    
    def repair(location: String, cb: ErrorCallback): Unit = js.native
  }
  object RocksDB {
    
    trait BatchOptions
      extends StObject
         with AbstractOptions {
      
      var sync: js.UndefOr[Boolean] = js.undefined
    }
    object BatchOptions {
      
      inline def apply(): BatchOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BatchOptions]
      }
      
      extension [Self <: BatchOptions](x: Self) {
        
        inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
        
        inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      }
    }
    
    type Bytes = String | Buffer
    
    @js.native
    trait Constructor
      extends StObject
         with Instantiable1[/* location */ String, RocksDB] {
      
      def apply(location: String): RocksDB = js.native
    }
    
    trait DelOptions
      extends StObject
         with AbstractOptions {
      
      var sync: js.UndefOr[Boolean] = js.undefined
    }
    object DelOptions {
      
      inline def apply(): DelOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DelOptions]
      }
      
      extension [Self <: DelOptions](x: Self) {
        
        inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
        
        inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      }
    }
    
    type ErrorSizeCallback = js.Function2[/* err */ js.UndefOr[js.Error], /* size */ Double, Unit]
    
    trait GetOptions
      extends StObject
         with AbstractGetOptions {
      
      var fillCache: js.UndefOr[Boolean] = js.undefined
    }
    object GetOptions {
      
      inline def apply(): GetOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetOptions]
      }
      
      extension [Self <: GetOptions](x: Self) {
        
        inline def setFillCache(value: Boolean): Self = StObject.set(x, "fillCache", value.asInstanceOf[js.Any])
        
        inline def setFillCacheUndefined: Self = StObject.set(x, "fillCache", js.undefined)
      }
    }
    
    trait Iterator
      extends StObject
         with AbstractIterator[Bytes, Bytes] {
      
      var binding: Any
      
      var cache: Any
      
      var fastFuture: Any
      
      var finished: Any
      
      def seek(key: Bytes): Unit
    }
    object Iterator {
      
      inline def apply(
        binding: Any,
        cache: Any,
        db: AbstractLevelDOWN[Bytes, Bytes],
        end: ErrorCallback => Callback,
        fastFuture: Any,
        finished: Any,
        next: ErrorKeyValueCallback[Bytes, Bytes] => Iterator,
        seek: Bytes => Callback
      ): Iterator = {
        val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], end = js.Any.fromFunction1((t0: ErrorCallback) => end(t0).runNow()), fastFuture = fastFuture.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], next = js.Any.fromFunction1(next), seek = js.Any.fromFunction1((t0: Bytes) => seek(t0).runNow()))
        __obj.asInstanceOf[Iterator]
      }
      
      extension [Self <: Iterator](x: Self) {
        
        inline def setBinding(value: Any): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
        
        inline def setCache(value: Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
        
        inline def setFastFuture(value: Any): Self = StObject.set(x, "fastFuture", value.asInstanceOf[js.Any])
        
        inline def setFinished(value: Any): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
        
        inline def setSeek(value: Bytes => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Bytes) => value(t0).runNow()))
      }
    }
    
    trait IteratorOptions
      extends StObject
         with AbstractIteratorOptions[Bytes] {
      
      var fillCache: js.UndefOr[Boolean] = js.undefined
    }
    object IteratorOptions {
      
      inline def apply(): IteratorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IteratorOptions]
      }
      
      extension [Self <: IteratorOptions](x: Self) {
        
        inline def setFillCache(value: Boolean): Self = StObject.set(x, "fillCache", value.asInstanceOf[js.Any])
        
        inline def setFillCacheUndefined: Self = StObject.set(x, "fillCache", js.undefined)
      }
    }
    
    // tslint:disable-next-line:no-empty-interface
    type OpenOptions = AbstractOpenOptions
    
    trait PutOptions
      extends StObject
         with AbstractOptions {
      
      var sync: js.UndefOr[Boolean] = js.undefined
    }
    object PutOptions {
      
      inline def apply(): PutOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PutOptions]
      }
      
      extension [Self <: PutOptions](x: Self) {
        
        inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
        
        inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
      }
    }
  }
}
