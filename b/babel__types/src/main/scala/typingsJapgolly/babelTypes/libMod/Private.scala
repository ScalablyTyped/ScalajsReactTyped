package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.get
import typingsJapgolly.babelTypes.babelTypesStrings.method_
import typingsJapgolly.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.libMod.ClassPrivateProperty_
  - typingsJapgolly.babelTypes.libMod.ClassPrivateMethod_
  - typingsJapgolly.babelTypes.libMod.PrivateName_
*/
trait Private extends StObject
object Private {
  
  inline def ClassPrivateMethod_(
    body: BlockStatement_,
    key: PrivateName_,
    kind: get | set | method_,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty__],
    static: Boolean
  ): typingsJapgolly.babelTypes.libMod.ClassPrivateMethod_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassPrivateMethod")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ClassPrivateMethod_]
  }
  
  inline def ClassPrivateProperty_(key: PrivateName_, static: Boolean): typingsJapgolly.babelTypes.libMod.ClassPrivateProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassPrivateProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ClassPrivateProperty_]
  }
  
  inline def PrivateName_(id: Identifier_): typingsJapgolly.babelTypes.libMod.PrivateName_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateName")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.PrivateName_]
  }
}
