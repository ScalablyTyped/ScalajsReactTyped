package typingsJapgolly.html2canvas

import typingsJapgolly.html2canvas.distTypesRenderPathMod.IPath
import typingsJapgolly.html2canvas.distTypesRenderPathMod.Path
import typingsJapgolly.html2canvas.distTypesRenderPathMod.PathType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRenderVectorMod {
  
  @JSImport("html2canvas/dist/types/render/vector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("html2canvas/dist/types/render/vector", "Vector")
  @js.native
  open class Vector protected ()
    extends StObject
       with IPath
       with Path {
    def this(x: Double, y: Double) = this()
    
    /* CompleteClass */
    override def add(deltaX: Double, deltaY: Double): IPath = js.native
    
    /* CompleteClass */
    var `type`: PathType = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  
  inline def isVector(path: Path): /* is html2canvas.html2canvas/dist/types/render/vector.Vector */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVector")(path.asInstanceOf[js.Any]).asInstanceOf[/* is html2canvas.html2canvas/dist/types/render/vector.Vector */ Boolean]
}
