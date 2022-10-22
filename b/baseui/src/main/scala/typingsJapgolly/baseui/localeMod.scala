package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.anon.PartialLocale
import typingsJapgolly.baseui.localeTypesMod.Locale
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeMod extends Shortcut {
  
  @JSImport("baseui/locale", JSImport.Default)
  @js.native
  val default: FC[LocaleProviderProps] = js.native
  
  @JSImport("baseui/locale", "LocaleContext")
  @js.native
  val LocaleContext: Context[Locale] = js.native
  
  type AccordionLocale = typingsJapgolly.baseui.accordionLocaleMod.AccordionLocale
  
  type BreadcrumbLocale = typingsJapgolly.baseui.breadcrumbsLocaleMod.BreadcrumbLocale
  
  type ButtonGroupLocale = typingsJapgolly.baseui.buttonGroupLocaleMod.ButtonGroupLocale
  
  type DataTableLocale = typingsJapgolly.baseui.dataTableLocaleMod.DataTableLocale
  
  type DatepickerLocale = typingsJapgolly.baseui.datepickerLocaleMod.DatepickerLocale
  
  type DrawerLocale = typingsJapgolly.baseui.drawerLocaleMod.DrawerLocale
  
  type FileUploaderLocale = typingsJapgolly.baseui.fileUploaderLocaleMod.FileUploaderLocale
  
  trait LocaleProviderProps extends StObject {
    
    var children: js.UndefOr[Node | Null] = js.undefined
    
    var locale: PartialLocale
  }
  object LocaleProviderProps {
    
    inline def apply(locale: PartialLocale): LocaleProviderProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleProviderProps]
    }
    
    extension [Self <: LocaleProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLocale(value: PartialLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  type MenuLocale = typingsJapgolly.baseui.menuLocaleMod.MenuLocale
  
  type ModalLocale = typingsJapgolly.baseui.modalLocaleMod.ModalLocale
  
  type PaginationLocale = typingsJapgolly.baseui.paginationLocaleMod.PaginationLocale
  
  type SelectLocale = typingsJapgolly.baseui.selectLocaleMod.SelectLocale
  
  type ToastLocale = typingsJapgolly.baseui.toastLocaleMod.ToastLocale
  
  type _To = FC[LocaleProviderProps]
  
  /* This means you don't have to write `default`, but can instead just say `localeMod.foo` */
  override def _to: FC[LocaleProviderProps] = default
}
