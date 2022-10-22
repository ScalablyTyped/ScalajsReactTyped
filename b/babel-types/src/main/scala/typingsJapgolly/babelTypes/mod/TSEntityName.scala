package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.Identifier_
  - typingsJapgolly.babelTypes.mod.TSQualifiedName
*/
trait TSEntityName extends StObject
object TSEntityName {
  
  inline def Identifier_(end: Double, loc: SourceLocation, name: String, start: Double): typingsJapgolly.babelTypes.mod.Identifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.Identifier_]
  }
  
  inline def TSQualifiedName(end: Double, left: TSEntityName, loc: SourceLocation, right: Identifier_, start: Double): typingsJapgolly.babelTypes.mod.TSQualifiedName = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSQualifiedName")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSQualifiedName]
  }
}
