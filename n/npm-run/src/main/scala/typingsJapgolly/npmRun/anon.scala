package typingsJapgolly.npmRun

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.childProcessMod.ChildProcess
import typingsJapgolly.node.childProcessMod.ChildProcessByStdio
import typingsJapgolly.node.childProcessMod.ChildProcessWithoutNullStreams
import typingsJapgolly.node.childProcessMod.ExecSyncOptions
import typingsJapgolly.node.childProcessMod.ExecSyncOptionsWithBufferEncoding
import typingsJapgolly.node.childProcessMod.ExecSyncOptionsWithStringEncoding
import typingsJapgolly.node.childProcessMod.SpawnOptions
import typingsJapgolly.node.childProcessMod.SpawnOptionsWithStdioTuple
import typingsJapgolly.node.childProcessMod.SpawnOptionsWithoutStdio
import typingsJapgolly.node.childProcessMod.SpawnSyncOptions
import typingsJapgolly.node.childProcessMod.SpawnSyncOptionsWithBufferEncoding
import typingsJapgolly.node.childProcessMod.SpawnSyncOptionsWithStringEncoding
import typingsJapgolly.node.childProcessMod.SpawnSyncReturns
import typingsJapgolly.node.childProcessMod.StdioNull
import typingsJapgolly.node.childProcessMod.StdioPipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply(command: String): ChildProcessWithoutNullStreams = js.native
    def apply(command: String, args: js.Array[String]): ChildProcessWithoutNullStreams = js.native
    def apply(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
    def apply(
      command: String,
      args: js.Array[String],
      options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
    ): ChildProcessByStdio[Null, Null, Null] = js.native
    def apply(command: String, args: js.Array[String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
    def apply(command: String, args: Unit, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
    def apply(command: String, options: SpawnOptions): ChildProcess = js.native
    def apply(
      command: String,
      options: SpawnOptionsWithStdioTuple[StdioNull | StdioPipe, StdioNull | StdioPipe, StdioNull | StdioPipe]
    ): ChildProcessByStdio[Null, Null, Null] = js.native
    def apply(command: String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(command: String): String | Buffer = js.native
    def apply(command: String, options: ExecSyncOptions): String | Buffer = js.native
    def apply(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
    def apply(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
  }
  
  @js.native
  trait FnCallCommandArgsOptions extends StObject {
    
    def apply(command: String): SpawnSyncReturns[String | Buffer] = js.native
    def apply(command: String, args: js.Array[String]): SpawnSyncReturns[String | Buffer] = js.native
    def apply(command: String, args: js.Array[String], options: SpawnSyncOptions): SpawnSyncReturns[String | Buffer] = js.native
    def apply(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
    def apply(command: String, args: Unit, options: SpawnSyncOptions): SpawnSyncReturns[String | Buffer] = js.native
    def apply(command: String, options: SpawnSyncOptions): SpawnSyncReturns[String | Buffer] = js.native
    def apply(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  }
}
