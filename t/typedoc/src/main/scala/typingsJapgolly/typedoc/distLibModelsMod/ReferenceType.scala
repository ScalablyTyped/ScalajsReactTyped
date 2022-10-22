package typingsJapgolly.typedoc.distLibModelsMod

import typingsJapgolly.typedoc.distLibConverterMod.Context
import typingsJapgolly.typescript.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models", "ReferenceType")
@js.native
/* private */ open class ReferenceType ()
  extends typingsJapgolly.typedoc.distLibModelsTypesMod.ReferenceType
/* static members */
object ReferenceType {
  
  @JSImport("typedoc/dist/lib/models", "ReferenceType")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal this is used for type parameters, which don't actually point to something */
  inline def createBrokenReference(
    name: String,
    project: typingsJapgolly.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection
  ): typingsJapgolly.typedoc.distLibModelsTypesMod.ReferenceType = (^.asInstanceOf[js.Dynamic].applyDynamic("createBrokenReference")(name.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typedoc.distLibModelsTypesMod.ReferenceType]
  
  inline def createResolvedReference(
    name: String,
    target: Double,
    project: typingsJapgolly.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection
  ): typingsJapgolly.typedoc.distLibModelsTypesMod.ReferenceType = (^.asInstanceOf[js.Dynamic].applyDynamic("createResolvedReference")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typedoc.distLibModelsTypesMod.ReferenceType]
  inline def createResolvedReference(
    name: String,
    target: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.Reflection,
    project: typingsJapgolly.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection
  ): typingsJapgolly.typedoc.distLibModelsTypesMod.ReferenceType = (^.asInstanceOf[js.Dynamic].applyDynamic("createResolvedReference")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typedoc.distLibModelsTypesMod.ReferenceType]
  
  inline def createSymbolReference(symbol: Symbol, context: Context): typingsJapgolly.typedoc.distLibModelsTypesMod.ReferenceType = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymbolReference")(symbol.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typedoc.distLibModelsTypesMod.ReferenceType]
  inline def createSymbolReference(symbol: Symbol, context: Context, name: String): typingsJapgolly.typedoc.distLibModelsTypesMod.ReferenceType = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymbolReference")(symbol.asInstanceOf[js.Any], context.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typedoc.distLibModelsTypesMod.ReferenceType]
}
