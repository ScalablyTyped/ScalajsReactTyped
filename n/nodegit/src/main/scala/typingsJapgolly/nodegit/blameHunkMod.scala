package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.oidMod.Oid
import typingsJapgolly.nodegit.signatureMod.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blameHunkMod {
  
  @JSImport("nodegit/blame-hunk", "BlameHunk")
  @js.native
  open class BlameHunk () extends StObject {
    
    def finalCommitId(): Oid = js.native
    
    def finalSignature(): Signature = js.native
    
    def finalStartLineNumber(): Double = js.native
    
    def linesInHunk(): Double = js.native
    
    def origCommitId(): Oid = js.native
    
    def origPath(): String = js.native
    
    def origSignature(): Signature = js.native
    
    def origStartLineNumber(): Double = js.native
  }
}
