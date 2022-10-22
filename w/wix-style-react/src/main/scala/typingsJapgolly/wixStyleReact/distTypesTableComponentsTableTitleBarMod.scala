package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.`12`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableComponentsTableTitleBarMod {
  
  object TableTitleBar {
    
    inline def apply(hasDataHook: `12`): Element = ^.asInstanceOf[js.Dynamic].apply(hasDataHook.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Table/components/TableTitleBar", "TableTitleBar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Table/components/TableTitleBar", "TableTitleBar.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Table/components/TableTitleBar", "TableTitleBar.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
    }
  }
}
