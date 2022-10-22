package typingsJapgolly.grommet

import typingsJapgolly.grommet.es6ComponentsBoxMod.BoxExtendedProps
import typingsJapgolly.grommet.grommetStrings.full
import typingsJapgolly.grommet.grommetStrings.narrow
import typingsJapgolly.grommet.grommetStrings.wide
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsPageMod {
  
  @JSImport("grommet/es6/components/Page", "Page")
  @js.native
  val Page: FC[PageExtendedProps] = js.native
  
  trait PageExtendedProps
    extends StObject
       with PageProps
       with BoxExtendedProps
  object PageExtendedProps {
    
    inline def apply(): PageExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageExtendedProps]
    }
  }
  
  trait PageProps extends StObject {
    
    var kind: js.UndefOr[wide | narrow | full | String] = js.undefined
  }
  object PageProps {
    
    inline def apply(): PageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageProps]
    }
    
    extension [Self <: PageProps](x: Self) {
      
      inline def setKind(value: wide | narrow | full | String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    }
  }
}
