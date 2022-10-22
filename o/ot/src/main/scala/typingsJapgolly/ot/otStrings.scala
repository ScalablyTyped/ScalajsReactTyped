package typingsJapgolly.ot

import typingsJapgolly.ot.mod.UndoState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object otStrings {
  
  @js.native
  sealed trait normal
    extends StObject
       with UndoState
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait redoing
    extends StObject
       with UndoState
  inline def redoing: redoing = "redoing".asInstanceOf[redoing]
  
  @js.native
  sealed trait undoing
    extends StObject
       with UndoState
  inline def undoing: undoing = "undoing".asInstanceOf[undoing]
}
