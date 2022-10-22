package typingsJapgolly.grommet

import typingsJapgolly.grommet.es6UtilsMod.BackgroundObject
import typingsJapgolly.grommet.grommetStrings.horizontal
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsPageContentMod {
  
  @JSImport("grommet/es6/components/PageContent", "PageContent")
  @js.native
  val PageContent: FC[PageContentExtendedProps] = js.native
  
  trait PageBackground
    extends StObject
       with BackgroundObject {
    
    var fill: js.UndefOr[horizontal] = js.undefined
  }
  object PageBackground {
    
    inline def apply(): PageBackground = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageBackground]
    }
    
    extension [Self <: PageBackground](x: Self) {
      
      inline def setFill(value: horizontal): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof grommet.grommet/es6/components/Box.BoxExtendedProps, 'background'> ]: grommet.grommet/es6/components/Box.BoxExtendedProps[P]} */ trait PageContentExtendedProps
    extends StObject
       with PageContentProps
  object PageContentExtendedProps {
    
    inline def apply(): PageContentExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageContentExtendedProps]
    }
  }
  
  trait PageContentProps extends StObject {
    
    var background: js.UndefOr[String | PageBackground] = js.undefined
  }
  object PageContentProps {
    
    inline def apply(): PageContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageContentProps]
    }
    
    extension [Self <: PageContentProps](x: Self) {
      
      inline def setBackground(value: String | PageBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    }
  }
}
