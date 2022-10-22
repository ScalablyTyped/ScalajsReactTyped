package typingsJapgolly.gitHttpBackend

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gitHttpBackend.anon.Gitreceivepack
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-http-backend", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Backend {
    def this(uri: String) = this()
    def this(uri: String, cb: js.Function2[/* err */ Any, /* service */ Service, Unit]) = this()
  }
  
  @js.native
  trait Backend extends Duplex {
    
    var info: Boolean = js.native
    
    var parsed: Boolean = js.native
    
    var service: String | js.Array[String] = js.native
  }
  
  trait Fields extends StObject {
    
    var branch: String
    
    var head: String
    
    var last: String
    
    var name: String
    
    var ref: String
    
    var refname: String
    
    var tag: String
  }
  object Fields {
    
    inline def apply(
      branch: String,
      head: String,
      last: String,
      name: String,
      ref: String,
      refname: String,
      tag: String
    ): Fields = {
      val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], refname = refname.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefname(value: String): Self = StObject.set(x, "refname", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Service extends StObject {
    
    var _backend: Backend
    
    var _bands: js.Array[Buffer]
    
    var action: String | Gitreceivepack
    
    var args: js.Array[String]
    
    var cmd: String
    
    def createBand(): Writable
    
    def createStream(): Duplex
    
    var fields: Fields
    
    var info: Boolean
    
    var `type`: String
  }
  object Service {
    
    inline def apply(
      _backend: Backend,
      _bands: js.Array[Buffer],
      action: String | Gitreceivepack,
      args: js.Array[String],
      cmd: String,
      createBand: CallbackTo[Writable],
      createStream: CallbackTo[Duplex],
      fields: Fields,
      info: Boolean,
      `type`: String
    ): Service = {
      val __obj = js.Dynamic.literal(_backend = _backend.asInstanceOf[js.Any], _bands = _bands.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any], createBand = createBand.toJsFn, createStream = createStream.toJsFn, fields = fields.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    extension [Self <: Service](x: Self) {
      
      inline def setAction(value: String | Gitreceivepack): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
      
      inline def setCreateBand(value: CallbackTo[Writable]): Self = StObject.set(x, "createBand", value.toJsFn)
      
      inline def setCreateStream(value: CallbackTo[Duplex]): Self = StObject.set(x, "createStream", value.toJsFn)
      
      inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def set_backend(value: Backend): Self = StObject.set(x, "_backend", value.asInstanceOf[js.Any])
      
      inline def set_bands(value: js.Array[Buffer]): Self = StObject.set(x, "_bands", value.asInstanceOf[js.Any])
      
      inline def set_bandsVarargs(value: Buffer*): Self = StObject.set(x, "_bands", js.Array(value*))
    }
  }
}
