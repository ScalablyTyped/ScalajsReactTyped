package typingsJapgolly.ajv

import typingsJapgolly.ajv.ajvStrings.`enum`
import typingsJapgolly.ajv.ajvStrings.`type`
import typingsJapgolly.ajv.ajvStrings.discriminator
import typingsJapgolly.ajv.ajvStrings.elements
import typingsJapgolly.ajv.ajvStrings.optionalProperties
import typingsJapgolly.ajv.ajvStrings.properties
import typingsJapgolly.ajv.ajvStrings.ref
import typingsJapgolly.ajv.ajvStrings.values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileJtdTypesMod {
  
  @JSImport("ajv/dist/compile/jtd/types", "jtdForms")
  @js.native
  val jtdForms: js.Tuple8[elements, values, discriminator, properties, optionalProperties, `enum`, `type`, ref] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ajv.ajvStrings.elements
    - typingsJapgolly.ajv.ajvStrings.values
    - typingsJapgolly.ajv.ajvStrings.discriminator
    - typingsJapgolly.ajv.ajvStrings.properties
    - typingsJapgolly.ajv.ajvStrings.optionalProperties
    - typingsJapgolly.ajv.ajvStrings.`enum`
    - typingsJapgolly.ajv.ajvStrings.`type`
    - typingsJapgolly.ajv.ajvStrings.ref
  */
  trait JTDForm extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Ref in string ]:? ajv.ajv/dist/types.SchemaObject}
    }}}
    */
  @js.native
  trait SchemaObjectMap extends StObject
}
