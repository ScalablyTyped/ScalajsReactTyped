package typingsJapgolly.jsonfile

import typingsJapgolly.jsonfile.mod.FS
import typingsJapgolly.node.NodeJS.ArrayBufferView
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.anon.EncodingFlag
import typingsJapgolly.node.anon.Flag
import typingsJapgolly.node.anon.ObjectEncodingOptionsflag
import typingsJapgolly.node.anon.ObjectEncodingOptionsflagEncoding
import typingsJapgolly.node.anon.encodingBufferEncodingflaEncoding
import typingsJapgolly.node.anon.encodingnullundefinedflagEncoding
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.node.fsMod.NoParamCallback
import typingsJapgolly.node.fsMod.PathOrFileDescriptor
import typingsJapgolly.node.fsMod.WriteFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait EOL extends StObject {
    
    var EOL: js.UndefOr[String] = js.undefined
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
    
    var fs: js.UndefOr[FS] = js.undefined
    
    var mode: js.UndefOr[String | Double] = js.undefined
    
    var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Any]] = js.undefined
    
    var spaces: js.UndefOr[String | Double] = js.undefined
  }
  object EOL {
    
    inline def apply(): EOL = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EOL]
    }
    
    extension [Self <: EOL](x: Self) {
      
      inline def setEOL(value: String): Self = StObject.set(x, "EOL", value.asInstanceOf[js.Any])
      
      inline def setEOLUndefined: Self = StObject.set(x, "EOL", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      inline def setFs(value: FS): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setMode(value: String | Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setReplacer(value: (/* key */ String, /* value */ Any) => Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setSpaces(value: String | Double): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
      
      inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    }
  }
  
  trait Encoding extends StObject {
    
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
    
    var fs: js.UndefOr[FS] = js.undefined
    
    var reviver: js.UndefOr[js.Function2[/* key */ Any, /* value */ Any, Any]] = js.undefined
    
    var throws: js.UndefOr[Boolean] = js.undefined
  }
  object Encoding {
    
    inline def apply(): Encoding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding]
    }
    
    extension [Self <: Encoding](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      inline def setFs(value: FS): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setReviver(value: (/* key */ Any, /* value */ Any) => Any): Self = StObject.set(x, "reviver", js.Any.fromFunction2(value))
      
      inline def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
      
      inline def setThrows(value: Boolean): Self = StObject.set(x, "throws", value.asInstanceOf[js.Any])
      
      inline def setThrowsUndefined: Self = StObject.set(x, "throws", js.undefined)
    }
  }
  
  trait FinalEOL extends StObject {
    
    var EOL: js.UndefOr[String] = js.undefined
    
    var finalEOL: js.UndefOr[Boolean] = js.undefined
    
    var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Any]] = js.undefined
    
    var spaces: js.UndefOr[String | Double] = js.undefined
  }
  object FinalEOL {
    
    inline def apply(): FinalEOL = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FinalEOL]
    }
    
    extension [Self <: FinalEOL](x: Self) {
      
      inline def setEOL(value: String): Self = StObject.set(x, "EOL", value.asInstanceOf[js.Any])
      
      inline def setEOLUndefined: Self = StObject.set(x, "EOL", js.undefined)
      
      inline def setFinalEOL(value: Boolean): Self = StObject.set(x, "finalEOL", value.asInstanceOf[js.Any])
      
      inline def setFinalEOLUndefined: Self = StObject.set(x, "finalEOL", js.undefined)
      
      inline def setReplacer(value: (/* key */ String, /* value */ Any) => Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setSpaces(value: String | Double): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
      
      inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathOrFileDescriptor): String | Buffer = js.native
    def apply(path: PathOrFileDescriptor, options: EncodingFlag): String = js.native
    def apply(path: PathOrFileDescriptor, options: Flag): Buffer = js.native
    def apply(path: PathOrFileDescriptor, options: ObjectEncodingOptionsflagEncoding): String | Buffer = js.native
    def apply(path: PathOrFileDescriptor, options: BufferEncoding): String = js.native
  }
  
  @js.native
  trait FnCallFileDataOptions extends StObject {
    
    def apply(file: PathOrFileDescriptor, data: String): Unit = js.native
    def apply(file: PathOrFileDescriptor, data: String, options: WriteFileOptions): Unit = js.native
    def apply(file: PathOrFileDescriptor, data: ArrayBufferView): Unit = js.native
    def apply(file: PathOrFileDescriptor, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
  }
  
  @js.native
  trait TypeoffsReadFile extends StObject {
    
    def apply(
      path: PathOrFileDescriptor,
      callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
    ): Unit = js.native
    def apply(
      path: PathOrFileDescriptor,
      options: Null,
      callback: js.Function2[ErrnoException | Null, Buffer | String, Unit]
    ): Unit = js.native
    def apply(
      path: PathOrFileDescriptor,
      options: Unit,
      callback: js.Function2[ErrnoException | Null, Buffer | String, Unit]
    ): Unit = js.native
    def apply(
      path: PathOrFileDescriptor,
      options: ObjectEncodingOptionsflag,
      callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String | Buffer, Unit]
    ): Unit = js.native
    def apply(
      path: PathOrFileDescriptor,
      options: encodingBufferEncodingflaEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
    ): Unit = js.native
    def apply(
      path: PathOrFileDescriptor,
      options: encodingnullundefinedflagEncoding,
      callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
    ): Unit = js.native
    def apply(
      path: PathOrFileDescriptor,
      options: BufferEncoding,
      callback: js.Function2[ErrnoException | Null, Buffer | (/* data */ String), Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeoffsWriteFile extends StObject {
    
    def apply(file: PathOrFileDescriptor, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
    def apply(
      file: PathOrFileDescriptor,
      data: ArrayBufferView,
      options: WriteFileOptions,
      callback: NoParamCallback
    ): Unit = js.native
    def apply(path: PathOrFileDescriptor, data: String, callback: NoParamCallback): Unit = js.native
    def apply(path: PathOrFileDescriptor, data: ArrayBufferView, callback: NoParamCallback): Unit = js.native
  }
}
