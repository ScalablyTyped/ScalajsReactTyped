package typingsJapgolly.reactWeui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Gallery {
  
  inline def apply(props: Any): Any = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("react-weui", "Gallery")
  @js.native
  val ^ : js.Any = js.native
  
  object defaultProps {
    
    @JSImport("react-weui", "Gallery.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-weui", "Gallery.defaultProps.show")
    @js.native
    def show: Any = js.native
    inline def show_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
    
    @JSImport("react-weui", "Gallery.defaultProps.src")
    @js.native
    def src: String = js.native
    inline def src_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("src")(x.asInstanceOf[js.Any])
  }
  
  object propTypes {
    
    object show {
      
      inline def apply(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any): Any = (^.asInstanceOf[js.Dynamic].apply(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("react-weui", "Gallery.propTypes.show")
      @js.native
      val ^ : js.Any = js.native
      
      inline def isRequired(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
    
    object src {
      
      inline def apply(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any): Any = (^.asInstanceOf[js.Dynamic].apply(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("react-weui", "Gallery.propTypes.src")
      @js.native
      val ^ : js.Any = js.native
      
      inline def isRequired(p0: Any, p1: Any, p2: Any, p3: Any, p4: Any, p5: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isRequired")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], p4.asInstanceOf[js.Any], p5.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
  }
}
