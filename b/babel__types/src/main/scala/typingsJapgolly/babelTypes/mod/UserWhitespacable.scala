package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.get
import typingsJapgolly.babelTypes.babelTypesStrings.init
import typingsJapgolly.babelTypes.babelTypesStrings.method_
import typingsJapgolly.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.ObjectMethod_
  - typingsJapgolly.babelTypes.mod.ObjectProperty_
  - typingsJapgolly.babelTypes.mod.ObjectTypeInternalSlot_
  - typingsJapgolly.babelTypes.mod.ObjectTypeCallProperty_
  - typingsJapgolly.babelTypes.mod.ObjectTypeIndexer_
  - typingsJapgolly.babelTypes.mod.ObjectTypeProperty_
  - typingsJapgolly.babelTypes.mod.ObjectTypeSpreadProperty_
*/
trait UserWhitespacable
  extends StObject
     with _Node
object UserWhitespacable {
  
  inline def ObjectMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_,
    kind: method_ | get | set,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typingsJapgolly.babelTypes.mod.ObjectMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ObjectMethod")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ObjectMethod_]
  }
  
  inline def ObjectProperty_(
    computed: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | DecimalLiteral_ | PrivateName_,
    shorthand: Boolean,
    value: Expression | PatternLike
  ): typingsJapgolly.babelTypes.mod.ObjectProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ObjectProperty_]
  }
  
  inline def ObjectTypeCallProperty_(static: Boolean, value: FlowType): typingsJapgolly.babelTypes.mod.ObjectTypeCallProperty_ = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectTypeCallProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ObjectTypeCallProperty_]
  }
  
  inline def ObjectTypeIndexer_(key: FlowType, static: Boolean, value: FlowType): typingsJapgolly.babelTypes.mod.ObjectTypeIndexer_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = null, id = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, variance = null)
    __obj.updateDynamic("type")("ObjectTypeIndexer")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ObjectTypeIndexer_]
  }
  
  inline def ObjectTypeInternalSlot_(id: Identifier_, method: Boolean, optional: Boolean, static: Boolean, value: FlowType): typingsJapgolly.babelTypes.mod.ObjectTypeInternalSlot_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectTypeInternalSlot")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ObjectTypeInternalSlot_]
  }
  
  inline def ObjectTypeProperty_(
    key: Identifier_ | StringLiteral_,
    kind: init | get | set,
    method: Boolean,
    optional: Boolean,
    proto: Boolean,
    static: Boolean,
    value: FlowType
  ): typingsJapgolly.babelTypes.mod.ObjectTypeProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, variance = null)
    __obj.updateDynamic("type")("ObjectTypeProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ObjectTypeProperty_]
  }
  
  inline def ObjectTypeSpreadProperty_(argument: FlowType): typingsJapgolly.babelTypes.mod.ObjectTypeSpreadProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectTypeSpreadProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ObjectTypeSpreadProperty_]
  }
}
