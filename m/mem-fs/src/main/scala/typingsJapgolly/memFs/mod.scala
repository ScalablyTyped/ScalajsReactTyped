package typingsJapgolly.memFs

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mem-fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): Store = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Store]
  
  @js.native
  trait Store extends EventEmitter {
    
    def add(file: File): this.type = js.native
    
    def each(callback: js.Function2[/* file */ File, /* index */ Double, Unit]): this.type = js.native
    
    def get(filepath: String): File = js.native
    
    def stream(): Transform = js.native
  }
}
