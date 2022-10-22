package typingsJapgolly.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pane extends StObject {
  
  var pane: typingsJapgolly.atom.srcPaneMod.Pane
}
object Pane {
  
  inline def apply(pane: typingsJapgolly.atom.srcPaneMod.Pane): Pane = {
    val __obj = js.Dynamic.literal(pane = pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pane]
  }
  
  extension [Self <: Pane](x: Self) {
    
    inline def setPane(value: typingsJapgolly.atom.srcPaneMod.Pane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
  }
}
