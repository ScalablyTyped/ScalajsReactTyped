package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUiCore.iconButtonIconButtonMod.IconButtonProps
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandIcon extends StObject {
  
  /**
    * Props applied to the `IconButton` element wrapping the expand icon.
    */
  var IconButtonProps: js.UndefOr[
    Partial[
      typingsJapgolly.materialUiCore.iconButtonIconButtonMod.IconButtonProps[
        /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.anon.DefaultComponent['defaultComponent'] */ js.Any, 
        js.Object
      ]
    ]
  ] = js.undefined
  
  /**
    * The content of the expansion panel summary.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * The icon to display as the expand indicator.
    */
  var expandIcon: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
}
object ExpandIcon {
  
  inline def apply(): ExpandIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandIcon]
  }
  
  extension [Self <: ExpandIcon](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setExpandIcon(value: VdomNode): Self = StObject.set(x, "expandIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setExpandIconNull: Self = StObject.set(x, "expandIcon", null)
    
    inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
    
    inline def setExpandIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "expandIcon", js.Array(value*))
    
    inline def setExpandIconVdomElement(value: VdomElement): Self = StObject.set(x, "expandIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIconButtonProps(
      value: Partial[
          IconButtonProps[
            /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.anon.DefaultComponent['defaultComponent'] */ js.Any, 
            js.Object
          ]
        ]
    ): Self = StObject.set(x, "IconButtonProps", value.asInstanceOf[js.Any])
    
    inline def setIconButtonPropsUndefined: Self = StObject.set(x, "IconButtonProps", js.undefined)
  }
}
