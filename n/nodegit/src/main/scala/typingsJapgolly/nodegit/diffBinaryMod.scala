package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.diffBinaryFileMod.DiffBinaryFile
import typingsJapgolly.nodegit.diffBinaryMod.DiffBinary.DIFF_BINARY
import typingsJapgolly.nodegit.nodegitInts.`0`
import typingsJapgolly.nodegit.nodegitInts.`1`
import typingsJapgolly.nodegit.nodegitInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffBinaryMod {
  
  @JSImport("nodegit/diff-binary", "DiffBinary")
  @js.native
  open class DiffBinary () extends StObject {
    
    var containsData: DIFF_BINARY = js.native
    
    var newFile: DiffBinaryFile = js.native
    
    var oldFile: DiffBinaryFile = js.native
  }
  object DiffBinary {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodegit.nodegitInts.`0`
      - typingsJapgolly.nodegit.nodegitInts.`1`
      - typingsJapgolly.nodegit.nodegitInts.`2`
    */
    trait DIFF_BINARY extends StObject
    object DIFF_BINARY {
      
      inline def DELTA: `2` = 2.asInstanceOf[`2`]
      
      inline def LITERAL: `1` = 1.asInstanceOf[`1`]
      
      inline def NONE: `0` = 0.asInstanceOf[`0`]
    }
  }
}
