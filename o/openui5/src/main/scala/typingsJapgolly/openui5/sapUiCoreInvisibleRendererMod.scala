package typingsJapgolly.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreInvisibleRendererMod extends Shortcut {
  
  @JSImport("sap/ui/core/InvisibleRenderer", JSImport.Default)
  @js.native
  val default: InvisibleRenderer = js.native
  
  /**
    * @SINCE 1.66.0
    *
    * Provides the default renderer for the controls that have set their `visible` property to `false`.
    */
  @js.native
  trait InvisibleRenderer extends StObject {
    
    /**
      * Creates the ID to be used for the invisible placeholder DOM element.
      *
      * @returns The ID used for the invisible placeholder of this element
      */
    def createInvisiblePlaceholderId(
      /**
      * The `control` instance for which to create the placeholder ID
      */
    oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): String = js.native
    
    /**
      * Returns the placeholder DOM element of the provided control.
      *
      * @returns The placeholder DOM element
      */
    def getDomRef(
      /**
      * The `control` instance for which to get the placeholder DOM element
      */
    oControl: typingsJapgolly.openui5.sapUiCoreControlMod.default
    ): HTMLElement | Null = js.native
    
    /**
      * Renders an invisible placeholder to identify the location of the invisible control within the DOM tree.
      *
      * The standard implementation renders an invisible <span> element for controls with `visible:false`
      * to improve re-rendering performance. Due to the fault tolerance of the HTML5 standard, such <span>
      * elements are accepted in many scenarios and won't appear in the render tree of the browser. However,
      * in some cases, controls might need to write a different element if <span> is not an allowed element
      * (for example, within the <tr> or <li> group). In this case, the caller can require this module
      * and use the third parameter to define the HTML tag.
      */
    def render(): Unit = js.native
    def render(
      /**
      * The `RenderManager` instance
      */
    oRm: Unit,
      /**
      * The instance of the invisible element
      */
    oElement: Unit,
      /**
      * HTML tag of the invisible placeholder; void tags are not allowed.
      */
    sTagName: String
    ): Unit = js.native
    def render(
      /**
      * The `RenderManager` instance
      */
    oRm: Unit,
      /**
      * The instance of the invisible element
      */
    oElement: typingsJapgolly.openui5.sapUiCoreElementMod.default
    ): Unit = js.native
    def render(
      /**
      * The `RenderManager` instance
      */
    oRm: Unit,
      /**
      * The instance of the invisible element
      */
    oElement: typingsJapgolly.openui5.sapUiCoreElementMod.default,
      /**
      * HTML tag of the invisible placeholder; void tags are not allowed.
      */
    sTagName: String
    ): Unit = js.native
    def render(
      /**
      * The `RenderManager` instance
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default
    ): Unit = js.native
    def render(
      /**
      * The `RenderManager` instance
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * The instance of the invisible element
      */
    oElement: Unit,
      /**
      * HTML tag of the invisible placeholder; void tags are not allowed.
      */
    sTagName: String
    ): Unit = js.native
    def render(
      /**
      * The `RenderManager` instance
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * The instance of the invisible element
      */
    oElement: typingsJapgolly.openui5.sapUiCoreElementMod.default
    ): Unit = js.native
    def render(
      /**
      * The `RenderManager` instance
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * The instance of the invisible element
      */
    oElement: typingsJapgolly.openui5.sapUiCoreElementMod.default,
      /**
      * HTML tag of the invisible placeholder; void tags are not allowed.
      */
    sTagName: String
    ): Unit = js.native
  }
  
  type _To = InvisibleRenderer
  
  /* This means you don't have to write `default`, but can instead just say `sapUiCoreInvisibleRendererMod.foo` */
  override def _to: InvisibleRenderer = default
}
