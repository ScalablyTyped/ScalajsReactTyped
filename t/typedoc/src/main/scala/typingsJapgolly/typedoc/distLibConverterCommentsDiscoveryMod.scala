package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import typingsJapgolly.typedoc.distLibUtilsMod.Logger
import typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.CommentStyle
import typingsJapgolly.typescript.mod.CommentRange
import typingsJapgolly.typescript.mod.JSDocSignature
import typingsJapgolly.typescript.mod.SignatureDeclaration
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterCommentsDiscoveryMod {
  
  @JSImport("typedoc/dist/lib/converter/comments/discovery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def discoverComment(symbol: Symbol, kind: ReflectionKind, logger: Logger, commentStyle: CommentStyle): js.UndefOr[js.Tuple2[SourceFile, js.Array[CommentRange]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("discoverComment")(symbol.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], commentStyle.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[SourceFile, js.Array[CommentRange]]]]
  
  inline def discoverSignatureComment(declaration: JSDocSignature, commentStyle: CommentStyle): js.UndefOr[js.Tuple2[SourceFile, js.Array[CommentRange]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("discoverSignatureComment")(declaration.asInstanceOf[js.Any], commentStyle.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[SourceFile, js.Array[CommentRange]]]]
  inline def discoverSignatureComment(declaration: SignatureDeclaration, commentStyle: CommentStyle): js.UndefOr[js.Tuple2[SourceFile, js.Array[CommentRange]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("discoverSignatureComment")(declaration.asInstanceOf[js.Any], commentStyle.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[SourceFile, js.Array[CommentRange]]]]
}
