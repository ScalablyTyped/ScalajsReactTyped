package typingsJapgolly.dockSpawn

import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.dockSpawn.dockspawn.TabStripDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object dockspawn {
    
    @JSGlobal("dockspawn.Dialog")
    @js.native
    open class Dialog protected ()
      extends StObject
         with typingsJapgolly.dockSpawn.dockspawn.Dialog {
      def this(
        panel: typingsJapgolly.dockSpawn.dockspawn.PanelContainer,
        dockManager: typingsJapgolly.dockSpawn.dockspawn.DockManager
      ) = this()
      
      /* CompleteClass */
      override def bringToFront(): Unit = js.native
      
      /* CompleteClass */
      override def resize(width: Double, height: Double): Unit = js.native
      
      /* CompleteClass */
      override def setPosition(x: Double, y: Double): Unit = js.native
      
      /* CompleteClass */
      override def setTitle(title: String): Unit = js.native
      
      /* CompleteClass */
      override def setTitleIcon(iconName: String): Unit = js.native
    }
    object Dialog {
      
      @JSGlobal("dockspawn.Dialog")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def fromElement(id: String, dockManager: typingsJapgolly.dockSpawn.dockspawn.DockManager): typingsJapgolly.dockSpawn.dockspawn.Dialog = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(id.asInstanceOf[js.Any], dockManager.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dockSpawn.dockspawn.Dialog]
    }
    
    /**
      * Dock manager manages all the dock panels in a hierarchy, similar to Visual Studio.
      * It owns an HTMLDivElement inside which all panels are docked.
      * Initially the document manager takes up the central space and acts as the root node.
      */
    @JSGlobal("dockspawn.DockManager")
    @js.native
    open class DockManager protected ()
      extends StObject
         with typingsJapgolly.dockSpawn.dockspawn.DockManager {
      def this(element: HTMLDivElement) = this()
      
      /* CompleteClass */
      var context: typingsJapgolly.dockSpawn.dockspawn.DockManagerContext = js.native
      
      /** Dock the [dialog] below the [referenceNode] node */
      /* CompleteClass */
      override def dockDialogDown(
        referenceNode: typingsJapgolly.dockSpawn.dockspawn.DockNode,
        dialog: typingsJapgolly.dockSpawn.dockspawn.Dialog
      ): typingsJapgolly.dockSpawn.dockspawn.DockNode = js.native
      
      /** Dock the [dialog] as a tab inside the [referenceNode] node */
      /* CompleteClass */
      override def dockDialogFill(
        referenceNode: typingsJapgolly.dockSpawn.dockspawn.DockNode,
        container: typingsJapgolly.dockSpawn.dockspawn.PanelContainer
      ): typingsJapgolly.dockSpawn.dockspawn.DockNode = js.native
      
      /** Dock the [dialog] to the left of the [referenceNode] node */
      /* CompleteClass */
      override def dockDialogLeft(
        referenceNode: typingsJapgolly.dockSpawn.dockspawn.DockNode,
        dialog: typingsJapgolly.dockSpawn.dockspawn.Dialog
      ): typingsJapgolly.dockSpawn.dockspawn.DockNode = js.native
      
      /** Dock the [dialog] to the right of the [referenceNode] node */
      /* CompleteClass */
      override def dockDialogRight(
        referenceNode: typingsJapgolly.dockSpawn.dockspawn.DockNode,
        dialog: typingsJapgolly.dockSpawn.dockspawn.Dialog
      ): typingsJapgolly.dockSpawn.dockspawn.DockNode = js.native
      
      /** Dock the [dialog] above the [referenceNode] node */
      /* CompleteClass */
      override def dockDialogUp(
        referenceNode: typingsJapgolly.dockSpawn.dockspawn.DockNode,
        dialog: typingsJapgolly.dockSpawn.dockspawn.Dialog
      ): typingsJapgolly.dockSpawn.dockspawn.DockNode = js.native
      
      /** Dock the [container] below the [referenceNode] node */
      /* CompleteClass */
      override def dockDown(
        referenceNode: typingsJapgolly.dockSpawn.dockspawn.DockNode,
        container: typingsJapgolly.dockSpawn.dockspawn.PanelContainer,
        ratio: Double
      ): typingsJapgolly.dockSpawn.dockspawn.DockNode = js.native
      
      /** Dock the [container] as a tab inside the [referenceNode] node */
      /* CompleteClass */
      override def dockFill(
        referenceNode: typingsJapgolly.dockSpawn.dockspawn.DockNode,
        container: typingsJapgolly.dockSpawn.dockspawn.PanelContainer
      ): typingsJapgolly.dockSpawn.dockspawn.DockNode = js.native
      
      /** Dock the [container] to the left of the [referenceNode] node */
      /* CompleteClass */
      override def dockLeft(
        referenceNode: typingsJapgolly.dockSpawn.dockspawn.DockNode,
        container: typingsJapgolly.dockSpawn.dockspawn.PanelContainer,
        ratio: Double
      ): typingsJapgolly.dockSpawn.dockspawn.DockNode = js.native
      
      /** Dock the [container] to the right of the [referenceNode] node */
      /* CompleteClass */
      override def dockRight(
        referenceNode: typingsJapgolly.dockSpawn.dockspawn.DockNode,
        container: typingsJapgolly.dockSpawn.dockspawn.PanelContainer,
        ratio: Double
      ): typingsJapgolly.dockSpawn.dockspawn.DockNode = js.native
      
      /** Dock the [container] above the [referenceNode] node */
      /* CompleteClass */
      override def dockUp(
        referenceNode: typingsJapgolly.dockSpawn.dockspawn.DockNode,
        container: typingsJapgolly.dockSpawn.dockspawn.PanelContainer,
        ratio: Double
      ): typingsJapgolly.dockSpawn.dockspawn.DockNode = js.native
      
      /* CompleteClass */
      override def initialize(): Unit = js.native
      
      /* CompleteClass */
      override def invalidate(): Unit = js.native
      
      /* CompleteClass */
      override def loadState(state: String): Unit = js.native
      
      /* CompleteClass */
      override def rebuildLayout(node: typingsJapgolly.dockSpawn.dockspawn.DockNode): Unit = js.native
      
      /* CompleteClass */
      override def resize(width: Double, height: Double): Unit = js.native
      
      /* CompleteClass */
      override def resumeLayout(): Unit = js.native
      
      /* CompleteClass */
      override def saveState(): String = js.native
      
      /**
        * Reset the dock model. This happens when state is loaded from JSON.
        */
      /* CompleteClass */
      override def setModel(model: typingsJapgolly.dockSpawn.dockspawn.DockModel): Unit = js.native
      
      /* CompleteClass */
      override def setRootNode(node: typingsJapgolly.dockSpawn.dockspawn.DockNode): Unit = js.native
      
      /* CompleteClass */
      override def suspendLayout(): Unit = js.native
    }
    
    @JSGlobal("dockspawn.DockManagerContext")
    @js.native
    open class DockManagerContext protected ()
      extends StObject
         with typingsJapgolly.dockSpawn.dockspawn.DockManagerContext {
      def this(dockManager: typingsJapgolly.dockSpawn.dockspawn.DockManager) = this()
      
      /* CompleteClass */
      var dockManager: typingsJapgolly.dockSpawn.dockspawn.DockManager = js.native
      
      /* CompleteClass */
      var documentManagerView: typingsJapgolly.dockSpawn.dockspawn.DocumentManagerContainer = js.native
      
      /* CompleteClass */
      var model: typingsJapgolly.dockSpawn.dockspawn.DockModel = js.native
    }
    
    @JSGlobal("dockspawn.DockModel")
    @js.native
    open class DockModel ()
      extends StObject
         with typingsJapgolly.dockSpawn.dockspawn.DockModel {
      
      /* CompleteClass */
      var documentManagerNode: typingsJapgolly.dockSpawn.dockspawn.DockNode = js.native
      
      /* CompleteClass */
      var rootNode: typingsJapgolly.dockSpawn.dockspawn.DockNode = js.native
    }
    
    @JSGlobal("dockspawn.DockNode")
    @js.native
    open class DockNode protected ()
      extends StObject
         with typingsJapgolly.dockSpawn.dockspawn.DockNode {
      def this(container: typingsJapgolly.dockSpawn.dockspawn.PanelContainer) = this()
      
      /* CompleteClass */
      override def detachFromParent(): Unit = js.native
    }
    
    /**
      * The document manager is then central area of the dock layout hierarchy.
      * This is where more important panels are placed (e.g. the text editor in an IDE,
      * 3D view in a modelling package etc
      */
    @JSGlobal("dockspawn.DocumentManagerContainer")
    @js.native
    open class DocumentManagerContainer protected ()
      extends StObject
         with typingsJapgolly.dockSpawn.dockspawn.DocumentManagerContainer {
      def this(dockManager: typingsJapgolly.dockSpawn.dockspawn.DockManager) = this()
      
      /* CompleteClass */
      var containerType: String = js.native
      
      /* CompleteClass */
      var dockManager: typingsJapgolly.dockSpawn.dockspawn.DockManager = js.native
      
      /* CompleteClass */
      var element: HTMLDivElement = js.native
      
      /* CompleteClass */
      var minimumAllowedChildNodes: Double = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      override def saveState(state: String): Unit = js.native
      
      /* CompleteClass */
      var selectedTab: typingsJapgolly.dockSpawn.dockspawn.TabPage = js.native
      
      /* CompleteClass */
      var tabHost: typingsJapgolly.dockSpawn.dockspawn.TabHost = js.native
      
      /* CompleteClass */
      var tabOrientation: TabStripDirection = js.native
    }
    
    @JSGlobal("dockspawn.FillDockContainer")
    @js.native
    open class FillDockContainer protected ()
      extends StObject
         with typingsJapgolly.dockSpawn.dockspawn.FillDockContainer {
      def this(dockManager: typingsJapgolly.dockSpawn.dockspawn.DockManager) = this()
      def this(dockManager: typingsJapgolly.dockSpawn.dockspawn.DockManager, tabStripDirection: TabStripDirection) = this()
      
      /* CompleteClass */
      var containerType: String = js.native
      
      /* CompleteClass */
      var dockManager: typingsJapgolly.dockSpawn.dockspawn.DockManager = js.native
      
      /* CompleteClass */
      var element: HTMLDivElement = js.native
      
      /* CompleteClass */
      var minimumAllowedChildNodes: Double = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      var tabHost: typingsJapgolly.dockSpawn.dockspawn.TabHost = js.native
      
      /* CompleteClass */
      var tabOrientation: TabStripDirection = js.native
    }
    
    @JSGlobal("dockspawn.PanelContainer")
    @js.native
    open class PanelContainer protected ()
      extends StObject
         with typingsJapgolly.dockSpawn.dockspawn.PanelContainer {
      def this(element: HTMLElement, dockManager: typingsJapgolly.dockSpawn.dockspawn.DockManager) = this()
      def this(element: HTMLElement, dockManager: typingsJapgolly.dockSpawn.dockspawn.DockManager, title: String) = this()
      
      /* CompleteClass */
      var height: Double = js.native
      
      /* CompleteClass */
      override def setTitle(title: String): Unit = js.native
      
      /* CompleteClass */
      override def setTitleIcon(iconName: String): Unit = js.native
      
      /* CompleteClass */
      var width: Double = js.native
    }
    
    /**
      * Tab Host control contains tabs known as TabPages.
      * The tab strip can be aligned in different orientations
      */
    @JSGlobal("dockspawn.TabHost")
    @js.native
    open class TabHost ()
      extends StObject
         with typingsJapgolly.dockSpawn.dockspawn.TabHost {
      def this(tabStripDirection: TabStripDirection) = this()
      def this(tabStripDirection: Unit, displayCloseButton: Boolean) = this()
      def this(tabStripDirection: TabStripDirection, displayCloseButton: Boolean) = this()
      
      /* CompleteClass */
      var contentElement: HTMLDivElement = js.native
      
      /* CompleteClass */
      var displayCloseButton: Boolean = js.native
      
      /* CompleteClass */
      var hostElement: HTMLDivElement = js.native
      
      /** Set the selected TabPage. */
      /* CompleteClass */
      override def onTabPageSelected(page: typingsJapgolly.dockSpawn.dockspawn.TabPage): Unit = js.native
      
      /* CompleteClass */
      var pages: js.Array[typingsJapgolly.dockSpawn.dockspawn.TabPage] = js.native
      
      /* CompleteClass */
      override def resize(width: Double, height: Double): Unit = js.native
      
      /* CompleteClass */
      var separatorElement: HTMLDivElement = js.native
      
      /* CompleteClass */
      override def setActiveTab(container: typingsJapgolly.dockSpawn.dockspawn.PanelContainer): Unit = js.native
      
      /* CompleteClass */
      var tabListElement: HTMLDivElement = js.native
      
      /* CompleteClass */
      var tabStripDirection: TabStripDirection = js.native
    }
    
    @JSGlobal("dockspawn.TabPage")
    @js.native
    open class TabPage protected ()
      extends StObject
         with typingsJapgolly.dockSpawn.dockspawn.TabPage {
      def this(
        host: typingsJapgolly.dockSpawn.dockspawn.TabHost,
        container: typingsJapgolly.dockSpawn.dockspawn.PanelContainer
      ) = this()
    }
    
    @JSGlobal("dockspawn.TabStripDirection")
    @js.native
    object TabStripDirection extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.dockSpawn.dockspawn.TabStripDirection & Double] = js.native
      
      /* 1 */ val DIRECTION_BOTTOM: typingsJapgolly.dockSpawn.dockspawn.TabStripDirection.DIRECTION_BOTTOM & Double = js.native
      
      /* 2 */ val DIRECTION_LEFT: typingsJapgolly.dockSpawn.dockspawn.TabStripDirection.DIRECTION_LEFT & Double = js.native
      
      /* 3 */ val DIRECTION_RIGHT: typingsJapgolly.dockSpawn.dockspawn.TabStripDirection.DIRECTION_RIGHT & Double = js.native
      
      /* 0 */ val DIRECTION_TOP: typingsJapgolly.dockSpawn.dockspawn.TabStripDirection.DIRECTION_TOP & Double = js.native
    }
  }
}
