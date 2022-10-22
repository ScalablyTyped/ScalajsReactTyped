package typingsJapgolly.fsTreeDiff

import typingsJapgolly.fsTreeDiff.mod.Operand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsTreeDiffStrings {
  
  @js.native
  sealed trait change
    extends StObject
       with Operand
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait create
    extends StObject
       with Operand
  inline def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait mkdir
    extends StObject
       with Operand
  inline def mkdir: mkdir = "mkdir".asInstanceOf[mkdir]
  
  @js.native
  sealed trait rmdir
    extends StObject
       with Operand
  inline def rmdir: rmdir = "rmdir".asInstanceOf[rmdir]
  
  @js.native
  sealed trait unlink
    extends StObject
       with Operand
  inline def unlink: unlink = "unlink".asInstanceOf[unlink]
}
