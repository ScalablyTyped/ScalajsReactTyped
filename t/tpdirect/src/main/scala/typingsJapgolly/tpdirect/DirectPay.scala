package typingsJapgolly.tpdirect

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tpdirect.anon.ExpirationDate
import typingsJapgolly.tpdirect.anon.PickBaseResultstatusmsgcl
import typingsJapgolly.tpdirect.anon.keyincssKeyNamestring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectPay extends StObject {
  
  def getPrime(callback: js.Function1[/* result */ PickBaseResultstatusmsgcl, Unit]): Unit = js.native
  
  def getTappayFieldsStatus(): UpdateResult = js.native
  
  def onUpdate(callback: js.Function1[/* update */ UpdateResult, Unit]): Unit = js.native
  
  def setup(fields: ExpirationDate): Unit = js.native
  def setup(fields: ExpirationDate, styles: StringDictionary[keyincssKeyNamestring]): Unit = js.native
}
