package typingsJapgolly.wixUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsPaginationDataHooksMod {
  
  @js.native
  sealed trait PaginationDataHooks extends StObject
  @JSImport("wix-ui-core/dist/es/src/components/pagination/DataHooks", "PaginationDataHooks")
  @js.native
  object PaginationDataHooks extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PaginationDataHooks & String] = js.native
    
    @js.native
    sealed trait currentPage
      extends StObject
         with PaginationDataHooks
    /* "current-page" */ val currentPage: typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationDataHooksMod.PaginationDataHooks.currentPage & String = js.native
    
    @js.native
    sealed trait first
      extends StObject
         with PaginationDataHooks
    /* "first" */ val first: typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationDataHooksMod.PaginationDataHooks.first & String = js.native
    
    @js.native
    sealed trait last
      extends StObject
         with PaginationDataHooks
    /* "last" */ val last: typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationDataHooksMod.PaginationDataHooks.last & String = js.native
    
    @js.native
    sealed trait next
      extends StObject
         with PaginationDataHooks
    /* "next" */ val next: typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationDataHooksMod.PaginationDataHooks.next & String = js.native
    
    @js.native
    sealed trait page
      extends StObject
         with PaginationDataHooks
    /* "page" */ val page: typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationDataHooksMod.PaginationDataHooks.page & String = js.native
    
    @js.native
    sealed trait pageCompact
      extends StObject
         with PaginationDataHooks
    /* "page-compact" */ val pageCompact: typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationDataHooksMod.PaginationDataHooks.pageCompact & String = js.native
    
    @js.native
    sealed trait pageForm
      extends StObject
         with PaginationDataHooks
    /* "page-form" */ val pageForm: typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationDataHooksMod.PaginationDataHooks.pageForm & String = js.native
    
    @js.native
    sealed trait pageInput
      extends StObject
         with PaginationDataHooks
    /* "page-input" */ val pageInput: typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationDataHooksMod.PaginationDataHooks.pageInput & String = js.native
    
    @js.native
    sealed trait pageStrip
      extends StObject
         with PaginationDataHooks
    /* "page-strip" */ val pageStrip: typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationDataHooksMod.PaginationDataHooks.pageStrip & String = js.native
    
    @js.native
    sealed trait previous
      extends StObject
         with PaginationDataHooks
    /* "previous" */ val previous: typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationDataHooksMod.PaginationDataHooks.previous & String = js.native
    
    @js.native
    sealed trait slashLabel
      extends StObject
         with PaginationDataHooks
    /* "slash-label" */ val slashLabel: typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationDataHooksMod.PaginationDataHooks.slashLabel & String = js.native
    
    @js.native
    sealed trait totalPages
      extends StObject
         with PaginationDataHooks
    /* "total-pages" */ val totalPages: typingsJapgolly.wixUiCore.distEsSrcComponentsPaginationDataHooksMod.PaginationDataHooks.totalPages & String = js.native
  }
}
