package typingsJapgolly.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Firstnote extends StObject {
  
  var first_note: typingsJapgolly.vexflow.Vex.Flow.Note
  
  var last_note: typingsJapgolly.vexflow.Vex.Flow.Note
}
object Firstnote {
  
  inline def apply(
    first_note: typingsJapgolly.vexflow.Vex.Flow.Note,
    last_note: typingsJapgolly.vexflow.Vex.Flow.Note
  ): Firstnote = {
    val __obj = js.Dynamic.literal(first_note = first_note.asInstanceOf[js.Any], last_note = last_note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstnote]
  }
  
  extension [Self <: Firstnote](x: Self) {
    
    inline def setFirst_note(value: typingsJapgolly.vexflow.Vex.Flow.Note): Self = StObject.set(x, "first_note", value.asInstanceOf[js.Any])
    
    inline def setLast_note(value: typingsJapgolly.vexflow.Vex.Flow.Note): Self = StObject.set(x, "last_note", value.asInstanceOf[js.Any])
  }
}
