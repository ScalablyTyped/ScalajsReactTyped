package typingsJapgolly.ngPackagr

import typingsJapgolly.ngPackagr.libCommandsCommandMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommandsBuildDotcommandMod {
  
  @JSImport("ng-packagr/lib/commands/build.command", "build")
  @js.native
  val build: Command[CliArguments, Unit] = js.native
  
  trait CliArguments extends StObject {
    
    /** Path to a tsconfig file. */
    var config: js.UndefOr[String] = js.undefined
    
    /** Path to the project file 'package.json', 'ng-package.json', or 'ng-package.js'. */
    var project: String
    
    /** Whether or not ng-packagr will watch for file changes and perform an incremental build. */
    var watch: js.UndefOr[Boolean] = js.undefined
  }
  object CliArguments {
    
    inline def apply(project: String): CliArguments = {
      val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[CliArguments]
    }
    
    extension [Self <: CliArguments](x: Self) {
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
}
