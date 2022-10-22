package typingsJapgolly.glReactExpo

import japgolly.scalajs.react.Callback
import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.glReactExpo.glviewnativeMod.GLViewNative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gl-react-expo", "Surface")
  @js.native
  open class Surface protected ()
    extends typingsJapgolly.glReact.mod.Surface[GLViewNative] {
    def this(props: typingsJapgolly.glReact.mod.SurfaceProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typingsJapgolly.glReact.mod.SurfaceProps, context: Any) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.glReactExpo.glviewnativeMod.GLViewNativeProps because var conflicts: children, style. Inlined onContextCreate */ trait SurfaceProps
    extends StObject
       with typingsJapgolly.glReact.mod.SurfaceProps {
    
    var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.undefined
  }
  object SurfaceProps {
    
    inline def apply(): SurfaceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SurfaceProps]
    }
    
    extension [Self <: SurfaceProps](x: Self) {
      
      inline def setOnContextCreate(value: /* gl */ WebGLRenderingContext => Callback): Self = StObject.set(x, "onContextCreate", js.Any.fromFunction1((t0: /* gl */ WebGLRenderingContext) => value(t0).runNow()))
      
      inline def setOnContextCreateUndefined: Self = StObject.set(x, "onContextCreate", js.undefined)
    }
  }
}
