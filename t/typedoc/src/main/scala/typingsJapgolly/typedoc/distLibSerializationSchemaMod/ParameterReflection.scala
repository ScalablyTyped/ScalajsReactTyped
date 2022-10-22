package typingsJapgolly.typedoc.distLibSerializationSchemaMod

import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Reflection */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ParameterReflection, 'type' | 'defaultValue'> */
trait ParameterReflection extends StObject {
  
  var comment: ToSerialized[js.UndefOr[typingsJapgolly.typedoc.distLibModelsCommentsCommentMod.Comment]]
  
  var defaultValue: ToSerialized[js.UndefOr[String]]
  
  var flags: ReflectionFlags
  
  var id: ToSerialized[Double]
  
  var kind: ToSerialized[ReflectionKind]
  
  var kindString: ToSerialized[js.UndefOr[String]]
  
  var name: ToSerialized[String]
  
  /** Will not be present if name === originalName */
  var originalName: js.UndefOr[String] = js.undefined
  
  var `type`: ToSerialized[js.UndefOr[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]]
}
object ParameterReflection {
  
  inline def apply(
    comment: ToSerialized[js.UndefOr[typingsJapgolly.typedoc.distLibModelsCommentsCommentMod.Comment]],
    defaultValue: ToSerialized[js.UndefOr[String]],
    flags: ReflectionFlags,
    id: ToSerialized[Double],
    kind: ToSerialized[ReflectionKind],
    kindString: ToSerialized[js.UndefOr[String]],
    name: ToSerialized[String],
    `type`: ToSerialized[js.UndefOr[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]]
  ): ParameterReflection = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindString = kindString.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterReflection]
  }
  
  extension [Self <: ParameterReflection](x: Self) {
    
    inline def setComment(value: ToSerialized[js.UndefOr[typingsJapgolly.typedoc.distLibModelsCommentsCommentMod.Comment]]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: ToSerialized[js.UndefOr[String]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: ReflectionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setId(value: ToSerialized[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ToSerialized[ReflectionKind]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindString(value: ToSerialized[js.UndefOr[String]]): Self = StObject.set(x, "kindString", value.asInstanceOf[js.Any])
    
    inline def setName(value: ToSerialized[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    inline def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    inline def setType(value: ToSerialized[js.UndefOr[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
