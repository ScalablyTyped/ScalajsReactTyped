package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.nodegitInts.`0`
import typingsJapgolly.nodegit.nodegitInts.`1`
import typingsJapgolly.nodegit.nodegitInts.`2`
import typingsJapgolly.nodegit.nodegitInts.`3`
import typingsJapgolly.nodegit.nodegitInts.`4`
import typingsJapgolly.nodegit.nodegitInts.`5`
import typingsJapgolly.nodegit.oidMod.Oid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rebaseOperationMod {
  
  @JSImport("nodegit/rebase-operation", "RebaseOperation")
  @js.native
  open class RebaseOperation () extends StObject {
    
    var exec: String = js.native
    
    var id: Oid = js.native
    
    var `type`: Double = js.native
  }
  object RebaseOperation {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodegit.nodegitInts.`0`
      - typingsJapgolly.nodegit.nodegitInts.`1`
      - typingsJapgolly.nodegit.nodegitInts.`2`
      - typingsJapgolly.nodegit.nodegitInts.`3`
      - typingsJapgolly.nodegit.nodegitInts.`4`
      - typingsJapgolly.nodegit.nodegitInts.`5`
    */
    trait REBASE_OPERATION extends StObject
    object REBASE_OPERATION {
      
      inline def EDIT: `2` = 2.asInstanceOf[`2`]
      
      inline def EXEC: `5` = 5.asInstanceOf[`5`]
      
      inline def FIXUP: `4` = 4.asInstanceOf[`4`]
      
      inline def PICK: `0` = 0.asInstanceOf[`0`]
      
      inline def REWORD: `1` = 1.asInstanceOf[`1`]
      
      inline def SQUASH: `3` = 3.asInstanceOf[`3`]
    }
  }
}
