package typingsJapgolly.fsJetpack

import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.ReadStream
import typingsJapgolly.node.fsMod.ReadStreamOptions
import typingsJapgolly.node.fsMod.StreamOptions
import typingsJapgolly.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathLike): ReadStream = js.native
    def apply(path: PathLike, options: BufferEncoding): ReadStream = js.native
    def apply(path: PathLike, options: ReadStreamOptions): ReadStream = js.native
  }
  
  @js.native
  trait FnCallPathOptions extends StObject {
    
    def apply(path: PathLike): WriteStream = js.native
    def apply(path: PathLike, options: BufferEncoding): WriteStream = js.native
    def apply(path: PathLike, options: StreamOptions): WriteStream = js.native
  }
}
