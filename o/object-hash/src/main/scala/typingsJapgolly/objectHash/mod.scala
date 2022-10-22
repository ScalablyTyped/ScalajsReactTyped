package typingsJapgolly.objectHash

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.objectHash.objectHashStrings.base64
import typingsJapgolly.objectHash.objectHashStrings.binary
import typingsJapgolly.objectHash.objectHashStrings.buffer
import typingsJapgolly.objectHash.objectHashStrings.hex
import typingsJapgolly.objectHash.objectHashStrings.md5
import typingsJapgolly.objectHash.objectHashStrings.passthrough
import typingsJapgolly.objectHash.objectHashStrings.sha1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @see https://github.com/puleos/object-hash#hashvalue-options
    */
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(`object`: js.Object): String = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(`object`: js.Object, options: NormalOption): String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(`object`: js.Object, options: WithBufferOption): Buffer = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def apply(`object`: Null, options: NormalOption): String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(`object`: Null, options: WithBufferOption): Buffer = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @JSImport("object-hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @see https://github.com/puleos/object-hash#hashmd5value
    */
  inline def MD5(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("MD5")().asInstanceOf[String]
  inline def MD5(`object`: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("MD5")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @see https://github.com/puleos/object-hash#hashkeysvalue
    */
  inline def keys(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")().asInstanceOf[String]
  inline def keys(`object`: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @see https://github.com/puleos/object-hash#hashkeysmd5value
    */
  inline def keysMD5(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keysMD5")().asInstanceOf[String]
  inline def keysMD5(`object`: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keysMD5")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @see https://github.com/puleos/object-hash#hashsha1value
    */
  inline def sha1(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")().asInstanceOf[String]
  inline def sha1(`object`: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def writeToStream(value: Any, options: Options, stream: Stream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToStream")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * @see https://github.com/puleos/object-hash#hashwritetostreamvalue-options-stream
    */
  inline def writeToStream(value: Any, stream: Stream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeToStream")(value.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait BaseOptions extends StObject {
    
    /**
      * @default 'sha1'
      */
    var algorithm: js.UndefOr[sha1 | md5 | passthrough] = js.undefined
    
    var excludeKeys: js.UndefOr[js.Function1[/* key */ String, Boolean]] = js.undefined
    
    /**
      * @default false
      */
    var excludeValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      */
    var ignoreUnknown: js.UndefOr[Boolean] = js.undefined
    
    var replacer: js.UndefOr[js.Function1[/* value */ Any, Any]] = js.undefined
    
    /**
      * @default true
      */
    var respectFunctionNames: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var respectFunctionProperties: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var respectType: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      */
    var unorderedArrays: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var unorderedObjects: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var unorderedSets: js.UndefOr[Boolean] = js.undefined
  }
  object BaseOptions {
    
    inline def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    extension [Self <: BaseOptions](x: Self) {
      
      inline def setAlgorithm(value: sha1 | md5 | passthrough): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setExcludeKeys(value: /* key */ String => Boolean): Self = StObject.set(x, "excludeKeys", js.Any.fromFunction1(value))
      
      inline def setExcludeKeysUndefined: Self = StObject.set(x, "excludeKeys", js.undefined)
      
      inline def setExcludeValues(value: Boolean): Self = StObject.set(x, "excludeValues", value.asInstanceOf[js.Any])
      
      inline def setExcludeValuesUndefined: Self = StObject.set(x, "excludeValues", js.undefined)
      
      inline def setIgnoreUnknown(value: Boolean): Self = StObject.set(x, "ignoreUnknown", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnknownUndefined: Self = StObject.set(x, "ignoreUnknown", js.undefined)
      
      inline def setReplacer(value: /* value */ Any => Any): Self = StObject.set(x, "replacer", js.Any.fromFunction1(value))
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setRespectFunctionNames(value: Boolean): Self = StObject.set(x, "respectFunctionNames", value.asInstanceOf[js.Any])
      
      inline def setRespectFunctionNamesUndefined: Self = StObject.set(x, "respectFunctionNames", js.undefined)
      
      inline def setRespectFunctionProperties(value: Boolean): Self = StObject.set(x, "respectFunctionProperties", value.asInstanceOf[js.Any])
      
      inline def setRespectFunctionPropertiesUndefined: Self = StObject.set(x, "respectFunctionProperties", js.undefined)
      
      inline def setRespectType(value: Boolean): Self = StObject.set(x, "respectType", value.asInstanceOf[js.Any])
      
      inline def setRespectTypeUndefined: Self = StObject.set(x, "respectType", js.undefined)
      
      inline def setUnorderedArrays(value: Boolean): Self = StObject.set(x, "unorderedArrays", value.asInstanceOf[js.Any])
      
      inline def setUnorderedArraysUndefined: Self = StObject.set(x, "unorderedArrays", js.undefined)
      
      inline def setUnorderedObjects(value: Boolean): Self = StObject.set(x, "unorderedObjects", value.asInstanceOf[js.Any])
      
      inline def setUnorderedObjectsUndefined: Self = StObject.set(x, "unorderedObjects", js.undefined)
      
      inline def setUnorderedSets(value: Boolean): Self = StObject.set(x, "unorderedSets", value.asInstanceOf[js.Any])
      
      inline def setUnorderedSetsUndefined: Self = StObject.set(x, "unorderedSets", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.objectHash.objectHashStrings.ascii
    - typingsJapgolly.objectHash.objectHashStrings.base64
    - typingsJapgolly.objectHash.objectHashStrings.binary
    - typingsJapgolly.objectHash.objectHashStrings.hex
    - typingsJapgolly.objectHash.objectHashStrings.latin1
    - typingsJapgolly.objectHash.objectHashStrings.`ucs-2`
    - typingsJapgolly.objectHash.objectHashStrings.ucs2
    - typingsJapgolly.objectHash.objectHashStrings.`utf-8`
    - typingsJapgolly.objectHash.objectHashStrings.utf16le
    - typingsJapgolly.objectHash.objectHashStrings.utf8
  */
  trait BufferEncoding extends StObject
  object BufferEncoding {
    
    inline def ascii: typingsJapgolly.objectHash.objectHashStrings.ascii = "ascii".asInstanceOf[typingsJapgolly.objectHash.objectHashStrings.ascii]
    
    inline def base64: typingsJapgolly.objectHash.objectHashStrings.base64 = "base64".asInstanceOf[typingsJapgolly.objectHash.objectHashStrings.base64]
    
    inline def binary: typingsJapgolly.objectHash.objectHashStrings.binary = "binary".asInstanceOf[typingsJapgolly.objectHash.objectHashStrings.binary]
    
    inline def hex: typingsJapgolly.objectHash.objectHashStrings.hex = "hex".asInstanceOf[typingsJapgolly.objectHash.objectHashStrings.hex]
    
    inline def latin1: typingsJapgolly.objectHash.objectHashStrings.latin1 = "latin1".asInstanceOf[typingsJapgolly.objectHash.objectHashStrings.latin1]
    
    inline def `ucs-2`: typingsJapgolly.objectHash.objectHashStrings.`ucs-2` = "ucs-2".asInstanceOf[typingsJapgolly.objectHash.objectHashStrings.`ucs-2`]
    
    inline def ucs2: typingsJapgolly.objectHash.objectHashStrings.ucs2 = "ucs2".asInstanceOf[typingsJapgolly.objectHash.objectHashStrings.ucs2]
    
    inline def `utf-8`: typingsJapgolly.objectHash.objectHashStrings.`utf-8` = "utf-8".asInstanceOf[typingsJapgolly.objectHash.objectHashStrings.`utf-8`]
    
    inline def utf16le: typingsJapgolly.objectHash.objectHashStrings.utf16le = "utf16le".asInstanceOf[typingsJapgolly.objectHash.objectHashStrings.utf16le]
    
    inline def utf8: typingsJapgolly.objectHash.objectHashStrings.utf8 = "utf8".asInstanceOf[typingsJapgolly.objectHash.objectHashStrings.utf8]
  }
  
  trait NormalOption
    extends StObject
       with BaseOptions
       with Options {
    
    /**
      * @default 'hex'
      */
    var encoding: js.UndefOr[hex | binary | base64] = js.undefined
  }
  object NormalOption {
    
    inline def apply(): NormalOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NormalOption]
    }
    
    extension [Self <: NormalOption](x: Self) {
      
      inline def setEncoding(value: hex | binary | base64): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.objectHash.mod.NormalOption
    - typingsJapgolly.objectHash.mod.WithBufferOption
  */
  trait Options extends StObject
  object Options {
    
    inline def NormalOption(): typingsJapgolly.objectHash.mod.NormalOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.objectHash.mod.NormalOption]
    }
    
    inline def WithBufferOption(): typingsJapgolly.objectHash.mod.WithBufferOption = {
      val __obj = js.Dynamic.literal(encoding = "buffer")
      __obj.asInstanceOf[typingsJapgolly.objectHash.mod.WithBufferOption]
    }
  }
  
  trait Stream extends StObject {
    
    var update: js.UndefOr[
        js.Function3[
          /* chunk */ Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var write: js.UndefOr[
        js.Function3[
          /* chunk */ Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object Stream {
    
    inline def apply(): Stream = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Stream]
    }
    
    extension [Self <: Stream](x: Self) {
      
      inline def setUpdate(
        value: (/* chunk */ Any, /* encoding */ BufferEncoding, /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]) => Callback
      ): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: /* chunk */ Any, t1: /* encoding */ BufferEncoding, t2: /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      inline def setWrite(
        value: (/* chunk */ Any, /* encoding */ BufferEncoding, /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]) => Callback
      ): Self = StObject.set(x, "write", js.Any.fromFunction3((t0: /* chunk */ Any, t1: /* encoding */ BufferEncoding, t2: /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    }
  }
  
  trait WithBufferOption
    extends StObject
       with BaseOptions
       with Options {
    
    var encoding: buffer
  }
  object WithBufferOption {
    
    inline def apply(): WithBufferOption = {
      val __obj = js.Dynamic.literal(encoding = "buffer")
      __obj.asInstanceOf[WithBufferOption]
    }
    
    extension [Self <: WithBufferOption](x: Self) {
      
      inline def setEncoding(value: buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
}
