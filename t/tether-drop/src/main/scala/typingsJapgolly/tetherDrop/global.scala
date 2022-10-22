package typingsJapgolly.tetherDrop

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.tetherDrop.mod.IDropContextOptions
import typingsJapgolly.tetherDrop.mod.IDropOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Drop {
    
    // global Drop constructor
    @JSGlobal("Drop")
    @js.native
    open class ^ protected ()
      extends typingsJapgolly.tetherDrop.mod.^ {
      def this(options: IDropOptions) = this()
    }
    
    @JSGlobal("Drop")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def createContext(options: IDropContextOptions): Instantiable1[/* options */ IDropOptions, typingsJapgolly.tetherDrop.mod.Drop] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(options.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* options */ IDropOptions, typingsJapgolly.tetherDrop.mod.Drop]]
  }
}
