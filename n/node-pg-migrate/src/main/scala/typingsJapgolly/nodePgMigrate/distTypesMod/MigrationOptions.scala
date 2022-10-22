package typingsJapgolly.nodePgMigrate.distTypesMod

import typingsJapgolly.nodePgMigrate.distOperationsGeneralTypesMod.Name
import typingsJapgolly.nodePgMigrate.distOperationsTablesTypesMod.ColumnDefinitions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationOptions extends StObject {
  
  def literal(v: Name): String
  @JSName("literal")
  var literal_Original: Literal
  
  var logger: Logger
  
  def schemalize(v: Name): String
  @JSName("schemalize")
  var schemalize_Original: Literal
  
  var typeShorthands: js.UndefOr[ColumnDefinitions] = js.undefined
}
object MigrationOptions {
  
  inline def apply(literal: /* v */ Name => String, logger: Logger, schemalize: /* v */ Name => String): MigrationOptions = {
    val __obj = js.Dynamic.literal(literal = js.Any.fromFunction1(literal), logger = logger.asInstanceOf[js.Any], schemalize = js.Any.fromFunction1(schemalize))
    __obj.asInstanceOf[MigrationOptions]
  }
  
  extension [Self <: MigrationOptions](x: Self) {
    
    inline def setLiteral(value: /* v */ Name => String): Self = StObject.set(x, "literal", js.Any.fromFunction1(value))
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setSchemalize(value: /* v */ Name => String): Self = StObject.set(x, "schemalize", js.Any.fromFunction1(value))
    
    inline def setTypeShorthands(value: ColumnDefinitions): Self = StObject.set(x, "typeShorthands", value.asInstanceOf[js.Any])
    
    inline def setTypeShorthandsUndefined: Self = StObject.set(x, "typeShorthands", js.undefined)
  }
}
