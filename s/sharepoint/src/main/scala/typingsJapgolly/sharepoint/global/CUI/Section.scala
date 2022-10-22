package typingsJapgolly.sharepoint.global.CUI

import org.scalajs.dom.Element
import typingsJapgolly.sharepoint.CUI.Alignment
import typingsJapgolly.sharepoint.CUI.RowType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CUI.Section")
@js.native
open class Section protected ()
  extends StObject
     with typingsJapgolly.sharepoint.CUI.Section {
  /**
    * @param type  2 - OneRow, 3 - TwoRow, 4 - ThreeRow.
    * @param alignment 0 - Top, 2  - Middle,
    */
  def this(ribbon: typingsJapgolly.sharepoint.CUI.Ribbon, id: String, `type`: RowType, alignment: Alignment) = this()
  
  /* CompleteClass */
  var _lastHeightUpdate: Double = js.native
  
  /* CompleteClass */
  var _lastLeftUpdate: Double = js.native
  
  /* CompleteClass */
  var _lastTopUpdate: Double = js.native
  
  /* CompleteClass */
  var _lastWidthUpdate: Double = js.native
  
  /* CompleteClass */
  override def addChild(child: typingsJapgolly.sharepoint.CUI.Component): scala.Unit = js.native
  
  /* CompleteClass */
  override def addChildAtIndex(child: typingsJapgolly.sharepoint.CUI.Component, index: Double): Any = js.native
  
  /* CompleteClass */
  override def appendChildrenToElement(elm: Element): scala.Unit = js.native
  
  /* CompleteClass */
  override def createChildArray(): scala.Unit = js.native
  
  //#region Methods
  /**
    * Releases resources held by an object that implements the Sys.IDisposable interface.
    * Implement the dispose method to close or release resources held by an object, or to prepare an object for reuse.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  
  /* CompleteClass */
  override def doDelayedInit(): scala.Unit = js.native
  
  /* CompleteClass */
  override def ensureCorrectChildType(): scala.Unit = js.native
  
  /* CompleteClass */
  override def ensureDOMElementAndEmpty(): scala.Unit = js.native
  
  /* CompleteClass */
  override def getChild(id: String): typingsJapgolly.sharepoint.CUI.Component = js.native
  
  /* CompleteClass */
  override def getChildByTitle(title: String): typingsJapgolly.sharepoint.CUI.Component = js.native
  
  /* CompleteClass */
  override def getRow(rowIndex: Double): typingsJapgolly.sharepoint.CUI.Row = js.native
  
  /* CompleteClass */
  override def getTextValue(): String = js.native
  
  /* CompleteClass */
  override def get_alignment(): Double = js.native
  
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
  override def get_parent(): typingsJapgolly.sharepoint.CUI.Component = js.native
  
  /* CompleteClass */
  override def get_ribbon(): typingsJapgolly.sharepoint.CUI.Ribbon = js.native
  
  /* CompleteClass */
  override def get_root(): typingsJapgolly.sharepoint.CUI.Component = js.native
  
  /* CompleteClass */
  override def get_title(): String = js.native
  
  /* CompleteClass */
  override def get_type(): Double = js.native
  
  /* CompleteClass */
  override def get_visible(): Boolean = js.native
  
  /* CompleteClass */
  override def get_visibleInDOM(): Boolean = js.native
  
  /* CompleteClass */
  override def initRootMember(root: typingsJapgolly.sharepoint.CUI.Component): Any = js.native
  
  /* CompleteClass */
  override def onEnabledChanged(enabled: Boolean): Any = js.native
  
  /* CompleteClass */
  override def onMenuClosed(): scala.Unit = js.native
  
  /* CompleteClass */
  override def raiseCommandEvent(commandId: String, `type`: typingsJapgolly.sharepoint.CUI.CommandType, properties: Any): Any = js.native
  
  /* CompleteClass */
  override def receiveFocus(): scala.Unit = js.native
  
  /* CompleteClass */
  override def removeChild(id: String): scala.Unit = js.native
  
  /* CompleteClass */
  override def removeChildren(): scala.Unit = js.native
  
  /* CompleteClass */
  override def set_description(description: String): String = js.native
  
  /* CompleteClass */
  override def set_enabled(value: Boolean): Boolean = js.native
  
  /* CompleteClass */
  override def set_id(id: String): scala.Unit = js.native
  
  /* CompleteClass */
  override def set_parent(value: typingsJapgolly.sharepoint.CUI.Component): typingsJapgolly.sharepoint.CUI.Component = js.native
  
  /* CompleteClass */
  override def set_title(title: String): String = js.native
  
  /* CompleteClass */
  override def set_visible(value: Boolean): Boolean = js.native
  
  /* CompleteClass */
  override def valueIsDirty(lastUpdate: Double): Boolean = js.native
}
