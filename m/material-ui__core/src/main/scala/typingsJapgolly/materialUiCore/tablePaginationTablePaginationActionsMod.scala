package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.materialUiCore.iconButtonIconButtonMod.IconButtonProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablePaginationTablePaginationActionsMod extends Shortcut {
  
  @JSImport("@material-ui/core/TablePagination/TablePaginationActions", JSImport.Default)
  @js.native
  val default: ComponentType[TablePaginationActionsProps] = js.native
  
  @js.native
  trait TablePaginationActionsProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var backIconButtonProps: js.UndefOr[
        Partial[
          IconButtonProps[
            /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.anon.DefaultComponent['defaultComponent'] */ js.Any, 
            js.Object
          ]
        ]
      ] = js.native
    
    var count: Double = js.native
    
    var nextIconButtonProps: js.UndefOr[
        Partial[
          IconButtonProps[
            /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.anon.DefaultComponent['defaultComponent'] */ js.Any, 
            js.Object
          ]
        ]
      ] = js.native
    
    /**
      * @deprecated Use onPageChange instead.
      */
    def onChangePage(event: ReactMouseEventFrom[HTMLButtonElement], page: Double): Unit = js.native
    def onChangePage(event: Null, page: Double): Unit = js.native
    
    def onPageChange(event: ReactMouseEventFrom[HTMLButtonElement], page: Double): Unit = js.native
    def onPageChange(event: Null, page: Double): Unit = js.native
    
    var page: Double = js.native
    
    var rowsPerPage: Double = js.native
  }
  
  type _To = ComponentType[TablePaginationActionsProps]
  
  /* This means you don't have to write `default`, but can instead just say `tablePaginationTablePaginationActionsMod.foo` */
  override def _to: ComponentType[TablePaginationActionsProps] = default
}
