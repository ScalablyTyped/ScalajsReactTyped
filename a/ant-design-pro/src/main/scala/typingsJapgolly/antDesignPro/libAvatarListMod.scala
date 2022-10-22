package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.antDesignPro.libAvatarListAvatarItemMod.AvatarItemProps
import typingsJapgolly.antDesignPro.libAvatarListAvatarItemMod.SizeType
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAvatarListMod {
  
  @JSImport("ant-design-pro/lib/AvatarList", JSImport.Default)
  @js.native
  open class default () extends Component[AvatarListProps, Any, Any]
  /* static members */
  object default {
    
    @JSImport("ant-design-pro/lib/AvatarList", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro/lib/AvatarList", "default.Item")
    @js.native
    def Item: Instantiable1[
        /* props */ AvatarItemProps, 
        typingsJapgolly.antDesignPro.libAvatarListAvatarItemMod.default
      ] = js.native
    inline def Item_=(
      x: Instantiable1[
          /* props */ AvatarItemProps, 
          typingsJapgolly.antDesignPro.libAvatarListAvatarItemMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  }
  
  type AvatarList = japgolly.scalajs.react.facade.React.Component[AvatarListProps & js.Object, js.Object]
  
  trait AvatarListProps extends StObject {
    
    var Item: js.UndefOr[Element] = js.undefined
    
    var children: Element | js.Array[Element]
    
    var excessItemsStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[SizeType] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object AvatarListProps {
    
    inline def apply(children: Element | js.Array[Element]): AvatarListProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarListProps]
    }
    
    extension [Self <: AvatarListProps](x: Self) {
      
      inline def setChildren(value: Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setExcessItemsStyle(value: CSSProperties): Self = StObject.set(x, "excessItemsStyle", value.asInstanceOf[js.Any])
      
      inline def setExcessItemsStyleUndefined: Self = StObject.set(x, "excessItemsStyle", js.undefined)
      
      inline def setItem(value: VdomElement): Self = StObject.set(x, "Item", value.rawElement.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
