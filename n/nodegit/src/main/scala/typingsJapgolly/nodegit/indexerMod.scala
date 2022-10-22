package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.oidMod.Oid
import typingsJapgolly.nodegit.transferProgressMod.TransferProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexerMod {
  
  @JSImport("nodegit/indexer", "Indexer")
  @js.native
  open class Indexer () extends StObject {
    
    def commit(stats: TransferProgress): Double = js.native
    
    def free(): Unit = js.native
    
    def hash(): Oid = js.native
  }
}
