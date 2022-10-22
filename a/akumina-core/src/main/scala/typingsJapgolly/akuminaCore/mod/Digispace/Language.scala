package typingsJapgolly.akuminaCore.mod.Digispace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("akumina-core", "Digispace.Language")
@js.native
open class Language () extends StObject
object Language {
  
  @JSImport("akumina-core", "Digispace.Language")
  @js.native
  val ^ : js.Any = js.native
  
  /* Added */
  /* static member */
  inline def GetText(Token: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetText")(Token.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  inline def TryGetText(Token: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("TryGetText")(Token.asInstanceOf[js.Any]).asInstanceOf[String]
}
