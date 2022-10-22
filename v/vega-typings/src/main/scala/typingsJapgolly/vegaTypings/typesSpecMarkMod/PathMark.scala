package typingsJapgolly.vegaTypings.typesSpecMarkMod

import typingsJapgolly.vegaTypings.typesSpecEncodeMod.Encodable
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.PathEncodeEntry
import typingsJapgolly.vegaTypings.vegaTypingsStrings.path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMark
  extends StObject
     with BaseMark
     with Encodable[PathEncodeEntry]
     with Mark {
  
  var `type`: path
}
object PathMark {
  
  inline def apply(): PathMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("path")
    __obj.asInstanceOf[PathMark]
  }
  
  extension [Self <: PathMark](x: Self) {
    
    inline def setType(value: path): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
