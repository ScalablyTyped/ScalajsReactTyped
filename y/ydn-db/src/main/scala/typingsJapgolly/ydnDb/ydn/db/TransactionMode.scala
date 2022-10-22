package typingsJapgolly.ydnDb.ydn.db

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransactionMode extends StObject
@JSGlobal("ydn.db.TransactionMode")
@js.native
object TransactionMode extends StObject {
  
  @js.native
  sealed trait readonly
    extends StObject
       with TransactionMode
  
  @js.native
  sealed trait readwrite
    extends StObject
       with TransactionMode
}
