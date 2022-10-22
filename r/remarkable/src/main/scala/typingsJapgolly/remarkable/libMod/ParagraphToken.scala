package typingsJapgolly.remarkable.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait ParagraphToken
  extends StObject
     with TagToken {
  
  /**
    * Absence of empty line before current tag: `true` if absent, `false`
    * if present. List is tight if any list item is tight.
    */
  var tight: Boolean
}
object ParagraphToken {
  
  inline def apply(level: Double, tight: Boolean, `type`: String): ParagraphToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphToken]
  }
  
  extension [Self <: ParagraphToken](x: Self) {
    
    inline def setTight(value: Boolean): Self = StObject.set(x, "tight", value.asInstanceOf[js.Any])
  }
}
