package typingsJapgolly.opentok.mod

import typingsJapgolly.opentok.opentokStrings.bestFit
import typingsJapgolly.opentok.opentokStrings.focus
import typingsJapgolly.opentok.opentokStrings.horizontalPresentation
import typingsJapgolly.opentok.opentokStrings.pip
import typingsJapgolly.opentok.opentokStrings.verticalPresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredefinedArchiveLayoutOptions
  extends StObject
     with ArchiveLayoutOptions {
  
  var `type`: bestFit | pip | verticalPresentation | horizontalPresentation | focus
}
object PredefinedArchiveLayoutOptions {
  
  inline def apply(`type`: bestFit | pip | verticalPresentation | horizontalPresentation | focus): PredefinedArchiveLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredefinedArchiveLayoutOptions]
  }
  
  extension [Self <: PredefinedArchiveLayoutOptions](x: Self) {
    
    inline def setType(value: bestFit | pip | verticalPresentation | horizontalPresentation | focus): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
