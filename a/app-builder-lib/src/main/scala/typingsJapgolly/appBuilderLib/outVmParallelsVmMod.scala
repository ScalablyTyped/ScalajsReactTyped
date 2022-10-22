package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.appBuilderLibStrings.`win-10`
import typingsJapgolly.appBuilderLib.appBuilderLibStrings.`win-11`
import typingsJapgolly.appBuilderLib.appBuilderLibStrings.elementary
import typingsJapgolly.appBuilderLib.appBuilderLibStrings.running
import typingsJapgolly.appBuilderLib.appBuilderLibStrings.stopped
import typingsJapgolly.appBuilderLib.appBuilderLibStrings.suspended
import typingsJapgolly.appBuilderLib.appBuilderLibStrings.ubuntu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outVmParallelsVmMod {
  
  @JSImport("app-builder-lib/out/vm/ParallelsVm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def macPathToParallelsWindows(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("macPathToParallelsWindows")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait ParallelsVm extends StObject {
    
    var id: String
    
    var name: String
    
    var os: `win-10` | `win-11` | ubuntu | elementary
    
    var state: running | suspended | stopped
  }
  object ParallelsVm {
    
    inline def apply(
      id: String,
      name: String,
      os: `win-10` | `win-11` | ubuntu | elementary,
      state: running | suspended | stopped
    ): ParallelsVm = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParallelsVm]
    }
    
    extension [Self <: ParallelsVm](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOs(value: `win-10` | `win-11` | ubuntu | elementary): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setState(value: running | suspended | stopped): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
