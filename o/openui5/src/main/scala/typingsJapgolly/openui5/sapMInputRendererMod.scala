package typingsJapgolly.openui5

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMInputRendererMod extends Shortcut {
  
  @JSImport("sap/m/InputRenderer", JSImport.Default)
  @js.native
  val default: InputRenderer = js.native
  
  /**
    * Input renderer.
    *
    * InputRenderer extends the InputBaseRenderer
    */
  trait InputRenderer extends StObject {
    
    /**
      * Adds inner css classes to the input field
      */
    def addInnerClasses(
      /**
      * the RenderManager that can be used for writing to the render output buffer
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * an object representation of the control that should be rendered
      */
    oControl: typingsJapgolly.openui5.sapMInputMod.default
    ): Unit
    
    /**
      * Adds control specific class
      */
    def addOuterClasses(
      /**
      * the RenderManager that can be used for writing to the render output buffer
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * an object representation of the control that should be rendered
      */
    oControl: typingsJapgolly.openui5.sapMInputMod.default
    ): Unit
    
    /**
      * Adds extra styles to the wrapper of the input field.
      */
    def addWrapperStyles(
      /**
      * The RenderManager that can be used for writing to the render output buffer.
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * An object representation of the control that should be rendered.
      */
    oControl: typingsJapgolly.openui5.sapMInputMod.default
    ): Unit
    
    /**
      * Returns the inner aria describedby ids for the accessibility.
      */
    def getAriaDescribedBy(
      /**
      * an object representation of the control.
      */
    oControl: typingsJapgolly.openui5.sapMInputMod.default
    ): js.UndefOr[String]
    
    /**
      * Returns aria accessibility role for the control. Hook for the subclasses.
      */
    def getAriaRole(
      /**
      * an object representation of the control
      */
    oControl: typingsJapgolly.openui5.sapMInputMod.default
    ): String
    
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
    oControl: typingsJapgolly.openui5.sapMInputMod.default
    ): Unit
    
    /**
      * add extra attributes to Input
      */
    def writeInnerAttributes(
      /**
      * the RenderManager that can be used for writing to the render output buffer
      */
    oRm: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * an object representation of the control that should be rendered
      */
    oControl: typingsJapgolly.openui5.sapMInputMod.default
    ): Unit
  }
  object InputRenderer {
    
    inline def apply(
      addInnerClasses: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputMod.default) => Callback,
      addOuterClasses: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputMod.default) => Callback,
      addWrapperStyles: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputMod.default) => Callback,
      getAriaDescribedBy: typingsJapgolly.openui5.sapMInputMod.default => js.UndefOr[String],
      getAriaRole: typingsJapgolly.openui5.sapMInputMod.default => String,
      writeDecorations: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputMod.default) => Callback,
      writeInnerAttributes: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputMod.default) => Callback
    ): InputRenderer = {
      val __obj = js.Dynamic.literal(addInnerClasses = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputMod.default) => (addInnerClasses(t0, t1)).runNow()), addOuterClasses = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputMod.default) => (addOuterClasses(t0, t1)).runNow()), addWrapperStyles = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputMod.default) => (addWrapperStyles(t0, t1)).runNow()), getAriaDescribedBy = js.Any.fromFunction1(getAriaDescribedBy), getAriaRole = js.Any.fromFunction1(getAriaRole), writeDecorations = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputMod.default) => (writeDecorations(t0, t1)).runNow()), writeInnerAttributes = js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputMod.default) => (writeInnerAttributes(t0, t1)).runNow()))
      __obj.asInstanceOf[InputRenderer]
    }
    
    extension [Self <: InputRenderer](x: Self) {
      
      inline def setAddInnerClasses(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputMod.default) => Callback
      ): Self = StObject.set(x, "addInnerClasses", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputMod.default) => (value(t0, t1)).runNow()))
      
      inline def setAddOuterClasses(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputMod.default) => Callback
      ): Self = StObject.set(x, "addOuterClasses", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputMod.default) => (value(t0, t1)).runNow()))
      
      inline def setAddWrapperStyles(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputMod.default) => Callback
      ): Self = StObject.set(x, "addWrapperStyles", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputMod.default) => (value(t0, t1)).runNow()))
      
      inline def setGetAriaDescribedBy(value: typingsJapgolly.openui5.sapMInputMod.default => js.UndefOr[String]): Self = StObject.set(x, "getAriaDescribedBy", js.Any.fromFunction1(value))
      
      inline def setGetAriaRole(value: typingsJapgolly.openui5.sapMInputMod.default => String): Self = StObject.set(x, "getAriaRole", js.Any.fromFunction1(value))
      
      inline def setWriteDecorations(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputMod.default) => Callback
      ): Self = StObject.set(x, "writeDecorations", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputMod.default) => (value(t0, t1)).runNow()))
      
      inline def setWriteInnerAttributes(
        value: (typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, typingsJapgolly.openui5.sapMInputMod.default) => Callback
      ): Self = StObject.set(x, "writeInnerAttributes", js.Any.fromFunction2((t0: typingsJapgolly.openui5.sapUiCoreRenderManagerMod.default, t1: typingsJapgolly.openui5.sapMInputMod.default) => (value(t0, t1)).runNow()))
    }
  }
  
  type _To = InputRenderer
  
  /* This means you don't have to write `default`, but can instead just say `sapMInputRendererMod.foo` */
  override def _to: InputRenderer = default
}
