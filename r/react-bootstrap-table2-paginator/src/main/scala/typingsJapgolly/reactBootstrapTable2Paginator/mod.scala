package typingsJapgolly.reactBootstrapTable2Paginator

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactBootstrapTable2Paginator.anon.Children
import typingsJapgolly.reactBootstrapTable2Paginator.reactBootstrapTable2PaginatorStrings.dropdown
import typingsJapgolly.reactBootstrapTable2Paginator.reactBootstrapTable2PaginatorStrings.dropup
import typingsJapgolly.reactBootstrapTableNext.mod.PaginationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-bootstrap-table2-paginator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * declaration for table pagination sub module and factory
    */
  inline def default(options: PaginationOptions): PaginationCtxOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[PaginationCtxOptions]
  
  @JSImport("react-bootstrap-table2-paginator", "PaginationListStandalone")
  @js.native
  val PaginationListStandalone: FC[PaginationChildProps] = js.native
  
  inline def PaginationProvider(props: Children): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("PaginationProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  @JSImport("react-bootstrap-table2-paginator", "PaginationTotalStandalone")
  @js.native
  val PaginationTotalStandalone: FC[PaginationChildProps] = js.native
  
  @JSImport("react-bootstrap-table2-paginator", "SizePerPageDropdownStandalone")
  @js.native
  val SizePerPageDropdownStandalone: FC[SizePerPageDropdownStandaloneProps] = js.native
  
  trait PaginationChildProps
    extends StObject
       with PaginationOptions {
    
    var bootstrap4: js.UndefOr[Boolean] = js.undefined
    
    var tableId: js.UndefOr[String] = js.undefined
  }
  object PaginationChildProps {
    
    inline def apply(): PaginationChildProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationChildProps]
    }
    
    extension [Self <: PaginationChildProps](x: Self) {
      
      inline def setBootstrap4(value: Boolean): Self = StObject.set(x, "bootstrap4", value.asInstanceOf[js.Any])
      
      inline def setBootstrap4Undefined: Self = StObject.set(x, "bootstrap4", js.undefined)
      
      inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
      
      inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    }
  }
  
  trait PaginationCtxOptions extends StObject {
    
    var options: js.UndefOr[PaginationOptions] = js.undefined
  }
  object PaginationCtxOptions {
    
    inline def apply(): PaginationCtxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationCtxOptions]
    }
    
    extension [Self <: PaginationCtxOptions](x: Self) {
      
      inline def setOptions(value: PaginationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait SizePerPageDropdownStandaloneProps
    extends StObject
       with PaginationChildProps {
    
    var btnContextual: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var variation: js.UndefOr[dropdown | dropup] = js.undefined
  }
  object SizePerPageDropdownStandaloneProps {
    
    inline def apply(): SizePerPageDropdownStandaloneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizePerPageDropdownStandaloneProps]
    }
    
    extension [Self <: SizePerPageDropdownStandaloneProps](x: Self) {
      
      inline def setBtnContextual(value: Boolean): Self = StObject.set(x, "btnContextual", value.asInstanceOf[js.Any])
      
      inline def setBtnContextualUndefined: Self = StObject.set(x, "btnContextual", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setVariation(value: dropdown | dropup): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
      
      inline def setVariationUndefined: Self = StObject.set(x, "variation", js.undefined)
    }
  }
}
