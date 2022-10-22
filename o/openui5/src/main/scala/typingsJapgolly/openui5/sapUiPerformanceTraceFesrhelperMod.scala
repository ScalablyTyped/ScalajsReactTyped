package typingsJapgolly.openui5

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiPerformanceTraceFesrhelperMod extends Shortcut {
  
  @JSImport("sap/ui/performance/trace/FESRHelper", JSImport.Default)
  @js.native
  val default: FESRHelper = js.native
  
  /**
    * @SINCE 1.100
    *
    * FESRHelper API Provides helper functionality for FESR and consumers of FESR
    */
  trait FESRHelper extends StObject {
    
    /**
      * @SINCE 1.100
      *
      * Get semantic stepname for an event of a given element used for FESR.
      *
      * @returns The semantic stepname for the given event ID
      */
    def getSemanticStepname(
      /**
      * The element conatining the semantic stepname
      */
    oElement: typingsJapgolly.openui5.sapUiCoreElementMod.default,
      /**
      * The event ID of the semantic stepname
      */
    sEventId: String
    ): String
    
    /**
      * @SINCE 1.100
      *
      * Add semantic stepname for an event of a given element used for FESR.
      */
    def setSemanticStepname(
      /**
      * The element the semantic stepname should be applied to
      */
    oElement: typingsJapgolly.openui5.sapUiCoreElementMod.default,
      /**
      * The event ID the semantic stepname is valid for
      */
    sEventId: String,
      /**
      * The semantic stepname
      */
    sStepname: String
    ): Unit
  }
  object FESRHelper {
    
    inline def apply(
      getSemanticStepname: (typingsJapgolly.openui5.sapUiCoreElementMod.default, String) => String,
      setSemanticStepname: (typingsJapgolly.openui5.sapUiCoreElementMod.default, String, String) => Callback
    ): FESRHelper = {
      val __obj = js.Dynamic.literal(getSemanticStepname = js.Any.fromFunction2(getSemanticStepname), setSemanticStepname = js.Any.fromFunction3((t0: typingsJapgolly.openui5.sapUiCoreElementMod.default, t1: String, t2: String) => (setSemanticStepname(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[FESRHelper]
    }
    
    extension [Self <: FESRHelper](x: Self) {
      
      inline def setGetSemanticStepname(value: (typingsJapgolly.openui5.sapUiCoreElementMod.default, String) => String): Self = StObject.set(x, "getSemanticStepname", js.Any.fromFunction2(value))
      
      inline def setSetSemanticStepname(value: (typingsJapgolly.openui5.sapUiCoreElementMod.default, String, String) => Callback): Self = StObject.set(x, "setSemanticStepname", js.Any.fromFunction3((t0: typingsJapgolly.openui5.sapUiCoreElementMod.default, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  type _To = FESRHelper
  
  /* This means you don't have to write `default`, but can instead just say `sapUiPerformanceTraceFesrhelperMod.foo` */
  override def _to: FESRHelper = default
}
