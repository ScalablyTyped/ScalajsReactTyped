package typingsJapgolly.mdast.mod

import typingsJapgolly.mdast.mdastStrings.thematicBreak
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThematicBreak
  extends StObject
     with Node[Data] {
  
  @JSName("type")
  var type_ThematicBreak: thematicBreak
}
object ThematicBreak {
  
  inline def apply(): ThematicBreak = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("thematicBreak")
    __obj.asInstanceOf[ThematicBreak]
  }
  
  extension [Self <: ThematicBreak](x: Self) {
    
    inline def setType(value: thematicBreak): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
