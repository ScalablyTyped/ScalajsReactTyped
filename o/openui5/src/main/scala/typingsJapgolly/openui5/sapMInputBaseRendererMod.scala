package typingsJapgolly.openui5

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMInputBaseRendererMod extends Shortcut {
  
  @JSImport("sap/m/InputBaseRenderer", JSImport.Default)
  @js.native
  val default: InputBaseRenderer = js.native
  
  /**
    * InputBase renderer.
    */
  trait InputBaseRenderer extends StObject {
    
    /**
      * This method is reserved for derived class to set width inline style
      */
    def addControlWidth(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Add cursor class to input container.
      */
    def addCursorClass(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * This method is reserved for derived classes to add extra classes for input element.
      */
    def addInnerClasses(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * This method is reserved for derived classes to add extra styles for input element.
      */
    def addInnerStyles(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * This method is reserved for derived classes to add extra classes for input container.
      */
    def addOuterClasses(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * This method is reserved for derived class to add extra styles for input container.
      */
    def addOuterStyles(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Add a padding class to input container. May be overwritten by subclasses.
      */
    def addPaddingClass(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * @deprecated
      *
      * Adds custom placeholder classes, if native placeholder is not used. To be overwritten by subclasses.
      * Note that this method should not be used anymore as native placeholder is used on all browsers
      */
    def addPlaceholderClasses(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * @deprecated
      *
      * This method is reserved for derived classes to add extra styles for the placeholder, if rendered as label.
      */
    def addPlaceholderStyles(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Add the CSS value state classes to the control's root element using the provided {@link sap.ui.core.RenderManager}.
      * To be overwritten by subclasses.
      */
    def addValueStateClasses(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * This method is reserved for derived classes to add extra styles for input element.
      */
    def addWrapperStyles(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Write the closing tag name of the input.
      */
    def closeInputTag(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Ends opened input tag.
      */
    def endInputTag(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Returns the accessibility state of the control. Hook for the subclasses.
      */
    def getAccessibilityState(
      /**
      * an object representation of the control.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): js.Object
    
    /**
      * Returns the inner aria describedby ids for the accessibility. Hook for the subclasses.
      */
    def getAriaDescribedBy(
      /**
      * an object representation of the control.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): js.UndefOr[String]
    
    /**
      * Returns the inner aria labelledby ids for the accessibility. Hook for the subclasses.
      */
    def getAriaLabelledBy(
      /**
      * an object representation of the control.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): js.UndefOr[String]
    
    /**
      * Returns aria accessibility role for the control. Hook for the subclasses.
      */
    def getAriaRole(
      /**
      * an object representation of the control
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): String
    
    /**
      * Returns the inner aria describedby announcement texts for the accessibility. Hook for the subclasses.
      */
    def getDescribedByAnnouncement(
      /**
      * an object representation of the control.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): String
    
    /**
      * Defines the ID suffix of the inner element
      *
      * @returns The inner element ID suffix.
      */
    def getInnerSuffix(): String
    
    /**
      * Returns the inner aria labelledby announcement texts for the accessibility. Hook for the subclasses.
      */
    def getLabelledByAnnouncement(
      /**
      * an object representation of the control.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): String
    
    /**
      * Write the opening tag name of the input.
      */
    def openInputTag(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * This method is reserved for derived classes to prepend inner content.
      */
    def prependInnerContent(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Renders the hidden aria labelledby node for the accessibility. Hook for the subclasses.
      */
    def renderAriaDescribedBy(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Renders the hidden aria labelledby node for the accessibility. Hook for the subclasses.
      */
    def renderAriaLabelledBy(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Renders the hidden aria describedby and errormessage nodes for the accessibility.
      */
    def renderValueStateAccDom(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Writes the accessibility state of the control. Hook for the subclasses.
      */
    def writeAccessibilityState(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Write the decorations of the input - description and value-help icon.
      */
    def writeDecorations(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Renders icons from the icon aggregations.
      */
    def writeIcons(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * List of icons to render
      */
    aIcons: js.Array[typingsJapgolly.openui5.sapUiCoreIconMod.default]
    ): Unit
    
    /**
      * This method is reserved for derived classes to add extra attributes for the input element.
      */
    def writeInnerAttributes(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Write the value of the input.
      */
    def writeInnerContent(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * Write the value of the input.
      */
    def writeInnerValue(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
    
    /**
      * This method is reserved for derived class to add extra attributes for input container.
      */
    def writeOuterAttributes(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputBaseMod.default
    ): Unit
  }
  object InputBaseRenderer {
    
    inline def apply(
      addControlWidth: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      addCursorClass: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      addInnerClasses: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      addInnerStyles: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      addOuterClasses: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      addOuterStyles: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      addPaddingClass: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      addPlaceholderClasses: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      addPlaceholderStyles: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      addValueStateClasses: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      addWrapperStyles: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      closeInputTag: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      endInputTag: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      getAccessibilityState: typingsJapgolly.openui5.sapMInputBaseMod.default => js.Object,
      getAriaDescribedBy: typingsJapgolly.openui5.sapMInputBaseMod.default => js.UndefOr[String],
      getAriaLabelledBy: typingsJapgolly.openui5.sapMInputBaseMod.default => js.UndefOr[String],
      getAriaRole: typingsJapgolly.openui5.sapMInputBaseMod.default => String,
      getDescribedByAnnouncement: typingsJapgolly.openui5.sapMInputBaseMod.default => String,
      getInnerSuffix: CallbackTo[String],
      getLabelledByAnnouncement: typingsJapgolly.openui5.sapMInputBaseMod.default => String,
      openInputTag: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      prependInnerContent: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      renderAriaDescribedBy: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      renderAriaLabelledBy: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      renderValueStateAccDom: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      writeAccessibilityState: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      writeDecorations: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      writeIcons: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, js.Array[typingsJapgolly.openui5.sapUiCoreIconMod.default]) => Callback,
      writeInnerAttributes: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      writeInnerContent: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      writeInnerValue: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback,
      writeOuterAttributes: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
    ): InputBaseRenderer = {
      val __obj = js.Dynamic.literal(addControlWidth = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (addControlWidth(t0, t1)).runNow()), addCursorClass = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (addCursorClass(t0, t1)).runNow()), addInnerClasses = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (addInnerClasses(t0, t1)).runNow()), addInnerStyles = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (addInnerStyles(t0, t1)).runNow()), addOuterClasses = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (addOuterClasses(t0, t1)).runNow()), addOuterStyles = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (addOuterStyles(t0, t1)).runNow()), addPaddingClass = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (addPaddingClass(t0, t1)).runNow()), addPlaceholderClasses = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (addPlaceholderClasses(t0, t1)).runNow()), addPlaceholderStyles = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (addPlaceholderStyles(t0, t1)).runNow()), addValueStateClasses = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (addValueStateClasses(t0, t1)).runNow()), addWrapperStyles = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (addWrapperStyles(t0, t1)).runNow()), closeInputTag = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (closeInputTag(t0, t1)).runNow()), endInputTag = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (endInputTag(t0, t1)).runNow()), getAccessibilityState = js.Any.fromFunction1(getAccessibilityState), getAriaDescribedBy = js.Any.fromFunction1(getAriaDescribedBy), getAriaLabelledBy = js.Any.fromFunction1(getAriaLabelledBy), getAriaRole = js.Any.fromFunction1(getAriaRole), getDescribedByAnnouncement = js.Any.fromFunction1(getDescribedByAnnouncement), getInnerSuffix = getInnerSuffix.toJsFn, getLabelledByAnnouncement = js.Any.fromFunction1(getLabelledByAnnouncement), openInputTag = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (openInputTag(t0, t1)).runNow()), prependInnerContent = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (prependInnerContent(t0, t1)).runNow()), renderAriaDescribedBy = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (renderAriaDescribedBy(t0, t1)).runNow()), renderAriaLabelledBy = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (renderAriaLabelledBy(t0, t1)).runNow()), renderValueStateAccDom = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (renderValueStateAccDom(t0, t1)).runNow()), writeAccessibilityState = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (writeAccessibilityState(t0, t1)).runNow()), writeDecorations = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (writeDecorations(t0, t1)).runNow()), writeIcons = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: js.Array[typingsJapgolly.openui5.sapUiCoreIconMod.default]) => (writeIcons(t0, t1)).runNow()), writeInnerAttributes = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (writeInnerAttributes(t0, t1)).runNow()), writeInnerContent = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (writeInnerContent(t0, t1)).runNow()), writeInnerValue = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (writeInnerValue(t0, t1)).runNow()), writeOuterAttributes = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (writeOuterAttributes(t0, t1)).runNow()))
      __obj.asInstanceOf[InputBaseRenderer]
    }
    
    extension [Self <: InputBaseRenderer](x: Self) {
      
      inline def setAddControlWidth(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "addControlWidth", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setAddCursorClass(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "addCursorClass", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setAddInnerClasses(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "addInnerClasses", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setAddInnerStyles(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "addInnerStyles", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setAddOuterClasses(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "addOuterClasses", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setAddOuterStyles(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "addOuterStyles", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setAddPaddingClass(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "addPaddingClass", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setAddPlaceholderClasses(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "addPlaceholderClasses", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setAddPlaceholderStyles(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "addPlaceholderStyles", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setAddValueStateClasses(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "addValueStateClasses", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setAddWrapperStyles(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "addWrapperStyles", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setCloseInputTag(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "closeInputTag", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setEndInputTag(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "endInputTag", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setGetAccessibilityState(value: typingsJapgolly.openui5.sapMInputBaseMod.default => js.Object): Self = StObject.set(x, "getAccessibilityState", js.Any.fromFunction1(value))
      
      inline def setGetAriaDescribedBy(value: typingsJapgolly.openui5.sapMInputBaseMod.default => js.UndefOr[String]): Self = StObject.set(x, "getAriaDescribedBy", js.Any.fromFunction1(value))
      
      inline def setGetAriaLabelledBy(value: typingsJapgolly.openui5.sapMInputBaseMod.default => js.UndefOr[String]): Self = StObject.set(x, "getAriaLabelledBy", js.Any.fromFunction1(value))
      
      inline def setGetAriaRole(value: typingsJapgolly.openui5.sapMInputBaseMod.default => String): Self = StObject.set(x, "getAriaRole", js.Any.fromFunction1(value))
      
      inline def setGetDescribedByAnnouncement(value: typingsJapgolly.openui5.sapMInputBaseMod.default => String): Self = StObject.set(x, "getDescribedByAnnouncement", js.Any.fromFunction1(value))
      
      inline def setGetInnerSuffix(value: CallbackTo[String]): Self = StObject.set(x, "getInnerSuffix", value.toJsFn)
      
      inline def setGetLabelledByAnnouncement(value: typingsJapgolly.openui5.sapMInputBaseMod.default => String): Self = StObject.set(x, "getLabelledByAnnouncement", js.Any.fromFunction1(value))
      
      inline def setOpenInputTag(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "openInputTag", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setPrependInnerContent(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "prependInnerContent", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setRenderAriaDescribedBy(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "renderAriaDescribedBy", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setRenderAriaLabelledBy(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "renderAriaLabelledBy", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setRenderValueStateAccDom(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "renderValueStateAccDom", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setWriteAccessibilityState(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "writeAccessibilityState", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setWriteDecorations(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "writeDecorations", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setWriteIcons(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, js.Array[typingsJapgolly.openui5.sapUiCoreIconMod.default]) => Callback
      ): Self = StObject.set(x, "writeIcons", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: js.Array[typingsJapgolly.openui5.sapUiCoreIconMod.default]) => (value(t0, t1)).runNow()))
      
      inline def setWriteInnerAttributes(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "writeInnerAttributes", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setWriteInnerContent(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "writeInnerContent", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setWriteInnerValue(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "writeInnerValue", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
      
      inline def setWriteOuterAttributes(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputBaseMod.default) => Callback
      ): Self = StObject.set(x, "writeOuterAttributes", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputBaseMod.default) => (value(t0, t1)).runNow()))
    }
  }
  
  type _To = InputBaseRenderer
  
  /* This means you don't have to write `default`, but can instead just say `sapMInputBaseRendererMod.foo` */
  override def _to: InputBaseRenderer = default
}
