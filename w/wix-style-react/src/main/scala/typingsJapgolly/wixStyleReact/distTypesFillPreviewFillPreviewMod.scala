package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.ReactNodeArray
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.anon.Background
import typingsJapgolly.wixStyleReact.anon.BackgroundColor
import typingsJapgolly.wixStyleReact.anon.BackgroundImage
import typingsJapgolly.wixStyleReact.anon.BackgroundPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFillPreviewFillPreviewMod {
  
  @JSImport("wix-style-react/dist/types/FillPreview/FillPreview", JSImport.Default)
  @js.native
  open class default protected () extends FillPreview {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/FillPreview/FillPreview", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/FillPreview/FillPreview", "default.defaultProps.selected_1")
      @js.native
      val selected1: Boolean = js.native
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/FillPreview/FillPreview", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/FillPreview/FillPreview", "default.propTypes.as")
      @js.native
      val as: Requireable[String | js.Object] = js.native
      
      @JSImport("wix-style-react/dist/types/FillPreview/FillPreview", "default.propTypes.aspectRatio")
      @js.native
      val aspectRatio: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/FillPreview/FillPreview", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FillPreview/FillPreview", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FillPreview/FillPreview", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/FillPreview/FillPreview", "default.propTypes.fill")
      @js.native
      val fill: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      
      @JSImport("wix-style-react/dist/types/FillPreview/FillPreview", "default.propTypes.onClick")
      @js.native
      val onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/FillPreview/FillPreview", "default.propTypes.selected")
      @js.native
      val selected: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/FillPreview/FillPreview", "default.propTypes.tabIndex")
      @js.native
      val tabIndex: Requireable[Double] = js.native
    }
  }
  
  @js.native
  trait FillPreview extends PureComponent[Any, Any, Any] {
    
    def _getBackground(fill: Any): js.UndefOr[Background | BackgroundColor | BackgroundImage | BackgroundPosition] = js.native
  }
}
