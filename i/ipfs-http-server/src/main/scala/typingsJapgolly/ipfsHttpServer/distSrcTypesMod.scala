package typingsJapgolly.ipfsHttpServer

import org.scalajs.dom.AbortSignal
import typingsJapgolly.hapiHapi.mod.ServerOptions
import typingsJapgolly.hapiHapi.mod.Server_
import typingsJapgolly.ipfsCoreTypes.mod.IPFS
import typingsJapgolly.ipfsHttpServer.ipfsHttpServerStrings.directory
import typingsJapgolly.ipfsHttpServer.ipfsHttpServerStrings.file
import typingsJapgolly.ipfsHttpServer.ipfsHttpServerStrings.symlink
import typingsJapgolly.ipfsUnixfs.mod.Mtime
import typingsJapgolly.multiformatsMultiaddr.mod.Multiaddr_
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  @JSImport("ipfs-http-server/dist/src/types", "Server")
  @js.native
  /**
    * Creates a new server object
    * @param options server configuration object.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-serveroptions)
    */
  open class Server () extends Server_ {
    def this(options: ServerOptions) = this()
  }
  
  trait MultipartDirectory
    extends StObject
       with MultipartUpload
       with MultipartEntry {
    
    var `type`: directory
  }
  object MultipartDirectory {
    
    inline def apply(name: String): MultipartDirectory = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("directory")
      __obj.asInstanceOf[MultipartDirectory]
    }
    
    extension [Self <: MultipartDirectory](x: Self) {
      
      inline def setType(value: directory): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ipfsHttpServer.distSrcTypesMod.MultipartFile
    - typingsJapgolly.ipfsHttpServer.distSrcTypesMod.MultipartDirectory
    - typingsJapgolly.ipfsHttpServer.distSrcTypesMod.MultipartSymlink
  */
  trait MultipartEntry extends StObject
  object MultipartEntry {
    
    inline def MultipartDirectory(name: String): typingsJapgolly.ipfsHttpServer.distSrcTypesMod.MultipartDirectory = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("directory")
      __obj.asInstanceOf[typingsJapgolly.ipfsHttpServer.distSrcTypesMod.MultipartDirectory]
    }
    
    inline def MultipartFile(content: AsyncIterable[js.typedarray.Uint8Array], name: String): typingsJapgolly.ipfsHttpServer.distSrcTypesMod.MultipartFile = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("file")
      __obj.asInstanceOf[typingsJapgolly.ipfsHttpServer.distSrcTypesMod.MultipartFile]
    }
    
    inline def MultipartSymlink(name: String, target: String): typingsJapgolly.ipfsHttpServer.distSrcTypesMod.MultipartSymlink = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("symlink")
      __obj.asInstanceOf[typingsJapgolly.ipfsHttpServer.distSrcTypesMod.MultipartSymlink]
    }
  }
  
  trait MultipartFile
    extends StObject
       with MultipartUpload
       with MultipartEntry {
    
    var content: AsyncIterable[js.typedarray.Uint8Array]
    
    var `type`: file
  }
  object MultipartFile {
    
    inline def apply(content: AsyncIterable[js.typedarray.Uint8Array], name: String): MultipartFile = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("file")
      __obj.asInstanceOf[MultipartFile]
    }
    
    extension [Self <: MultipartFile](x: Self) {
      
      inline def setContent(value: AsyncIterable[js.typedarray.Uint8Array]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setType(value: file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultipartSymlink
    extends StObject
       with MultipartUpload
       with MultipartEntry {
    
    var target: String
    
    var `type`: symlink
  }
  object MultipartSymlink {
    
    inline def apply(name: String, target: String): MultipartSymlink = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("symlink")
      __obj.asInstanceOf[MultipartSymlink]
    }
    
    extension [Self <: MultipartSymlink](x: Self) {
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: symlink): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultipartUpload extends StObject {
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[Mtime] = js.undefined
    
    var name: String
  }
  object MultipartUpload {
    
    inline def apply(name: String): MultipartUpload = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipartUpload]
    }
    
    extension [Self <: MultipartUpload](x: Self) {
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: Mtime): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    trait RequestApplicationState extends StObject {
      
      var signal: AbortSignal
    }
    object RequestApplicationState {
      
      inline def apply(signal: AbortSignal): RequestApplicationState = {
        val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
        __obj.asInstanceOf[RequestApplicationState]
      }
      
      extension [Self <: RequestApplicationState](x: Self) {
        
        inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      }
    }
    
    trait ServerApplicationState extends StObject {
      
      var ipfs: IPFS[js.Object]
    }
    object ServerApplicationState {
      
      inline def apply(ipfs: IPFS[js.Object]): ServerApplicationState = {
        val __obj = js.Dynamic.literal(ipfs = ipfs.asInstanceOf[js.Any])
        __obj.asInstanceOf[ServerApplicationState]
      }
      
      extension [Self <: ServerApplicationState](x: Self) {
        
        inline def setIpfs(value: IPFS[js.Object]): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
      }
    }
    
    trait ServerInfo extends StObject {
      
      var ma: Multiaddr_
    }
    object ServerInfo {
      
      inline def apply(ma: Multiaddr_): ServerInfo = {
        val __obj = js.Dynamic.literal(ma = ma.asInstanceOf[js.Any])
        __obj.asInstanceOf[ServerInfo]
      }
      
      extension [Self <: ServerInfo](x: Self) {
        
        inline def setMa(value: Multiaddr_): Self = StObject.set(x, "ma", value.asInstanceOf[js.Any])
      }
    }
  }
}
