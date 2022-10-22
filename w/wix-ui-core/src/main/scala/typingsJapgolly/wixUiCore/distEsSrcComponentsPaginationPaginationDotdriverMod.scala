package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.anon.BlurInput
import typingsJapgolly.wixUiCore.anon.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsPaginationPaginationDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/pagination/Pagination.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginationDriverFactory(hasRootSimulate: Element): BlurInput = ^.asInstanceOf[js.Dynamic].applyDynamic("paginationDriverFactory")(hasRootSimulate.asInstanceOf[js.Any]).asInstanceOf[BlurInput]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixUiCore.wixUiCoreStrings.first
    - typingsJapgolly.wixUiCore.wixUiCoreStrings.previous
    - typingsJapgolly.wixUiCore.wixUiCoreStrings.next
    - typingsJapgolly.wixUiCore.wixUiCoreStrings.last
  */
  trait NavButtonName extends StObject
  object NavButtonName {
    
    inline def first: typingsJapgolly.wixUiCore.wixUiCoreStrings.first = "first".asInstanceOf[typingsJapgolly.wixUiCore.wixUiCoreStrings.first]
    
    inline def last: typingsJapgolly.wixUiCore.wixUiCoreStrings.last = "last".asInstanceOf[typingsJapgolly.wixUiCore.wixUiCoreStrings.last]
    
    inline def next: typingsJapgolly.wixUiCore.wixUiCoreStrings.next = "next".asInstanceOf[typingsJapgolly.wixUiCore.wixUiCoreStrings.next]
    
    inline def previous: typingsJapgolly.wixUiCore.wixUiCoreStrings.previous = "previous".asInstanceOf[typingsJapgolly.wixUiCore.wixUiCoreStrings.previous]
  }
}
