package typingsJapgolly.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDndStylesMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/dnd-styles", JSImport.Default)
  @js.native
  val default: dndStylesType = js.native
  
  type _To = dndStylesType
  
  /* This means you don't have to write `default`, but can instead just say `distTypesDndStylesMod.foo` */
  override def _to: dndStylesType = default
  
  trait dndStylesType extends StObject {
    
    var gridItemPlaceholder: String
    
    var gridItemPreview: String
    
    var isInitialPositionToDrop: String
    
    var item: String
    
    var itemPlaceholder: String
    
    var itemPreview: String
    
    var list: String
    
    var withGridItemStrip: String
    
    var withGridItemStripRight: String
  }
  object dndStylesType {
    
    inline def apply(
      gridItemPlaceholder: String,
      gridItemPreview: String,
      isInitialPositionToDrop: String,
      item: String,
      itemPlaceholder: String,
      itemPreview: String,
      list: String,
      withGridItemStrip: String,
      withGridItemStripRight: String
    ): dndStylesType = {
      val __obj = js.Dynamic.literal(gridItemPlaceholder = gridItemPlaceholder.asInstanceOf[js.Any], gridItemPreview = gridItemPreview.asInstanceOf[js.Any], isInitialPositionToDrop = isInitialPositionToDrop.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemPlaceholder = itemPlaceholder.asInstanceOf[js.Any], itemPreview = itemPreview.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], withGridItemStrip = withGridItemStrip.asInstanceOf[js.Any], withGridItemStripRight = withGridItemStripRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[dndStylesType]
    }
    
    extension [Self <: dndStylesType](x: Self) {
      
      inline def setGridItemPlaceholder(value: String): Self = StObject.set(x, "gridItemPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setGridItemPreview(value: String): Self = StObject.set(x, "gridItemPreview", value.asInstanceOf[js.Any])
      
      inline def setIsInitialPositionToDrop(value: String): Self = StObject.set(x, "isInitialPositionToDrop", value.asInstanceOf[js.Any])
      
      inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemPlaceholder(value: String): Self = StObject.set(x, "itemPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setItemPreview(value: String): Self = StObject.set(x, "itemPreview", value.asInstanceOf[js.Any])
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setWithGridItemStrip(value: String): Self = StObject.set(x, "withGridItemStrip", value.asInstanceOf[js.Any])
      
      inline def setWithGridItemStripRight(value: String): Self = StObject.set(x, "withGridItemStripRight", value.asInstanceOf[js.Any])
    }
  }
}
