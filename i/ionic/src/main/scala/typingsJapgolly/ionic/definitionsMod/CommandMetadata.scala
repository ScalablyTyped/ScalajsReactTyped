package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.ionic.ionicStrings.global
import typingsJapgolly.ionic.ionicStrings.project
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandMetadata
  extends StObject
     with typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadata[CommandMetadataInput, CommandMetadataOption] {
  
  var `type`: global | project
}
object CommandMetadata {
  
  inline def apply(name: String, summary: String, `type`: global | project): CommandMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadata]
  }
  
  extension [Self <: CommandMetadata](x: Self) {
    
    inline def setType(value: global | project): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
