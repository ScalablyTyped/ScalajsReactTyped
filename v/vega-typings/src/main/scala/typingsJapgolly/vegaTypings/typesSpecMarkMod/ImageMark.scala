package typingsJapgolly.vegaTypings.typesSpecMarkMod

import typingsJapgolly.vegaTypings.typesSpecEncodeMod.Encodable
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.ImageEncodeEntry
import typingsJapgolly.vegaTypings.vegaTypingsStrings.image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageMark
  extends StObject
     with BaseMark
     with Encodable[ImageEncodeEntry]
     with Mark {
  
  var `type`: image
}
object ImageMark {
  
  inline def apply(): ImageMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[ImageMark]
  }
  
  extension [Self <: ImageMark](x: Self) {
    
    inline def setType(value: image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
