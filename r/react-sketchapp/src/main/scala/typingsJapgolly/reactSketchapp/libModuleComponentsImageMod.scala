package typingsJapgolly.reactSketchapp

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.propTypes.mod.ReactNodeLike
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSketchapp.anon.AlignItems
import typingsJapgolly.reactSketchapp.anon.AnimationType
import typingsJapgolly.reactSketchapp.anon.Bottom
import typingsJapgolly.reactSketchapp.anon.DefaultSource
import typingsJapgolly.reactSketchapp.anon.Name
import typingsJapgolly.reactSketchapp.anon.ShadowColor
import typingsJapgolly.reactSketchapp.anon.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleComponentsImageMod {
  
  @JSImport("react-sketchapp/lib/module/components/Image", "Image")
  @js.native
  open class Image protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Image {
    
    @JSImport("react-sketchapp/lib/module/components/Image", "Image")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/Image", "Image.defaultProps")
    @js.native
    def defaultProps: Name = js.native
    inline def defaultProps_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Image", "Image.propTypes")
    @js.native
    def propTypes: DefaultSource = js.native
    inline def propTypes_=(x: DefaultSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  object ImagePropTypes {
    
    @JSImport("react-sketchapp/lib/module/components/Image", "ImagePropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/Image", "ImagePropTypes.children")
    @js.native
    def children: Requireable[ReactNodeLike] = js.native
    inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Image", "ImagePropTypes.defaultSource")
    @js.native
    def defaultSource: Requireable[String | InferProps[Uri]] = js.native
    inline def defaultSource_=(x: Requireable[String | InferProps[Uri]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSource")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Image", "ImagePropTypes.flow")
    @js.native
    def flow: Requireable[InferProps[AnimationType]] = js.native
    inline def flow_=(x: Requireable[InferProps[AnimationType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flow")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Image", "ImagePropTypes.name")
    @js.native
    def name: Requireable[String] = js.native
    inline def name_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Image", "ImagePropTypes.resizeMode")
    @js.native
    def resizeMode: Requireable[String] = js.native
    inline def resizeMode_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resizeMode")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Image", "ImagePropTypes.resizingConstraint")
    @js.native
    def resizingConstraint: Requireable[InferProps[Bottom]] = js.native
    inline def resizingConstraint_=(x: Requireable[InferProps[Bottom]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resizingConstraint")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Image", "ImagePropTypes.shadows")
    @js.native
    def shadows: Requireable[js.Array[js.UndefOr[InferProps[ShadowColor] | Null]]] = js.native
    inline def shadows_=(x: Requireable[js.Array[js.UndefOr[InferProps[ShadowColor] | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadows")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Image", "ImagePropTypes.source")
    @js.native
    def source: Requireable[String | InferProps[Uri]] = js.native
    inline def source_=(x: Requireable[String | InferProps[Uri]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("source")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Image", "ImagePropTypes.style")
    @js.native
    def style: Requireable[js.UndefOr[Double | InferProps[AlignItems] | Null]] = js.native
    inline def style_=(x: Requireable[js.UndefOr[Double | InferProps[AlignItems] | Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/module/components/Image", "ImageSourcePropType")
  @js.native
  val ImageSourcePropType: Requireable[String | InferProps[Uri]] = js.native
  
  type Props = InferProps[DefaultSource]
}
