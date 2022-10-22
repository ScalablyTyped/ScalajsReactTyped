package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.server

import typingsJapgolly.schematicsAngular.schematicsAngularStrings.discover
import typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.CompilerOptions
import typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.Path
import typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.SortedReadonlyArray
import typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TypeAcquisition
import typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.WatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoverTypings
  extends StObject
     with TypingInstallerRequestWithProjectName {
  
  val cachePath: js.UndefOr[String] = js.undefined
  
  val compilerOptions: CompilerOptions
  
  val fileNames: js.Array[String]
  
  val kind: discover
  
  val projectRootPath: Path
  
  val typeAcquisition: TypeAcquisition
  
  val unresolvedImports: SortedReadonlyArray[String]
  
  val watchOptions: js.UndefOr[WatchOptions] = js.undefined
}
object DiscoverTypings {
  
  inline def apply(
    compilerOptions: CompilerOptions,
    fileNames: js.Array[String],
    projectName: String,
    projectRootPath: Path,
    typeAcquisition: TypeAcquisition,
    unresolvedImports: SortedReadonlyArray[String]
  ): DiscoverTypings = {
    val __obj = js.Dynamic.literal(compilerOptions = compilerOptions.asInstanceOf[js.Any], fileNames = fileNames.asInstanceOf[js.Any], kind = "discover", projectName = projectName.asInstanceOf[js.Any], projectRootPath = projectRootPath.asInstanceOf[js.Any], typeAcquisition = typeAcquisition.asInstanceOf[js.Any], unresolvedImports = unresolvedImports.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoverTypings]
  }
  
  extension [Self <: DiscoverTypings](x: Self) {
    
    inline def setCachePath(value: String): Self = StObject.set(x, "cachePath", value.asInstanceOf[js.Any])
    
    inline def setCachePathUndefined: Self = StObject.set(x, "cachePath", js.undefined)
    
    inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setFileNames(value: js.Array[String]): Self = StObject.set(x, "fileNames", value.asInstanceOf[js.Any])
    
    inline def setFileNamesVarargs(value: String*): Self = StObject.set(x, "fileNames", js.Array(value*))
    
    inline def setKind(value: discover): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setProjectRootPath(value: Path): Self = StObject.set(x, "projectRootPath", value.asInstanceOf[js.Any])
    
    inline def setTypeAcquisition(value: TypeAcquisition): Self = StObject.set(x, "typeAcquisition", value.asInstanceOf[js.Any])
    
    inline def setUnresolvedImports(value: SortedReadonlyArray[String]): Self = StObject.set(x, "unresolvedImports", value.asInstanceOf[js.Any])
    
    inline def setWatchOptions(value: WatchOptions): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
    
    inline def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
  }
}
