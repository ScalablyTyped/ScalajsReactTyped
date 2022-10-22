package typingsJapgolly.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sequelize.mod.AddUniqueConstraintOptions
  - typingsJapgolly.sequelize.mod.AddDefaultConstraintOptions
  - typingsJapgolly.sequelize.mod.AddCheckConstraintOptions
  - typingsJapgolly.sequelize.mod.AddPrimaryKeyConstraintOptions
  - typingsJapgolly.sequelize.mod.AddForeignKeyConstraintOptions
*/
trait AddConstraintOptions extends StObject
object AddConstraintOptions {
  
  inline def AddCheckConstraintOptions(): typingsJapgolly.sequelize.mod.AddCheckConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("check")
    __obj.asInstanceOf[typingsJapgolly.sequelize.mod.AddCheckConstraintOptions]
  }
  
  inline def AddDefaultConstraintOptions(): typingsJapgolly.sequelize.mod.AddDefaultConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("default")
    __obj.asInstanceOf[typingsJapgolly.sequelize.mod.AddDefaultConstraintOptions]
  }
  
  inline def AddForeignKeyConstraintOptions(onDelete: String, onUpdate: String): typingsJapgolly.sequelize.mod.AddForeignKeyConstraintOptions = {
    val __obj = js.Dynamic.literal(onDelete = onDelete.asInstanceOf[js.Any], onUpdate = onUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("foreign key")
    __obj.asInstanceOf[typingsJapgolly.sequelize.mod.AddForeignKeyConstraintOptions]
  }
  
  inline def AddPrimaryKeyConstraintOptions(): typingsJapgolly.sequelize.mod.AddPrimaryKeyConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("primary key")
    __obj.asInstanceOf[typingsJapgolly.sequelize.mod.AddPrimaryKeyConstraintOptions]
  }
  
  inline def AddUniqueConstraintOptions(): typingsJapgolly.sequelize.mod.AddUniqueConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("unique")
    __obj.asInstanceOf[typingsJapgolly.sequelize.mod.AddUniqueConstraintOptions]
  }
}
