package typingsJapgolly.reactNativeWindowsFs

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.reactNativeWindowsFs.anon.Typeofconstants
import typingsJapgolly.reactNativeWindowsFs.libCommonjsAsyncMethodsMod.AsyncMethods
import typingsJapgolly.reactNativeWindowsFs.libCommonjsSyncMethodsMod.ExtraMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonjsFsMod extends Shortcut {
  
  @JSImport("@react-native-windows/fs/lib-commonjs/fs", JSImport.Default)
  @js.native
  val default: ReactBativeWindowsFs = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in @react-native-windows/fs.@react-native-windows/fs/lib-commonjs/syncMethods.ImportedMethodNames ]: @react-native-windows/fs.anon.Typeoffs[P]} */ @js.native
  trait ReactBativeWindowsFs
    extends StObject
       with AsyncMethods
       with ExtraMethods {
    
    var constants: Typeofconstants = js.native
    
    /**
      * `renameSync` should not be used, as it can cause EPERM issues on Windows
      * @deprecated
      */
    def renameSync(oldPath: PathLike, newPath: PathLike): Unit = js.native
  }
  
  type _To = ReactBativeWindowsFs
  
  /* This means you don't have to write `default`, but can instead just say `libCommonjsFsMod.foo` */
  override def _to: ReactBativeWindowsFs = default
}
