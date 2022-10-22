package typingsJapgolly.ngtoolsWebpack

import typingsJapgolly.ngtoolsWebpack.anon.EmitClassMetadata
import typingsJapgolly.ngtoolsWebpack.anon.InlineStyleFileExtension
import typingsJapgolly.ngtoolsWebpack.anon.TypeofimportedCompilerC
import typingsJapgolly.typescript.mod.BuilderProgram
import typingsJapgolly.typescript.mod.CustomTransformers
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TransformerFactory
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIvyTransformationMod {
  
  @JSImport("@ngtools/webpack/src/ivy/transformation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAotTransformers(builder: BuilderProgram, options: EmitClassMetadata): CustomTransformers = (^.asInstanceOf[js.Dynamic].applyDynamic("createAotTransformers")(builder.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CustomTransformers]
  
  inline def createJitTransformers(builder: BuilderProgram, compilerCli: TypeofimportedCompilerC, options: InlineStyleFileExtension): CustomTransformers = (^.asInstanceOf[js.Dynamic].applyDynamic("createJitTransformers")(builder.asInstanceOf[js.Any], compilerCli.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CustomTransformers]
  
  inline def mergeTransformers(first: CustomTransformers, second: CustomTransformers): CustomTransformers = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeTransformers")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[CustomTransformers]
  
  inline def replaceBootstrap(getTypeChecker: js.Function0[TypeChecker]): TransformerFactory[SourceFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceBootstrap")(getTypeChecker.asInstanceOf[js.Any]).asInstanceOf[TransformerFactory[SourceFile]]
}
