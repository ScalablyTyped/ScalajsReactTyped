package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.wixStyleReact.distTypesCommonMod.ScrollableContainerCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseModalLayoutLayoutBlocksContentMod {
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Content", "Content")
  @js.native
  val Content: FunctionComponent[ContentProps] = js.native
  
  trait ContentProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String | Node] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var hideBottomScrollDivider: js.UndefOr[Boolean] = js.undefined
    
    var hideTopScrollDivider: js.UndefOr[Boolean] = js.undefined
    
    var overflowY: js.UndefOr[String] = js.undefined
    
    var scrollProps: js.UndefOr[ScrollableContainerCommonProps] = js.undefined
  }
  object ContentProps {
    
    inline def apply(): ContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentProps]
    }
    
    extension [Self <: ContentProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: String | Node): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setHideBottomScrollDivider(value: Boolean): Self = StObject.set(x, "hideBottomScrollDivider", value.asInstanceOf[js.Any])
      
      inline def setHideBottomScrollDividerUndefined: Self = StObject.set(x, "hideBottomScrollDivider", js.undefined)
      
      inline def setHideTopScrollDivider(value: Boolean): Self = StObject.set(x, "hideTopScrollDivider", value.asInstanceOf[js.Any])
      
      inline def setHideTopScrollDividerUndefined: Self = StObject.set(x, "hideTopScrollDivider", js.undefined)
      
      inline def setOverflowY(value: String): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      inline def setScrollProps(value: ScrollableContainerCommonProps): Self = StObject.set(x, "scrollProps", value.asInstanceOf[js.Any])
      
      inline def setScrollPropsUndefined: Self = StObject.set(x, "scrollProps", js.undefined)
    }
  }
}
