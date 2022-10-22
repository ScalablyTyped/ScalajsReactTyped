package typingsJapgolly.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.libMod.ObjectProperty_
  - typingsJapgolly.babelTypes.libMod.ClassProperty_
  - typingsJapgolly.babelTypes.libMod.ClassAccessorProperty_
  - typingsJapgolly.babelTypes.libMod.ClassPrivateProperty_
*/
trait Property extends StObject
object Property {
  
  inline def ClassAccessorProperty_(
    computed: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression | PrivateName_,
    static: Boolean
  ): typingsJapgolly.babelTypes.libMod.ClassAccessorProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassAccessorProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ClassAccessorProperty_]
  }
  
  inline def ClassPrivateProperty_(key: PrivateName_, static: Boolean): typingsJapgolly.babelTypes.libMod.ClassPrivateProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassPrivateProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ClassPrivateProperty_]
  }
  
  inline def ClassProperty_(
    computed: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression,
    static: Boolean
  ): typingsJapgolly.babelTypes.libMod.ClassProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ClassProperty_]
  }
  
  inline def ObjectProperty_(
    computed: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | DecimalLiteral_ | PrivateName_,
    shorthand: Boolean,
    value: Expression | PatternLike
  ): typingsJapgolly.babelTypes.libMod.ObjectProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ObjectProperty_]
  }
}
