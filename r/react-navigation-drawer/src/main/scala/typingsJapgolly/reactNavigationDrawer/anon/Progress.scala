package typingsJapgolly.reactNavigationDrawer.anon

import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Progress extends StObject {
  
  var progress: Node
}
object Progress {
  
  inline def apply(progress: Node): Progress = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  
  extension [Self <: Progress](x: Self) {
    
    inline def setProgress(value: Node): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}
