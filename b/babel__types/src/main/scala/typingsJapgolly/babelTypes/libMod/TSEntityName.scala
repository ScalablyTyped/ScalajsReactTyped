package typingsJapgolly.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.libMod.Identifier_
  - typingsJapgolly.babelTypes.libMod.TSQualifiedName__
*/
trait TSEntityName extends StObject
object TSEntityName {
  
  inline def Identifier_(name: String): typingsJapgolly.babelTypes.libMod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.Identifier_]
  }
  
  inline def TSQualifiedName__(left: TSEntityName, right: Identifier_): typingsJapgolly.babelTypes.libMod.TSQualifiedName__ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSQualifiedName")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSQualifiedName__]
  }
}
