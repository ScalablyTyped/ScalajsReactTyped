package typingsJapgolly.markitup

import typingsJapgolly.markitup.MarkItUp.Options
import typingsJapgolly.markitup.MarkItUp.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def markItUp(): JQuery
  def markItUp(settings: Options): JQuery
  @JSName("markItUp")
  var markItUp_Original: Static
}
object JQueryStatic {
  
  inline def apply(markItUp: Static): JQueryStatic = {
    val __obj = js.Dynamic.literal(markItUp = markItUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setMarkItUp(value: Static): Self = StObject.set(x, "markItUp", value.asInstanceOf[js.Any])
  }
}
