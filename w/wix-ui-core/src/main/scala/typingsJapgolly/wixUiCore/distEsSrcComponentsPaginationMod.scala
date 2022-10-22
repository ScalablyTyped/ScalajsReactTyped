package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.anon.PartialPaginationProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationPaginationMod.PaginationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsPaginationMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/pagination", "Pagination")
  @js.native
  open class Pagination protected ()
    extends typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationPaginationMod.Pagination {
    def this(props: PaginationProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PaginationProps, context: Any) = this()
  }
  /* static members */
  object Pagination {
    
    @JSImport("wix-ui-core/dist/es/src/components/pagination", "Pagination")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/pagination", "Pagination.defaultProps")
    @js.native
    def defaultProps: PartialPaginationProps = js.native
    inline def defaultProps_=(x: PartialPaginationProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/pagination", "Pagination.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
