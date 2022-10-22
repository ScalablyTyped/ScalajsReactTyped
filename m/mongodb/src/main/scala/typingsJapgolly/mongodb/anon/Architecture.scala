package typingsJapgolly.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Architecture extends StObject {
  
  var architecture: String
  
  var name: typingsJapgolly.node.processMod.global.NodeJS.Platform
  
  var `type`: String
  
  var version: String
}
object Architecture {
  
  inline def apply(
    architecture: String,
    name: typingsJapgolly.node.processMod.global.NodeJS.Platform,
    `type`: String,
    version: String
  ): Architecture = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Architecture]
  }
  
  extension [Self <: Architecture](x: Self) {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setName(value: typingsJapgolly.node.processMod.global.NodeJS.Platform): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
