package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkExtrasJavaScriptSerializerMod {
  
  @JSImport("mendixmodelsdk/src/sdk/extras/JavaScriptSerializer", "JavaScriptSerializer")
  @js.native
  open class JavaScriptSerializer protected () extends StObject {
    def this(_unit: IAbstractUnit) = this()
    
    /* private */ var schedule: Any = js.native
    
    /* private */ var source: Any = js.native
  }
  /* static members */
  object JavaScriptSerializer {
    
    @JSImport("mendixmodelsdk/src/sdk/extras/JavaScriptSerializer", "JavaScriptSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Given a unit, generates JavaScript(/TypeScript) code that would re-create the same unit.
      * Useful as scaffolding for model generators.
      */
    inline def serializeToJs(unit: IAbstractUnit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeToJs")(unit.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
