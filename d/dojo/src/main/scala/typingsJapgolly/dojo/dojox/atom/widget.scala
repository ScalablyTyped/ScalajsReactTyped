package typingsJapgolly.dojo.dojox.atom

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dijit.Widget
import typingsJapgolly.dojo.dijit.WidgetBase
import typingsJapgolly.dojo.dojoStrings.alertsEnabled
import typingsJapgolly.dojo.dojoStrings.attachScope
import typingsJapgolly.dojo.dojoStrings.contextRequire
import typingsJapgolly.dojo.dojoStrings.deleteButton
import typingsJapgolly.dojo.dojoStrings.displayEntrySections
import typingsJapgolly.dojo.dojoStrings.enableEdit
import typingsJapgolly.dojo.dojoStrings.enableMenu
import typingsJapgolly.dojo.dojoStrings.enableMenuFade
import typingsJapgolly.dojo.dojoStrings.entry
import typingsJapgolly.dojo.dojoStrings.entryNewButton
import typingsJapgolly.dojo.dojoStrings.entryNode
import typingsJapgolly.dojo.dojoStrings.entrySelectionTopic
import typingsJapgolly.dojo.dojoStrings.feed
import typingsJapgolly.dojo.dojoStrings.feedViewerTable
import typingsJapgolly.dojo.dojoStrings.feedViewerTableBody
import typingsJapgolly.dojo.dojoStrings.groupingNode
import typingsJapgolly.dojo.dojoStrings.localSaveOnly
import typingsJapgolly.dojo.dojoStrings.searchContainerNode
import typingsJapgolly.dojo.dojoStrings.style
import typingsJapgolly.dojo.dojoStrings.templatePath
import typingsJapgolly.dojo.dojoStrings.templateString
import typingsJapgolly.dojo.dojoStrings.timeNode
import typingsJapgolly.dojo.dojoStrings.titleNode
import typingsJapgolly.dojo.dojoStrings.url
import typingsJapgolly.dojo.dojoStrings.widgetsInTemplate
import typingsJapgolly.dojo.dojoStrings.xmethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.atom.widget")
@js.native
object widget extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/widget/FeedEntryEditor.html
    *
    * An ATOM feed entry editor that allows viewing of the individual attributes of an entry.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  @js.native
  class FeedEntryEditor () extends FeedEntryViewer {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      *
      */
    var enableEdit: Boolean = js.native
    /**
      *
      */
    var entryNewButton: js.Object = js.native
    /**
      * Cancels edits and reverts the editor to its previous state (display mode)
      *
      */
    def cancelEdits(): js.Any = js.native
    /**
      *
      */
    def clearEditors(): Unit = js.native
    @JSName("get")
    def get_enableEdit(property: enableEdit): Boolean = js.native
    @JSName("get")
    def get_entryNewButton(property: entryNewButton): js.Object = js.native
    /**
      * Saves edits submitted when the 'save' button is pressed.
      * Saves edits submitted when the 'save' button is pressed.  Distinguishes between new and existing
      * entries and saves appropriately.  Fetches the values of the editors, and, if existing, compares them to
      * the existing values and submits the updates, otherwise creates a new entry and posts it as a new entry.
      *
      */
    def saveEdits(): js.Any = js.native
    /**
      * Function to set the contents of the title node in the template to some value from the entry.
      * Function to set the contents of the title node in the template to some value from the entry.
      * This exists specifically so users can over-ride how the title data is filled out from an entry.
      *
      * @param titleAnchorNode The DOM node to attach the title data to.
      * @param editMode Boolean to indicate if the display should be in edit mode or not.
      * @param entry The Feed Entry to work with.
      */
    def setTitle(titleAnchorNode: HTMLElement, editMode: Boolean, entry: js.Object): Unit = js.native
    @JSName("set")
    def set_enableEdit(property: enableEdit, value: Boolean): Unit = js.native
    @JSName("set")
    def set_entryNewButton(property: entryNewButton, value: js.Object): Unit = js.native
    @JSName("watch")
    def watch_enableEdit(
      property: enableEdit,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_entryNewButton(
      property: entryNewButton,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): AnonUnwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/widget/FeedEntryViewer.html
    *
    * An ATOM feed entry editor for publishing updated ATOM entries, or viewing non-editable entries.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.dojo.dijit.AttachMixin because Inheritance from two classes. Inlined 
  - typingsJapgolly.dojo.dijit.WidgetsInTemplateMixin because Inheritance from two classes. Inlined 
  - typingsJapgolly.dojo.dijit.TemplatedMixin because Inheritance from two classes. Inlined 
  - typingsJapgolly.dojo.dijit.Container because Inheritance from two classes. Inlined addChild, addChild, getIndexOfChild, hasChildren, removeChild, removeChild
  - typingsJapgolly.dojo.dijit.Templated because Inheritance from two classes. Inlined attachScope, contextRequire, searchContainerNode, templatePath, templateString, widgetsInTemplate, buildRendering, destroyRendering, startup, getCachedTemplate */ @js.native
  class FeedEntryViewer () extends Widget {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * Object to which attach points and events will be scoped.  Defaults
      * to 'this'.
      *
      */
    var attachScope: js.Object = js.native
    /**
      * Used to provide a context require to the dojo/parser in order to be
      * able to use relative MIDs (e.g. ./Widget) in the widget's template.
      *
      */
    var contextRequire: js.Function = js.native
    /**
      *
      */
    var displayEntrySections: String = js.native
    /**
      *
      */
    var enableMenu: Boolean = js.native
    /**
      *
      */
    var enableMenuFade: Boolean = js.native
    /**
      *
      */
    var entrySelectionTopic: String = js.native
    /**
      *
      */
    var searchContainerNode: Boolean = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style_FeedEntryViewer: String = js.native
    /**
      * Path to template (HTML file) for this widget relative to dojo.baseUrl.
      * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
      *
      */
    var templatePath: String = js.native
    /**
      *
      */
    var templateString: String = js.native
    /**
      * Should we parse the template to find widgets that might be
      * declared in markup inside it?  False by default.
      *
      */
    var widgetsInTemplate: Boolean = js.native
    /**
      *
      */
    def EntryHeader(): Unit = js.native
    /**
      * Makes the given widget a child of this widget.
      * Inserts specified child widget's dom node as a child of this widget's
      * container node, and possibly does other processing (such as layout).
      * 
      * @param widget             
      * @param insertIndex               Optional            
      */
    def addChild(widget: WidgetBase): Unit = js.native
    /**
      * Makes the given widget a child of this widget.
      * Inserts specified child widget's dom node as a child of this widget's
      * container node, and possibly does other processing (such as layout).
      *
      * @param widget
      * @param insertIndex               Optional
      */
    def addChild(widget: WidgetBase, insertIndex: Double): Unit = js.native
    /**
      * Function to clear the state of the widget.
      *
      */
    def clear(): Unit = js.native
    /**
      * Function to clear all the display nodes for the ATOM entry from the viewer.
      *
      */
    def clearNodes(): Unit = js.native
    /**
      * Static method to get a template based on the templatePath or
      * templateString key
      */
    /**
      * Static method to get a template based on the templatePath or
      * templateString key
      */
    def getCachedTemplate(): js.Any = js.native
    /**
      *
      */
    def getEntry(): js.Any = js.native
    /**
      *
      */
    def getFeed(): js.Any = js.native
    /**
      * Gets the index of the child in this container or -1 if not found
      *
      * @param child
      */
    /**
      * Gets the index of the child in this container or -1 if not found
      * 
      * @param child             
      */
    def getIndexOfChild(child: WidgetBase): js.Any = js.native
    @JSName("get")
    def get_attachScope(property: attachScope): js.Object = js.native
    @JSName("get")
    def get_contextRequire(property: contextRequire): js.Function = js.native
    @JSName("get")
    def get_displayEntrySections(property: displayEntrySections): String = js.native
    @JSName("get")
    def get_enableMenu(property: enableMenu): Boolean = js.native
    @JSName("get")
    def get_enableMenuFade(property: enableMenuFade): Boolean = js.native
    @JSName("get")
    def get_entrySelectionTopic(property: entrySelectionTopic): String = js.native
    @JSName("get")
    def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
    @JSName("get")
    def get_templatePath(property: templatePath): String = js.native
    @JSName("get")
    def get_templateString(property: templateString): String = js.native
    @JSName("get")
    def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
    /**
      * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
      *
      */
    /**
      * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
      * 
      */
    def hasChildren(): Boolean = js.native
    /**
      * Function to return if a displayable field is valid or not
      *
      * @param field The field name to get the valid parameter of.  Such as 'content', 'id', etc.
      */
    def isFieldValid(field: String): js.Any = js.native
    /**
      * Removes the passed widget instance from this widget but does
      * not destroy it.  You can also pass in an integer indicating
      * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
      *
      * @param widget
      */
    /**
      * Removes the passed widget instance from this widget but does
      * not destroy it.  You can also pass in an integer indicating
      * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
      * 
      * @param widget             
      */
    def removeChild(widget: Double): Unit = js.native
    /**
      * Removes the passed widget instance from this widget but does
      * not destroy it.  You can also pass in an integer indicating
      * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
      *
      * @param widget
      */
    /**
      * Removes the passed widget instance from this widget but does
      * not destroy it.  You can also pass in an integer indicating
      * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
      * 
      * @param widget             
      */
    def removeChild(widget: WidgetBase): Unit = js.native
    /**
      * Function to set the contents of the author node in the template to some value from the entry.
      * Function to set the contents of the author node in the template to some value from the entry.
      * This exists specifically so users can over-ride how the title data is filled out from an entry.
      *
      * @param authorsAnchorNode The DOM node to attach the author data to.
      * @param editMode Boolean to indicate if the display should be in edit mode or not.
      * @param entry The Feed Entry to work with.
      */
    def setAuthors(authorsAnchorNode: HTMLElement, editMode: Boolean, entry: js.Object): Unit = js.native
    /**
      * Function to set the title format for the authors section of the author row in the template to some value from the entry.
      * Function to set the title format for the authors section of the author row in the template to some value from the entry.
      * This exists specifically so users can over-ride how the author data is filled out from an entry.
      *
      * @param authorHeaderNode The DOM node to attach the author section header data to.
      * @param entry The Feed Entry to work with.
      */
    def setAuthorsHeader(authorHeaderNode: HTMLElement, entry: js.Object): Unit = js.native
    /**
      * Function to set the contents of the content node in the template to some value from the entry.
      * Function to set the contents of the content node in the template to some value from the entry.
      * This exists specifically so users can over-ride how the title data is filled out from an entry.
      *
      * @param contentAnchorNode The DOM node to attach the content data to.
      * @param editMode Boolean to indicate if the display should be in edit mode or not.
      * @param entry The Feed Entry to work with.
      */
    def setContent(contentAnchorNode: HTMLElement, editMode: Boolean, entry: js.Object): Unit = js.native
    /**
      * Function to set the contents of the content node in the template to some value from the entry.
      * Function to set the contents of the content node in the template to some value from the entry.
      * This exists specifically so users can over-ride how the title data is filled out from an entry.
      *
      * @param contentHeaderNode The DOM node to attach the content data to.
      * @param entry The Feed Entry to work with.
      */
    def setContentHeader(contentHeaderNode: HTMLElement, entry: js.Object): Unit = js.native
    /**
      * Function to set the contents of the contributor node in the template to some value from the entry.
      * Function to set the contents of the contributor node in the template to some value from the entry.
      * This exists specifically so users can over-ride how the title data is filled out from an entry.
      *
      * @param contributorsAnchorNode The DOM node to attach the contributor data to.
      * @param editMode Boolean to indicate if the display should be in edit mode or not.
      * @param entry The Feed Entry to work with.
      */
    def setContributors(contributorsAnchorNode: HTMLElement, editMode: Boolean, entry: js.Object): Unit = js.native
    /**
      * Function to set the contents of the contributor header node in the template to some value from the entry.
      * Function to set the contents of the contributor header node in the template to some value from the entry.
      * This exists specifically so users can over-ride how the title data is filled out from an entry.
      *
      * @param contributorsHeaderNode The DOM node to attach the contributor title to.
      * @param entry The Feed Entry to work with.
      */
    def setContributorsHeader(contributorsHeaderNode: HTMLElement, entry: js.Object): Unit = js.native
    /**
      * Function for setting which sections of the entry should be displayed.
      *
      * @param sectionsArray Array of string names that indicate which sections to display.
      */
    def setDisplaySections(sectionsArray: js.Array[_]): js.Any = js.native
    /**
      * Function to set the current entry that is being edited.
      *
      * @param entry Instance of dojox.atom.io.model.Entry to display for reading/editing.
      * @param feed
      * @param leaveMenuState
      */
    def setEntry(entry: js.Object, feed: js.Object, leaveMenuState: Boolean): Unit = js.native
    /**
      * Function to set whether a field in the view is valid and displayable.
      * Function to set whether a field in the view is valid and displayable.
      * This is needed for over-riding of the set* functions and customization of how data is displayed in the attach point.
      * So if custom implementations use their own display logic, they can still enable the field.
      *
      * @param field The field name to set the valid parameter on.  Such as 'content', 'id', etc.
      * @param isValid Flag denoting if the field is valid or not.
      */
    def setFieldValidity(field: String, isValid: Boolean): js.Any = js.native
    /**
      * Function to set the contents of the ID  node in the template to some value from the entry.
      * Function to set the contents of the ID node in the template to some value from the entry.
      * This exists specifically so users can over-ride how the title data is filled out from an entry.
      *
      * @param idAnchorNode The DOM node to attach the ID data to.
      * @param editMode Boolean to indicate if the display should be in edit mode or not.
      * @param entry The Feed Entry to work with.
      */
    def setId(idAnchorNode: HTMLElement, editMode: Boolean, entry: js.Object): Unit = js.native
    /**
      * Function to set the contents of the ID  node in the template to some value from the entry.
      * Function to set the contents of the ID node in the template to some value from the entry.
      * This exists specifically so users can over-ride how the title data is filled out from an entry.
      *
      * @param idHeaderNode
      * @param entry The Feed Entry to work with.
      */
    def setIdHeader(idHeaderNode: HTMLElement, entry: js.Object): Unit = js.native
    /**
      * Function to set the contents of the summary  node in the template to some value from the entry.
      * Function to set the contents of the summary node in the template to some value from the entry.
      * This exists specifically so users can over-ride how the title data is filled out from an entry.
      *
      * @param summaryAnchorNode The DOM node to attach the summary data to.
      * @param editMode Boolean to indicate if the display should be in edit mode or not.
      * @param entry The Feed Entry to work with.
      */
    def setSummary(summaryAnchorNode: HTMLElement, editMode: Boolean, entry: js.Object): Unit = js.native
    /**
      * Function to set the contents of the summary  node in the template to some value from the entry.
      * Function to set the contents of the summary node in the template to some value from the entry.
      * This exists specifically so users can over-ride how the title data is filled out from an entry.
      *
      * @param summaryHeaderNode The DOM node to attach the summary title to.
      * @param entry The Feed Entry to work with.
      */
    def setSummaryHeader(summaryHeaderNode: HTMLElement, entry: js.Object): Unit = js.native
    /**
      * Function to set the contents of the title node in the template to some value from the entry.
      * Function to set the contents of the title node in the template to some value from the entry.
      * This exists specifically so users can over-ride how the title data is filled out from an entry.
      *
      * @param titleAnchorNode The DOM node to attach the title data to.
      * @param editMode Boolean to indicate if the display should be in edit mode or not.
      * @param entry The Feed Entry to work with.
      */
    def setTitle(titleAnchorNode: js.Any, editMode: js.Any, entry: js.Any): Unit = js.native
    /**
      * Function to set the contents of the title header node in the template to some value.
      * Function to set the contents of the title header node in the template to some value.
      * This exists specifically so users can over-ride how the title data is filled out from an entry.
      *
      * @param titleHeaderNode
      * @param entry The Feed Entry to work with.
      */
    def setTitleHeader(titleHeaderNode: HTMLElement, entry: js.Object): Unit = js.native
    /**
      * Function to set the contents of the updated  node in the template to some value from the entry.
      * Function to set the contents of the updated node in the template to some value from the entry.
      * This exists specifically so users can over-ride how the title data is filled out from an entry.
      *
      * @param updatedAnchorNode The DOM node to attach the udpated data to.
      * @param editMode Boolean to indicate if the display should be in edit mode or not.
      * @param entry The Feed Entry to work with.
      */
    def setUpdated(updatedAnchorNode: HTMLElement, editMode: Boolean, entry: js.Object): Unit = js.native
    /**
      * Function to set the contents of the updated header node in the template to some value from the entry.
      * Function to set the contents of the updated header node in the template to some value from the entry.
      * This exists specifically so users can over-ride how the title data is filled out from an entry.
      *
      * @param updatedHeaderNode The DOM node to attach the updated header data to.
      * @param entry The Feed Entry to work with.
      */
    def setUpdatedHeader(updatedHeaderNode: HTMLElement, entry: js.Object): Unit = js.native
    @JSName("set")
    def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
    @JSName("set")
    def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
    @JSName("set")
    def set_displayEntrySections(property: displayEntrySections, value: String): Unit = js.native
    @JSName("set")
    def set_enableMenu(property: enableMenu, value: Boolean): Unit = js.native
    @JSName("set")
    def set_enableMenuFade(property: enableMenuFade, value: Boolean): Unit = js.native
    @JSName("set")
    def set_entrySelectionTopic(property: entrySelectionTopic, value: String): Unit = js.native
    @JSName("set")
    def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_templatePath(property: templatePath, value: String): Unit = js.native
    @JSName("set")
    def set_templateString(property: templateString, value: String): Unit = js.native
    @JSName("set")
    def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
    @JSName("watch")
    def watch_attachScope(
      property: attachScope,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_contextRequire(
      property: contextRequire,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Function], 
          /* newValue */ js.UndefOr[js.Function], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_displayEntrySections(
      property: displayEntrySections,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_enableMenu(
      property: enableMenu,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_enableMenuFade(
      property: enableMenuFade,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_entrySelectionTopic(
      property: entrySelectionTopic,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_searchContainerNode(
      property: searchContainerNode,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_templatePath(
      property: templatePath,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_templateString(
      property: templateString,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_widgetsInTemplate(
      property: widgetsInTemplate,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): AnonUnwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/widget/FeedViewer.html
    *
    * An ATOM feed viewer that allows for viewing a feed, deleting entries, and editing entries.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.dojo.dijit.AttachMixin because Inheritance from two classes. Inlined 
  - typingsJapgolly.dojo.dijit.WidgetsInTemplateMixin because Inheritance from two classes. Inlined 
  - typingsJapgolly.dojo.dijit.TemplatedMixin because Inheritance from two classes. Inlined 
  - typingsJapgolly.dojo.dijit.Container because Inheritance from two classes. Inlined addChild, addChild, getIndexOfChild, hasChildren, removeChild, removeChild
  - typingsJapgolly.dojo.dijit.Templated because Inheritance from two classes. Inlined attachScope, contextRequire, searchContainerNode, templatePath, templateString, widgetsInTemplate, buildRendering, destroyRendering, startup, getCachedTemplate */ @js.native
  class FeedViewer () extends Widget {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      *
      */
    var alertsEnabled: Boolean = js.native
    /**
      * Object to which attach points and events will be scoped.  Defaults
      * to 'this'.
      *
      */
    var attachScope: js.Object = js.native
    /**
      * Used to provide a context require to the dojo/parser in order to be
      * able to use relative MIDs (e.g. ./Widget) in the widget's template.
      *
      */
    var contextRequire: js.Function = js.native
    /**
      *
      */
    var entrySelectionTopic: String = js.native
    /**
      *
      */
    var feedViewerTable: js.Object = js.native
    /**
      *
      */
    var feedViewerTableBody: js.Object = js.native
    /**
      *
      */
    var localSaveOnly: Boolean = js.native
    /**
      *
      */
    var searchContainerNode: Boolean = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style_FeedViewer: String = js.native
    /**
      * Path to template (HTML file) for this widget relative to dojo.baseUrl.
      * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
      *
      */
    var templatePath: String = js.native
    /**
      *
      */
    var templateString: String = js.native
    /**
      *
      */
    var url: String = js.native
    /**
      * Should we parse the template to find widgets that might be
      * declared in markup inside it?  False by default.
      *
      */
    var widgetsInTemplate: Boolean = js.native
    /**
      *
      */
    var xmethod: Boolean = js.native
    /**
      *
      */
    def AtomEntryCategoryFilter(): Unit = js.native
    /**
      *
      */
    def CategoryIncludeFilter(): Unit = js.native
    /**
      *
      */
    def FeedViewerEntry(): Unit = js.native
    /**
      *
      */
    def FeedViewerGrouping(): Unit = js.native
    /**
      * Function to add a filter for entry inclusion in the feed view.
      *
      * @param filter The basic items to filter on and the values.Should be of format: {scheme: some text or null, term: some text or null, label: some text or null}
      */
    def addCategoryIncludeFilter(filter: js.Object): js.Any = js.native
    /**
      * Makes the given widget a child of this widget.
      * Inserts specified child widget's dom node as a child of this widget's
      * container node, and possibly does other processing (such as layout).
      * 
      * @param widget             
      * @param insertIndex               Optional            
      */
    def addChild(widget: WidgetBase): Unit = js.native
    /**
      * Makes the given widget a child of this widget.
      * Inserts specified child widget's dom node as a child of this widget's
      * container node, and possibly does other processing (such as layout).
      *
      * @param widget
      * @param insertIndex               Optional
      */
    def addChild(widget: WidgetBase, insertIndex: Double): Unit = js.native
    /**
      * Function for appending an entry to the feed view.
      *
      * @param entry The dojox.atom.io.model.Entry object to append
      */
    def appendEntry(entry: js.Object): js.Any = js.native
    /**
      * Function for appending a new grouping of entries to the feed view.
      *
      * @param titleText
      */
    def appendGrouping(titleText: String): js.Any = js.native
    /**
      * Function clearing all current entries in the feed view.
      *
      */
    def clear(): js.Any = js.native
    /**
      * Function for deleting a row from the view
      *
      * @param entryRow
      */
    def deleteEntry(entryRow: js.Object): Unit = js.native
    /**
      * Static method to get a template based on the templatePath or
      * templateString key
      */
    /**
      * Static method to get a template based on the templatePath or
      * templateString key
      */
    def getCachedTemplate(): js.Any = js.native
    /**
      * Gets the index of the child in this container or -1 if not found
      *
      * @param child
      */
    /**
      * Gets the index of the child in this container or -1 if not found
      * 
      * @param child             
      */
    def getIndexOfChild(child: WidgetBase): js.Any = js.native
    @JSName("get")
    def get_alertsEnabled(property: alertsEnabled): Boolean = js.native
    @JSName("get")
    def get_attachScope(property: attachScope): js.Object = js.native
    @JSName("get")
    def get_contextRequire(property: contextRequire): js.Function = js.native
    @JSName("get")
    def get_entrySelectionTopic(property: entrySelectionTopic): String = js.native
    @JSName("get")
    def get_feedViewerTable(property: feedViewerTable): js.Object = js.native
    @JSName("get")
    def get_feedViewerTableBody(property: feedViewerTableBody): js.Object = js.native
    @JSName("get")
    def get_localSaveOnly(property: localSaveOnly): Boolean = js.native
    @JSName("get")
    def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
    @JSName("get")
    def get_templatePath(property: templatePath): String = js.native
    @JSName("get")
    def get_templateString(property: templateString): String = js.native
    @JSName("get")
    def get_url(property: url): String = js.native
    @JSName("get")
    def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
    @JSName("get")
    def get_xmethod(property: xmethod): Boolean = js.native
    /**
      * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
      *
      */
    /**
      * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
      * 
      */
    def hasChildren(): Boolean = js.native
    /**
      * Function intended for over-riding/replacement as an attachpoint to for other items to recieve
      * selection notification.
      *
      * @param entry The dojox.atom.io.model.Entry object selected.
      */
    def onEntrySelected(entry: js.Object): js.Any = js.native
    /**
      * Function to remove a filter for entry inclusion in the feed view.
      *
      * @param filter The basic items to identify the filter that is present.Should be of format: {scheme: some text or null, term: some text or null, label: some text or null}
      */
    def removeCategoryIncludeFilter(filter: js.Object): js.Any = js.native
    /**
      * Removes the passed widget instance from this widget but does
      * not destroy it.  You can also pass in an integer indicating
      * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
      *
      * @param widget
      */
    /**
      * Removes the passed widget instance from this widget but does
      * not destroy it.  You can also pass in an integer indicating
      * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
      * 
      * @param widget             
      */
    def removeChild(widget: Double): Unit = js.native
    /**
      * Removes the passed widget instance from this widget but does
      * not destroy it.  You can also pass in an integer indicating
      * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
      *
      * @param widget
      */
    /**
      * Removes the passed widget instance from this widget but does
      * not destroy it.  You can also pass in an integer indicating
      * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
      * 
      * @param widget             
      */
    def removeChild(widget: WidgetBase): Unit = js.native
    /**
      * Function setting the dojox.atom.io.model.Feed data into the view.
      *
      * @param feed
      */
    def setFeed(feed: js.Object): js.Any = js.native
    /**
      * Function setting the feed from a URL which to get the feed.
      *
      * @param url The URL to the feed to load.
      */
    def setFeedFromUrl(url: String): js.Any = js.native
    @JSName("set")
    def set_alertsEnabled(property: alertsEnabled, value: Boolean): Unit = js.native
    @JSName("set")
    def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
    @JSName("set")
    def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
    @JSName("set")
    def set_entrySelectionTopic(property: entrySelectionTopic, value: String): Unit = js.native
    @JSName("set")
    def set_feedViewerTable(property: feedViewerTable, value: js.Object): Unit = js.native
    @JSName("set")
    def set_feedViewerTableBody(property: feedViewerTableBody, value: js.Object): Unit = js.native
    @JSName("set")
    def set_localSaveOnly(property: localSaveOnly, value: Boolean): Unit = js.native
    @JSName("set")
    def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_templatePath(property: templatePath, value: String): Unit = js.native
    @JSName("set")
    def set_templateString(property: templateString, value: String): Unit = js.native
    @JSName("set")
    def set_url(property: url, value: String): Unit = js.native
    @JSName("set")
    def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
    @JSName("set")
    def set_xmethod(property: xmethod, value: Boolean): Unit = js.native
    @JSName("watch")
    def watch_alertsEnabled(
      property: alertsEnabled,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_attachScope(
      property: attachScope,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_contextRequire(
      property: contextRequire,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Function], 
          /* newValue */ js.UndefOr[js.Function], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_entrySelectionTopic(
      property: entrySelectionTopic,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_feedViewerTable(
      property: feedViewerTable,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_feedViewerTableBody(
      property: feedViewerTableBody,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_localSaveOnly(
      property: localSaveOnly,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_searchContainerNode(
      property: searchContainerNode,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_templatePath(
      property: templatePath,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_templateString(
      property: templateString,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_url(
      property: url,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_widgetsInTemplate(
      property: widgetsInTemplate,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_xmethod(
      property: xmethod,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): AnonUnwatch = js.native
  }
  
  @js.native
  object FeedEntryViewer extends js.Object {
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/widget/FeedEntryViewer.EntryHeader.html
      *
      * Widget representing a header in a FeedEntryViewer/Editor
      *
      * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
      * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typingsJapgolly.dojo.dijit.AttachMixin because Inheritance from two classes. Inlined 
    - typingsJapgolly.dojo.dijit.WidgetsInTemplateMixin because Inheritance from two classes. Inlined 
    - typingsJapgolly.dojo.dijit.TemplatedMixin because Inheritance from two classes. Inlined 
    - typingsJapgolly.dojo.dijit.Container because Inheritance from two classes. Inlined addChild, addChild, getIndexOfChild, hasChildren, removeChild, removeChild
    - typingsJapgolly.dojo.dijit.Templated because Inheritance from two classes. Inlined attachScope, contextRequire, searchContainerNode, templatePath, templateString, widgetsInTemplate, buildRendering, destroyRendering, startup, getCachedTemplate */ @js.native
    class EntryHeader () extends Widget {
      def this(params: js.Object) = this()
      def this(params: js.Object, srcNodeRef: HTMLElement) = this()
      /**
        * Object to which attach points and events will be scoped.  Defaults
        * to 'this'.
        *
        */
      var attachScope: js.Object = js.native
      /**
        * Used to provide a context require to the dojo/parser in order to be
        * able to use relative MIDs (e.g. ./Widget) in the widget's template.
        *
        */
      var contextRequire: js.Function = js.native
      /**
        *
        */
      var searchContainerNode: Boolean = js.native
      /**
        * HTML style attributes as cssText string or name/value hash
        *
        */
      @JSName("style")
      var style_EntryHeader: String = js.native
      /**
        * Path to template (HTML file) for this widget relative to dojo.baseUrl.
        * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
        *
        */
      var templatePath: String = js.native
      /**
        *
        */
      var templateString: String = js.native
      /**
        * Should we parse the template to find widgets that might be
        * declared in markup inside it?  False by default.
        *
        */
      var widgetsInTemplate: Boolean = js.native
      /**
        * Makes the given widget a child of this widget.
        * Inserts specified child widget's dom node as a child of this widget's
        * container node, and possibly does other processing (such as layout).
        * 
        * @param widget             
        * @param insertIndex               Optional            
        */
      def addChild(widget: WidgetBase): Unit = js.native
      /**
        * Makes the given widget a child of this widget.
        * Inserts specified child widget's dom node as a child of this widget's
        * container node, and possibly does other processing (such as layout).
        *
        * @param widget
        * @param insertIndex               Optional
        */
      def addChild(widget: WidgetBase, insertIndex: Double): Unit = js.native
      /**
        *
        */
      def clear(): Unit = js.native
      /**
        * Static method to get a template based on the templatePath or
        * templateString key
        */
      /**
        * Static method to get a template based on the templatePath or
        * templateString key
        */
      def getCachedTemplate(): js.Any = js.native
      /**
        * Gets the index of the child in this container or -1 if not found
        *
        * @param child
        */
      /**
        * Gets the index of the child in this container or -1 if not found
        * 
        * @param child             
        */
      def getIndexOfChild(child: WidgetBase): js.Any = js.native
      @JSName("get")
      def get_attachScope(property: attachScope): js.Object = js.native
      @JSName("get")
      def get_contextRequire(property: contextRequire): js.Function = js.native
      @JSName("get")
      def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
      @JSName("get")
      def get_templatePath(property: templatePath): String = js.native
      @JSName("get")
      def get_templateString(property: templateString): String = js.native
      @JSName("get")
      def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
      /**
        * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
        *
        */
      /**
        * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
        * 
        */
      def hasChildren(): Boolean = js.native
      /**
        * Removes the passed widget instance from this widget but does
        * not destroy it.  You can also pass in an integer indicating
        * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
        *
        * @param widget
        */
      /**
        * Removes the passed widget instance from this widget but does
        * not destroy it.  You can also pass in an integer indicating
        * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
        * 
        * @param widget             
        */
      def removeChild(widget: Double): Unit = js.native
      /**
        * Removes the passed widget instance from this widget but does
        * not destroy it.  You can also pass in an integer indicating
        * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
        *
        * @param widget
        */
      /**
        * Removes the passed widget instance from this widget but does
        * not destroy it.  You can also pass in an integer indicating
        * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
        * 
        * @param widget             
        */
      def removeChild(widget: WidgetBase): Unit = js.native
      /**
        *
        * @param title
        */
      def setListHeader(title: String): Unit = js.native
      @JSName("set")
      def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
      @JSName("set")
      def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
      @JSName("set")
      def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
      @JSName("set")
      def set_style(property: style, value: String): Unit = js.native
      @JSName("set")
      def set_templatePath(property: templatePath, value: String): Unit = js.native
      @JSName("set")
      def set_templateString(property: templateString, value: String): Unit = js.native
      @JSName("set")
      def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
      @JSName("watch")
      def watch_attachScope(
        property: attachScope,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[js.Object], 
              /* newValue */ js.UndefOr[js.Object], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_contextRequire(
        property: contextRequire,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[js.Function], 
              /* newValue */ js.UndefOr[js.Function], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_searchContainerNode(
        property: searchContainerNode,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[Boolean], 
              /* newValue */ js.UndefOr[Boolean], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_templatePath(
        property: templatePath,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[String], 
              /* newValue */ js.UndefOr[String], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_templateString(
        property: templateString,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[String], 
              /* newValue */ js.UndefOr[String], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_widgetsInTemplate(
        property: widgetsInTemplate,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[Boolean], 
              /* newValue */ js.UndefOr[Boolean], 
              Unit
            ]
      ): AnonUnwatch = js.native
    }
    
  }
  
  @js.native
  object FeedViewer extends js.Object {
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/widget/FeedViewer.AtomEntryCategoryFilter.html
      *
      * A filter to be applied to the list of entries.
      *
      */
    @js.native
    class AtomEntryCategoryFilter () extends js.Object {
      /**
        *
        */
      var isFilter: Boolean = js.native
      /**
        *
        */
      var label: String = js.native
      /**
        *
        */
      var scheme: String = js.native
      /**
        *
        */
      var term: String = js.native
    }
    
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/widget/FeedViewer.CategoryIncludeFilter.html
      *
      *
      * @param scheme
      * @param term
      * @param label
      */
    @js.native
    class CategoryIncludeFilter protected () extends js.Object {
      def this(scheme: js.Any, term: js.Any, label: js.Any) = this()
      /**
        * Function to determine if this category filter matches against a category on an atom entry
        *
        * @param entry
        */
      def `match`(entry: js.Any): js.Any = js.native
    }
    
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/widget/FeedViewer.FeedViewerEntry.html
      *
      * Widget for handling the display of an entry and specific events associated with it.
      *
      * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
      * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typingsJapgolly.dojo.dijit.AttachMixin because Inheritance from two classes. Inlined 
    - typingsJapgolly.dojo.dijit.WidgetsInTemplateMixin because Inheritance from two classes. Inlined 
    - typingsJapgolly.dojo.dijit.TemplatedMixin because Inheritance from two classes. Inlined 
    - typingsJapgolly.dojo.dijit.Templated because Inheritance from two classes. Inlined attachScope, contextRequire, searchContainerNode, templatePath, templateString, widgetsInTemplate, buildRendering, destroyRendering, startup, getCachedTemplate */ @js.native
    class FeedViewerEntry () extends Widget {
      def this(params: js.Object) = this()
      def this(params: js.Object, srcNodeRef: HTMLElement) = this()
      /**
        * Object to which attach points and events will be scoped.  Defaults
        * to 'this'.
        *
        */
      var attachScope: js.Object = js.native
      /**
        * Used to provide a context require to the dojo/parser in order to be
        * able to use relative MIDs (e.g. ./Widget) in the widget's template.
        *
        */
      var contextRequire: js.Function = js.native
      /**
        *
        */
      var deleteButton: js.Object = js.native
      /**
        *
        */
      var entry: js.Object = js.native
      /**
        *
        */
      var entryNode: js.Object = js.native
      /**
        *
        */
      var feed: js.Object = js.native
      /**
        *
        */
      var searchContainerNode: Boolean = js.native
      /**
        * HTML style attributes as cssText string or name/value hash
        *
        */
      @JSName("style")
      var style_FeedViewerEntry: String = js.native
      /**
        * Path to template (HTML file) for this widget relative to dojo.baseUrl.
        * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
        *
        */
      var templatePath: String = js.native
      /**
        *
        */
      var templateString: String = js.native
      /**
        *
        */
      var timeNode: js.Object = js.native
      /**
        * Should we parse the template to find widgets that might be
        * declared in markup inside it?  False by default.
        *
        */
      var widgetsInTemplate: Boolean = js.native
      /**
        * Function to handle the delete event and delete the entry.
        *
        * @param event
        */
      def deleteEntry(event: js.Object): js.Any = js.native
      /**
        * Function to disable the delete action on this entry.
        *
        */
      def disableDelete(): js.Any = js.native
      /**
        * Function to enable the delete action on this entry.
        *
        */
      def enableDelete(): js.Any = js.native
      /**
        * Static method to get a template based on the templatePath or
        * templateString key
        */
      /**
        * Static method to get a template based on the templatePath or
        * templateString key
        */
      def getCachedTemplate(): js.Any = js.native
      @JSName("get")
      def get_attachScope(property: attachScope): js.Object = js.native
      @JSName("get")
      def get_contextRequire(property: contextRequire): js.Function = js.native
      @JSName("get")
      def get_deleteButton(property: deleteButton): js.Object = js.native
      @JSName("get")
      def get_entry(property: entry): js.Object = js.native
      @JSName("get")
      def get_entryNode(property: entryNode): js.Object = js.native
      @JSName("get")
      def get_feed(property: feed): js.Object = js.native
      @JSName("get")
      def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
      @JSName("get")
      def get_templatePath(property: templatePath): String = js.native
      @JSName("get")
      def get_templateString(property: templateString): String = js.native
      @JSName("get")
      def get_timeNode(property: timeNode): js.Object = js.native
      @JSName("get")
      def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
      /**
        * Attach point for when a row is clicked on.
        *
        * @param e The event generated by the click.
        */
      def onClick(e: js.Object): Unit = js.native
      /**
        * Function to set the time of the entry.
        *
        * @param timeText The string form of the date.
        */
      def setTime(timeText: String): js.Any = js.native
      /**
        * Function to set the title of the entry.
        *
        * @param text The title.
        */
      def setTitle(text: String): js.Any = js.native
      @JSName("set")
      def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
      @JSName("set")
      def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
      @JSName("set")
      def set_deleteButton(property: deleteButton, value: js.Object): Unit = js.native
      @JSName("set")
      def set_entry(property: entry, value: js.Object): Unit = js.native
      @JSName("set")
      def set_entryNode(property: entryNode, value: js.Object): Unit = js.native
      @JSName("set")
      def set_feed(property: feed, value: js.Object): Unit = js.native
      @JSName("set")
      def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
      @JSName("set")
      def set_style(property: style, value: String): Unit = js.native
      @JSName("set")
      def set_templatePath(property: templatePath, value: String): Unit = js.native
      @JSName("set")
      def set_templateString(property: templateString, value: String): Unit = js.native
      @JSName("set")
      def set_timeNode(property: timeNode, value: js.Object): Unit = js.native
      @JSName("set")
      def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
      @JSName("watch")
      def watch_attachScope(
        property: attachScope,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[js.Object], 
              /* newValue */ js.UndefOr[js.Object], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_contextRequire(
        property: contextRequire,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[js.Function], 
              /* newValue */ js.UndefOr[js.Function], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_deleteButton(
        property: deleteButton,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[js.Object], 
              /* newValue */ js.UndefOr[js.Object], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_entry(
        property: entry,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[js.Object], 
              /* newValue */ js.UndefOr[js.Object], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_entryNode(
        property: entryNode,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[js.Object], 
              /* newValue */ js.UndefOr[js.Object], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_feed(
        property: feed,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[js.Object], 
              /* newValue */ js.UndefOr[js.Object], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_searchContainerNode(
        property: searchContainerNode,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[Boolean], 
              /* newValue */ js.UndefOr[Boolean], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_templatePath(
        property: templatePath,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[String], 
              /* newValue */ js.UndefOr[String], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_templateString(
        property: templateString,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[String], 
              /* newValue */ js.UndefOr[String], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_timeNode(
        property: timeNode,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[js.Object], 
              /* newValue */ js.UndefOr[js.Object], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_widgetsInTemplate(
        property: widgetsInTemplate,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[Boolean], 
              /* newValue */ js.UndefOr[Boolean], 
              Unit
            ]
      ): AnonUnwatch = js.native
    }
    
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojox/atom/widget/FeedViewer.FeedViewerGrouping.html
      *
      * Grouping of feed entries.
      *
      * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
      * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typingsJapgolly.dojo.dijit.AttachMixin because Inheritance from two classes. Inlined 
    - typingsJapgolly.dojo.dijit.WidgetsInTemplateMixin because Inheritance from two classes. Inlined 
    - typingsJapgolly.dojo.dijit.TemplatedMixin because Inheritance from two classes. Inlined 
    - typingsJapgolly.dojo.dijit.Templated because Inheritance from two classes. Inlined attachScope, contextRequire, searchContainerNode, templatePath, templateString, widgetsInTemplate, buildRendering, destroyRendering, startup, getCachedTemplate */ @js.native
    class FeedViewerGrouping () extends Widget {
      def this(params: js.Object) = this()
      def this(params: js.Object, srcNodeRef: HTMLElement) = this()
      /**
        * Object to which attach points and events will be scoped.  Defaults
        * to 'this'.
        *
        */
      var attachScope: js.Object = js.native
      /**
        * Used to provide a context require to the dojo/parser in order to be
        * able to use relative MIDs (e.g. ./Widget) in the widget's template.
        *
        */
      var contextRequire: js.Function = js.native
      /**
        *
        */
      var groupingNode: js.Object = js.native
      /**
        *
        */
      var searchContainerNode: Boolean = js.native
      /**
        * HTML style attributes as cssText string or name/value hash
        *
        */
      @JSName("style")
      var style_FeedViewerGrouping: String = js.native
      /**
        * Path to template (HTML file) for this widget relative to dojo.baseUrl.
        * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
        *
        */
      var templatePath: String = js.native
      /**
        *
        */
      var templateString: String = js.native
      /**
        *
        */
      var titleNode: js.Object = js.native
      /**
        * Should we parse the template to find widgets that might be
        * declared in markup inside it?  False by default.
        *
        */
      var widgetsInTemplate: Boolean = js.native
      /**
        * Static method to get a template based on the templatePath or
        * templateString key
        */
      /**
        * Static method to get a template based on the templatePath or
        * templateString key
        */
      def getCachedTemplate(): js.Any = js.native
      @JSName("get")
      def get_attachScope(property: attachScope): js.Object = js.native
      @JSName("get")
      def get_contextRequire(property: contextRequire): js.Function = js.native
      @JSName("get")
      def get_groupingNode(property: groupingNode): js.Object = js.native
      @JSName("get")
      def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
      @JSName("get")
      def get_templatePath(property: templatePath): String = js.native
      @JSName("get")
      def get_templateString(property: templateString): String = js.native
      @JSName("get")
      def get_titleNode(property: titleNode): js.Object = js.native
      @JSName("get")
      def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
      /**
        * Sets the text to be shown above this grouping.
        *
        * @param text The text to show.
        */
      def setText(text: js.Any): Unit = js.native
      @JSName("set")
      def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
      @JSName("set")
      def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
      @JSName("set")
      def set_groupingNode(property: groupingNode, value: js.Object): Unit = js.native
      @JSName("set")
      def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
      @JSName("set")
      def set_style(property: style, value: String): Unit = js.native
      @JSName("set")
      def set_templatePath(property: templatePath, value: String): Unit = js.native
      @JSName("set")
      def set_templateString(property: templateString, value: String): Unit = js.native
      @JSName("set")
      def set_titleNode(property: titleNode, value: js.Object): Unit = js.native
      @JSName("set")
      def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
      @JSName("watch")
      def watch_attachScope(
        property: attachScope,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[js.Object], 
              /* newValue */ js.UndefOr[js.Object], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_contextRequire(
        property: contextRequire,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[js.Function], 
              /* newValue */ js.UndefOr[js.Function], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_groupingNode(
        property: groupingNode,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[js.Object], 
              /* newValue */ js.UndefOr[js.Object], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_searchContainerNode(
        property: searchContainerNode,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[Boolean], 
              /* newValue */ js.UndefOr[Boolean], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_templatePath(
        property: templatePath,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[String], 
              /* newValue */ js.UndefOr[String], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_templateString(
        property: templateString,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[String], 
              /* newValue */ js.UndefOr[String], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_titleNode(
        property: titleNode,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[js.Object], 
              /* newValue */ js.UndefOr[js.Object], 
              Unit
            ]
      ): AnonUnwatch = js.native
      @JSName("watch")
      def watch_widgetsInTemplate(
        property: widgetsInTemplate,
        callback: js.Function3[
              /* property */ js.UndefOr[String], 
              /* oldValue */ js.UndefOr[Boolean], 
              /* newValue */ js.UndefOr[Boolean], 
              Unit
            ]
      ): AnonUnwatch = js.native
    }
    
  }
  
}

