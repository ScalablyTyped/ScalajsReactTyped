package typingsJapgolly.sharepoint.global.SP.Ribbon

import org.scalajs.dom.Element
import typingsJapgolly.sharepoint.CUI.CommandType
import typingsJapgolly.sharepoint.CUI.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Ribbon.Ribbon")
@js.native
open class Ribbon ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.Ribbon.Ribbon {
  
  /* CompleteClass */
  var _lastHeightUpdate: Double = js.native
  
  /* CompleteClass */
  var _lastLeftUpdate: Double = js.native
  
  /* CompleteClass */
  var _lastTopUpdate: Double = js.native
  
  /* CompleteClass */
  var _lastWidthUpdate: Double = js.native
  
  /* CompleteClass */
  override def addChild(child: Component): Unit = js.native
  
  /* CompleteClass */
  override def addChildAtIndex(child: Any, index: Double): Unit = js.native
  /* CompleteClass */
  override def addChildAtIndex(child: Component, index: Double): Any = js.native
  
  /* CompleteClass */
  override def addContextualGroup(id: String, title: String, color: Any, command: String): Any = js.native
  
  /* CompleteClass */
  override def appendChildrenToElement(elm: Element): Unit = js.native
  
  /* CompleteClass */
  override def createChildArray(): Unit = js.native
  
  //#region Methods
  /**
    * Releases resources held by an object that implements the Sys.IDisposable interface.
    * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  override def doDelayedInit(): Unit = js.native
  
  /* CompleteClass */
  override def ensureCorrectChildType(): Unit = js.native
  
  /* CompleteClass */
  override def ensureDOMElementAndEmpty(): Unit = js.native
  
  /* CompleteClass */
  override def getChild(id: String): Component = js.native
  
  /* CompleteClass */
  override def getChildByTitle(title: String): Component = js.native
  
  /* CompleteClass */
  override def getTextValue(): String = js.native
  
  /* CompleteClass */
  override def get_contextualGroupIds(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def get_cssClass(): String = js.native
  
  /* CompleteClass */
  override def get_description(): String = js.native
  
  /* CompleteClass */
  override def get_domElementTagName(): String = js.native
  
  /* CompleteClass */
  override def get_enabled(): Boolean = js.native
  
  /* CompleteClass */
  override def get_id(): String = js.native
  
  /* CompleteClass */
  override def get_needsDelayIniting(): Boolean = js.native
  
  /* CompleteClass */
  override def get_parent(): Component = js.native
  
  /* CompleteClass */
  override def get_root(): Component = js.native
  
  /* CompleteClass */
  override def get_title(): String = js.native
  
  /* CompleteClass */
  override def get_visible(): Boolean = js.native
  
  /* CompleteClass */
  override def get_visibleInDOM(): Boolean = js.native
  
  /* CompleteClass */
  override def hideContextualGroup(id: String): Unit = js.native
  
  /* CompleteClass */
  override def initRootMember(root: Component): Any = js.native
  
  /* CompleteClass */
  override def onEnabledChanged(enabled: Boolean): Any = js.native
  
  /* CompleteClass */
  override def onMenuClosed(): Unit = js.native
  
  /* CompleteClass */
  override def raiseCommandEvent(commandId: String, `type`: CommandType, properties: Any): Any = js.native
  
  /* CompleteClass */
  override def receiveFocus(): Unit = js.native
  
  /* CompleteClass */
  override def refresh(): Unit = js.native
  
  /* CompleteClass */
  override def removeChild(id: String): Unit = js.native
  
  /* CompleteClass */
  override def removeChildren(): Unit = js.native
  
  /* CompleteClass */
  override def removeContextualGroup(id: String): Unit = js.native
  
  /* CompleteClass */
  override def setFocus(): Unit = js.native
  
  /* CompleteClass */
  override def setFocusOnCurrentTab(): Unit = js.native
  
  /* CompleteClass */
  override def setFocusOnRibbon(): Unit = js.native
  
  /* CompleteClass */
  override def set_description(description: String): String = js.native
  
  /* CompleteClass */
  override def set_enabled(value: Boolean): Boolean = js.native
  
  /* CompleteClass */
  override def set_id(id: String): Unit = js.native
  
  /* CompleteClass */
  override def set_parent(value: Component): Component = js.native
  
  /* CompleteClass */
  override def set_title(title: String): String = js.native
  
  /* CompleteClass */
  override def set_visible(value: Boolean): Boolean = js.native
  
  /* CompleteClass */
  override def showContextualGroup(id: String): Unit = js.native
  
  /* CompleteClass */
  override def valueIsDirty(lastUpdate: Double): Boolean = js.native
}
