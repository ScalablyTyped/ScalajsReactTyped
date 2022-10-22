package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemOption extends StObject {
  
  var item: typingsJapgolly.baseui.selectTypesMod.Option
}
object ItemOption {
  
  inline def apply(item: typingsJapgolly.baseui.selectTypesMod.Option): ItemOption = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemOption]
  }
  
  extension [Self <: ItemOption](x: Self) {
    
    inline def setItem(value: typingsJapgolly.baseui.selectTypesMod.Option): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
