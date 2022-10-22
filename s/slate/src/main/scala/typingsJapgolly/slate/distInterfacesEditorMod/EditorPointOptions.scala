package typingsJapgolly.slate.distInterfacesEditorMod

import typingsJapgolly.slate.distInterfacesTypesMod.LeafEdge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorPointOptions extends StObject {
  
  var edge: js.UndefOr[LeafEdge] = js.undefined
}
object EditorPointOptions {
  
  inline def apply(): EditorPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorPointOptions]
  }
  
  extension [Self <: EditorPointOptions](x: Self) {
    
    inline def setEdge(value: LeafEdge): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
  }
}
