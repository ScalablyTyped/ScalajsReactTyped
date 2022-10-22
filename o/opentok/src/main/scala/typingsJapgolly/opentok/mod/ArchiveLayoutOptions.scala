package typingsJapgolly.opentok.mod

import typingsJapgolly.opentok.opentokStrings.bestFit
import typingsJapgolly.opentok.opentokStrings.focus
import typingsJapgolly.opentok.opentokStrings.horizontalPresentation
import typingsJapgolly.opentok.opentokStrings.pip
import typingsJapgolly.opentok.opentokStrings.verticalPresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.opentok.mod.PredefinedArchiveLayoutOptions
  - typingsJapgolly.opentok.mod.CustomArchiveLayoutOptions
*/
trait ArchiveLayoutOptions extends StObject
object ArchiveLayoutOptions {
  
  inline def CustomArchiveLayoutOptions(stylesheet: String): typingsJapgolly.opentok.mod.CustomArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal(stylesheet = stylesheet.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[typingsJapgolly.opentok.mod.CustomArchiveLayoutOptions]
  }
  
  inline def PredefinedArchiveLayoutOptions(`type`: bestFit | pip | verticalPresentation | horizontalPresentation | focus): typingsJapgolly.opentok.mod.PredefinedArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.opentok.mod.PredefinedArchiveLayoutOptions]
  }
}
