package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.distLibApplicationMod.Application
import typingsJapgolly.typedoc.distLibModelsMod.ProjectReflection
import typingsJapgolly.typedoc.distLibModelsMod.Reflection
import typingsJapgolly.typedoc.typedocStrings.begin
import typingsJapgolly.typedoc.typedocStrings.createDeclaration
import typingsJapgolly.typedoc.typedocStrings.createParameter
import typingsJapgolly.typedoc.typedocStrings.createSignature
import typingsJapgolly.typedoc.typedocStrings.createTypeParameter
import typingsJapgolly.typedoc.typedocStrings.end
import typingsJapgolly.typedoc.typedocStrings.resolveBegin
import typingsJapgolly.typedoc.typedocStrings.resolveEnd
import typingsJapgolly.typedoc.typedocStrings.resolveReflection
import typingsJapgolly.typescript.mod.Declaration
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterMod {
  
  @JSImport("typedoc/dist/lib/converter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/converter", "Context")
  @js.native
  open class Context protected ()
    extends typingsJapgolly.typedoc.distLibConverterContextMod.Context {
    /**
      * Create a new Context instance.
      *
      * @param converter  The converter instance that has created the context.
      * @internal
      */
    def this(
      converter: typingsJapgolly.typedoc.distLibConverterConverterMod.Converter,
      programs: js.Array[Program],
      project: ProjectReflection
    ) = this()
    def this(
      converter: typingsJapgolly.typedoc.distLibConverterConverterMod.Converter,
      programs: js.Array[Program],
      project: ProjectReflection,
      scope: Reflection
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/converter", "Converter")
  @js.native
  open class Converter protected ()
    extends typingsJapgolly.typedoc.distLibConverterConverterMod.Converter {
    def this(owner: Application) = this()
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
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_BEGIN")
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
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_CREATE_DECLARATION")
    @js.native
    val EVENT_CREATE_DECLARATION: createDeclaration = js.native
    
    /**
      * Triggered when the converter has created a parameter reflection.
      * The listener will be given {@link Context}, {@link ParameterReflection} and a `ts.Node?`
      * @event
      */
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_CREATE_PARAMETER")
    @js.native
    val EVENT_CREATE_PARAMETER: createParameter = js.native
    
    /**
      * Triggered when the converter has created a signature reflection.
      * The listener will be given {@link Context}, {@link SignatureReflection} | {@link ProjectReflection} and
      * `ts.SignatureDeclaration | ts.IndexSignatureDeclaration | ts.JSDocSignature | undefined`
      * @event
      */
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_CREATE_SIGNATURE")
    @js.native
    val EVENT_CREATE_SIGNATURE: createSignature = js.native
    
    /**
      * Triggered when the converter has created a type parameter reflection.
      * The listener will be given {@link Context} and a {@link TypeParameterReflection}
      * @event
      */
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_CREATE_TYPE_PARAMETER")
    @js.native
    val EVENT_CREATE_TYPE_PARAMETER: createTypeParameter = js.native
    
    /**
      * Triggered when the converter has finished converting a project.
      * The listener will be given a {@link Context} object.
      * @event
      */
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_END")
    @js.native
    val EVENT_END: end = js.native
    
    /**
      * Triggered when the converter resolves a reflection.
      * The listener will be given {@link Context} and a {@link Reflection}.
      * @event
      */
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_RESOLVE")
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
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_RESOLVE_BEGIN")
    @js.native
    val EVENT_RESOLVE_BEGIN: resolveBegin = js.native
    
    /**
      * Triggered when the converter has finished resolving a project.
      * The listener will be given {@link Context}.
      * @event
      */
    @JSImport("typedoc/dist/lib/converter", "Converter.EVENT_RESOLVE_END")
    @js.native
    val EVENT_RESOLVE_END: resolveEnd = js.native
  }
  
  inline def convertDefaultValue(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDefaultValue")().asInstanceOf[js.UndefOr[String]]
  inline def convertDefaultValue(node: Declaration): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDefaultValue")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def convertExpression(expression: Expression): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertExpression")(expression.asInstanceOf[js.Any]).asInstanceOf[String]
}
