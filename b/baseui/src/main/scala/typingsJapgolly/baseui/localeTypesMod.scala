package typingsJapgolly.baseui

import typingsJapgolly.baseui.accordionLocaleMod.AccordionLocale
import typingsJapgolly.baseui.breadcrumbsLocaleMod.BreadcrumbLocale
import typingsJapgolly.baseui.buttonGroupLocaleMod.ButtonGroupLocale
import typingsJapgolly.baseui.dataTableLocaleMod.DataTableLocale
import typingsJapgolly.baseui.datepickerLocaleMod.DatepickerLocale
import typingsJapgolly.baseui.drawerLocaleMod.DrawerLocale
import typingsJapgolly.baseui.fileUploaderLocaleMod.FileUploaderLocale
import typingsJapgolly.baseui.menuLocaleMod.MenuLocale
import typingsJapgolly.baseui.modalLocaleMod.ModalLocale
import typingsJapgolly.baseui.paginationLocaleMod.PaginationLocale
import typingsJapgolly.baseui.selectLocaleMod.SelectLocale
import typingsJapgolly.baseui.toastLocaleMod.ToastLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeTypesMod {
  
  trait Locale extends StObject {
    
    var accordion: AccordionLocale
    
    var breadcrumbs: BreadcrumbLocale
    
    var buttongroup: ButtonGroupLocale
    
    var datatable: DataTableLocale
    
    var datepicker: DatepickerLocale
    
    var drawer: DrawerLocale
    
    var fileuploader: FileUploaderLocale
    
    var menu: MenuLocale
    
    var modal: ModalLocale
    
    var pagination: PaginationLocale
    
    var select: SelectLocale
    
    var toast: ToastLocale
  }
  object Locale {
    
    inline def apply(
      accordion: AccordionLocale,
      breadcrumbs: BreadcrumbLocale,
      buttongroup: ButtonGroupLocale,
      datatable: DataTableLocale,
      datepicker: DatepickerLocale,
      drawer: DrawerLocale,
      fileuploader: FileUploaderLocale,
      menu: MenuLocale,
      modal: ModalLocale,
      pagination: PaginationLocale,
      select: SelectLocale,
      toast: ToastLocale
    ): Locale = {
      val __obj = js.Dynamic.literal(accordion = accordion.asInstanceOf[js.Any], breadcrumbs = breadcrumbs.asInstanceOf[js.Any], buttongroup = buttongroup.asInstanceOf[js.Any], datatable = datatable.asInstanceOf[js.Any], datepicker = datepicker.asInstanceOf[js.Any], drawer = drawer.asInstanceOf[js.Any], fileuploader = fileuploader.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], toast = toast.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setAccordion(value: AccordionLocale): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbs(value: BreadcrumbLocale): Self = StObject.set(x, "breadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setButtongroup(value: ButtonGroupLocale): Self = StObject.set(x, "buttongroup", value.asInstanceOf[js.Any])
      
      inline def setDatatable(value: DataTableLocale): Self = StObject.set(x, "datatable", value.asInstanceOf[js.Any])
      
      inline def setDatepicker(value: DatepickerLocale): Self = StObject.set(x, "datepicker", value.asInstanceOf[js.Any])
      
      inline def setDrawer(value: DrawerLocale): Self = StObject.set(x, "drawer", value.asInstanceOf[js.Any])
      
      inline def setFileuploader(value: FileUploaderLocale): Self = StObject.set(x, "fileuploader", value.asInstanceOf[js.Any])
      
      inline def setMenu(value: MenuLocale): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setModal(value: ModalLocale): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setPagination(value: PaginationLocale): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: SelectLocale): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setToast(value: ToastLocale): Self = StObject.set(x, "toast", value.asInstanceOf[js.Any])
    }
  }
}
