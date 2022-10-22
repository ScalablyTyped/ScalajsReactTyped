package typingsJapgolly.ajv

import typingsJapgolly.ajv.ajvStrings.discriminator
import typingsJapgolly.ajv.anon.Error
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesDiscriminatorTypesMod {
  
  @js.native
  sealed trait DiscrError extends StObject
  @JSImport("ajv/dist/vocabularies/discriminator/types", "DiscrError")
  @js.native
  object DiscrError extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DiscrError & String] = js.native
    
    @js.native
    sealed trait Mapping
      extends StObject
         with DiscrError
    /* "mapping" */ val Mapping: typingsJapgolly.ajv.distVocabulariesDiscriminatorTypesMod.DiscrError.Mapping & String = js.native
    
    @js.native
    sealed trait Tag
      extends StObject
         with DiscrError
    /* "tag" */ val Tag: typingsJapgolly.ajv.distVocabulariesDiscriminatorTypesMod.DiscrError.Tag & String = js.native
  }
  
  type DiscrErrorObj[E /* <: DiscrError */] = ErrorObject[discriminator, Error[E], String]
}
