package typingsJapgolly.refUnionDi

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.refNapi.mod.Type
import typingsJapgolly.refUnionDi.mod.UnionType
import typingsJapgolly.refUnionDi.mod.UnionTypeObjectDefinitionBase
import typingsJapgolly.refUnionDi.mod.UnionTypeObjectDefinitionInferenceMarker
import typingsJapgolly.refUnionDi.mod.UnionTypeObjectDefinitionToUnionTypeDefinition
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call
    extends StObject
       with Instantiable0[UnionType[Any]]
       with Instantiable1[
          (/* fields */ Record[String, String | Type[Any]]) | UnionTypeObjectDefinitionBase | UnionTypeObjectDefinitionInferenceMarker, 
          UnionType[
            Any | (UnionTypeObjectDefinitionToUnionTypeDefinition[UnionTypeObjectDefinitionBase | UnionTypeObjectDefinitionInferenceMarker])
          ]
        ] {
    
    def apply(): UnionType[Any] = js.native
    def apply(fields: Record[String, String | Type[Any]]): UnionType[Any] = js.native
    def apply[TDefinition /* <: UnionTypeObjectDefinitionBase | UnionTypeObjectDefinitionInferenceMarker */](fields: TDefinition): UnionType[UnionTypeObjectDefinitionToUnionTypeDefinition[TDefinition]] = js.native
  }
}
