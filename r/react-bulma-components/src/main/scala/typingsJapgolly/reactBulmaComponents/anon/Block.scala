package typingsJapgolly.reactBulmaComponents.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.div
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.span
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import typingsJapgolly.reactBulmaComponents.srcComponentsPanelMod.PanelBlockProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block extends StObject {
  
  var Block: BulmaComponent[PanelBlockProps, div]
  
  var Header: BulmaComponent[js.Object, div]
  
  var Icon: BulmaComponent[js.Object, span]
  
  var Tabs: (BulmaComponent[js.Object, div]) & Tab
}
object Block {
  
  inline def apply(
    Block: /* props */ PanelBlockProps & (ElementProps[PanelBlockProps, div]) => Element,
    Header: /* props */ js.Object & (ElementProps[js.Object, div]) => Element,
    Icon: /* props */ js.Object & (ElementProps[js.Object, span]) => Element,
    Tabs: (BulmaComponent[js.Object, div]) & Tab
  ): Block = {
    val __obj = js.Dynamic.literal(Block = js.Any.fromFunction1(Block), Header = js.Any.fromFunction1(Header), Icon = js.Any.fromFunction1(Icon), Tabs = Tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  extension [Self <: Block](x: Self) {
    
    inline def setBlock(value: /* props */ PanelBlockProps & (ElementProps[PanelBlockProps, div]) => Element): Self = StObject.set(x, "Block", js.Any.fromFunction1(value))
    
    inline def setHeader(value: /* props */ js.Object & (ElementProps[js.Object, div]) => Element): Self = StObject.set(x, "Header", js.Any.fromFunction1(value))
    
    inline def setIcon(value: /* props */ js.Object & (ElementProps[js.Object, span]) => Element): Self = StObject.set(x, "Icon", js.Any.fromFunction1(value))
    
    inline def setTabs(value: (BulmaComponent[js.Object, div]) & Tab): Self = StObject.set(x, "Tabs", value.asInstanceOf[js.Any])
  }
}
