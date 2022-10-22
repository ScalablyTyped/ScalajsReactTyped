package typingsJapgolly.ngPackagr.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.angularCompilerCli.ngccSrcNgccOptionsMod.AsyncNgccOptions
import typingsJapgolly.angularCompilerCli.ngccSrcNgccOptionsMod.SyncNgccOptions
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedNgcc extends StObject {
  
  var ConsoleLogger: Instantiable1[/* level */ LogLevel, typingsJapgolly.angularCompilerCli.ngccMod.ConsoleLogger] = js.native
  
  def clearTsConfigCache(): Unit = js.native
  
  val containingDirPath: String = js.native
  
  val ngccMainFilePath: String = js.native
  
  def process(options: AsyncNgccOptions): /* import warning: importer.ImportType#apply Failed type conversion: @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.AsyncNgccOptions extends @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.AsyncNgccOptions ? std.Promise<void> : void */ js.Any = js.native
  def process(options: SyncNgccOptions): /* import warning: importer.ImportType#apply Failed type conversion: @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.SyncNgccOptions extends @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.AsyncNgccOptions ? std.Promise<void> : void */ js.Any = js.native
}
