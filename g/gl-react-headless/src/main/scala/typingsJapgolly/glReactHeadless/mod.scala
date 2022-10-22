package typingsJapgolly.glReactHeadless

import typingsJapgolly.glReactHeadless.glviewheadlessMod.GLViewHeadless
import typingsJapgolly.glReactHeadless.glviewheadlessMod.GLViewHeadlessProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gl-react-headless", "Surface")
  @js.native
  open class Surface protected ()
    extends typingsJapgolly.glReact.mod.Surface[GLViewHeadless] {
    def this(props: typingsJapgolly.glReact.mod.SurfaceProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.glReact.mod.SurfaceProps, context: Any) = this()
  }
  
  trait SurfaceProps
    extends StObject
       with typingsJapgolly.glReact.mod.SurfaceProps
       with GLViewHeadlessProps
  object SurfaceProps {
    
    inline def apply(height: Double, width: Double): SurfaceProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SurfaceProps]
    }
  }
}
