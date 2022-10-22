package typingsJapgolly.typedoc.mod

import typingsJapgolly.typedoc.typedocStrings.begin
import typingsJapgolly.typedoc.typedocStrings.createDeclaration
import typingsJapgolly.typedoc.typedocStrings.createParameter
import typingsJapgolly.typedoc.typedocStrings.createSignature
import typingsJapgolly.typedoc.typedocStrings.createTypeParameter
import typingsJapgolly.typedoc.typedocStrings.end
import typingsJapgolly.typedoc.typedocStrings.resolveBegin
import typingsJapgolly.typedoc.typedocStrings.resolveEnd
import typingsJapgolly.typedoc.typedocStrings.resolveReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "Converter")
@js.native
open class Converter protected ()
  extends typingsJapgolly.typedoc.distLibConverterMod.Converter {
  def this(owner: typingsJapgolly.typedoc.distLibApplicationMod.Application) = this()
}
/* static members */
object Converter {
  
  /**
    * General events
    */
  /**
    * Triggered when the converter begins converting a project.
    * The listener will be given a {@link Context} object.
    * @event
    */
  @JSImport("typedoc", "Converter.EVENT_BEGIN")
  @js.native
  val EVENT_BEGIN: begin = js.native
  
  /**
    * Factory events
    */
  /**
    * Triggered when the converter has created a declaration reflection.
    * The listener will be given {@link Context} and a {@link DeclarationReflection}.
    * @event
    */
  @JSImport("typedoc", "Converter.EVENT_CREATE_DECLARATION")
  @js.native
  val EVENT_CREATE_DECLARATION: createDeclaration = js.native
  
  /**
    * Triggered when the converter has created a parameter reflection.
    * The listener will be given {@link Context}, {@link ParameterReflection} and a `ts.Node?`
    * @event
    */
  @JSImport("typedoc", "Converter.EVENT_CREATE_PARAMETER")
  @js.native
  val EVENT_CREATE_PARAMETER: createParameter = js.native
  
  /**
    * Triggered when the converter has created a signature reflection.
    * The listener will be given {@link Context}, {@link SignatureReflection} | {@link ProjectReflection} and
    * `ts.SignatureDeclaration | ts.IndexSignatureDeclaration | ts.JSDocSignature | undefined`
    * @event
    */
  @JSImport("typedoc", "Converter.EVENT_CREATE_SIGNATURE")
  @js.native
  val EVENT_CREATE_SIGNATURE: createSignature = js.native
  
  /**
    * Triggered when the converter has created a type parameter reflection.
    * The listener will be given {@link Context} and a {@link TypeParameterReflection}
    * @event
    */
  @JSImport("typedoc", "Converter.EVENT_CREATE_TYPE_PARAMETER")
  @js.native
  val EVENT_CREATE_TYPE_PARAMETER: createTypeParameter = js.native
  
  /**
    * Triggered when the converter has finished converting a project.
    * The listener will be given a {@link Context} object.
    * @event
    */
  @JSImport("typedoc", "Converter.EVENT_END")
  @js.native
  val EVENT_END: end = js.native
  
  /**
    * Triggered when the converter resolves a reflection.
    * The listener will be given {@link Context} and a {@link Reflection}.
    * @event
    */
  @JSImport("typedoc", "Converter.EVENT_RESOLVE")
  @js.native
  val EVENT_RESOLVE: resolveReflection = js.native
  
  /**
    * Resolve events
    */
  /**
    * Triggered when the converter begins resolving a project.
    * The listener will be given {@link Context}.
    * @event
    */
  @JSImport("typedoc", "Converter.EVENT_RESOLVE_BEGIN")
  @js.native
  val EVENT_RESOLVE_BEGIN: resolveBegin = js.native
  
  /**
    * Triggered when the converter has finished resolving a project.
    * The listener will be given {@link Context}.
    * @event
    */
  @JSImport("typedoc", "Converter.EVENT_RESOLVE_END")
  @js.native
  val EVENT_RESOLVE_END: resolveEnd = js.native
}
