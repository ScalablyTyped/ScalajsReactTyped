package typingsJapgolly.agenda

import typingsJapgolly.bson.mod.Document
import typingsJapgolly.mongodb.mod.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAgendaCancelMod {
  
  @JSImport("agenda/dist/agenda/cancel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cancel(query: Filter[Document]): js.Promise[js.UndefOr[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Double]]]
}
