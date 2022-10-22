package typingsJapgolly.write

import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.node.fsMod.Mode
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.StreamOptions
import typingsJapgolly.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathLike): WriteStream = js.native
    def apply(path: PathLike, options: BufferEncoding): WriteStream = js.native
    def apply(path: PathLike, options: StreamOptions): WriteStream = js.native
  }
  
  /* Inlined std.Omit<node.fs.MakeDirectoryOptions, 'recursive'> */
  trait OmitMakeDirectoryOptionsr extends StObject {
    
    var mode: js.UndefOr[Mode] = js.undefined
  }
  object OmitMakeDirectoryOptionsr {
    
    inline def apply(): OmitMakeDirectoryOptionsr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitMakeDirectoryOptionsr]
    }
    
    extension [Self <: OmitMakeDirectoryOptionsr](x: Self) {
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
