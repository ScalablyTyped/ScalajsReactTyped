package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcCore.typesMod.TsUnionType
  - typingsJapgolly.swcCore.typesMod.TsIntersectionType
*/
trait TsUnionOrIntersectionType
  extends StObject
     with TsType
object TsUnionOrIntersectionType {
  
  inline def TsIntersectionType(span: Span, types: js.Array[TsType]): typingsJapgolly.swcCore.typesMod.TsIntersectionType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsIntersectionType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsIntersectionType]
  }
  
  inline def TsUnionType(span: Span, types: js.Array[TsType]): typingsJapgolly.swcCore.typesMod.TsUnionType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsUnionType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsUnionType]
  }
}
