package typingsJapgolly.openrct2.mod.global

import japgolly.scalajs.react.Callback
import typingsJapgolly.openrct2.mod.PluginType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents information about the plugin such as type, name, author and version.
  * It also includes the entry point.
  */
trait PluginMetadata extends StObject {
  
  var authors: String | js.Array[String]
  
  var licence: String
  
  def main(): Unit
  
  var minApiVersion: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var `type`: PluginType
  
  var version: String
}
object PluginMetadata {
  
  inline def apply(
    authors: String | js.Array[String],
    licence: String,
    main: Callback,
    name: String,
    `type`: PluginType,
    version: String
  ): PluginMetadata = {
    val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], licence = licence.asInstanceOf[js.Any], main = main.toJsFn, name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMetadata]
  }
  
  extension [Self <: PluginMetadata](x: Self) {
    
    inline def setAuthors(value: String | js.Array[String]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    inline def setAuthorsVarargs(value: String*): Self = StObject.set(x, "authors", js.Array(value*))
    
    inline def setLicence(value: String): Self = StObject.set(x, "licence", value.asInstanceOf[js.Any])
    
    inline def setMain(value: Callback): Self = StObject.set(x, "main", value.toJsFn)
    
    inline def setMinApiVersion(value: Double): Self = StObject.set(x, "minApiVersion", value.asInstanceOf[js.Any])
    
    inline def setMinApiVersionUndefined: Self = StObject.set(x, "minApiVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: PluginType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
