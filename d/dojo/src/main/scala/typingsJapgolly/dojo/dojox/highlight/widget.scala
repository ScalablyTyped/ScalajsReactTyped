package typingsJapgolly.dojo.dojox.highlight

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.AnonUnwatch
import typingsJapgolly.dojo.dijit.Widget
import typingsJapgolly.dojo.dojoStrings.attachScope
import typingsJapgolly.dojo.dojoStrings.contextRequire
import typingsJapgolly.dojo.dojoStrings.listType
import typingsJapgolly.dojo.dojoStrings.range
import typingsJapgolly.dojo.dojoStrings.searchContainerNode
import typingsJapgolly.dojo.dojoStrings.style
import typingsJapgolly.dojo.dojoStrings.templatePath
import typingsJapgolly.dojo.dojoStrings.templateString
import typingsJapgolly.dojo.dojoStrings.url
import typingsJapgolly.dojo.dojoStrings.widgetsInTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.highlight.widget")
@js.native
object widget extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/widget/Code.html
    *
    * A simple source code formatting widget that adds line numbering, alternating line colors
    * and line range support on top of dojox.highlight module.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.dojo.dijit.AttachMixin because Inheritance from two classes. Inlined 
  - typingsJapgolly.dojo.dijit.WidgetsInTemplateMixin because Inheritance from two classes. Inlined 
  - typingsJapgolly.dojo.dijit.TemplatedMixin because Inheritance from two classes. Inlined 
  - typingsJapgolly.dojo.dijit.Templated because Inheritance from two classes. Inlined attachScope, contextRequire, searchContainerNode, templatePath, templateString, widgetsInTemplate, buildRendering, destroyRendering, startup, getCachedTemplate */ @js.native
  class Code () extends Widget {
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
    var listType: String = js.native
    /**
      *
      */
    var range: js.Object = js.native
    /**
      *
      */
    var searchContainerNode: Boolean = js.native
    /**
      *
      */
    @JSName("style")
    var style_Code: String = js.native
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
    def get_listType(property: listType): String = js.native
    @JSName("get")
    def get_range(property: range): js.Object = js.native
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
    /**
      * update the view to a new passed range
      *
      * @param range
      */
    def setRange(range: js.Array[_]): Unit = js.native
    @JSName("set")
    def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
    @JSName("set")
    def set_contextRequire(property: contextRequire, value: js.Function): Unit = js.native
    @JSName("set")
    def set_listType(property: listType, value: String): Unit = js.native
    @JSName("set")
    def set_range(property: range, value: js.Object): Unit = js.native
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
    def watch_listType(
      property: listType,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): AnonUnwatch = js.native
    @JSName("watch")
    def watch_range(
      property: range,
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
  }
  
}

