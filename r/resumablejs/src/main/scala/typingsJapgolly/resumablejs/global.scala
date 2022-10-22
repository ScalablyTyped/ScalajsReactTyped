package typingsJapgolly.resumablejs

import typingsJapgolly.resumablejs.Resumable.ConfigurationHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Resumable {
    
    @JSGlobal("Resumable.Resumable")
    @js.native
    open class Resumable protected ()
      extends StObject
         with typingsJapgolly.resumablejs.Resumable.Resumable {
      def this(options: ConfigurationHash) = this()
    }
    
    @JSGlobal("Resumable.ResumableChunk")
    @js.native
    open class ResumableChunk ()
      extends StObject
         with typingsJapgolly.resumablejs.Resumable.ResumableChunk
  }
}
