package typingsJapgolly.reactSpringNative

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.ImageProps
import typingsJapgolly.reactSpringNative.anon.TextPropschildrenReactNod
import typingsJapgolly.reactSpringNative.anon.ViewPropschildrenReactNod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcPrimitivesMod {
  
  object primitives {
    
    @JSImport("@react-spring/native/dist/declarations/src/primitives", "primitives")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@react-spring/native/dist/declarations/src/primitives", "primitives.Image")
    @js.native
    open class Image protected () extends Component[ImageProps, Any, Any] {
      def this(props: ImageProps) = this()
      def this(props: ImageProps, context: Any) = this()
    }
    @JSImport("@react-spring/native/dist/declarations/src/primitives", "primitives.Image")
    @js.native
    def Image: ComponentClassP[ImageProps & js.Object] = js.native
    inline def Image_=(x: ComponentClassP[ImageProps & js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@react-spring/native/dist/declarations/src/primitives", "primitives.Text")
    @js.native
    open class Text protected () extends Component[TextPropschildrenReactNod, Any, Any] {
      def this(props: TextPropschildrenReactNod) = this()
      def this(props: TextPropschildrenReactNod, context: Any) = this()
    }
    @JSImport("@react-spring/native/dist/declarations/src/primitives", "primitives.Text")
    @js.native
    def Text: ComponentClassP[TextPropschildrenReactNod & js.Object] = js.native
    inline def Text_=(x: ComponentClassP[TextPropschildrenReactNod & js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@react-spring/native/dist/declarations/src/primitives", "primitives.View")
    @js.native
    open class View protected () extends Component[ViewPropschildrenReactNod, Any, Any] {
      def this(props: ViewPropschildrenReactNod) = this()
      def this(props: ViewPropschildrenReactNod, context: Any) = this()
    }
    @JSImport("@react-spring/native/dist/declarations/src/primitives", "primitives.View")
    @js.native
    def View: ComponentClassP[ViewPropschildrenReactNod & js.Object] = js.native
    inline def View_=(x: ComponentClassP[ViewPropschildrenReactNod & js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
  }
}
