package typingsJapgolly.typedUndo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typed-undo", "UndoManager")
  @js.native
  /**
    * Create a new UndoManager
    *
    * @param limit The maximum amount of editables to remember
    */
  open class UndoManager ()
    extends typingsJapgolly.typedUndo.distUndoManagerMod.UndoManager {
    def this(limit: Double) = this()
  }
  
  /* note: abstract class */ @JSImport("typed-undo", "UndoableEdit")
  @js.native
  open class UndoableEdit ()
    extends typingsJapgolly.typedUndo.distUndoableEditMod.UndoableEdit
}
