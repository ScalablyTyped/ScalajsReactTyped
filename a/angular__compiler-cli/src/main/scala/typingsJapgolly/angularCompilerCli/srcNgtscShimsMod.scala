package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.anon.PickCompilerHostgetSource
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscImportsSrcCoreMod.ImportRewriter
import typingsJapgolly.angularCompilerCli.srcNgtscShimsApiMod.FactoryInfo
import typingsJapgolly.angularCompilerCli.srcNgtscShimsApiMod.PerFileShimGenerator
import typingsJapgolly.angularCompilerCli.srcNgtscShimsApiMod.TopLevelShimGenerator
import typingsJapgolly.angularCompilerCli.srcNgtscShimsSrcExpandoMod.NgExtensionData
import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TransformerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscShimsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/shims", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/shims", "FactoryGenerator")
  @js.native
  open class FactoryGenerator ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscShimsSrcFactoryGeneratorMod.FactoryGenerator
  
  @JSImport("@angular/compiler-cli/src/ngtsc/shims", "ShimAdapter")
  @js.native
  open class ShimAdapter protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscShimsSrcAdapterMod.ShimAdapter {
    def this(
      delegate: PickCompilerHostgetSource,
      tsRootFiles: js.Array[AbsoluteFsPath],
      topLevelGenerators: js.Array[TopLevelShimGenerator],
      perFileGenerators: js.Array[PerFileShimGenerator]
    ) = this()
    def this(
      delegate: PickCompilerHostgetSource,
      tsRootFiles: js.Array[AbsoluteFsPath],
      topLevelGenerators: js.Array[TopLevelShimGenerator],
      perFileGenerators: js.Array[PerFileShimGenerator],
      oldProgram: Program
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/shims", "ShimReferenceTagger")
  @js.native
  open class ShimReferenceTagger protected ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscShimsSrcReferenceTaggerMod.ShimReferenceTagger {
    def this(shimExtensions: js.Array[String]) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/shims", "SummaryGenerator")
  @js.native
  open class SummaryGenerator ()
    extends typingsJapgolly.angularCompilerCli.srcNgtscShimsSrcSummaryGeneratorMod.SummaryGenerator
  
  inline def copyFileShimData(from: SourceFile, to: SourceFile): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileShimData")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def generatedFactoryTransform(factoryMap: Map[String, FactoryInfo], importRewriter: ImportRewriter): TransformerFactory[SourceFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("generatedFactoryTransform")(factoryMap.asInstanceOf[js.Any], importRewriter.asInstanceOf[js.Any])).asInstanceOf[TransformerFactory[SourceFile]]
  
  inline def isShim(sf: SourceFile): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isShim")(sf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def retagAllTsFiles(program: Program): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("retagAllTsFiles")(program.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def retagTsFile(sf: SourceFile): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("retagTsFile")(sf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sfExtensionData(sf: SourceFile): NgExtensionData = ^.asInstanceOf[js.Dynamic].applyDynamic("sfExtensionData")(sf.asInstanceOf[js.Any]).asInstanceOf[NgExtensionData]
  
  inline def untagAllTsFiles(program: Program): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("untagAllTsFiles")(program.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def untagTsFile(sf: SourceFile): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("untagTsFile")(sf.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
