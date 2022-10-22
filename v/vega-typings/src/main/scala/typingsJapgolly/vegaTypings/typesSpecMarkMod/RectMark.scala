package typingsJapgolly.vegaTypings.typesSpecMarkMod

import typingsJapgolly.vegaTypings.typesSpecEncodeMod.Encodable
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.RectEncodeEntry
import typingsJapgolly.vegaTypings.vegaTypingsStrings.rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectMark
  extends StObject
     with BaseMark
     with Encodable[RectEncodeEntry]
     with Mark {
  
  var `type`: rect
}
object RectMark {
  
  inline def apply(): RectMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("rect")
    __obj.asInstanceOf[RectMark]
  }
  
  extension [Self <: RectMark](x: Self) {
    
    inline def setType(value: rect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
