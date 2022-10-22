package typingsJapgolly.remarkable.libMod

import typingsJapgolly.remarkable.remarkableStrings.paragraph_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.remarkable.libMod._Token because Already inherited */ trait ParagraphOpenToken
  extends StObject
     with ParagraphToken {
  
  @JSName("type")
  var type_ParagraphOpenToken: paragraph_open
}
object ParagraphOpenToken {
  
  inline def apply(level: Double, tight: Boolean): ParagraphOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("paragraph_open")
    __obj.asInstanceOf[ParagraphOpenToken]
  }
  
  extension [Self <: ParagraphOpenToken](x: Self) {
    
    inline def setType(value: paragraph_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
