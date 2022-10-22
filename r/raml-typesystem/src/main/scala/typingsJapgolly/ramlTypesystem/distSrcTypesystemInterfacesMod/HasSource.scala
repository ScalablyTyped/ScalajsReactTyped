package typingsJapgolly.ramlTypesystem.distSrcTypesystemInterfacesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasSource extends StObject {
  
  def sourceMap(): ElementSourceInfo
}
object HasSource {
  
  inline def apply(sourceMap: CallbackTo[ElementSourceInfo]): HasSource = {
    val __obj = js.Dynamic.literal(sourceMap = sourceMap.toJsFn)
    __obj.asInstanceOf[HasSource]
  }
  
  extension [Self <: HasSource](x: Self) {
    
    inline def setSourceMap(value: CallbackTo[ElementSourceInfo]): Self = StObject.set(x, "sourceMap", value.toJsFn)
  }
}
