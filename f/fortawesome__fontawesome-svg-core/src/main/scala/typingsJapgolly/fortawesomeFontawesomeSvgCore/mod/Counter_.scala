package typingsJapgolly.fortawesomeFontawesomeSvgCore.mod

import org.scalajs.dom.HTMLCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Counter_
  extends StObject
     with FontawesomeObject {
  
  val `type`: typingsJapgolly.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.counter
}
object Counter_ {
  
  inline def apply(`abstract`: js.Array[AbstractElement], html: js.Array[String], node: HTMLCollection[Any]): Counter_ = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("counter")
    __obj.asInstanceOf[Counter_]
  }
  
  extension [Self <: Counter_](x: Self) {
    
    inline def setType(value: typingsJapgolly.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.counter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
