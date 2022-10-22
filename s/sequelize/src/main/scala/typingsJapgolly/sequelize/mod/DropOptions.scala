package typingsJapgolly.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
//  Model
// ~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/model.js
//
/**
  * Options to pass to Model on drop
  */
trait DropOptions
  extends StObject
     with LoggingOptions {
  
  /**
    * Also drop all objects depending on this table, such as views. Only works in postgres
    */
  var cascade: js.UndefOr[Boolean] = js.undefined
}
object DropOptions {
  
  inline def apply(): DropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropOptions]
  }
  
  extension [Self <: DropOptions](x: Self) {
    
    inline def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
    
    inline def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
  }
}
