package typingsJapgolly.babylonjs.BABYLON

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInspectorOptions extends StObject {
  
  /**
    * Optional list of additional top level nodes
    */
  var additionalNodes: js.UndefOr[js.Array[IExplorerAdditionalNode]] = js.undefined
  
  /**
    * Display in embed mode (both panes on the right)
    */
  var embedMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allow the panes to be closed by users (default: true)
    */
  var enableClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allow the panes to popup (default: true)
    */
  var enablePopup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional list of extensibility entries
    */
  var explorerExtensibility: js.UndefOr[js.Array[IExplorerExtensibilityGroup]] = js.undefined
  
  /**
    * HTML element to use as root (the parent of the rendering canvas will be used as default value)
    */
  var globalRoot: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * let the Inspector handles resize of the canvas when panes are resized (default to true)
    */
  var handleResize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional initial tab (default to DebugLayerTab.Properties)
    */
  var initialTab: js.UndefOr[DebugLayerTab] = js.undefined
  
  /**
    * Optional URL to get the inspector script from (by default it uses the babylonjs CDN).
    */
  var inspectorURL: js.UndefOr[String] = js.undefined
  
  /**
    * Display in overlay mode (default: false)
    */
  var overlay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Display the Scene explorer
    */
  var showExplorer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Display the property inspector
    */
  var showInspector: js.UndefOr[Boolean] = js.undefined
}
object IInspectorOptions {
  
  inline def apply(): IInspectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInspectorOptions]
  }
  
  extension [Self <: IInspectorOptions](x: Self) {
    
    inline def setAdditionalNodes(value: js.Array[IExplorerAdditionalNode]): Self = StObject.set(x, "additionalNodes", value.asInstanceOf[js.Any])
    
    inline def setAdditionalNodesUndefined: Self = StObject.set(x, "additionalNodes", js.undefined)
    
    inline def setAdditionalNodesVarargs(value: IExplorerAdditionalNode*): Self = StObject.set(x, "additionalNodes", js.Array(value*))
    
    inline def setEmbedMode(value: Boolean): Self = StObject.set(x, "embedMode", value.asInstanceOf[js.Any])
    
    inline def setEmbedModeUndefined: Self = StObject.set(x, "embedMode", js.undefined)
    
    inline def setEnableClose(value: Boolean): Self = StObject.set(x, "enableClose", value.asInstanceOf[js.Any])
    
    inline def setEnableCloseUndefined: Self = StObject.set(x, "enableClose", js.undefined)
    
    inline def setEnablePopup(value: Boolean): Self = StObject.set(x, "enablePopup", value.asInstanceOf[js.Any])
    
    inline def setEnablePopupUndefined: Self = StObject.set(x, "enablePopup", js.undefined)
    
    inline def setExplorerExtensibility(value: js.Array[IExplorerExtensibilityGroup]): Self = StObject.set(x, "explorerExtensibility", value.asInstanceOf[js.Any])
    
    inline def setExplorerExtensibilityUndefined: Self = StObject.set(x, "explorerExtensibility", js.undefined)
    
    inline def setExplorerExtensibilityVarargs(value: IExplorerExtensibilityGroup*): Self = StObject.set(x, "explorerExtensibility", js.Array(value*))
    
    inline def setGlobalRoot(value: HTMLElement): Self = StObject.set(x, "globalRoot", value.asInstanceOf[js.Any])
    
    inline def setGlobalRootUndefined: Self = StObject.set(x, "globalRoot", js.undefined)
    
    inline def setHandleResize(value: Boolean): Self = StObject.set(x, "handleResize", value.asInstanceOf[js.Any])
    
    inline def setHandleResizeUndefined: Self = StObject.set(x, "handleResize", js.undefined)
    
    inline def setInitialTab(value: DebugLayerTab): Self = StObject.set(x, "initialTab", value.asInstanceOf[js.Any])
    
    inline def setInitialTabUndefined: Self = StObject.set(x, "initialTab", js.undefined)
    
    inline def setInspectorURL(value: String): Self = StObject.set(x, "inspectorURL", value.asInstanceOf[js.Any])
    
    inline def setInspectorURLUndefined: Self = StObject.set(x, "inspectorURL", js.undefined)
    
    inline def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    inline def setShowExplorer(value: Boolean): Self = StObject.set(x, "showExplorer", value.asInstanceOf[js.Any])
    
    inline def setShowExplorerUndefined: Self = StObject.set(x, "showExplorer", js.undefined)
    
    inline def setShowInspector(value: Boolean): Self = StObject.set(x, "showInspector", value.asInstanceOf[js.Any])
    
    inline def setShowInspectorUndefined: Self = StObject.set(x, "showInspector", js.undefined)
  }
}
