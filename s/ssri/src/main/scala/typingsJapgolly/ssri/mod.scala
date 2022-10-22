package typingsJapgolly.ssri

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.NodeJS.TypedArray
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.ssri.anon.Algorithms
import typingsJapgolly.ssri.anon.AlgorithmsOptions
import typingsJapgolly.ssri.anon.Error
import typingsJapgolly.ssri.anon.Options
import typingsJapgolly.ssri.anon.OptionsSingle
import typingsJapgolly.ssri.anon.OptionsSingleStrict
import typingsJapgolly.ssri.anon.PickAlgorithm
import typingsJapgolly.ssri.anon.Promise
import typingsJapgolly.ssri.anon.Sep
import typingsJapgolly.ssri.anon.Single
import typingsJapgolly.ssri.anon.SingleStrict
import typingsJapgolly.ssri.anon.Strict
import typingsJapgolly.ssri.anon.`0`
import typingsJapgolly.ssri.anon.`1`
import typingsJapgolly.ssri.anon.`2`
import typingsJapgolly.ssri.ssriBooleans.`false`
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ssri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ssri", "Hash")
  @js.native
  open class Hash protected ()
    extends StObject
       with HashLike {
    def this(hash: String) = this()
    def this(hash: String, opts: Strict) = this()
    
    /* CompleteClass */
    var algorithm: String = js.native
    
    /* CompleteClass */
    var digest: String = js.native
    
    def hexDigest(): String = js.native
    
    var isHash: Boolean = js.native
    
    var source: String = js.native
    
    def toJSON(): String = js.native
    
    def toString(opts: Strict): String = js.native
  }
  
  @JSImport("ssri", "Integrity")
  @js.native
  open class Integrity () extends StObject {
    
    def concat(integrity: String): IntegrityMap = js.native
    def concat(integrity: String, opts: Strict): IntegrityMap = js.native
    def concat(integrity: HashLike): IntegrityMap = js.native
    def concat(integrity: HashLike, opts: Strict): IntegrityMap = js.native
    def concat(integrity: IntegrityLike): IntegrityMap = js.native
    def concat(integrity: IntegrityLike, opts: Strict): IntegrityMap = js.native
    
    def hexDigest(): String = js.native
    
    var isIntegrity: Boolean = js.native
    
    def `match`(integrity: String): Hash | `false` = js.native
    def `match`(integrity: String, opts: PickAlgorithm): Hash | `false` = js.native
    def `match`(integrity: HashLike): Hash | `false` = js.native
    def `match`(integrity: HashLike, opts: PickAlgorithm): Hash | `false` = js.native
    def `match`(integrity: IntegrityLike): Hash | `false` = js.native
    def `match`(integrity: IntegrityLike, opts: PickAlgorithm): Hash | `false` = js.native
    
    /**
      * Safely merges another IntegrityLike or integrity string into an Integrity object.
      */
    def merge(): Unit = js.native
    def merge(otherIntegrity: String): Unit = js.native
    def merge(otherIntegrity: String, opts: Single): Unit = js.native
    def merge(otherIntegrity: Unit, opts: Single): Unit = js.native
    def merge(otherIntegrity: HashLike): Unit = js.native
    def merge(otherIntegrity: HashLike, opts: Single): Unit = js.native
    def merge(otherIntegrity: IntegrityLike): Unit = js.native
    def merge(otherIntegrity: IntegrityLike, opts: Single): Unit = js.native
    
    def pickAlgorithm(): String = js.native
    def pickAlgorithm(opts: `0`): String = js.native
    
    def toJSON(): String = js.native
    
    def toString(opts: Sep): String = js.native
  }
  
  inline def checkData(data: String, sri: String): Hash | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("checkData")(data.asInstanceOf[js.Any], sri.asInstanceOf[js.Any])).asInstanceOf[Hash | `false`]
  inline def checkData(data: String, sri: String, opts: Error): Hash | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("checkData")(data.asInstanceOf[js.Any], sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Hash | `false`]
  inline def checkData(data: String, sri: HashLike): Hash | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("checkData")(data.asInstanceOf[js.Any], sri.asInstanceOf[js.Any])).asInstanceOf[Hash | `false`]
  inline def checkData(data: String, sri: HashLike, opts: Error): Hash | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("checkData")(data.asInstanceOf[js.Any], sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Hash | `false`]
  inline def checkData(data: String, sri: IntegrityLike): Hash | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("checkData")(data.asInstanceOf[js.Any], sri.asInstanceOf[js.Any])).asInstanceOf[Hash | `false`]
  inline def checkData(data: String, sri: IntegrityLike, opts: Error): Hash | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("checkData")(data.asInstanceOf[js.Any], sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Hash | `false`]
  inline def checkData(data: TypedArray, sri: String): Hash | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("checkData")(data.asInstanceOf[js.Any], sri.asInstanceOf[js.Any])).asInstanceOf[Hash | `false`]
  inline def checkData(data: TypedArray, sri: String, opts: Error): Hash | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("checkData")(data.asInstanceOf[js.Any], sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Hash | `false`]
  inline def checkData(data: TypedArray, sri: HashLike): Hash | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("checkData")(data.asInstanceOf[js.Any], sri.asInstanceOf[js.Any])).asInstanceOf[Hash | `false`]
  inline def checkData(data: TypedArray, sri: HashLike, opts: Error): Hash | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("checkData")(data.asInstanceOf[js.Any], sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Hash | `false`]
  inline def checkData(data: TypedArray, sri: IntegrityLike): Hash | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("checkData")(data.asInstanceOf[js.Any], sri.asInstanceOf[js.Any])).asInstanceOf[Hash | `false`]
  inline def checkData(data: TypedArray, sri: IntegrityLike, opts: Error): Hash | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("checkData")(data.asInstanceOf[js.Any], sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Hash | `false`]
  inline def checkData(data: Buffer, sri: String): Hash | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("checkData")(data.asInstanceOf[js.Any], sri.asInstanceOf[js.Any])).asInstanceOf[Hash | `false`]
  inline def checkData(data: Buffer, sri: String, opts: Error): Hash | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("checkData")(data.asInstanceOf[js.Any], sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Hash | `false`]
  inline def checkData(data: Buffer, sri: HashLike): Hash | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("checkData")(data.asInstanceOf[js.Any], sri.asInstanceOf[js.Any])).asInstanceOf[Hash | `false`]
  inline def checkData(data: Buffer, sri: HashLike, opts: Error): Hash | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("checkData")(data.asInstanceOf[js.Any], sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Hash | `false`]
  inline def checkData(data: Buffer, sri: IntegrityLike): Hash | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("checkData")(data.asInstanceOf[js.Any], sri.asInstanceOf[js.Any])).asInstanceOf[Hash | `false`]
  inline def checkData(data: Buffer, sri: IntegrityLike, opts: Error): Hash | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("checkData")(data.asInstanceOf[js.Any], sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Hash | `false`]
  
  inline def checkStream(stream: Readable, sri: String): PromiseLike[Hash] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkStream")(stream.asInstanceOf[js.Any], sri.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Hash]]
  inline def checkStream(stream: Readable, sri: String, opts: Options): js.Promise[Hash] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkStream")(stream.asInstanceOf[js.Any], sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Hash]]
  inline def checkStream(stream: Readable, sri: String, opts: Promise): PromiseLike[Hash] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkStream")(stream.asInstanceOf[js.Any], sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Hash]]
  inline def checkStream(stream: Readable, sri: HashLike): PromiseLike[Hash] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkStream")(stream.asInstanceOf[js.Any], sri.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Hash]]
  inline def checkStream(stream: Readable, sri: HashLike, opts: Options): js.Promise[Hash] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkStream")(stream.asInstanceOf[js.Any], sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Hash]]
  inline def checkStream(stream: Readable, sri: HashLike, opts: Promise): PromiseLike[Hash] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkStream")(stream.asInstanceOf[js.Any], sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Hash]]
  inline def checkStream(stream: Readable, sri: IntegrityLike): PromiseLike[Hash] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkStream")(stream.asInstanceOf[js.Any], sri.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Hash]]
  inline def checkStream(stream: Readable, sri: IntegrityLike, opts: Options): js.Promise[Hash] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkStream")(stream.asInstanceOf[js.Any], sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Hash]]
  inline def checkStream(stream: Readable, sri: IntegrityLike, opts: Promise): PromiseLike[Hash] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkStream")(stream.asInstanceOf[js.Any], sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Hash]]
  
  inline def checkStream_Promise(stream: Readable, sri: String): js.Promise[Hash] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkStream")(stream.asInstanceOf[js.Any], sri.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Hash]]
  inline def checkStream_Promise(stream: Readable, sri: HashLike): js.Promise[Hash] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkStream")(stream.asInstanceOf[js.Any], sri.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Hash]]
  inline def checkStream_Promise(stream: Readable, sri: IntegrityLike): js.Promise[Hash] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkStream")(stream.asInstanceOf[js.Any], sri.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Hash]]
  
  inline def create(): typingsJapgolly.node.cryptoMod.Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.node.cryptoMod.Hash]
  inline def create(opts: Algorithms): typingsJapgolly.node.cryptoMod.Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.cryptoMod.Hash]
  
  inline def fromData(data: String): IntegrityMap = ^.asInstanceOf[js.Dynamic].applyDynamic("fromData")(data.asInstanceOf[js.Any]).asInstanceOf[IntegrityMap]
  inline def fromData(data: String, opts: Algorithms): IntegrityMap = (^.asInstanceOf[js.Dynamic].applyDynamic("fromData")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IntegrityMap]
  inline def fromData(data: js.typedarray.DataView): IntegrityMap = ^.asInstanceOf[js.Dynamic].applyDynamic("fromData")(data.asInstanceOf[js.Any]).asInstanceOf[IntegrityMap]
  inline def fromData(data: js.typedarray.DataView, opts: Algorithms): IntegrityMap = (^.asInstanceOf[js.Dynamic].applyDynamic("fromData")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IntegrityMap]
  inline def fromData(data: TypedArray): IntegrityMap = ^.asInstanceOf[js.Dynamic].applyDynamic("fromData")(data.asInstanceOf[js.Any]).asInstanceOf[IntegrityMap]
  inline def fromData(data: TypedArray, opts: Algorithms): IntegrityMap = (^.asInstanceOf[js.Dynamic].applyDynamic("fromData")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IntegrityMap]
  inline def fromData(data: Buffer): IntegrityMap = ^.asInstanceOf[js.Dynamic].applyDynamic("fromData")(data.asInstanceOf[js.Any]).asInstanceOf[IntegrityMap]
  inline def fromData(data: Buffer, opts: Algorithms): IntegrityMap = (^.asInstanceOf[js.Dynamic].applyDynamic("fromData")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IntegrityMap]
  
  inline def fromHex(hexDigest: String, algorithm: String): Hash = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hexDigest.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[Hash]
  inline def fromHex(hexDigest: String, algorithm: String, opts: OptionsSingle): IntegrityMap = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hexDigest.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IntegrityMap]
  inline def fromHex(hexDigest: String, algorithm: String, opts: OptionsSingleStrict): IntegrityMap | Hash = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hexDigest.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IntegrityMap | Hash]
  inline def fromHex(hexDigest: String, algorithm: String, opts: SingleStrict): Hash = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hexDigest.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Hash]
  
  inline def fromHex_IntegrityMap(hexDigest: String, algorithm: String): IntegrityMap = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hexDigest.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[IntegrityMap]
  
  inline def fromHex_Union(hexDigest: String, algorithm: String): IntegrityMap | Hash = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hexDigest.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[IntegrityMap | Hash]
  
  inline def fromStream(stream: Readable): PromiseLike[IntegrityMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[PromiseLike[IntegrityMap]]
  inline def fromStream(stream: Readable, opts: Algorithms): js.Promise[IntegrityMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IntegrityMap]]
  inline def fromStream(stream: Readable, opts: AlgorithmsOptions): PromiseLike[IntegrityMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[IntegrityMap]]
  
  inline def fromStream_Promise(stream: Readable): js.Promise[IntegrityMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IntegrityMap]]
  
  inline def integrityStream(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("integrityStream")().asInstanceOf[Transform]
  inline def integrityStream(opts: typingsJapgolly.ssri.anon.Integrity): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("integrityStream")(opts.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  inline def parse(sri: String): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sri.asInstanceOf[js.Any]).asInstanceOf[Hash]
  inline def parse(sri: String, opts: Single): IntegrityMap | Hash = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IntegrityMap | Hash]
  inline def parse(sri: String, opts: `1`): IntegrityMap = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IntegrityMap]
  inline def parse(sri: String, opts: `2`): Hash = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Hash]
  inline def parse(sri: HashLike): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sri.asInstanceOf[js.Any]).asInstanceOf[Hash]
  inline def parse(sri: HashLike, opts: Single): IntegrityMap | Hash = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IntegrityMap | Hash]
  inline def parse(sri: HashLike, opts: `1`): IntegrityMap = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IntegrityMap]
  inline def parse(sri: HashLike, opts: `2`): Hash = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Hash]
  inline def parse(sri: IntegrityLike): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sri.asInstanceOf[js.Any]).asInstanceOf[Hash]
  inline def parse(sri: IntegrityLike, opts: Single): IntegrityMap | Hash = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IntegrityMap | Hash]
  inline def parse(sri: IntegrityLike, opts: `1`): IntegrityMap = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[IntegrityMap]
  inline def parse(sri: IntegrityLike, opts: `2`): Hash = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Hash]
  
  inline def parse_IntegrityMap(sri: String): IntegrityMap = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sri.asInstanceOf[js.Any]).asInstanceOf[IntegrityMap]
  inline def parse_IntegrityMap(sri: HashLike): IntegrityMap = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sri.asInstanceOf[js.Any]).asInstanceOf[IntegrityMap]
  inline def parse_IntegrityMap(sri: IntegrityLike): IntegrityMap = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sri.asInstanceOf[js.Any]).asInstanceOf[IntegrityMap]
  
  inline def parse_Union(sri: String): IntegrityMap | Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sri.asInstanceOf[js.Any]).asInstanceOf[IntegrityMap | Hash]
  inline def parse_Union(sri: HashLike): IntegrityMap | Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sri.asInstanceOf[js.Any]).asInstanceOf[IntegrityMap | Hash]
  inline def parse_Union(sri: IntegrityLike): IntegrityMap | Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sri.asInstanceOf[js.Any]).asInstanceOf[IntegrityMap | Hash]
  
  inline def stringify(obj: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(obj: String, opts: Sep): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(obj: HashLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(obj: HashLike, opts: Sep): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(obj: IntegrityLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(obj: IntegrityLike, opts: Sep): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait HashLike extends StObject {
    
    var algorithm: String
    
    var digest: String
    
    var options: js.UndefOr[js.Array[String]] = js.undefined
  }
  object HashLike {
    
    inline def apply(algorithm: String, digest: String): HashLike = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashLike]
    }
    
    extension [Self <: HashLike](x: Self) {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  type IntegrityLike = StringDictionary[js.Array[HashLike]]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - typingsJapgolly.ssri.mod.IntegrityLike because Inheritance from two classes. Inlined  */ @js.native
  trait IntegrityMap extends Integrity
}
