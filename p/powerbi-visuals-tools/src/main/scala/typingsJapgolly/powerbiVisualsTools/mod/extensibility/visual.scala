package typingsJapgolly.powerbiVisualsTools.mod.extensibility

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.powerbiVisualsTools.mod.DataView
import typingsJapgolly.powerbiVisualsTools.mod.EditMode
import typingsJapgolly.powerbiVisualsTools.mod.EnumerateVisualObjectInstancesOptions
import typingsJapgolly.powerbiVisualsTools.mod.FilterAction
import typingsJapgolly.powerbiVisualsTools.mod.IFilter
import typingsJapgolly.powerbiVisualsTools.mod.IViewport
import typingsJapgolly.powerbiVisualsTools.mod.ViewMode
import typingsJapgolly.powerbiVisualsTools.mod.VisualObjectInstanceEnumeration
import typingsJapgolly.powerbiVisualsTools.mod.VisualObjectInstancesToPersist
import typingsJapgolly.powerbiVisualsTools.mod.VisualUpdateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Change Log Version 1.11.0
  * Added `selectionManager.registerOnSelectCallback()` method for Report Bookmarks support
  */
object visual {
  
  /**
    * Represents a visualization displayed within an application (PowerBI dashboards, ad-hoc reporting, etc.).
    * This interface does not make assumptions about the underlying JS/HTML constructs the visual uses to render itself.
    */
  @js.native
  trait IVisual
    extends StObject
       with typingsJapgolly.powerbiVisualsTools.mod.extensibility.IVisual {
    
    /** Gets the set of objects that the visual is currently displaying. */
    var enumerateObjectInstances: js.UndefOr[
        js.Function1[
          /* options */ EnumerateVisualObjectInstancesOptions, 
          VisualObjectInstanceEnumeration
        ]
      ] = js.native
    
    /** Notifies the IVisual of an update (data, viewmode, size change). */
    // tslint:disable-next-line:no-unnecessary-generics
    def update[T](options: typingsJapgolly.powerbiVisualsTools.mod.extensibility.visual.VisualUpdateOptions): Unit = js.native
    def update[T](
      options: typingsJapgolly.powerbiVisualsTools.mod.extensibility.visual.VisualUpdateOptions,
      viewModel: T
    ): Unit = js.native
  }
  
  trait IVisualHost
    extends StObject
       with typingsJapgolly.powerbiVisualsTools.mod.extensibility.IVisualHost {
    
    var allowInteractions: Boolean
    
    def applyJsonFilter(filter: IFilter, objectName: String, propertyName: String, action: FilterAction): Unit
    
    var authenticationService: IAuthenticationService
    
    var colorPalette: IColorPalette
    
    def createLocalizationManager(): ILocalizationManager
    
    def createSelectionIdBuilder(): typingsJapgolly.powerbiVisualsTools.mod.visuals.ISelectionIdBuilder
    
    def createSelectionManager(): ISelectionManager
    
    def launchUrl(url: String): Unit
    
    var locale: String
    
    def persistProperties(changes: VisualObjectInstancesToPersist): Unit
    
    def refreshHostData(): Unit
    
    var telemetry: ITelemetryService
    
    var tooltipService: ITooltipService
  }
  object IVisualHost {
    
    inline def apply(
      allowInteractions: Boolean,
      applyJsonFilter: (IFilter, String, String, FilterAction) => Callback,
      authenticationService: IAuthenticationService,
      colorPalette: IColorPalette,
      createLocalizationManager: CallbackTo[ILocalizationManager],
      createSelectionIdBuilder: CallbackTo[typingsJapgolly.powerbiVisualsTools.mod.visuals.ISelectionIdBuilder],
      createSelectionManager: CallbackTo[ISelectionManager],
      instanceId: String,
      launchUrl: String => Callback,
      locale: String,
      persistProperties: VisualObjectInstancesToPersist => Callback,
      refreshHostData: Callback,
      telemetry: ITelemetryService,
      tooltipService: ITooltipService
    ): typingsJapgolly.powerbiVisualsTools.mod.extensibility.visual.IVisualHost = {
      val __obj = js.Dynamic.literal(allowInteractions = allowInteractions.asInstanceOf[js.Any], applyJsonFilter = js.Any.fromFunction4((t0: IFilter, t1: String, t2: String, t3: FilterAction) => (applyJsonFilter(t0, t1, t2, t3)).runNow()), authenticationService = authenticationService.asInstanceOf[js.Any], colorPalette = colorPalette.asInstanceOf[js.Any], createLocalizationManager = createLocalizationManager.toJsFn, createSelectionIdBuilder = createSelectionIdBuilder.toJsFn, createSelectionManager = createSelectionManager.toJsFn, instanceId = instanceId.asInstanceOf[js.Any], launchUrl = js.Any.fromFunction1((t0: String) => launchUrl(t0).runNow()), locale = locale.asInstanceOf[js.Any], persistProperties = js.Any.fromFunction1((t0: VisualObjectInstancesToPersist) => persistProperties(t0).runNow()), refreshHostData = refreshHostData.toJsFn, telemetry = telemetry.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.powerbiVisualsTools.mod.extensibility.visual.IVisualHost]
    }
    
    extension [Self <: typingsJapgolly.powerbiVisualsTools.mod.extensibility.visual.IVisualHost](x: Self) {
      
      inline def setAllowInteractions(value: Boolean): Self = StObject.set(x, "allowInteractions", value.asInstanceOf[js.Any])
      
      inline def setApplyJsonFilter(value: (IFilter, String, String, FilterAction) => Callback): Self = StObject.set(x, "applyJsonFilter", js.Any.fromFunction4((t0: IFilter, t1: String, t2: String, t3: FilterAction) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setAuthenticationService(value: IAuthenticationService): Self = StObject.set(x, "authenticationService", value.asInstanceOf[js.Any])
      
      inline def setColorPalette(value: IColorPalette): Self = StObject.set(x, "colorPalette", value.asInstanceOf[js.Any])
      
      inline def setCreateLocalizationManager(value: CallbackTo[ILocalizationManager]): Self = StObject.set(x, "createLocalizationManager", value.toJsFn)
      
      inline def setCreateSelectionIdBuilder(value: CallbackTo[typingsJapgolly.powerbiVisualsTools.mod.visuals.ISelectionIdBuilder]): Self = StObject.set(x, "createSelectionIdBuilder", value.toJsFn)
      
      inline def setCreateSelectionManager(value: CallbackTo[ISelectionManager]): Self = StObject.set(x, "createSelectionManager", value.toJsFn)
      
      inline def setLaunchUrl(value: String => Callback): Self = StObject.set(x, "launchUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setPersistProperties(value: VisualObjectInstancesToPersist => Callback): Self = StObject.set(x, "persistProperties", js.Any.fromFunction1((t0: VisualObjectInstancesToPersist) => value(t0).runNow()))
      
      inline def setRefreshHostData(value: Callback): Self = StObject.set(x, "refreshHostData", value.toJsFn)
      
      inline def setTelemetry(value: ITelemetryService): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
      
      inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  trait VisualConstructorOptions
    extends StObject
       with typingsJapgolly.powerbiVisualsTools.mod.extensibility.VisualConstructorOptions {
    
    var element: HTMLElement
    
    var host: typingsJapgolly.powerbiVisualsTools.mod.extensibility.visual.IVisualHost
  }
  object VisualConstructorOptions {
    
    inline def apply(
      element: HTMLElement,
      host: typingsJapgolly.powerbiVisualsTools.mod.extensibility.visual.IVisualHost
    ): typingsJapgolly.powerbiVisualsTools.mod.extensibility.visual.VisualConstructorOptions = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.powerbiVisualsTools.mod.extensibility.visual.VisualConstructorOptions]
    }
    
    extension [Self <: typingsJapgolly.powerbiVisualsTools.mod.extensibility.visual.VisualConstructorOptions](x: Self) {
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setHost(value: typingsJapgolly.powerbiVisualsTools.mod.extensibility.visual.IVisualHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    }
  }
  
  trait VisualUpdateOptions
    extends StObject
       with typingsJapgolly.powerbiVisualsTools.mod.extensibility.VisualUpdateOptions {
    
    var dataViews: js.Array[DataView]
    
    var editMode: js.UndefOr[EditMode] = js.undefined
    
    var viewMode: js.UndefOr[ViewMode] = js.undefined
    
    var viewport: IViewport
  }
  object VisualUpdateOptions {
    
    inline def apply(dataViews: js.Array[DataView], `type`: VisualUpdateType, viewport: IViewport): typingsJapgolly.powerbiVisualsTools.mod.extensibility.visual.VisualUpdateOptions = {
      val __obj = js.Dynamic.literal(dataViews = dataViews.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.powerbiVisualsTools.mod.extensibility.visual.VisualUpdateOptions]
    }
    
    extension [Self <: typingsJapgolly.powerbiVisualsTools.mod.extensibility.visual.VisualUpdateOptions](x: Self) {
      
      inline def setDataViews(value: js.Array[DataView]): Self = StObject.set(x, "dataViews", value.asInstanceOf[js.Any])
      
      inline def setDataViewsVarargs(value: DataView*): Self = StObject.set(x, "dataViews", js.Array(value*))
      
      inline def setEditMode(value: EditMode): Self = StObject.set(x, "editMode", value.asInstanceOf[js.Any])
      
      inline def setEditModeUndefined: Self = StObject.set(x, "editMode", js.undefined)
      
      inline def setViewMode(value: ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
      
      inline def setViewport(value: IViewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    }
  }
}
