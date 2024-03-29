package typingsJapgolly.pgPromise.typescriptPgSubsetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Interface for TypeOverrides;
// See: https://github.com/brianc/node-postgres/blob/master/packages/pg/lib/type-overrides.js
@js.native
trait ITypeOverrides extends StObject {
  
  def getTypeParser(id: TypeId): Any = js.native
  def getTypeParser(id: TypeId, format: ParserFormat): Any = js.native
  
  def setTypeParser(id: TypeId, format: ParserFormat, parseFn: String): Unit = js.native
  def setTypeParser(id: TypeId, format: ParserFormat, parseFn: js.Function1[/* value */ String, Any]): Unit = js.native
  def setTypeParser(id: TypeId, parseFn: String): Unit = js.native
  def setTypeParser(id: TypeId, parseFn: js.Function1[/* value */ String, Any]): Unit = js.native
}
