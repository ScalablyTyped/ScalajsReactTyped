package typingsJapgolly.cytoscapeEdgehandles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.cytoscape.mod.ElementDefinition
import typingsJapgolly.cytoscape.mod.Ext
import typingsJapgolly.cytoscape.mod.NodeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cytoscape-edgehandles", JSImport.Namespace)
  @js.native
  val ^ : Ext = js.native
  
  trait EdgeHandlesInstance extends StObject {
    
    def destroy(): Unit
    
    /**
      * Disables edgehandles behaviour
      */
    def disable(): Unit
    
    /**
      * Turn off draw mode
      */
    def disableDrawMode(): Unit
    
    /**
      * Enables edgehandles behaviour
      */
    def enable(): Unit
    
    /**
      * Turn on draw mode (the entire node body acts like the handle)
      */
    def enableDrawMode(): Unit
    
    /**
      * Remove the handle node from the graph
      */
    def hide(): Unit
    
    /**
      * Manually start the gesture (as if the handle were already held)
      */
    def start(sourceNode: String): Unit
    
    /**
      * Manually completes or cancels the gesture
      */
    def stop(): Unit
  }
  object EdgeHandlesInstance {
    
    inline def apply(
      destroy: Callback,
      disable: Callback,
      disableDrawMode: Callback,
      enable: Callback,
      enableDrawMode: Callback,
      hide: Callback,
      start: String => Callback,
      stop: Callback
    ): EdgeHandlesInstance = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, disable = disable.toJsFn, disableDrawMode = disableDrawMode.toJsFn, enable = enable.toJsFn, enableDrawMode = enableDrawMode.toJsFn, hide = hide.toJsFn, start = js.Any.fromFunction1((t0: String) => start(t0).runNow()), stop = stop.toJsFn)
      __obj.asInstanceOf[EdgeHandlesInstance]
    }
    
    extension [Self <: EdgeHandlesInstance](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
      
      inline def setDisableDrawMode(value: Callback): Self = StObject.set(x, "disableDrawMode", value.toJsFn)
      
      inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
      
      inline def setEnableDrawMode(value: Callback): Self = StObject.set(x, "enableDrawMode", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setStart(value: String => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
  
  trait EdgeHandlesOptions extends StObject {
    
    /**
      * Check, if the source and target node can be connected with each other.
      *
      * Default: Disable self loops
      */
    var canConnect: js.UndefOr[js.Function2[/* source */ NodeSingular, /* target */ NodeSingular, Boolean]] = js.undefined
    
    /**
      * During an edge drawing gesture, disable browser gestures such as two-finger trackpad swipe and pinch-to-zoom.
      *
      * Default: true
      */
    var disableBrowserGestures: js.UndefOr[Boolean] = js.undefined
    
    /**
      * for edges between the specified source and target
      * return element object to be passed to cy.add() for edge
      */
    var edgeParams: js.UndefOr[
        js.Function2[/* source */ NodeSingular, /* target */ NodeSingular, ElementDefinition]
      ] = js.undefined
    
    /**
      * Time spent hovering over a target node before it is considered selected.
      *
      * Default: 150
      */
    var hoverDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Set events:no to edges during draws, prevents mouseouts on compounds.
      *
      * Default: true
      */
    var noEdgeEventsInDraw: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When enabled, the edge can be drawn by just moving close to a target node (can be confusing on compound graphs).
      *
      * Default: true
      */
    var snap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of times per second (Hz) that snap checks done (lower is less expensive).
      *
      * Default: 15
      */
    var snapFrequency: js.UndefOr[Double] = js.undefined
    
    /**
      * The target node must be less than or equal to this many pixels away from the cursor/finger.
      *
      * Default: 50
      */
    var snapThreshold: js.UndefOr[Double] = js.undefined
  }
  object EdgeHandlesOptions {
    
    inline def apply(): EdgeHandlesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EdgeHandlesOptions]
    }
    
    extension [Self <: EdgeHandlesOptions](x: Self) {
      
      inline def setCanConnect(value: (/* source */ NodeSingular, /* target */ NodeSingular) => Boolean): Self = StObject.set(x, "canConnect", js.Any.fromFunction2(value))
      
      inline def setCanConnectUndefined: Self = StObject.set(x, "canConnect", js.undefined)
      
      inline def setDisableBrowserGestures(value: Boolean): Self = StObject.set(x, "disableBrowserGestures", value.asInstanceOf[js.Any])
      
      inline def setDisableBrowserGesturesUndefined: Self = StObject.set(x, "disableBrowserGestures", js.undefined)
      
      inline def setEdgeParams(value: (/* source */ NodeSingular, /* target */ NodeSingular) => ElementDefinition): Self = StObject.set(x, "edgeParams", js.Any.fromFunction2(value))
      
      inline def setEdgeParamsUndefined: Self = StObject.set(x, "edgeParams", js.undefined)
      
      inline def setHoverDelay(value: Double): Self = StObject.set(x, "hoverDelay", value.asInstanceOf[js.Any])
      
      inline def setHoverDelayUndefined: Self = StObject.set(x, "hoverDelay", js.undefined)
      
      inline def setNoEdgeEventsInDraw(value: Boolean): Self = StObject.set(x, "noEdgeEventsInDraw", value.asInstanceOf[js.Any])
      
      inline def setNoEdgeEventsInDrawUndefined: Self = StObject.set(x, "noEdgeEventsInDraw", js.undefined)
      
      inline def setSnap(value: Boolean): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      inline def setSnapFrequency(value: Double): Self = StObject.set(x, "snapFrequency", value.asInstanceOf[js.Any])
      
      inline def setSnapFrequencyUndefined: Self = StObject.set(x, "snapFrequency", js.undefined)
      
      inline def setSnapThreshold(value: Double): Self = StObject.set(x, "snapThreshold", value.asInstanceOf[js.Any])
      
      inline def setSnapThresholdUndefined: Self = StObject.set(x, "snapThreshold", js.undefined)
      
      inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    }
  }
  
  type _To = Ext
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Ext = ^
  
  object global {
    
    object cytoscape {
      
      @js.native
      trait Core extends StObject {
        
        def edgehandles(): EdgeHandlesInstance = js.native
        def edgehandles(options: EdgeHandlesOptions): EdgeHandlesInstance = js.native
      }
    }
  }
}
