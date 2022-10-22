package typingsJapgolly.glReactExpo

import japgolly.scalajs.react.Callback
import org.scalajs.dom.WebGLRenderingContext
import typingsJapgolly.glReactExpo.anon.Height
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object glviewnativeMod {
  
  @JSImport("gl-react-expo/GLViewNative", "GLViewNative")
  @js.native
  open class GLViewNative protected ()
    extends Component[GLViewNativeProps, js.Object, Any] {
    def this(props: GLViewNativeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GLViewNativeProps, context: Any) = this()
    
    var afterDraw: js.UndefOr[js.Function0[Unit]] = js.native
    
    def capture(opt: Any): js.Promise[Height] = js.native
    
    def onContextCreate(gl: WebGLRenderingContext): Unit = js.native
    
    def onRef(ref: Any): Unit = js.native
    
    var ref: js.UndefOr[Any] = js.native
  }
  
  trait GLViewNativeProps extends StObject {
    
    var children: js.UndefOr[Any] = js.undefined
    
    var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
  }
  object GLViewNativeProps {
    
    inline def apply(): GLViewNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GLViewNativeProps]
    }
    
    extension [Self <: GLViewNativeProps](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnContextCreate(value: /* gl */ WebGLRenderingContext => Callback): Self = StObject.set(x, "onContextCreate", js.Any.fromFunction1((t0: /* gl */ WebGLRenderingContext) => value(t0).runNow()))
      
      inline def setOnContextCreateUndefined: Self = StObject.set(x, "onContextCreate", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
