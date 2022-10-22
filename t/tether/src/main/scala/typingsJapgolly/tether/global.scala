package typingsJapgolly.tether

import typingsJapgolly.tether.mod.ITetherOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Tether {
    
    // global Tether constructor
    @JSGlobal("Tether")
    @js.native
    open class ^ protected ()
      extends typingsJapgolly.tether.mod.^ {
      def this(options: ITetherOptions) = this()
    }
    
    @JSGlobal("Tether")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def position(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("position")().asInstanceOf[Unit]
  }
}
