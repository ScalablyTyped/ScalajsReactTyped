package typingsJapgolly.peculiarJsonSchema

import typingsJapgolly.peculiarJsonSchema.buildTypesTypesMod.IValidation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesValidationsInclusiveMod {
  
  @JSImport("@peculiar/json-schema/build/types/validations/inclusive", "InclusiveValidation")
  @js.native
  open class InclusiveValidation ()
    extends StObject
       with IValidation {
    def this(min: Double) = this()
    def this(min: Double, max: Double) = this()
    def this(min: Unit, max: Double) = this()
    
    /* private */ var max: Any = js.native
    
    /* private */ var min: Any = js.native
    
    /* CompleteClass */
    override def validate(value: Any): Unit = js.native
  }
}
