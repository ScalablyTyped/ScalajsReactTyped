package typingsJapgolly.reactStickyBox

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefFn
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-sticky-box", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sticky-box", JSImport.Default)
  @js.native
  val default: FunctionComponent[StickyBoxCompProps] = js.native
  
  inline def useStickyBox[T](): RefFn[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStickyBox")().asInstanceOf[RefFn[T]]
  inline def useStickyBox[T](options: UseStickyBoxOptions): RefFn[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStickyBox")(options.asInstanceOf[js.Any]).asInstanceOf[RefFn[T]]
  
  trait StickyBoxCompProps
    extends StObject
       with UseStickyBoxOptions {
    
    var children: Node
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object StickyBoxCompProps {
    
    inline def apply(): StickyBoxCompProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[StickyBoxCompProps]
    }
    
    extension [Self <: StickyBoxCompProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait UseStickyBoxOptions extends StObject {
    
    var bottom: js.UndefOr[Boolean] = js.undefined
    
    var offsetBottom: js.UndefOr[Double] = js.undefined
    
    var offsetTop: js.UndefOr[Double] = js.undefined
  }
  object UseStickyBoxOptions {
    
    inline def apply(): UseStickyBoxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseStickyBoxOptions]
    }
    
    extension [Self <: UseStickyBoxOptions](x: Self) {
      
      inline def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
      
      inline def setOffsetBottomUndefined: Self = StObject.set(x, "offsetBottom", js.undefined)
      
      inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      inline def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
    }
  }
}
