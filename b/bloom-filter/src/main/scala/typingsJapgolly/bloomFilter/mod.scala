package typingsJapgolly.bloomFilter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bloom-filter", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Filter {
    def this(options: FilterOptions) = this()
    
    /* CompleteClass */
    var BLOOM_UPDATE_ALL: Double = js.native
    
    /* CompleteClass */
    var BLOOM_UPDATE_NONE: Double = js.native
    
    /* CompleteClass */
    var BLOOM_UPDATE_P2PUBKEY_ONLY: Double = js.native
    
    /* CompleteClass */
    var LN2: Double = js.native
    
    /* CompleteClass */
    var LN2SQUARED: Double = js.native
    
    /* CompleteClass */
    var MAX_BLOOM_FILTER_SIZE: Double = js.native
    
    /* CompleteClass */
    var MAX_HASH_FUNCS: Double = js.native
    
    /* CompleteClass */
    var MIN_HASH_FUNCS: Double = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def contains(data: Buffer): Boolean = js.native
    
    /* CompleteClass */
    override def hash(nHashNum: Double, vDataToHash: Buffer): Double = js.native
    
    /* CompleteClass */
    override def insert(data: Buffer): Unit = js.native
    
    /* CompleteClass */
    override def inspect(): String = js.native
    
    /* CompleteClass */
    override def toObject(): FilterOptions = js.native
  }
  @JSImport("bloom-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MurmurHash3(seed: Double, data: Buffer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("MurmurHash3")(seed.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def create(elements: Double, falsePositiveRate: Double): Filter = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(elements.asInstanceOf[js.Any], falsePositiveRate.asInstanceOf[js.Any])).asInstanceOf[Filter]
  inline def create(elements: Double, falsePositiveRate: Double, nTweak: Double): Filter = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(elements.asInstanceOf[js.Any], falsePositiveRate.asInstanceOf[js.Any], nTweak.asInstanceOf[js.Any])).asInstanceOf[Filter]
  inline def create(elements: Double, falsePositiveRate: Double, nTweak: Double, nFlags: Double): Filter = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(elements.asInstanceOf[js.Any], falsePositiveRate.asInstanceOf[js.Any], nTweak.asInstanceOf[js.Any], nFlags.asInstanceOf[js.Any])).asInstanceOf[Filter]
  inline def create(elements: Double, falsePositiveRate: Double, nTweak: Unit, nFlags: Double): Filter = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(elements.asInstanceOf[js.Any], falsePositiveRate.asInstanceOf[js.Any], nTweak.asInstanceOf[js.Any], nFlags.asInstanceOf[js.Any])).asInstanceOf[Filter]
  
  trait Filter extends StObject {
    
    var BLOOM_UPDATE_ALL: Double
    
    var BLOOM_UPDATE_NONE: Double
    
    var BLOOM_UPDATE_P2PUBKEY_ONLY: Double
    
    var LN2: Double
    
    var LN2SQUARED: Double
    
    var MAX_BLOOM_FILTER_SIZE: Double
    
    var MAX_HASH_FUNCS: Double
    
    var MIN_HASH_FUNCS: Double
    
    def clear(): Unit
    
    def contains(data: Buffer): Boolean
    
    def hash(nHashNum: Double, vDataToHash: Buffer): Double
    
    def insert(data: Buffer): Unit
    
    def inspect(): String
    
    def toObject(): FilterOptions
  }
  object Filter {
    
    inline def apply(
      BLOOM_UPDATE_ALL: Double,
      BLOOM_UPDATE_NONE: Double,
      BLOOM_UPDATE_P2PUBKEY_ONLY: Double,
      LN2: Double,
      LN2SQUARED: Double,
      MAX_BLOOM_FILTER_SIZE: Double,
      MAX_HASH_FUNCS: Double,
      MIN_HASH_FUNCS: Double,
      clear: Callback,
      contains: Buffer => Boolean,
      hash: (Double, Buffer) => Double,
      insert: Buffer => Callback,
      inspect: CallbackTo[String],
      toObject: CallbackTo[FilterOptions]
    ): Filter = {
      val __obj = js.Dynamic.literal(BLOOM_UPDATE_ALL = BLOOM_UPDATE_ALL.asInstanceOf[js.Any], BLOOM_UPDATE_NONE = BLOOM_UPDATE_NONE.asInstanceOf[js.Any], BLOOM_UPDATE_P2PUBKEY_ONLY = BLOOM_UPDATE_P2PUBKEY_ONLY.asInstanceOf[js.Any], LN2 = LN2.asInstanceOf[js.Any], LN2SQUARED = LN2SQUARED.asInstanceOf[js.Any], MAX_BLOOM_FILTER_SIZE = MAX_BLOOM_FILTER_SIZE.asInstanceOf[js.Any], MAX_HASH_FUNCS = MAX_HASH_FUNCS.asInstanceOf[js.Any], MIN_HASH_FUNCS = MIN_HASH_FUNCS.asInstanceOf[js.Any], clear = clear.toJsFn, contains = js.Any.fromFunction1(contains), hash = js.Any.fromFunction2(hash), insert = js.Any.fromFunction1((t0: Buffer) => insert(t0).runNow()), inspect = inspect.toJsFn, toObject = toObject.toJsFn)
      __obj.asInstanceOf[Filter]
    }
    
    extension [Self <: Filter](x: Self) {
      
      inline def setBLOOM_UPDATE_ALL(value: Double): Self = StObject.set(x, "BLOOM_UPDATE_ALL", value.asInstanceOf[js.Any])
      
      inline def setBLOOM_UPDATE_NONE(value: Double): Self = StObject.set(x, "BLOOM_UPDATE_NONE", value.asInstanceOf[js.Any])
      
      inline def setBLOOM_UPDATE_P2PUBKEY_ONLY(value: Double): Self = StObject.set(x, "BLOOM_UPDATE_P2PUBKEY_ONLY", value.asInstanceOf[js.Any])
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setContains(value: Buffer => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setHash(value: (Double, Buffer) => Double): Self = StObject.set(x, "hash", js.Any.fromFunction2(value))
      
      inline def setInsert(value: Buffer => Callback): Self = StObject.set(x, "insert", js.Any.fromFunction1((t0: Buffer) => value(t0).runNow()))
      
      inline def setInspect(value: CallbackTo[String]): Self = StObject.set(x, "inspect", value.toJsFn)
      
      inline def setLN2(value: Double): Self = StObject.set(x, "LN2", value.asInstanceOf[js.Any])
      
      inline def setLN2SQUARED(value: Double): Self = StObject.set(x, "LN2SQUARED", value.asInstanceOf[js.Any])
      
      inline def setMAX_BLOOM_FILTER_SIZE(value: Double): Self = StObject.set(x, "MAX_BLOOM_FILTER_SIZE", value.asInstanceOf[js.Any])
      
      inline def setMAX_HASH_FUNCS(value: Double): Self = StObject.set(x, "MAX_HASH_FUNCS", value.asInstanceOf[js.Any])
      
      inline def setMIN_HASH_FUNCS(value: Double): Self = StObject.set(x, "MIN_HASH_FUNCS", value.asInstanceOf[js.Any])
      
      inline def setToObject(value: CallbackTo[FilterOptions]): Self = StObject.set(x, "toObject", value.toJsFn)
    }
  }
  
  trait FilterOptions extends StObject {
    
    var nFlags: js.UndefOr[Double] = js.undefined
    
    var nHashFuncs: Double
    
    var nTweak: js.UndefOr[Double] = js.undefined
    
    var vData: Buffer
  }
  object FilterOptions {
    
    inline def apply(nHashFuncs: Double, vData: Buffer): FilterOptions = {
      val __obj = js.Dynamic.literal(nHashFuncs = nHashFuncs.asInstanceOf[js.Any], vData = vData.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterOptions]
    }
    
    extension [Self <: FilterOptions](x: Self) {
      
      inline def setNFlags(value: Double): Self = StObject.set(x, "nFlags", value.asInstanceOf[js.Any])
      
      inline def setNFlagsUndefined: Self = StObject.set(x, "nFlags", js.undefined)
      
      inline def setNHashFuncs(value: Double): Self = StObject.set(x, "nHashFuncs", value.asInstanceOf[js.Any])
      
      inline def setNTweak(value: Double): Self = StObject.set(x, "nTweak", value.asInstanceOf[js.Any])
      
      inline def setNTweakUndefined: Self = StObject.set(x, "nTweak", js.undefined)
      
      inline def setVData(value: Buffer): Self = StObject.set(x, "vData", value.asInstanceOf[js.Any])
    }
  }
}
