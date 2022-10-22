package typingsJapgolly.mailcheck

import typingsJapgolly.mailcheck.MailcheckModule.IAsynchronousOptions
import typingsJapgolly.mailcheck.MailcheckModule.ISuggestion
import typingsJapgolly.mailcheck.MailcheckModule.ISynchronousOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def mailcheck(opts: IAsynchronousOptions): Unit = js.native
  def mailcheck(opts: ISynchronousOptions): ISuggestion | Unit = js.native
}
