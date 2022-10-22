package typingsJapgolly.ioredis

import typingsJapgolly.ioredis.anon.Redis
import typingsJapgolly.ioredis.ioredisBooleans.`true`
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.tlsMod.TLSSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtTypesMod {
  
  type Callback[T] = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[T], Unit]
  
  trait CommandItem extends StObject {
    
    var command: Respondable
    
    var select: Double
    
    var stream: WriteableStream
  }
  object CommandItem {
    
    inline def apply(command: Respondable, select: Double, stream: WriteableStream): CommandItem = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandItem]
    }
    
    extension [Self <: CommandItem](x: Self) {
      
      inline def setCommand(value: Respondable): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: Double): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setStream(value: WriteableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  type CommandParameter = String | Buffer | Double | js.Array[Any]
  
  type NetStream = Socket | TLSSocket
  
  @js.native
  trait PipelineWriteableStream extends StObject {
    
    var destination: Redis = js.native
    
    var isPipeline: `true` = js.native
    
    def write(data: String): Any = js.native
    def write(data: Buffer): Any = js.native
  }
  
  trait Respondable extends StObject {
    
    var args: js.Array[CommandParameter]
    
    var name: String
    
    def reject(error: js.Error): Unit
    
    def resolve(result: Any): Unit
  }
  object Respondable {
    
    inline def apply(
      args: js.Array[CommandParameter],
      name: String,
      reject: js.Error => japgolly.scalajs.react.Callback,
      resolve: Any => japgolly.scalajs.react.Callback
    ): Respondable = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reject = js.Any.fromFunction1((t0: js.Error) => reject(t0).runNow()), resolve = js.Any.fromFunction1((t0: Any) => resolve(t0).runNow()))
      __obj.asInstanceOf[Respondable]
    }
    
    extension [Self <: Respondable](x: Self) {
      
      inline def setArgs(value: js.Array[CommandParameter]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: CommandParameter*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReject(value: js.Error => japgolly.scalajs.react.Callback): Self = StObject.set(x, "reject", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
      
      inline def setResolve(value: Any => japgolly.scalajs.react.Callback): Self = StObject.set(x, "resolve", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  trait ScanStreamOptions extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var `match`: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ScanStreamOptions {
    
    inline def apply(): ScanStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScanStreamOptions]
    }
    
    extension [Self <: ScanStreamOptions](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type WriteableStream = NetStream | PipelineWriteableStream
}
