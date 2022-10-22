package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.uifabricMergeStyles.libStylesheetMod.IStyleSheetConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "Stylesheet")
@js.native
open class Stylesheet ()
  extends typingsJapgolly.officeUiFabricReact.libStylingMod.Stylesheet {
  def this(config: IStyleSheetConfig) = this()
}
/* static members */
object Stylesheet {
  
  @JSImport("office-ui-fabric-react", "Stylesheet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the singleton instance.
    */
  inline def getInstance(): typingsJapgolly.uifabricMergeStyles.libStylesheetMod.Stylesheet = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typingsJapgolly.uifabricMergeStyles.libStylesheetMod.Stylesheet]
}
