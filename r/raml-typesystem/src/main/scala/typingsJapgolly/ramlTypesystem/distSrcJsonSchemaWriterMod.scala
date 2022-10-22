package typingsJapgolly.ramlTypesystem

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ramlTypesystem.distSrcTypesystemMod.AbstractType
import typingsJapgolly.ramlTypesystem.ramlTypesystemStrings.`object`
import typingsJapgolly.ramlTypesystem.ramlTypesystemStrings.array
import typingsJapgolly.ramlTypesystem.ramlTypesystemStrings.boolean
import typingsJapgolly.ramlTypesystem.ramlTypesystemStrings.number
import typingsJapgolly.ramlTypesystem.ramlTypesystemStrings.string
import typingsJapgolly.ramlTypesystem.ramlTypesystemStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcJsonSchemaWriterMod {
  
  @JSImport("raml-typesystem/dist/src/jsonSchemaWriter", "SchemaWriter")
  @js.native
  open class SchemaWriter () extends StObject {
    
    def generateRef(t: AbstractType): Any = js.native
    
    def getResult(): Any = js.native
    
    def getType(t: AbstractType): `object` | unknown | string | number | boolean | array = js.native
    
    var map: StringDictionary[String] = js.native
    
    def options(allOptions: js.Array[AbstractType], noBuiltIn: Boolean): js.Array[Any] = js.native
    
    var root: Any = js.native
    
    def store(t: AbstractType): Any = js.native
  }
}
