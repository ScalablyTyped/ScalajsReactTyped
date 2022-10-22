package typingsJapgolly.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ReferenceType, 'type' | 'name' | 'typeArguments' | 'package' | 'externalUrl'> */
trait ReferenceType extends StObject {
  
  @JSName("package")
  var _package: ToSerialized[js.UndefOr[String]]
  
  var externalUrl: ToSerialized[js.UndefOr[String]]
  
  var id: js.UndefOr[Double] = js.undefined
  
  var name: ToSerialized[String]
  
  var qualifiedName: js.UndefOr[String] = js.undefined
  
  var `type`: ToSerialized[/* "reference" */ String]
  
  var typeArguments: ToSerialized[js.UndefOr[js.Array[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]]]
}
object ReferenceType {
  
  inline def apply(
    _package: ToSerialized[js.UndefOr[String]],
    externalUrl: ToSerialized[js.UndefOr[String]],
    name: ToSerialized[String],
    `type`: ToSerialized[/* "reference" */ String],
    typeArguments: ToSerialized[js.UndefOr[js.Array[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]]]
  ): ReferenceType = {
    val __obj = js.Dynamic.literal(externalUrl = externalUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeArguments = typeArguments.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceType]
  }
  
  extension [Self <: ReferenceType](x: Self) {
    
    inline def setExternalUrl(value: ToSerialized[js.UndefOr[String]]): Self = StObject.set(x, "externalUrl", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: ToSerialized[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQualifiedName(value: String): Self = StObject.set(x, "qualifiedName", value.asInstanceOf[js.Any])
    
    inline def setQualifiedNameUndefined: Self = StObject.set(x, "qualifiedName", js.undefined)
    
    inline def setType(value: ToSerialized[/* "reference" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArguments(value: ToSerialized[js.UndefOr[js.Array[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]]]): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    inline def set_package(value: ToSerialized[js.UndefOr[String]]): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
